package com.learning.adaptor;

public class ZarinpalAdapter implements PaymentProcessor {
    private ZarinpalGateway zarinpal;

    public ZarinpalAdapter(ZarinpalGateway zarinpal) {
        this.zarinpal = zarinpal;
    }

    @Override
    public void pay(int amount) {
        // تبدیل اینترفیس به فرمت مورد نیاز کلاینت
        zarinpal.requestPayment(amount);
    }
}
