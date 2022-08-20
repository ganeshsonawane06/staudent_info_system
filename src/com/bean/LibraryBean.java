
package com.bean;


public class LibraryBean {
    long id;
    String studentID, bookID, bookName, issueDate, submitDate, fine;

    public LibraryBean() {
    }

    public LibraryBean(String studentID, String bookID, String bookName, String issueDate, String submitDate, String fine) {
        this.studentID = studentID;
        this.bookID = bookID;
        this.bookName = bookName;
        this.issueDate = issueDate;
        this.submitDate = submitDate;
        this.fine = fine;
    }

    public LibraryBean(long id, String studentID, String bookID, String bookName, String issueDate, String submitDate, String fine) {
        this.id = id;
        this.studentID = studentID;
        this.bookID = bookID;
        this.bookName = bookName;
        this.issueDate = issueDate;
        this.submitDate = submitDate;
        this.fine = fine;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getBookID() {
        return bookID;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public String getSubmitDate() {
        return submitDate;
    }

    public void setSubmitDate(String submitDate) {
        this.submitDate = submitDate;
    }

    public String getFine() {
        return fine;
    }

    public void setFine(String fine) {
        this.fine = fine;
    }

    @Override
    public String toString() {
        return "Library{" + "id=" + id + ", studentID=" + studentID + ", bookID=" + bookID + ", bookName=" + bookName + ", issueDate=" + issueDate + ", submitDate=" + submitDate + ", fine=" + fine + '}';
    }
    
}
