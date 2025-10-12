package com.praticandoweb.webservice.entities.enums;

public enum OrderStatus {

    WAITING_PAYMENT(1),
    PAID(2),
    SHIPPED(3),
    DELIVERED(4),
    CANCELED(5);

    private int code;

    /*
    Cada constante do enum chama esse construtor passando seu número.
    → Por exemplo: WAITING_PAYMENT(1) chama OrderStatus(1) → guarda 1 no code.
    */
    private OrderStatus (int code) { // CONSTRUCTOR
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static OrderStatus valueOf(int code) {
        for (OrderStatus value : OrderStatus.values()) {
            if (value.getCode() == code) {
                return value;
            }
        }
        throw new IllegalArgumentException("Inválid OrderStatus code!");
    }
}
