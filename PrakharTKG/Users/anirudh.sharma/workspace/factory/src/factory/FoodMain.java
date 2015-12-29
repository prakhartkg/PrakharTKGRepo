package factory;

import java.util.Scanner;

public class FoodMain {
	public static void main(String...args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Type of food you want To Eat");
		String foodType=sc.next();
		FoodFactory factory=new FoodFactory();
		Food food=factory.getFood(foodType);
		food.cook();
	}
}
