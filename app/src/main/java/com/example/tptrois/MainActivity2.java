package com.example.tptrois;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ActionBar bar = getSupportActionBar();
        bar.setTitle("Activity2");
        bar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#9431A5")));



       EditText edt2=findViewById(R.id.edt2);
        TextView msg =findViewById(R.id.txtmsg2);

        Button btn2=findViewById(R.id.btn2);
        String msgrecue = getIntent().getStringExtra("send");
        msg.setText(msgrecue);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String messageSend= edt2.getText().toString();

                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                intent.putExtra("Reply",messageSend);
                startActivity(intent);
            }});

//        btn2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                EditText edt2=findViewById(R.id.edt2);
//                String messageReply= edt2.getText().toString();
//
//                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
//                intent.putExtra("Reply",messageReply);
//                startActivity(intent);
//            }});
//        Intent intent = getIntent();
//
//        String msgrecue = getIntent().getStringExtra("send");
//        msg.setText(msgrecue);

    }
}