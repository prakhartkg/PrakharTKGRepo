package factory;

public class FoodFactory {
	public Food getFood(String food){
		
		if(food.equals("Chinese"))
			return new Chinese();
		else if(food.equals("Italian"))
			return new Italian();
		else if(food.equals("Indian"))
			return new Indian();
		else
		return null;
	}
}
