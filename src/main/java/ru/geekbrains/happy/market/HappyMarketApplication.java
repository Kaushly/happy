package ru.geekbrains.happy.market;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class HappyMarketApplication {
	// Домашнее задание:
	// 1. Добавить к заказу возможность указания адреса доставки в виде строки++
	// 2. Сделать регистрацию пользователей через REST API

	public static void main(String[] args) {
		SpringApplication.run(HappyMarketApplication.class, args);
	}
}
