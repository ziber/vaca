package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		
		List<Employee> workers = setUpTenWorkers();
		
		//in lieu of creating a whole ui
		for(int i = 0; i < workers.size(); i++) {
			System.out.println(workers.get(i).getName()+": "+workers.get(i).getVacationDays()+" "+workers.get(i).getWorkDays());
		}
		
		
		System.out.println();
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println();
		
		//make some changes
		for(int i = 0; i < workers.size(); i++) {
			workers.get(i).TakeVacation(5.0);
			workers.get(i).Work(30);
		}
		
		//output after some changes
		for(int i = 0; i < workers.size(); i++) {
			System.out.println(workers.get(i).getName()+": "+workers.get(i).getVacationDays()+" "+workers.get(i).getWorkDays());
		}
		
		
				
	}

	private static List<Employee> setUpTenWorkers() {
		List<Employee> employees = new ArrayList<Employee>();
		
		HourlyEmployee Bob = new HourlyEmployee("Bob", 260, 0.0);
		HourlyEmployee Charles = new HourlyEmployee("Charles", 60, 10.0);
		HourlyEmployee Megan = new HourlyEmployee("Megan", 230, 0.0);
		SalariedEmployee Tom = new SalariedEmployee("Tom", 260, 0.0);
		SalariedEmployee Lisa = new SalariedEmployee("Lisa", 60, 15.0);
		SalariedEmployee Audrey = new SalariedEmployee("Audrey", 210, 0.0);
		Manager Frank = new Manager("Frank", 260, 30.0);
		Manager Laura = new Manager("Laura", 180, 0.0);
		
		employees.add(Audrey);
		employees.add(Lisa);
		employees.add(Tom);
		employees.add(Megan);
		employees.add(Charles);
		employees.add(Bob);
		employees.add(Frank);
		employees.add(Laura);
		
		return employees;
	}

}
