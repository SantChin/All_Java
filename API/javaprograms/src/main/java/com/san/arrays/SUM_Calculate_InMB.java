package com.san.arrays;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;

public class SUM_Calculate_InMB {

	public static void main(String[] args) {
		
		long dataSize =  0;
		List<String> dataList = getDataList();
		for (String str : dataList ) {
			dataSize = (long) (dataSize+ 
					Double.parseDouble((str.replace("MB", "").trim())));
		}
		
		System.out.println(dataSize/1024);
		//System.out.println(formatFileSize(dataSize));
		
	}

	
	public static List<String> getDataList(){
		String[] arr = new String[] {
		
				
				"697.39 MB",
				"615.25 MB",
				"674.8 MB",
				"1238.51 MB",
				"790.25 MB",
				"665.99 MB",
				"1685.41 MB",
				"50.18 MB",
				"490.8 MB",
				"985.3 MB",
				"1213.81 MB",
				"870.11 MB",
				"1045.65 MB",
				"1097.66 MB",
				"838.61 MB",
				"953.21 MB",
				"682.37 MB",
				
		};
		
		List<String> asList = Arrays.asList(arr);
		return asList;
	}


	public static String formatFileSize(long size) {
	    String hrSize = null;

	    double b = size;
	    double k = size/1024.0;
	    double m = ((size/1024.0)/1024.0);
	    double g = (((size/1024.0)/1024.0)/1024.0);
	    double t = ((((size/1024.0)/1024.0)/1024.0)/1024.0);

	    DecimalFormat dec = new DecimalFormat("0.00");

	    if ( t>1 ) {
	        hrSize = dec.format(t).concat(" TB");
	    } else if ( g>1 ) {
	        hrSize = dec.format(g).concat(" GB");
	    } else if ( m>1 ) {
	        hrSize = dec.format(m).concat(" MB");
	    } else if ( k>1 ) {
	        hrSize = dec.format(k).concat(" KB");
	    } else {
	        hrSize = dec.format(b).concat(" Bytes");
	    }

	    return hrSize;
	}
	
	
}


