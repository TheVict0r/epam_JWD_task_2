package by.epamtc.task2.ex1.datarequest;

import by.epamtc.task2.ex1.entity.Basket;
import by.epamtc.task2.ex1.scanner.DataScanner;

public class DataRequest {

	public static int requestNumberOfBalls() {
		int numberOfBalls = 0;
		Basket basket = Basket.getInstance();
		int basketCapacity = basket.getCapacity();
		
		System.out.printf("Укажите, пожалуйста, сколько мячей вы хотите положить в корзину (сейчас в неё помещается не более %s мячей):\n", basketCapacity);
				
		do {
			numberOfBalls = DataScanner.enterIntFromConsole();

			if (numberOfBalls == 0) {
				System.out.println("Количество мячей не может равняться 0. Пожалуйста, введите данные ещё раз:");
			} else if (numberOfBalls < 0) {
				System.out.println("Количество мячей не может быть отрицательным. Пожалуйста, введите данные ещё раз:");
			}

		} while (numberOfBalls <= 0);

		return numberOfBalls;
	}	
	
}
