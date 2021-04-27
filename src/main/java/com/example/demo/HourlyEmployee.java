package com.example.demo;

public class HourlyEmployee implements Employee {

	private String name;
	private Double vacationDays = 0.0;
	private Integer workDays = 0;
	
	@Override
	public int Work(int days) {
		if(this.workDays + days <= 260) {
			this.workDays = this.workDays + days;
			if(this.workDays % 260 == 0) {
				this.vacationDays = this.vacationDays + 10;
			}
			return 0;
		}
		return -1;
	}

	@Override
	public int TakeVacation(double daysUsed) {
		if(this.vacationDays - daysUsed > 0) {
			this.vacationDays = this.vacationDays - daysUsed;
			return 0;
		}
		return -1;
		
	}
	
	public HourlyEmployee(String name, int workDays, double vacation) {
		this.vacationDays = vacation;
		this.workDays = workDays;
		this.setName(name);
		
	}
	
	public Integer getWorkDays() {
		return workDays;
	}

	public void setWorkDays(Integer workDays) {
		this.workDays = workDays;
	}

	public Double getVacationDays() {
		return vacationDays;
	}

	public void setVacationDays(Double vacationDays) {
		this.vacationDays = vacationDays;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
