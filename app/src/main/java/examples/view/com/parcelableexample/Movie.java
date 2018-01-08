package examples.view.com.parcelableexample;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by user on 11-Dec-17.
 */

public class Movie implements Parcelable {

    String email;
    String Password;

    public Movie(String email, String password) {
        this.email = email;
        Password = password;
    }

    protected Movie(Parcel in) {
        email = in.readString();
        Password = in.readString();
    }

    public static final Creator<Movie> CREATOR = new Creator<Movie>() {
        @Override
        public Movie createFromParcel(Parcel in) {
            return new Movie(in);
        }

        @Override
        public Movie[] newArray(int size) {
            return new Movie[size];
        }
    };

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(email);
        parcel.writeString(Password);
    }
}
