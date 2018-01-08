package examples.view.com.parcelableexample;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

/**
 * Created by user on 10-Nov-17.
 */

public class Employs implements Parcelable {
    public Employs(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public List<Employee> employeeList;

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    protected Employs(Parcel in) {

        this.employeeList = in.readArrayList(null);
    }

    public static final Creator<Employs> CREATOR = new Creator<Employs>() {
        @Override
        public Employs createFromParcel(Parcel in) {
            return new Employs(in);
        }

        @Override
        public Employs[] newArray(int size) {
            return new Employs[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(employeeList);
    }
}
