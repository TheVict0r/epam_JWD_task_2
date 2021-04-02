package by.epamtc.task2.ex1.logic;

import by.epamtc.task2.ex1.entity.Ball;
import by.epamtc.task2.ex1.entity.Basket;
import by.epamtc.task2.ex1.entity.Color;

public class Operator {

	
	public void fillBacket (int numberOfBalls) {
		BallGenerator ballGenerator = new BallGenerator();
		
		for (int i = 0; i < numberOfBalls; i++) {
			Ball ball = ballGenerator.generateRandomBall();
			addBallToBasket(ball);
		}
		
	}
	
	
	public void addBallToBasket(Ball ball) {
		Basket basket = Basket.getInstance();
		basket.takeBasket().add(ball);
	}
	
	public int defineColorBallsCount(Color color) {
		Basket basket = Basket.getInstance();
		int count = 0;
		
		for(Ball ball : basket.takeBasket()) {
			if (ball.getColor() == color) {
				count++;
			}
		}
		return count;
	}
	
	public double defineBasketTotalWeight() {
		Basket basket = Basket.getInstance();
		double totalWeight = 0.0;
		
		for(Ball ball : basket.takeBasket()) {
			totalWeight += ball.getWeight();
		}
		return totalWeight;
	}
	
}
