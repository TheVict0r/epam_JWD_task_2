package by.epamtc.task2.ex1.logic;

import by.epamtc.task2.ex1.entity.Ball;
import by.epamtc.task2.ex1.entity.Basket;
import by.epamtc.task2.ex1.entity.Color;
import by.epamtc.task2.ex1.exception.NoBallException;
import by.epamtc.task2.ex1.exception.NoColorException;

public class Operator {

	private int ballsInBucket = 0;
	
	public void fillBacket (int numberOfBalls) throws NoBallException {
		BallGenerator ballGenerator = new BallGenerator();
		Basket basket = Basket.getInstance();
		
		for (int i = 0; i < numberOfBalls; i++) {
			
			if (ballsInBucket == basket.getCapacity()) {
				System.out.println("Всего в корзину поместилось " + ballsInBucket + " мячей. В ней больше нет места.");
				break;
			}
			
			Ball ball = ballGenerator.generateRandomBall();
			addBallToBasket(ball);
			ballsInBucket++;
		}
		
	}
	
	
	public void addBallToBasket(Ball ball) throws NoBallException {
		if (ball == null) {
			throw new NoBallException();
		}
		
		Basket basket = Basket.getInstance();
		basket.takeBasket().add(ball);
	}

	public Ball takeBallFromBucket(Color color) throws NoColorException {
		if (color == null) {
			throw new NoColorException();
		}
		
		Basket basket = Basket.getInstance();
		Ball ball = null;
		for (Ball ball1 : basket.takeBasket()) {
			if (ball1.getColor() == color) {
				ball = ball1;
				basket.takeBasket().remove(ball1);
			}
		}
		return ball;
	}
	
	public int defineColorBallsCount(Color color) throws NoColorException {
		if (color == null) {
			throw new NoColorException();
		}
		
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
