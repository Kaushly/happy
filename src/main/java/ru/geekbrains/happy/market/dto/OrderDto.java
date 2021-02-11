package ru.geekbrains.happy.market.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import ru.geekbrains.happy.market.model.Order;

@NoArgsConstructor
@Data
public class OrderDto {
    private Long id;
    private String username;
    private int totalPrice;
    private String creationDateTime;

    public OrderDto(Order order) {
        this.id = order.getId();
        this.username = order.getOwner().getUsername();
        this.totalPrice = order.getPrice();
        this.creationDateTime = order.getCreatedAt().toString();
    }
}