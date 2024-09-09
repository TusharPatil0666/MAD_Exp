package com.macair.calculator;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText n1,n2;

    Button add,sub,mul,div;

    TextView tv1;


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        n1 = findViewById(R.id.n1);
        n2 = findViewById(R.id.n2);

        add = findViewById(R.id.add);
        sub = findViewById(R.id.sub);
        mul = findViewById(R.id.mul);
        div = findViewById(R.id.div);
        tv1 = findViewById(R.id.tv1);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int no1 = Integer.parseInt(n1.getText().toString());
                int no2 = Integer.parseInt(n2.getText().toString());
                int no3 = no1+no2;

                tv1.setText("Addition is "+ Integer.toString(no3));

                Toast.makeText(getApplicationContext(), "Addition Done", Toast.LENGTH_SHORT).show();

            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int no1 = Integer.parseInt(n1.getText().toString());
                int no2 = Integer.parseInt(n2.getText().toString());
                int no3 = no1-no2;

                tv1.setText("Subtraction is "+Integer.toString(no3));

                Toast.makeText(getApplicationContext(), "Subtraction Done", Toast.LENGTH_SHORT).show();
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int no1 = Integer.parseInt(n1.getText().toString());
                int no2 = Integer.parseInt(n2.getText().toString());
                int no3 = no1*no2;

                tv1.setText("Multiplication is "+Integer.toString(no3));
                Toast.makeText(getApplicationContext(), "Multiplication Done", Toast.LENGTH_SHORT).show();
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int no1 = Integer.parseInt(n1.getText().toString());
                int no2 = Integer.parseInt(n2.getText().toString());
                int no3 = no1/no2;

                tv1.setText("Division is "+Integer.toString(no3));

                Toast.makeText(getApplicationContext(), "Division Done", Toast.LENGTH_SHORT).show();
            }
        });
    }
}