package com.macair.evenoddfactorial;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView tv1;
    EditText et1;
    Button bt1,bt2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        tv1=findViewById(R.id.tv1);
        et1=findViewById(R.id.et1);
        bt1=findViewById(R.id.bt1);
        bt2=findViewById(R.id.bt2);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int num=Integer.parseInt(et1.getText().toString());
                int fact = 0;
                if(num==0){
                    fact=0;
                } else if (num==1) {
                    fact=0;
                }
                else{
                    for(int i=num;i>=0;i--){
                        fact= num * (num-1);
                    }}
                tv1.setText(Integer.toString(fact));

            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num=Integer.parseInt(et1.getText().toString());
                if(num%2==0){
                    tv1.setText(num+ " is Even Number");
                }
                else{
                    tv1.setText(num+ " is Odd Number");
                }
            }
        });


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}