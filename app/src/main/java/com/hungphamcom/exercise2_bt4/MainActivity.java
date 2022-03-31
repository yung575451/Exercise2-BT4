package com.hungphamcom.exercise2_bt4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtName;
    TextView txtEmail;
    TextView txtProject;

    Button viewContactButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtName=findViewById(R.id.txtName);
        txtEmail=findViewById(R.id.txtEmail);
        txtProject=findViewById(R.id.txtProject);
        viewContactButton=findViewById(R.id.viewInfo);

        viewContactButton.setOnClickListener(click);
    }

    View.OnClickListener click=new View.OnClickListener() {
        @Override
        public void onClick(View view){
            Intent iGetConTactInfo=new Intent(getApplicationContext(),ViewContactActivity.class);
            Bundle bundle=new Bundle();
            bundle.putString("namekey",txtName.getText().toString());
            bundle.putString("emailkey",txtEmail.getText().toString());
            bundle.putString("projectkey",txtProject.getText().toString());
            iGetConTactInfo.putExtras(bundle);
            Log.d("main", "namekey: "+bundle.getString("namekey"));
            Log.d("main", "emailkey: "+bundle.getString("emailkey"));
            Log.d("main", "projectkey: "+bundle.getString("projectkey"));

            startActivity(iGetConTactInfo);
        }
    };

}