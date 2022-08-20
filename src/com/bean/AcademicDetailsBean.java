
package com.bean;


public class AcademicDetailsBean {
    int id;
    String universityOrBoard, schoolOrinstitution, course, passingYear, percentageOrGPA;

    public AcademicDetailsBean() {
    }

    public AcademicDetailsBean(String universityOrBoard, String schoolOrinstitution, String course, String passingYear, String percentageOrGPA) {
        this.universityOrBoard = universityOrBoard;
        this.schoolOrinstitution = schoolOrinstitution;
        this.course = course;
        this.passingYear = passingYear;
        this.percentageOrGPA = percentageOrGPA;
    }

    public AcademicDetailsBean(int id, String universityOrBoard, String schoolOrinstitution, String course, String passingYear, String percentageOrGPA) {
        this.id = id;
        this.universityOrBoard = universityOrBoard;
        this.schoolOrinstitution = schoolOrinstitution;
        this.course = course;
        this.passingYear = passingYear;
        this.percentageOrGPA = percentageOrGPA;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUniversityOrBoard() {
        return universityOrBoard;
    }

    public void setUniversityOrBoard(String universityOrBoard) {
        this.universityOrBoard = universityOrBoard;
    }

    public String getSchoolOrinstitution() {
        return schoolOrinstitution;
    }

    public void setSchoolOrinstitution(String schoolOrinstitution) {
        this.schoolOrinstitution = schoolOrinstitution;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getPassingYear() {
        return passingYear;
    }

    public void setPassingYear(String passingYear) {
        this.passingYear = passingYear;
    }

    public String getPercentageOrGPA() {
        return percentageOrGPA;
    }

    public void setPercentageOrGPA(String percentageOrGPA) {
        this.percentageOrGPA = percentageOrGPA;
    }

    @Override
    public String toString() {
        return "AcademicDetails{" + "id=" + id + ", universityOrBoard=" + universityOrBoard + ", schoolOrinstitution=" + schoolOrinstitution + ", course=" + course + ", passingYear=" + passingYear + ", percentageOrGPA=" + percentageOrGPA + '}';
    }
}
