package com.san.arrays;

import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.compress.compressors.FileNameUtil;
import org.apache.commons.compress.utils.FileNameUtils;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.util.IOUtils;

public class Test6 {

	public static void main(String[] args) {

		String test = "/Users/Santosh/Box/Global%20Finance%20Team%20Library/Finance%20-%20US/CFO/Budgeting/GSIH%20Budgets/2021/Revenue%20Support/1st%20Draft%20-%20Completed%20Revenue%20Templates/2021%20Budget%20-%20Advisory%20(Final).xlsx.xlsx?EB07FF0B";
		String test2 = "/Users/ajay/Box/Global%20Finance%20Team%20Library/Finance%20-%20US/CFO/Budgeting/GSIH%20Budgets/2021/Revenue%20Support/1st%20Draft%20-%20Completed%20Revenue%20Templates/2021%20Budget%20-%20Advisory%20(Final).xlsx.xlsx";

		String test3 = "'[47]GSA - Format'!$X$13-[49]Summary!$H$7/1000-[51]Summary!$H$6/1000+150";

		String test4 = "/users/Box/Finance - US/";

		String longFileName = "https://cloudfuzecom.sharepoint.com/sites/finance/Shared Documents";

		String test5 = "/Users/Santosh/Box/Global%20Finance%20Team%20Library/Finance%20-%20US/CFO/Budgeting/GSIH%20Budgets/2020/2020%20Top-Down%20Budget.xlsx";

//		System.out.println(test2);
//		String last = Paths.get(test2).getFileName().toString();
//		
//	if(last!=null && last.endsWith(".xlsx")) {
//		test2 =	test2.replace(last, "["+last+"]");
//	}
//		
//	System.out.println(test2);

//		Map<String, String> dataMap = new HashMap<String, String>();
//		// Map<String,String> keys = new HashMap<String,String>();
//		List<String> keys = new ArrayList<>();
//		dataMap.put("[47]", "Fourty Seven.xlsx");
//		dataMap.put("[49]", "Fourty Nine.xlsx");
//		dataMap.put("[51]", "Fifty One.xlsx");
//
//		Pattern p = Pattern.compile("\\[(.*?)\\]");
//		Matcher m = p.matcher(test3);
//		String group = null;
//		while (m.find()) {
//			// group = m.group();
//			keys.add(m.group());
//		}
//
//		System.out.println(dataMap);
//		System.out.println(keys);

//		for (String key : keys) {
//			String value = dataMap.get(key);
//			value = formatValue(value);
//			// test3 = test3.replaceAll(" *\\[\\d+\\] *", value);
//			// test3 = test3.replaceAll("\\[(.*?)\\]", "$1");
//			//test3 = test3.replaceAll("\\[" + key + "\\]", value);
//			test3 = test3.replace(key , value);
//			// test3 = test3.replaceAll(key, value);
//			System.out.println(test3);
//		}

		// Fourty Seven.xlsxGSA - Format'!$X$13-Fourty Nine.xlsxSummary!$H$7/1000-Fifty
		// One.xlsxSummary!$H$6/1000+150

		// matchValue(test2);
		// matchValue(test);
		// matchValue(test3);
		// matchValue(test4);

		// extactSiteName(longFileName);
		//replaceAString(test5);
		System.out.println(changeExtension("abc.docx"));

	}

	public  static String changeExtension(String name) {
		  int i = name.lastIndexOf('.');
		  String _name = name.substring(0,i);
		  _name =  _name + ".boxnote";
		  return _name;
	}


	public static void replaceAString(String value) {
		Set<String> keySet = new HashSet<String>();
		// [^/users/.*/box/.*$, ^/users/box/.*$, ^/box/.*$]
		keySet.add("^/users/.*/box/.*$");
		keySet.add("^/users/box/.*$");
		keySet.add("^/box/.*$");
		for (String keyValue : keySet) {
			Pattern compile = Pattern.compile(keyValue.toLowerCase());
			if (compile.matcher(value.toLowerCase()).matches()) {
				String _keyValue = keyValue.replace(".*$", "");
				value = value.replaceAll("(?i)" + _keyValue, "/sites/Santosh2/Shared Documents/");
				System.out.println(value);
			}
		}
	}

	private static String extactSiteName(String longFileName) {
		String siteName = null;
		try {
			if (longFileName != null && longFileName.length() > 0) {
				siteName = StringUtils.substringBetween(longFileName, "sites", "Shared Documents");
				if (siteName != null) {
					siteName = siteName.replace("/", "");
				} else {
					longFileName = "/finance/Documents/";
					siteName = StringUtils.substringBetween(longFileName, "/", "/");
				}
			}
		} catch (Exception e) {
			siteName = null;
		}
		return siteName;
	}

	public static boolean hasOOXMLHeader(InputStream inp) throws IOException {
		// We want to peek at the first 4 bytes
		final byte[] OOXML_FILE_HEADER = new byte[] { 0x50, 0x4b, 0x03, 0x04 };
		inp.mark(4);

		byte[] header = new byte[4];
		IOUtils.readFully(inp, header);

		// Wind back those 4 bytes
		if (inp instanceof PushbackInputStream) {
			PushbackInputStream pin = (PushbackInputStream) inp;
			pin.unread(header);
		} else {
			inp.reset();
		}

		// Did it match the ooxml zip signature?
		return (header[0] == OOXML_FILE_HEADER[0] && header[1] == OOXML_FILE_HEADER[1]
				&& header[2] == OOXML_FILE_HEADER[2] && header[3] == OOXML_FILE_HEADER[3]);
	}

	private static void matchValue(String value) {
		// String match = "/Users/%*%/Box/";
		Pattern compile = Pattern.compile("^/users/.*/box/.*$");

		if (compile.matcher(value.toLowerCase()).matches()) {
			System.out.println(value);
			System.out.println("Match Found");
		}

//		if(value.toLowerCase().contains(match.toLowerCase())) {
//			System.out.println(value);
//			System.out.println("Match Found");
//		}

	}

	private static String formatValue(String value) {
		value = value.replaceAll("%20", " ");
		String last = Paths.get(value).getFileName().toString();
		if (last != null && last.endsWith(".xlsx")) {
			value = value.replace(last, "[" + last + "]");
		}
		return value;
	}
}
