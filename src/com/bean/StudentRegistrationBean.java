
package com.bean;

import java.sql.Blob;




public class StudentRegistrationBean
{
    private String sFName, sMName, sLName, fFName, fMName, fLName, mFName;
    private long contactNumber, emergencyContact_1, emergencyContact_2, aadhaarNumber, id;
    private int age;
    private String email, localAddress, permanentAddress;
    private String dob, gender, desability, religion, catagory;
    private String previousInstitution, universityOrBoard;
    private String admissionDate, courseEnrolled, stream, classYear, benificiary;
    private Blob image;

    public StudentRegistrationBean() {
    }
    
    public StudentRegistrationBean(String sFName, String sMName, String sLName
            , String fFName, String fMName, String fLName, String mFName
            , long contactNumber, long emergencyContact_1, long emergencyContact_2
            , long aadhaarNumber, int age, String email, String permanentAddress, String localAddress
            , String dob, String gender, String desability
            , String religion, String catagory, String universityOrBoard, String previousInstitution
            , String admissionDate, String courseEnrolled
            , String stream, String classYear, String benificiary, Blob image) {
        this.sFName = sFName;
        this.sMName = sMName;
        this.sLName = sLName;
        this.fFName = fFName;
        this.fMName = fMName;
        this.fLName = fLName;
        this.mFName = mFName;
        this.contactNumber = contactNumber;
        this.emergencyContact_1 = emergencyContact_1;
        this.emergencyContact_2 = emergencyContact_2;
        this.aadhaarNumber = aadhaarNumber;
        this.age = age;
        this.email = email;
        this.localAddress = localAddress;
        this.permanentAddress = permanentAddress;
        this.dob = dob;
        this.gender = gender;
        this.desability = desability;
        this.religion = religion;
        this.catagory = catagory;
        this.previousInstitution = previousInstitution;
        this.universityOrBoard = universityOrBoard;
        this.admissionDate = admissionDate;
        this.courseEnrolled = courseEnrolled;
        this.stream = stream;
        this.classYear = classYear;
        this.benificiary = benificiary;
        this.image = image;
    }

    public StudentRegistrationBean(long id, String sFName, String sMName, String sLName
            , String fFName, String fMName, String fLName, String mFName
            , long contactNumber, long emergencyContact_1, long emergencyContact_2
            , long aadhaarNumber, int age, String email, String permanentAddress, String localAddress
            , String dob, String gender, String desability
            , String religion, String catagory, String universityOrBoard, String previousInstitution
            , String admissionDate, String courseEnrolled
            , String stream, String classYear, String benificiary, Blob image) {
        this.sFName = sFName;
        this.sMName = sMName;
        this.sLName = sLName;
        this.fFName = fFName;
        this.fMName = fMName;
        this.fLName = fLName;
        this.mFName = mFName;
        this.contactNumber = contactNumber;
        this.emergencyContact_1 = emergencyContact_1;
        this.emergencyContact_2 = emergencyContact_2;
        this.aadhaarNumber = aadhaarNumber;
        this.age = age;
        this.id = id;
        this.email = email;
        this.localAddress = localAddress;
        this.permanentAddress = permanentAddress;
        this.dob = dob;
        this.gender = gender;
        this.desability = desability;
        this.religion = religion;
        this.catagory = catagory;
        this.previousInstitution = previousInstitution;
        this.universityOrBoard = universityOrBoard;
        this.admissionDate = admissionDate;
        this.courseEnrolled = courseEnrolled;
        this.stream = stream;
        this.classYear = classYear;
        this.benificiary = benificiary;
        this.image = image;
    }

    public String getsFName() {
        return sFName;
    }

    public void setsFName(String sFName) {
        this.sFName = sFName;
    }

    public String getsMName() {
        return sMName;
    }

    public void setsMName(String sMName) {
        this.sMName = sMName;
    }

    public String getsLName() {
        return sLName;
    }

