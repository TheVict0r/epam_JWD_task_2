package by.epamtc.task2.ex1.main;

//import java.awt.Color;

import by.epamtc.task2.ex1.entity.Ball;
import by.epamtc.task2.ex1.entity.Basket;
import by.epamtc.task2.ex1.entity.Color;
import by.epamtc.task2.ex1.logic.Operator;

/*
 * Создать класс Мяч. Создать класс Корзина. Наполнить корзину мячиками. 
 * Определить вес мячиков в корзине и количество синих мячиков.
 */
 

public class Main {

	public static void main(String[] args) {
		Operator operator = new Operator();
		
		operator.addBallToBasket(new Ball(2.8, Color.WHITE));
		operator.addBallToBasket(new Ball(3.4, Color.BLACK));
		operator.addBallToBasket(new Ball(2.8, Color.BLUE));
		operator.addBallToBasket(new Ball(8.3, Color.GRAY));
		operator.addBallToBasket(new Ball(1.4, Color.BLUE));
		operator.addBallToBasket(new Ball(7.5, Color.BLUE));
		operator.addBallToBasket(new Ball(2.8, Color.WHITE));
		operator.addBallToBasket(new Ball(1.1, Color.ORANGE));
		
		System.out.println("Общий вес корзины - " + operator.defineBasketTotalWeight());
		System.out.println("Всего в корзине синих шаров - " + operator.defineColorBallsCount(Color.BLUE));
		
	}

}
