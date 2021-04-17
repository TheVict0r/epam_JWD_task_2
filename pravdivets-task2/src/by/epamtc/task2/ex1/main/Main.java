package by.epamtc.task2.ex1.main;



import by.epamtc.task2.ex1.action.Operator;
import by.epamtc.task2.ex1.entity.Ball;
import by.epamtc.task2.ex1.entity.Basket;
import by.epamtc.task2.ex1.entity.Color;


/*
 * Создать класс Мяч. Создать класс Корзина. Наполнить корзину мячиками. 
 * Определить вес мячиков в корзине и количество синих мячиков.
 */
 

public class Main {

	public static void main(String[] args) {
		
		Operator operator = new Operator();
		Basket basket = new Basket();
		
		operator.fillBacket(basket, 50);
		Ball ball1 = new Ball(2, Color.BLUE);
		Ball ball2 = new Ball(1.5, Color.RED);
		Ball ball3 = new Ball(0.5, Color.ORANGE);
		operator.addBallToBasket(basket, ball1);
		operator.addBallToBasket(basket, ball2);
		operator.addBallToBasket(basket, ball3);
		operator.removeBallByColor(basket, Color.ORANGE);
		operator.removeSpecificBall(basket, ball3);
		operator.fillBacket(basket, 50);
		
		System.out.println("Сейчас в корзине мячей - " + basket.getBallsInBucket());
		System.out.println("Емкость корзины составляет - " + basket.getCapacity());
		
		double basketTotalWeight = operator.defineBasketTotalWeight(basket);
		int colorBallsCount = operator.countBallsByColor(basket, Color.BLUE);
		
		System.out.println("Общий вес корзины - " + basketTotalWeight);
		System.out.println("Всего в корзине синих мячей - " + colorBallsCount);
		
		

		
	}

}
