package com.design_pattern.composite;

public class FinancialDepartment implements Department{
	private Integer id;
	private String name;
	public FinancialDepartment(int id, String name) {
		this.id=id;
		this.name=name;
	}
	@Override
	public void printDepartmentName() {
		System.out.print(getClass().getSimpleName());
	}
}
