
package com.bean;


public class PracticalExamScheduleBean {
    int id;
    String department, academicClass;
    String timeTable;

    public PracticalExamScheduleBean() {
    }

    public PracticalExamScheduleBean(String department, String academicClass, String timeTable) {
        this.department = department;
        this.academicClass = academicClass;
        this.timeTable = timeTable;
    }

    public PracticalExamScheduleBean(int id, String department, String academicClass, String timeTable) {
        this.id = id;
        this.department = department;
        this.academicClass = academicClass;
        this.timeTable = timeTable;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getTimeTable() {
        return timeTable;
    }

    public void setTimeTable(String timeTable) {
        this.timeTable = timeTable;
    }

    @Override
    public String toString() {
        return "PracticalExamSchedule{" + "id=" + id + ", department=" + department + ", academicClass=" + academicClass + ", timeTable=" + timeTable + '}';
    }
    
}
