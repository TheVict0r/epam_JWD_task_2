package by.epamtc.task2.ex1.entity;

import java.util.ArrayList;
import java.util.List;


public class Basket {


	private List<Ball> list;
	
	private int capacity;

	private final static int DEFAULT_CAPACITY = 70;
	
	private int ballsInBucket;
	
	public Basket() {
		list = new ArrayList<>();
		setCapacity(DEFAULT_CAPACITY);
		ballsInBucket = 0;
	}

	public Basket(int capacity) {
		list = new ArrayList<>();
		this.capacity = capacity;
		ballsInBucket = 0;
	}
	
	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getBallsInBasket() {
		return ballsInBucket;
	}

	public void setBallsInBucket(int ballsInBucket) {
		this.ballsInBucket = ballsInBucket;
	}
	
	
	public List<Ball> takeBasket() {
		return list;
	}


	@Override
	public int hashCode() {
		final int prime = 42;
		int result = 1;
		result = prime * result + capacity;
		result = prime * result + ((list == null) ? 0 : list.hashCode());
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
		Basket other = (Basket) obj;
		if (capacity != other.capacity)
			return false;
		if (list == null) {
			if (other.list != null)
				return false;
		} else if (!list.equals(other.list))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return getClass().getSimpleName() + " [list=" + list + ", capacity=" + capacity + "]";
	}

}
