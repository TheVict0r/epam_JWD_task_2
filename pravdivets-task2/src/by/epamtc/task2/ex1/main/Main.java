package by.epamtc.task2.ex1.main;

import by.epamtc.task2.ex1.datarequest.DataRequest;

import by.epamtc.task2.ex1.entity.Color;
import by.epamtc.task2.ex1.exception.NoBallException;
import by.epamtc.task2.ex1.exception.NoColorException;
import by.epamtc.task2.ex1.logic.Operator;

/*
 * Создать класс Мяч. Создать класс Корзина. Наполнить корзину мячиками. 
 * Определить вес мячиков в корзине и количество синих мячиков.
 */
 

public class Main {

	public static void main(String[] args) {
		
		int numberOfBalls = DataRequest.requestNumberOfBalls();
		
		Operator operator = new Operator();
		
		try {
		
		operator.fillBacket(numberOfBalls);
		double basketTotalWeight = operator.defineBasketTotalWeight();
		int colorBallsCount = operator.defineColorBallsCount(Color.BLUE);
		
		System.out.println("Общий вес корзины - " + basketTotalWeight);
		System.out.println("Всего в корзине синих мячей - " + colorBallsCount);
		
		} catch (NoBallException nB) {
			nB.printStackTrace();
		} catch (NoColorException nC) {
			nC.printStackTrace();
		}
		

		
	}

}
