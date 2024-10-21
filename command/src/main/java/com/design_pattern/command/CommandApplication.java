package com.design_pattern.command;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CommandApplication {

	public static void main(String[] args) {
		//SpringApplication.run(CommandApplication.class, args);
		TextFileOperationExecutor textFileOperationExecutor=new TextFileOperationExecutor();
		textFileOperationExecutor.executeOperation(new OpenTextFileOperation(new TextFile("file1.txt")));
		textFileOperationExecutor.executeOperation(new OpenTextFileOperation(new TextFile("file2.txt")));

	}

}
