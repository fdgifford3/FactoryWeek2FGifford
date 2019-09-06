/*
 * Frederick Gifford
 * CPSC-60000 Week 2 Factory Pattern to Extend
 * Week 1 Decorator Pattern with Baking Theme
 * 9.6.2019
 * Prof Nowak
 */
public class FactoryWeek2FGifford {

	public static void main(String[] args) {
		System.out.println("Frederick Gifford\nCPSC-60000\nWeek 2 Factory Pattern\n");
		
		CakeFactory fredFactory = new FredsCakeFactory();
		CakeFactory emilyFactory = new EmilysCakeFactory();
		
		Cake cake = fredFactory.bakeCake("chocolate", Size.EIGHT);
		System.out.println("Order received for Fred's Cake Factory: " + cake.getDescription());
		System.out.println("The price will be $" + cake.cost());
		
		cake = emilyFactory.bakeCake("chocolate", Size.EIGHT);
		System.out.println("\nOrder received for Emily's Cake Factory: " + cake.getDescription());
		System.out.println("The price will be $" + cake.cost());
		

	}

}
