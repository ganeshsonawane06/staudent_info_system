
package com.bean;

import java.util.LinkedHashMap;
import java.util.Map;


public class ClassTimeTableBean {
    private long id;
    private String department, academicClass;
   private String classTimeTable;

    public ClassTimeTableBean() {
    }

    public ClassTimeTableBean(String department, String academicClass, String classTimeTable) {
        this.department = department;
        this.academicClass = academicClass;
        this.classTimeTable = classTimeTable;
    }

    public ClassTimeTableBean(long id, String department, String academicClass, String classTimeTable) {
        this.id = id;
        this.department = department;
        this.academicClass = academicClass;
        this.classTimeTable = classTimeTable;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getAcademicClass() {
        return academicClass;
    }

    public void setAcademicClass(String academicClass) {
        this.academicClass = academicClass;
    }

    public String getClassTimeTable() {
        return classTimeTable;
    }

    public void setClassTimeTable(String classTimeTable) {
        this.classTimeTable = classTimeTable;
    }

    @Override
    public String toString() {
        return "ClassTimeTableBean{" + "id=" + id + ", department=" + department + ", academicClass=" + academicClass + ", classTimeTable=" + classTimeTable + '}';
    }
    
}
