/*
 * Frederick Gifford
 * CPSC-60000 Week 2 Factory Pattern to Extend
 * Week 1 Decorator Pattern with Baking Theme
 * The goal was to reuse code from week 1 and
 * Keep the decorator pattern with as little refactoring
 * As possible while still showcasing the factory design
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
		
		cake = fredFactory.bakeCake("vanilla", Size.SIX);
		System.out.println("\nOrder received for Fred's Cake Factory: " + cake.getDescription());
		System.out.println("The price will be $" + cake.cost());
		
		cake = emilyFactory.bakeCake("vanilla", Size.TEN);
		System.out.println("\nOrder received for Emily's Cake Factory: " + cake.getDescription());
		System.out.println("The price will be $" + cake.cost());
		
		cake = fredFactory.bakeCake("red velvet", Size.FOUR);
		System.out.println("\nOrder received for Fred's Cake Factory: " + cake.getDescription());
		System.out.println("The price will be $" + cake.cost());
		
		cake = emilyFactory.bakeCake("red velvet", Size.EIGHT);
		System.out.println("\nOrder received for Emily's Cake Factory: " + cake.getDescription());
		System.out.println("The price will be $" + cake.cost());
		
		cake = fredFactory.bakeCake("cookies and cream", Size.SIX);
		System.out.println("\nOrder received for Fred's Cake Factory: " + cake.getDescription());
		System.out.println("The price will be $" + cake.cost());
		
		cake = emilyFactory.bakeCake("cookies and cream", Size.FOUR);
		System.out.println("\nOrder received for Emily's Cake Factory: " + cake.getDescription());
		System.out.println("The price will be $" + cake.cost());
		
		cake = fredFactory.bakeCake("confetti", Size.TEN);
		System.out.println("\nOrder received for Fred's Cake Factory: " + cake.getDescription());
		System.out.println("The price will be $" + cake.cost());
		
		cake = emilyFactory.bakeCake("confetti", Size.TEN);
		System.out.println("\nOrder received for Emily's Cake Factory: " + cake.getDescription());
		System.out.println("The price will be $" + cake.cost());
	}

}
