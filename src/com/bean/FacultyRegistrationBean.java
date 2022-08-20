
package com.bean;

import java.sql.Blob;
import java.util.List;


public class FacultyRegistrationBean 
{
    private long id;
    private int age;
    private long aadharNumber, panNumber, contactNumber;
    private String firstName, middleName, lastName;
    private String emailId, permanentAddress, localAddress, dob;
    private String gender, desability, desabilityDetails;
    private String degree, specialization, college, university;
    private List academicDetails;
    private String position, remark;
    private Blob image;

    public FacultyRegistrationBean() {
    }

    public FacultyRegistrationBean(int age, long aadharNumber, long panNumber, long contactNumber, String firstName, String middleName, String lastName, String emailId, String permanentAddress, String localAddress, String dob, String gender, String desability, String desabilityDetails, String degree, String specialization, String college, String university, List academicDetails, String position, String remark, Blob image) {
        this.age = age;
        this.aadharNumber = aadharNumber;
        this.panNumber = panNumber;
        this.contactNumber = contactNumber;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.emailId = emailId;
        this.permanentAddress = permanentAddress;
        this.localAddress = localAddress;
        this.dob = dob;
        this.gender = gender;
        this.desability = desability;
        this.desabilityDetails = desabilityDetails;
        this.degree = degree;
        this.specialization = specialization;
        this.college = college;
        this.university = university;
        this.academicDetails = academicDetails;
        this.position = position;
        this.remark = remark;
        this.image = image;
    }

    public FacultyRegistrationBean(long id, int age, long aadharNumber, long panNumber, long contactNumber, String firstName, String middleName, String lastName, String emailId, String permanentAddress, String localAddress, String dob, String gender, String desability, String desabilityDetails, String degree, String specialization, String college, String university, List academicDetails, String position, String remark, Blob image) {
        this.id = id;
        this.age = age;
        this.aadharNumber = aadharNumber;
        this.panNumber = panNumber;
        this.contactNumber = contactNumber;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.emailId = emailId;
        this.permanentAddress = permanentAddress;
        this.localAddress = localAddress;
        this.dob = dob;
        this.gender = gender;
        this.desability = desability;
        this.desabilityDetails = desabilityDetails;
        this.degree = degree;
        this.specialization = specialization;
        this.college = college;
        this.university = university;
        this.academicDetails = academicDetails;
        this.position = position;
        this.remark = remark;
        this.image = image;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getAadharNumber() {
        return aadharNumber;
    }

    public void setAadharNumber(long aadharNumber) {
        this.aadharNumber = aadharNumber;
    }

    public long getPanNumber() {
        return panNumber;
    }

    public void setPanNumber(long panNumber) {
        this.panNumber = panNumber;
    }

    public long getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(long contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPermanentAddress() {
        return permanentAddress;
    }

    public void setPermanentAddress(String permanentAddress) {
        this.permanentAddress = permanentAddress;
    }

    public String getLocalAddress() {
        return localAddress;
    }

    public void setLocalAddress(String localAddress) {
        this.localAddress = localAddress;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDesability() {
        return desability;
    }

    public void setDesability(String desability) {
        this.desability = desability;
    }

    public String getDesabilityDetails() {
        return desabilityDetails;
    }

    public void setDesabilityDetails(String desabilityDetails) {
        this.desabilityDetails = desabilityDetails;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public List getAcademicDetails() {
        return academicDetails;
    }

    public void setAcademicDetails(List academicDetails) {
        this.academicDetails = academicDetails;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Blob getImage() {
        return image;
    }

    public void setImage(Blob image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "FacultyRegistration{" + "id=" + id + ", age=" + age + ", aadharNumber=" + aadharNumber + ", panNumber=" + panNumber + ", contactNumber=" + contactNumber + ", firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName + ", emailId=" + emailId + ", permanentAddress=" + permanentAddress + ", localAddress=" + localAddress + ", dob=" + dob + ", gender=" + gender + ", desability=" + desability + ", desabilityDetails=" + desabilityDetails + ", degree=" + degree + ", specialization=" + specialization + ", college=" + college + ", university=" + university + ", academicDetails=" + academicDetails + ", position=" + position + ", remark=" + remark + ", image=" + image + '}';
    }
}
