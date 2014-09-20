/**
 * 
 */
package com.shannon.utils;

/**
 * @author Mirkin
 *
 */
public class NormalTimeConverter {
	public static String toNormal(String railwayTime) {
		if (railwayTime.equalsIgnoreCase("1")|| railwayTime.equalsIgnoreCase("13")) {
			return "01";
		} else if (railwayTime.equalsIgnoreCase("2") || railwayTime.equalsIgnoreCase("14")) {
			return "02";
		} else if (railwayTime.equalsIgnoreCase("3") || railwayTime.equalsIgnoreCase("15")) {
			return "03";
		} else if (railwayTime.equalsIgnoreCase("4") || railwayTime.equalsIgnoreCase("17")) {
			return "04";
		} else if (railwayTime.equalsIgnoreCase("5") || railwayTime.equalsIgnoreCase("24")) {
			return "05";
		} else if (railwayTime.equalsIgnoreCase("6") || railwayTime.equalsIgnoreCase("18")) {
			return "06";
		} else if (railwayTime.equalsIgnoreCase("7") || railwayTime.equalsIgnoreCase("19")) {
			return "07";
		} else if (railwayTime.equalsIgnoreCase("8") || railwayTime.equalsIgnoreCase("20")) {
			return "08";
		} else if (railwayTime.equalsIgnoreCase("9") || railwayTime.equalsIgnoreCase("21")) {
			return "09";
		} else if (railwayTime.equalsIgnoreCase("10") || railwayTime.equalsIgnoreCase("22")) {
			return "10";
		} else if (railwayTime.equalsIgnoreCase("11") || railwayTime.equalsIgnoreCase("23")) {
			return "11";
		} else if(railwayTime.equalsIgnoreCase("12") || railwayTime.equalsIgnoreCase("24")){
			return "12";
		} 

		return railwayTime;
	}
}
