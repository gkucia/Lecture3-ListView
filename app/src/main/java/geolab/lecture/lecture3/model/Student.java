package geolab.lecture.lecture3.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.os.ParcelableCompatCreatorCallbacks;

import java.io.Serializable;

/**
 * Created by Jay on 6/10/2015.
 */
public class Student implements Parcelable {
    private String saxeli, status, phoneNumber;

    public Student(String saxeli, String status, String phoneNumber) {
        this.saxeli = saxeli;
        this.status = status;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "saxeli='" + saxeli + '\'' +
                ", status='" + status + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    public String getSaxeli() {
        return saxeli;
    }

    public void setSaxeli(String saxeli) {
        this.saxeli = saxeli;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

    }
}
