package by.epamtc.task2.ex1.entity;

import java.util.ArrayList;
import java.util.List;

//Singletone

public class Basket {

	private static Basket instance;

	private Basket() {

	}

	public static Basket getInstance() {
		if (instance == null) {
			instance = new Basket();
		}

		return instance;
	}

	private double totalWeight = 0.0;

	public double getTotalWeight() {
		return totalWeight;
	}

	public void addTotalWeight (double ballWeight) {
		totalWeight += ballWeight;
	}
	
	
	
	private List<Ball> list = new ArrayList<>();
	
	public List<Ball> getList(){
		return list;
	}

}
