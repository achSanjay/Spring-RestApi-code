package com.example.restapi.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee {

				@Id
				@GeneratedValue(strategy = GenerationType.IDENTITY)
				private long empId;

				@Column
				private String empName;

				@Column
				private float empSalary;

				@Column
				private  int age ;

				@Column
				private String empCity;

				public Employee(long empId, String empName, float empSalary, int age, String empCity) {
								this.empId = empId;
								this.empName = empName;
								this.empSalary = empSalary;
								this.age = age;
								this.empCity = empCity;
				}

				public Employee(){

				}

				@Override
				public String toString() {
								return "Employee{" +
																"empId=" + empId +
																", empName='" + empName + '\'' +
																", empSalary=" + empSalary +
																", age=" + age +
																", empCity='" + empCity + '\'' +
																'}';
				}

				public long getEmpId() {
								return empId;
				}

				public void setEmpId(long empId) {
								this.empId = empId;
				}

				public String getEmpName() {
								return empName;
				}

				public void setEmpName(String empName) {
								this.empName = empName;
				}

				public float getEmpSalary() {
								return empSalary;
				}

				public void setEmpSalary(float empSalary) {
								this.empSalary = empSalary;
				}

				public int getAge() {
								return age;
				}

				public void setAge(int age) {
								this.age = age;
				}

				public String getEmpCity() {
								return empCity;
				}

				public void setEmpCity(String empCity) {
								this.empCity = empCity;
				}



}
