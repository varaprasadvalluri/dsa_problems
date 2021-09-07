package com.problems.java8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

public class ReadLogFiles {
	static List<String> usageData = new ArrayList<>();
	static Map<String, String> tempStartTimeStamp = new HashMap<>();
	static Map<String, String> tempEndTimeStamp = new HashMap<>();
	static Map<String, Integer> tempSessionCount = new HashMap<>();

	public static void main(String[] args) {
		File inFile = null;
		if (0 < args.length) {
			inFile = new File("F:\\LogUsage.log");// args[0] || F:\\LogUsage.log
		} else {
			System.out.println("InValid FilePath");
			return;
		}
		try {
			// File inFile = new File(args[0]);
			FileInputStream fstream = new FileInputStream(inFile);
			BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
			String strLine;
			while ((strLine = br.readLine()) != null) {
				/* parse strLine to obtain what you want */
				String[] str = strLine.split(" ");//Single Line
				System.out.println("String --->" + Arrays.toString(str));
				String timeStamp = getTime(str[0]);
				if (timeStamp.contains("Unparseable date:")) {
					return;
				}
				getTimestamp(str);
			}
			// System.out.println("After Loop ");
			// finally I want to calculate Seconds
			for (Entry<String, String> startTime : tempStartTimeStamp.entrySet()) {
				String[] userSession = startTime.getKey().split("\\|");
				// System.out.println("userSession -->" + userSession[0]);
				Optional<String> isPresent = Optional.ofNullable(tempEndTimeStamp.get(userSession[0] + "|End"));
				System.out.println("isPresent -->" + isPresent.isPresent());
				if (!isPresent.isPresent()) {
					usageData.add(userSession[0] + " " + tempSessionCount.get(userSession[0] + "|Start") + " " + 0);
				} else {
					// System.out.println("Else Loop for seconds ");
					SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss");
					try {
						Date startDate = df.parse(startTime.getValue());
						Date endDate = df.parse(tempEndTimeStamp.get(userSession[0] + "|End"));
						// System.out.println("startDate -->" + startDate);
						long secondsBetween = (endDate.getTime() - startDate.getTime()) / 1000;
						usageData.add(userSession[0] + " " + tempSessionCount.get(userSession[0] + "|Start") + " "
								+ secondsBetween);
					} catch (Exception e) {
						System.out.println("Exception -->" + e.getLocalizedMessage());
					}
				}

			}
			System.out.println("usageData -->" + usageData);
			fstream.close();
		} catch (Exception e) {
			System.err.println("Exception : " + e.getLocalizedMessage());
		}
	}

	private static void getTimestamp(String[] str) {
		try {
			// System.out.println("session -->" + str[2]);
			if (str[2].equals("Start")) {
				String startTime = getTime(str[0]);
				tempStartTimeStamp.put(str[1] + "|" + str[2], startTime);
				System.out.println("TempSessionCount -->" + tempSessionCount);
				if (tempSessionCount.containsKey(str[1] + "|" + str[2])) {
					// System.out.println("Start -->");
					tempSessionCount.put(str[1] + "|" + str[2], tempSessionCount.get(str[1] + "|" + str[2]) + 1);
				} else {
					// System.out.println("Else -->");
					tempSessionCount.put(str[1] + "|" + str[2], 1);
				}
			} else {
				String endTime = getTime(str[0]);
				tempEndTimeStamp.put(str[1] + "|" + str[2], endTime);
			}
		} catch (Exception e) {
			System.out.println("Exception -->" + e.getLocalizedMessage());
		}
	}

	private static String getTime(String timeStamp) {
		SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss");
		Date date = null;
		try {
			System.out.println("timeStamp -->" + timeStamp);
			date = df.parse(timeStamp);
			System.out.println("df formted is Valid " + date);
			return df.format(date);//Lagic 
		} catch (Exception e) {
			System.out.println("Session Formate is InValid --->" + e.getLocalizedMessage());
			return e.getLocalizedMessage();
		}
	}
}
