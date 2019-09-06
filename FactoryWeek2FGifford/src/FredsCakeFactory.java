// Fred's franchise of Cake Factory will have specific Cake items 
// on the menu with pre-defined decorator's that his bakery implements

public class FredsCakeFactory extends CakeFactory {

	public Cake createCake(String type) {
		if (type.equals("chocolate")) {
			return new ButtercreamFrosting(new ChocolateCake());
		} else if (type.equals("red velvet")) {
			return new CreamCheeseFrosting(new RedVelvetCake());
		}
		else return null;
	}

}
