package ru.geekbrains.happy.market.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.geekbrains.happy.market.beans.Cart;
import ru.geekbrains.happy.market.dto.CartDto;

@RestController
@RequestMapping("/api/v1/cart")
@RequiredArgsConstructor
public class CartController {
    private final Cart cart;

    @GetMapping
    public CartDto getCart() {
        return new CartDto(cart);
    }

    @GetMapping("/add/{id}")
    public void addToCart(@PathVariable Long id) {
        cart.addToCart(id);
    }

    @GetMapping("/reduce/{title}")
    public void reduce(@PathVariable String title ) {
        cart.reduceProduct(title);
    }

    @GetMapping("/enlarge/{title}")
    public void enlarge(@PathVariable String title ) {
        cart.enlargeProduct(title);
    }



    @GetMapping("/clear")
    public void clearCart() {
        cart.clear();
    }

}