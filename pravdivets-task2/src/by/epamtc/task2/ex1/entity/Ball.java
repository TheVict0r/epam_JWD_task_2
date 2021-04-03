package by.epamtc.task2.ex1.entity;

import java.io.Serializable;

import by.epamtc.task2.ex1.logic.BallGenerator;

@SuppressWarnings({ "serial" })
public class Ball implements Serializable{

	private double weight;
	private Color color;
	
	
	public Ball() {
		BallGenerator ballGenerator = new BallGenerator();
		ballGenerator.generateRandomBall();
	}
	
	public Ball(double weight, Color color) {
		this.weight = weight;
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		long temp;
		temp = Double.doubleToLongBits(weight);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ball other = (Ball) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (Double.doubleToLongBits(weight) != Double.doubleToLongBits(other.weight))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " [weight=" + weight + ", color=" + color.name() + "]";
	}
	
	
	
	
}
