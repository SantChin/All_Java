package com.san.arrays;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class Base64Check {

	public static void main(String[] args) throws NoSuchAlgorithmException {
		    String myString = "/63aaf89ac2dcc65a4b302314/Shared/NEW/1.Apart from counting words and characters, our online editor can help you to improve word choice an/2.Apart from counting words and characters, our online editor can help you to improve word choice an/3.Apart from counting words and characters, our online editor can help you to improve word choice an/4.Apart from counting words and characters, our online editor can help you to improve word choice an/5.Apart from counting words and characters, our online editor can help you to improve word choice an";
//		    byte[] myBytes = myString.getBytes();
//	        String myBase64 = Base64.getEncoder().encodeToString(myBytes);
//
//	        System.out.println(myBase64);
	        
	        
	    //    String myString = "This is a long string that needs to be shortened";
	        MessageDigest md = MessageDigest.getInstance("SHA-256");
	        byte[] myBytes = myString.getBytes();
	        byte[] hashBytes = md.digest(myBytes);
	        String myHash = bytesToHex(hashBytes);

	        System.out.println(myHash);
	    }

	    private static String bytesToHex(byte[] bytes) {
	        StringBuilder sb = new StringBuilder();
	        for (byte b : bytes) {
	            sb.append(String.format("%02x", b));
	        }
	        return sb.toString();
	    }
	}

