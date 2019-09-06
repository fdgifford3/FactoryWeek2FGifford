// Emily's franchise of Cake Factory will have specific Cake items 
// on the menu with pre-defined decorator's that her bakery implements

public class EmilysCakeFactory extends CakeFactory {

	public Cake createCake(String type) {
		if (type.equals("chocolate")) {
			return new ChocolateFrosting(new ChocolateCake());
		} else if (type.equals("red velvet")) {
			return new CreamCheeseFrosting(new RedVelvetCake());
		}
		else return null;
	}

}
