package com.qcloud.weapp;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Date;

public class Logger {
	public static void log(String content) {
		
		try {
			OutputStream oStream = new FileOutputStream(new File("/var/log/qcloud/weapp.log"), true);
			OutputStreamWriter writer = new OutputStreamWriter(oStream, "UTF-8");
			writer.write(String.format("[%s] %s\n", new Date().toString(), content));
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
			System.err.println("Write file error");
		}
		
	}
}
