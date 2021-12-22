/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment;

import java.io.Serializable;

/**
 *
 * @author pvsla
 */
public class Student implements Serializable {

    private String masv, name, email, phone, address, image;
    private boolean gender;

    public Student(String masv, String name, String email, String phone, String address, String image, boolean gender) {
        this.masv = masv;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.image = image;
        this.gender = gender;
    }

    public Student() {
    }

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

}