    public void setsLName(String sLName) {
        this.sLName = sLName;
    }

    public String getfFName() {
        return fFName;
    }

    public void setfFName(String fFName) {
        this.fFName = fFName;
    }

    public String getfMName() {
        return fMName;
    }

    public void setfMName(String fMName) {
        this.fMName = fMName;
    }

    public String getfLName() {
        return fLName;
    }

    public void setfLName(String fLName) {
        this.fLName = fLName;
    }

    public String getmFName() {
        return mFName;
    }

    public void setmFName(String mFName) {
        this.mFName = mFName;
    }

    public long getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(long contactNumber) {
        this.contactNumber = contactNumber;
    }

    public long getEmergencyContact_1() {
        return emergencyContact_1;
    }

    public void setEmergencyContact_1(long emergencyContact_1) {
        this.emergencyContact_1 = emergencyContact_1;
    }

    public long getEmergencyContact_2() {
        return emergencyContact_2;
    }

    public void setEmergencyContact_2(long emergencyContact_2) {
        this.emergencyContact_2 = emergencyContact_2;
    }

    public long getAadhaarNumber() {
        return aadhaarNumber;
    }

    public void setAadhaarNumber(long aadhaarNumber) {
        this.aadhaarNumber = aadhaarNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLocalAddress() {
        return localAddress;
    }

    public void setLocalAddress(String localAddress) {
        this.localAddress = localAddress;
    }

    public String getPermanentAddress() {
        return permanentAddress;
    }

    public void setPermanentAddress(String permanentAddress) {
        this.permanentAddress = permanentAddress;
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

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getCatagory() {
        return catagory;
    }

    public void setCatagory(String catagory) {
        this.catagory = catagory;
    }

    public String getPreviousInstitution() {
        return previousInstitution;
    }

    public void setPreviousInstitution(String previousInstitution) {
        this.previousInstitution = previousInstitution;
    }

    public String getUniversityOrBoard() {
        return universityOrBoard;
    }

    public void setUniversityOrBoard(String universityOrBoard) {
        this.universityOrBoard = universityOrBoard;
    }

    public String getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(String admissionDate) {
        this.admissionDate = admissionDate;
    }

    public String getCourseEnrolled() {
        return courseEnrolled;
    }

    public void setCourseEnrolled(String courseEnrolled) {
        this.courseEnrolled = courseEnrolled;
    }

    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    public String getClassYear() {
        return classYear;
    }

    public void setClassYear(String classYear) {
        this.classYear = classYear;
    }

    public String getBenificiary() {
        return benificiary;
    }

    public void setBenificiary(String benificiary) {
        this.benificiary = benificiary;
    }

    public Blob getImage() {
        return image;
    }

    public void setImage(Blob image) {
        this.image = image;
    }
    
    @Override
    public String toString() {
        return "StudentRegistration{" + "sFName=" + sFName + ", sMName=" 
                + sMName + ", sLName=" + sLName + ", fFName=" + fFName 
                + ", fMName=" + fMName + ", fLName=" + fLName + ", mFName=" 
                + mFName + ", contactNumber=" + contactNumber + ", emergencyContact_1=" 
                + emergencyContact_1 + ", emergencyContact_2=" + emergencyContact_2 
                + ", aadhaarNumber=" + aadhaarNumber + ", age=" + age + ", id=" + id 
                + ", email=" + email + ", localAddress=" + localAddress + ", permanentAddress=" 
                + permanentAddress + ", dob=" + dob + ", gender=" + gender + ", desability=" 
                + desability + ", religion=" + religion + ", catagory=" + catagory 
                + ", previousInstitution=" + previousInstitution + ", universityOrBoard="
                + universityOrBoard + ", admissionDate=" + admissionDate + ", courseEnrolled="
                + courseEnrolled + ", stream=" + stream + ", classYear=" + classYear 
                + ", benificiary=" + benificiary + ", Photo=" + image + '}';
    }
}
