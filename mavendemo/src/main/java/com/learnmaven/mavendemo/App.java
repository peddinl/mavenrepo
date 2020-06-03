package com.learnmaven.mavendemo;

/**
 * Hello world!
 *
 */
import org.apache.log4j.Logger;
public class App 
{
	final static Logger logger = Logger.getLogger(App.class);
	public static void main( String[] args )
    {
        Calculator calc = new Calculator();
		logger.debug(new Calculator().add(1,2));
		logger.debug(new Calculator().subtract(4,3));
		logger.debug(new Calculator().multiply(5,6));
		logger.debug(new Calculator().divide(1,2));
    }
}