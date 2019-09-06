
public abstract class CakeDecorator extends Cake {

	public Cake cake;
	public abstract String getDescription();
	
	public Size getSize() {
		return cake.getSize();
	}

}
