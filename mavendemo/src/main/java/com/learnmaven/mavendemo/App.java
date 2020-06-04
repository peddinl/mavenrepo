package com.learnmaven.mavendemo;

/**
 * Hello world!
 *
 */
import org.apache.log4j.Logger;
class App{
	final static Logger LOGGER = Logger.getLogger(App.class);
	public static void main(String[] args){
		int a = 1;
		int b = 2;
		int c = 4;
		int d = 3;
		int e = 5;
		int f = 6;
        Calculator calc = new Calculator();
		LOGGER.debug(new Calculator().add(a, b));
		LOGGER.debug(new Calculator().subtract(c,d));
		LOGGER.debug(new Calculator().multiply(e,f));
		LOGGER.debug(new Calculator().divide(a,b));
    }
 }