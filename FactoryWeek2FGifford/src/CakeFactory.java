//Generic Cake Factory that we will extend to create a specific
//Bakery's menu of cakes
public abstract class CakeFactory {

	public Cake bakeCake(String type, Size size) {
		Cake cake;
		
		cake = createCake(type);
		cake.setSize(size);
		return cake;
		
	}
	public abstract Cake createCake(String type);
}
