package com.hungphamcom.exercise2_bt4;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ViewContactActivity extends MainActivity {

    TextView txtNameValue;
    TextView txtEmailValue;
    TextView txtProjectValue;

    Button finishBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contactinfo);

        txtNameValue=findViewById(R.id.txtNameDisplay);
        txtEmailValue=findViewById(R.id.txtEmailDisplay);
        txtProjectValue=findViewById(R.id.txtProjectDisplay);

        finishBtn=findViewById(R.id.finish);
        finishBtn.setOnClickListener(mClickListener);

        Bundle bundle=getIntent().getExtras();
        String name=bundle.getString("namekey");
        String email=bundle.getString("emailkey");
        String project=bundle.getString("projectkey");

        txtNameValue.setText(name);
        txtEmailValue.setText(email);
        txtProjectValue.setText(project);
    }

    private View.OnClickListener mClickListener=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            finish();
        }
    };
}
