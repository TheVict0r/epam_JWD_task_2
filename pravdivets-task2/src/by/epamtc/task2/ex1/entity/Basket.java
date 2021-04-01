package by.epamtc.task2.ex1.entity;

import java.util.ArrayList;
import java.util.List;

//Singletone

public class Basket {

	private static Basket instance;

	private List<Ball> list;

	private Basket() {
		list = new ArrayList<>();
	}

	public static Basket getInstance() {
		if (instance == null) {
			instance = new Basket();
		}

		return instance;
	}

	public List<Ball> getList() {
		return list;
	}

}
