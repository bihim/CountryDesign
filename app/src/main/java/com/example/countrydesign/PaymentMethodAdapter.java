package com.example.countrydesign;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class PaymentMethodAdapter extends ArrayAdapter<PaymentMethod>
{

    public PaymentMethodAdapter(Context context, ArrayList<PaymentMethod> paymentMethods)
    {
        super(context, 0, paymentMethods);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {
        return initView(position, convertView, parent);
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {
        return initView(position, convertView, parent);
    }


    private View initView (int position, View convertView, ViewGroup parent)
    {
        if (convertView == null)
        {
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.payment_carriers_name, parent, false);
        }

        ImageView imageViewPaymentMethodIcons = convertView.findViewById(R.id.payment_method_icon);
        TextView textViewPaymentMethodText = convertView.findViewById(R.id.payment_method_name);

        PaymentMethod currentItem = getItem(position);

        if (currentItem!=null)
        {
            imageViewPaymentMethodIcons.setImageResource(currentItem.getPaymentMethodImage());
            textViewPaymentMethodText.setText(currentItem.getPaymentMethodName());
        }

        return convertView;
    }
}
