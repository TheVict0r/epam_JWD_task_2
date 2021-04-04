package by.epamtc.task2.ex1.entity;

import java.util.ArrayList;
import java.util.List;

// Singleton

public class Basket {

	private static Basket instance;

	private List<Ball> list;
	
	private int capacity;

	private final static int DEFAULT_CAPACITY = 70;
	
	private Basket() {
		list = new ArrayList<>();
	}

	public static Basket getInstance() {
		if (instance == null) {
			instance = new Basket();
			instance.setCapacity(DEFAULT_CAPACITY);
		}

		return instance;
	}

	
	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public List<Ball> takeBasket() {
		return list;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " [list=" + list + "]";
	}

	
	
}
