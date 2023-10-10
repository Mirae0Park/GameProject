package com.no3.gameproject.exception;

public class OutOfStockException extends RuntimeException{ // 상품의 주문 수량보다 재고의 수가 적을 때 발생시킴

    public OutOfStockException(String message){
        super(message);
    }
}
