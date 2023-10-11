package com.no3.gameproject.entity;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter @Setter
public class OrderItem extends BaseEntity {

    @Id @GeneratedValue
    @Column(name = "order_item_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "item_id")
    private Item item;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id")
    private Order order;

    private int orderPrice; //주문가격

    public static OrderItem createOrderItem(Item item){
        OrderItem orderItem = new OrderItem();
        
        orderItem.setItem(item);
        orderItem.setOrderPrice(item.getPrice());

        return orderItem;
    }

    public int getTotalPrice(){ // 주문 가격과 주문 수량을 곱해서 해당 상품을 주문한

        return orderPrice;
    }
}
