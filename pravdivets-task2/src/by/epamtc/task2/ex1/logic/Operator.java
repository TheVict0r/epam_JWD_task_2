package by.epamtc.task2.ex1.logic;

import by.epamtc.task2.ex1.entity.Ball;
import by.epamtc.task2.ex1.entity.Basket;
import by.epamtc.task2.ex1.entity.Color;

public class Operator {

	public void addBallToBasket(Ball ball) {
		Basket basket = Basket.getInstance();
		basket.getList().add(ball);
		basket.addTotalWeight(ball.getWeight());
		
	}
	
	public int calculateCountOfColorBalls(Color color) {
		Basket basket = Basket.getInstance();
		int count = 0;
		for(Ball ball : basket.getList()) {
			if (ball.getColor() == color) {
				count++;
			}
		}
		
		return count;
	}
	
	public double getBusketTotalWeight() {
		Basket basket = Basket.getInstance();
		return basket.getTotalWeight();
	}
	
}
