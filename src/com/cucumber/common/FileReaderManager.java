package com.cucumber.common;

import com.cucumber.common.PropertyReader;
 
public class FileReaderManager {
 
	private static FileReaderManager fileReaderManager = new FileReaderManager();
	private static PropertyReader propReader;
 
	private FileReaderManager() {
	}
 
	 public static FileReaderManager getInstance( ) {
	      return fileReaderManager;
	 }
 
	 public PropertyReader getPropReader() {
		 return (propReader == null) ? new PropertyReader() : propReader;
	 }
}