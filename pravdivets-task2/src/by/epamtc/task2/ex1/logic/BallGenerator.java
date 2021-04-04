package by.epamtc.task2.ex1.logic;

import java.util.Random;

import by.epamtc.task2.ex1.entity.Ball;
import by.epamtc.task2.ex1.entity.Color;

public class BallGenerator {

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
