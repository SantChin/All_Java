package com.san.designpattern.basicconcepts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class B implements A{

	public void methodB() {
		System.out.println("B - MB");
	}
	
	public void methodA() {
		System.out.println("B - MA");
	}
	
	public void methodC() throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
	}
	
}
