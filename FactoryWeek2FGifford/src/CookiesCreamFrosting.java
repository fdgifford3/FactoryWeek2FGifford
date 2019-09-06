
public class CookiesCreamFrosting extends CakeDecorator {

	public CookiesCreamFrosting(Cake cake) {
		this.cake = cake;
	}
	
	public String getDescription() {
		return cake.getDescription() + ", Cookies and Cream Frosting";
	}

	public double cost() {
		double cost = cake.cost();
		Size size = cake.getSize();
		
		if (size == Size.FOUR) {
			cost += 4.00;
		} else if (size == Size.SIX) {
			cost += 4.50;
		} else if (size == Size.EIGHT) {
			cost += 5.00;
		} else if (size == Size.TEN) {
			cost += 5.50;
		}
		return cost;
	}

}
