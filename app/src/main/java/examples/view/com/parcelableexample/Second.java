package examples.view.com.parcelableexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Second extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        textView = (TextView)findViewById(R.id.t1);

        Bundle bundle = getIntent().getExtras();
        Model model =(Model) bundle.getParcelable("data");
        textView.setText("Name :" +model.getName()+"\n"+ "Email :"+model.getEmail()+"\n"+"Password:"+model.getPassword());
    }
}
