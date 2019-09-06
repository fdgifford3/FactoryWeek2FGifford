// Emily's franchise of Cake Factory will have specific Cake items 
// on the menu with pre-defined decorator's that her bakery implements

public class EmilysCakeFactory extends CakeFactory {

	public Cake createCake(String type, Size size) {
		if (type.equals("chocolate")) {
			return new ChocolateFrosting(new ChocolateCake(size));
		} else if (type.equals("red velvet")) {
			return new CreamCheeseFrosting(new RedVelvetCake(size));
		} else if (type.equals("vanilla")) {
			return new ButtercreamFlowers(
					new ButtercreamFlowers(
					 new ButtercreamFlowers(
					  new ButtercreamFrosting(
					   new VanillaCake(size))))); //Emily thinks all customers love tons of flowers
		} else if (type.equals("cookies and cream")) {
			return new CookieCrumbs(
					new CookiesCreamFrosting(
					 new CookiesCreamCake(size)));
		} else if (type.equals("confetti")) {
			return new Sprinkles(
					new ButtercreamFrosting(
					 new ConfettiCake(size)));
		}
		else return null;
	}

}
