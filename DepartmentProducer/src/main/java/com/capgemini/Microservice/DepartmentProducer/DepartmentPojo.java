package com.capgemini.Microservice.DepartmentProducer;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(
  name = "Department")
public class DepartmentPojo implements Serializable{

@Id
@Column
private String id;

@Column(length=20)
private String deptName;

@Column(length = 32)
private String HOD;

@Column(length = 10)
private int studentNo;

public DepartmentPojo(String id, String deptName, String HOD, int studentNo) {
	super();
	this.id = id;
	this.deptName = deptName;
	this.HOD = HOD;
	this.studentNo = studentNo;
}

public DepartmentPojo()
{
	
}

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getDeptName() {
	return deptName;
}

public void setDeptName(String deptName) {
	this.deptName = deptName;
}

public String getHOD() {
	return HOD;
}

public void setHOD(String HOD) {
	this.HOD = HOD;
}

public int getStudentNo() {
	return studentNo;
}

public void setStudentNo(int studentNo) {
	this.studentNo = studentNo;
}

@Override
public String toString() {
	return "DepartmentPojo [id=" + id + ", deptName=" + deptName + ", HOD="
			+ HOD + ", studentNo=" + studentNo + "]";
}

}