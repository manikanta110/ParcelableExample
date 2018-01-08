package examples.view.com.parcelableexample;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by user on 10-Nov-17.
 */

public class Model implements Parcelable {

    String name;
    String email;
    String Password;

    public Model(String name, String email, String password) {
        this.name = name;
        this.email = email;
        Password = password;
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

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    protected Model(Parcel in) {
       this. name=in.readString();
       this. email = in.readString();
       this. Password = in.readString();



    }

    public static final Creator<Model> CREATOR = new Creator<Model>() {
        @Override
        public Model createFromParcel(Parcel in) {
            return new Model(in);
        }

        @Override
        public Model[] newArray(int size) {
            return new Model[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeString(this.email);
        dest.writeString(this.Password);
    }



}
