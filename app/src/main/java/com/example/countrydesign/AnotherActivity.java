package com.example.countrydesign;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.manojbhadane.QButton;

import java.util.ArrayList;

public class AnotherActivity extends AppCompatActivity {

    ArrayList<PaymentMethod> paymentMethods;
    PaymentMethodAdapter paymentMethodAdapter;
    Spinner spinner;
    EditText receiverName, accountNumber, amount;
    QButton qButtonSend;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);


        findViewDeclare();
        initList();
        customSpinner();
    }


    private void findViewDeclare()
    {
        receiverName    = findViewById(R.id.receiver_name_another);
        accountNumber   = findViewById(R.id.account_name_another);
        amount          = findViewById(R.id.amount_another);
        qButtonSend     = findViewById(R.id.send_another);
        spinner         = findViewById(R.id.payment_method_spinner);
    }


    private void initList()
    {
        paymentMethods = new ArrayList<>();
        paymentMethods.add(new PaymentMethod("bkash", R.drawable.bkash));
        paymentMethods.add(new PaymentMethod("Rocket", R.drawable.rocket));
        paymentMethods.add(new PaymentMethod("Nogod", R.drawable.nogod));
        paymentMethods.add(new PaymentMethod("Ucash", R.drawable.ucash));
    }

    private void customSpinner()
    {
        paymentMethodAdapter = new PaymentMethodAdapter(this, paymentMethods);
        spinner.setAdapter(paymentMethodAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {
                PaymentMethod clickedItem = (PaymentMethod) parent.getItemAtPosition(position);

                String selectedPaymentMethod = clickedItem.getPaymentMethodName();

                Toast.makeText(AnotherActivity.this, selectedPaymentMethod+" is selected", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent)
            {

            }
        });
    }
}
