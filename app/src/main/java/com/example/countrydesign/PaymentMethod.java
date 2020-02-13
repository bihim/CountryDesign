package com.example.countrydesign;

public class PaymentMethod
{
    private String paymentMethodName;
    private int paymentMethodImage;

    public PaymentMethod(String paymentMethodName, int paymentMethodImage)
    {
        this.paymentMethodName = paymentMethodName;
        this.paymentMethodImage = paymentMethodImage;
    }

    public PaymentMethod(String paymentMethodName)
    {
        this.paymentMethodName = paymentMethodName;
    }

    public String getPaymentMethodName()
    {
        return paymentMethodName;
    }

    public void setPaymentMethodName(String paymentMethodName)
    {
        this.paymentMethodName = paymentMethodName;
    }

    public int getPaymentMethodImage()
    {
        return paymentMethodImage;
    }

    public void setPaymentMethodImage(int paymentMethodImage)
    {
        this.paymentMethodImage = paymentMethodImage;
    }
}
