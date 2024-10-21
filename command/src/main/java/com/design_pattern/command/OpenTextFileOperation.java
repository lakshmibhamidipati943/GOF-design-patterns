package com.design_pattern.command;

public class OpenTextFileOperation implements TextFileOperation{

	private TextFile textFile;
	public OpenTextFileOperation(TextFile textFile) {
		this.textFile=textFile;
	}
	@Override
	public String execute() {
		// TODO Auto-generated method stub
		return textFile.open();
	}

}
