package by.epamtc.task2.ex1.main;

import by.epamtc.task2.ex1.datarequest.DataRequest;

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
		int numberOfBalls = DataRequest.requestNumberOfBalls();
		
		operator.fillBacket(numberOfBalls);
		
		double basketTotalWeight = operator.defineBasketTotalWeight();
		int colorBallsCount = operator.defineColorBallsCount(Color.BLUE);
		
		System.out.println("Общий вес корзины - " + basketTotalWeight);
		System.out.println("Всего в корзине синих шаров - " + colorBallsCount);

		
	}

}
