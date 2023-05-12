package com.mycompany.componentspractice;

import java.time.LocalDate;

public class Person {
    private String documentId;
    private String name;
    private String lastName;
    private String email;
    private String sex;
    private String civilStatus;
    private LocalDate birthDate;
    private String nationality;
    private String hobbies;
    private String studies;

    public Person(String documentId, String name, String lastName, String email, String sex, String civilStatus, LocalDate birthDate, String nationality, String hobbies, String studies) {
        this.documentId = documentId;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.sex = sex;
        this.civilStatus = civilStatus;
        this.birthDate = birthDate;
        this.nationality = nationality;
        this.hobbies = hobbies;
        this.studies = studies;
    }

    public Object[] getObjectData() {
      return new Object[] {
        this.documentId,
        this.name,
        this.lastName,
        this.email,
        this.sex,
        this.civilStatus,
        this.birthDate,
        this.nationality,
        this.hobbies,
        this.studies
      };
    }

    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCivilStatus() {
        return civilStatus;
    }

    public void setCivilStatus(String civilStatus) {
        this.civilStatus = civilStatus;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    public String getStudies() {
        return studies;
    }

    public void setStudies(String studies) {
        this.studies = studies;
    }
    
    
}
