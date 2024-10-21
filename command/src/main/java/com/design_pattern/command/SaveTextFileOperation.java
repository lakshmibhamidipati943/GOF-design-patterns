package com.design_pattern.command;

public class SaveTextFileOperation implements TextFileOperation{

	private TextFile textFile;
	public SaveTextFileOperation(TextFile textFile) {
		this.textFile=textFile;
	}
	@Override
	public String execute() {
		// TODO Auto-generated method stub
		return textFile.save();
	}
	
}
