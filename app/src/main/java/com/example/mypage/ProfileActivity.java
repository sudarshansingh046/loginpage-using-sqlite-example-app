package com.example.mypage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ProfileActivity extends Activity {
    TextView tv;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        Intent i=getIntent();
        String str=i.getStringExtra("username");
        tv=(TextView)findViewById(R.id.tv);
        b=(Button)findViewById(R.id.b);

        tv.setText(str);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLogout=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intentLogout);

            }
        });


    }
}
