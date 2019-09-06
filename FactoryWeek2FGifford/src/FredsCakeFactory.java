// Fred's franchise of Cake Factory will have specific Cake items 
// on the menu with pre-defined decorator's that his bakery implements

public class FredsCakeFactory extends CakeFactory {

	public Cake createCake(String type, Size size) {
		if (type.equals("chocolate")) {
			return new ButtercreamFrosting(new ChocolateCake(size));
		} else if (type.equals("red velvet")) {
			return new CreamCheeseFrosting(new RedVelvetCake(size));
		} else if (type.equals("vanilla")) {
			return new ButtercreamFlowers(
					new ButtercreamFrosting(
					 new VanillaCake(size)));
		} else if (type.equals("cookies and cream")) {
			return new CookieCrumbs(
					new CookieCrumbs(
					 new CookieCrumbs(
					  new CookiesCreamFrosting(
					   new CookiesCreamCake(size))))); //Fred assumes all customers are crazy for cookies on their cookies and cream cakes
		} else if (type.equals("confetti")) {
			return new ButtercreamFrosting(
					 new ConfettiCake(size));// Fred hates sprinkles, therefore he refuses to assume anyone would want them on a cake
		}
		else return null;
	}

}
