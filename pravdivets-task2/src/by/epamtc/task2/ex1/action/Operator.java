package by.epamtc.task2.ex1.action;

import java.util.Random;

import by.epamtc.task2.ex1.entity.Ball;
import by.epamtc.task2.ex1.entity.Basket;
import by.epamtc.task2.ex1.entity.Color;

public class Operator {

	private final int BUFFER = 10;
	// величина, на которую в случае необходимости "оператор" будет автоматически увеличивать
	// capacity корзины


	public void addBallToBasket(Basket basket, Ball ball) {
		if (basket == null) {
			// throw new NullBasketException(basket);
			// пока не реализовано
		}

		if (ball == null) {
			// throw new NoBallException(ball);
		}

		if (basket.getBallsInBasket() == basket.getCapacity()) {
			basket.setCapacity(basket.getBallsInBasket() + BUFFER);
		}

		basket.takeBasket().add(ball);
		basket.setBallsInBucket(basket.getBallsInBasket() + 1);
	}

	public void fillBasket(Basket basket, int numberOfBalls) {

		if (basket == null) {
			// throw new NullBasketException(basket);
			// пока не реализовано
		}

		if (numberOfBalls <= 0) {
			// throw new IllegalNumberOfBallsException(numberOfBalls);
			// пока не реализовано
		}

		for (int i = 0; i < numberOfBalls; i++) {
			Ball ball = generateRandomBall();
			addBallToBasket(basket, ball);
		}

	}


	
	public Ball takeSpecifiedBall(Basket basket, Ball ball) {
		if (ball == null) {
			// throw new NoBallException();
		}
		
		if (basket == null) {
			// throw new NullBasketException(basket);
			// пока не реализовано
		}
		
		Ball outBall = null;
		for (Ball ballInBucket : basket.takeBasket()) {
			if (ballInBucket.equals(ball)) {
				outBall = ballInBucket;
			}
		}
		
		if (outBall != null) {
			basket.takeBasket().remove(outBall);
			basket.setBallsInBucket(basket.getBallsInBasket() - 1);
		}
		
		return outBall;
	}

	public Ball takeBallByColor(Basket basket, Color color) {
		if (color == null) {
			// throw new NoColorException();
		}

		if (basket == null) {
			// throw new NullBasketException(basket);
			// пока не реализовано
		}

		Ball ball = null;
		for (Ball ballInBucket : basket.takeBasket()) {
			if (ballInBucket.getColor() == color) {
				ball = ballInBucket;
			}
		}

		if (ball != null) {
			basket.takeBasket().remove(ball);
			basket.setBallsInBucket(basket.getBallsInBasket() - 1);
		}

		return ball;
	}

	public Ball takeRandomBall(Basket basket) {
		if (basket == null) {
			// throw new NullBasketException(basket);
			// пока не реализовано
		}

		Random random = new Random();
		
		int idx = random.nextInt(basket.getBallsInBasket());
		
		Ball ball = basket.takeBasket().remove(idx);
		basket.setBallsInBucket(basket.getBallsInBasket() - 1);
		
		return ball;
	}
	
	public int countBallsByColor(Basket basket, Color color) {
		if (color == null) {
			// throw new NoColorException(color);
			// пока не реализовано
		}
		
		if (basket == null) {
			// throw new NullBasketException(basket);
			// пока не реализовано
		}
		
		int count = 0;
		
		for (Ball ballInBucket : basket.takeBasket()) {
			if (ballInBucket.getColor() == color) {
				count++;
			}
		}
		return count;
	}

	public double defineBasketTotalWeight(Basket basket) {

		if (basket == null) {
			// throw new NullBasketException(basket);
			// пока не реализовано
		}

		double totalWeight = 0.0;

		for (Ball ball : basket.takeBasket()) {
			totalWeight += ball.getWeight();
		}
		return totalWeight;
	}

	public Ball generateRandomBall() {

		double weight = generateRandomWeight();
		Color color = generateRandomColor();

		Ball ball = new Ball(weight, color);
		return ball;
	}

	public double generateRandomWeight() {
		Random rand = new Random();
		double weight;
		weight = (rand.nextInt(3) + 1) + rand.nextDouble();
		return weight;
	}

	public Color generateRandomColor() {
		Color color = null;
		Color[] allColors = Color.values();

		Random rand = new Random();
		int idx = rand.nextInt(allColors.length);

		for (int i = 0; i < allColors.length; i++) {
			if (i == idx) {
				color = allColors[i];
			}
		}

		return color;
	}

}
