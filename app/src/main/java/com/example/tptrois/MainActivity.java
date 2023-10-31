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

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar bar = getSupportActionBar();
        bar.setTitle("MainActivity");
        bar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#0D547E")));


        TextView txtmsg1=findViewById(R.id.txtmsg1);
        EditText edt1=findViewById(R.id.edt1);
        Button btn1=findViewById(R.id.btn1);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String messageSend= edt1.getText().toString();

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("send",messageSend);
                startActivity(intent);
            }});

        Button btn2=findViewById(R.id.btn1);
        TextView msg =findViewById(R.id.txtmsg1);
        String msgrecue = getIntent().getStringExtra("Reply");
        msg.setText(msgrecue);
//        Intent intent = getIntent();
//        String msgrecue = getIntent().getStringExtra("Reply");
//        txtmsg1.setText(msgrecue);
    }
}
