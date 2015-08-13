package designPattern.Factory.framwork;

public abstract class Factory {
	public final Product creat(String owner){
		Product p = creatProduct(owner);
		registerProduct(p);
		return p;
	}
	protected abstract Product creatProduct(String owner);
	protected abstract void registerProduct(Product product);
}
