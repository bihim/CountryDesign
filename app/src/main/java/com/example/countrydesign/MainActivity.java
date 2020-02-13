package com.example.countrydesign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.manojbhadane.QButton;

public class MainActivity extends AppCompatActivity {


    EditText receiverName, mobileNumber, bankName, branchName, accountNumber, amount;
    QButton buttonSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.next_activity);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(MainActivity.this, AnotherActivity.class));
            }
        });

        findViewDeclaring();

    }

    private void findViewDeclaring()
    {
        receiverName    = findViewById(R.id.receiver_name);
        mobileNumber    = findViewById(R.id.mobile_number);
        bankName        = findViewById(R.id.bank_name);
        branchName      = findViewById(R.id.branch_name);
        accountNumber   = findViewById(R.id.account_name);
        amount          = findViewById(R.id.amount);
        buttonSend      = findViewById(R.id.send);

        buttonSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(MainActivity.this, "Clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
