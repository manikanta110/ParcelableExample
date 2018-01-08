package examples.view.com.parcelableexample;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    EditText name,email,password;
    Button b;
    Model model;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name =(EditText)findViewById(R.id.edt_name);
        email = (EditText)findViewById(R.id.edt_email);
        password =(EditText)findViewById(R.id.edt_pass);
        b = (Button)findViewById(R.id.button);


        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,Second.class);
                intent.putExtra("data",new Model(name.getText().toString(),email.getText().toString(),password.getText().toString()));
                startActivity(intent);




            }
        });
    }
}
