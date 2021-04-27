package com.example.demo;

public class Manager extends SalariedEmployee{

	public Manager(String name, int workDays, double vacation) {
		super(name, workDays, vacation);
	}

	@Override
	public int Work(int days) {
		if(this.getWorkDays() + days <= 260) {
			this.setWorkDays(this.getWorkDays() + days);
			if(this.getWorkDays() % 260 == 0) {
				this.setVacationDays(this.getVacationDays() + 30);
			}
			return 0;
		}
		return -1;
	}
	
}
