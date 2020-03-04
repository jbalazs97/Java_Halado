package hu.me.krz.haladojava;


public class Tanar extends Szemely implements Valogato{

	private float avg;
	public Tanar(String name, int age) {
		super(name, age);
		avg = 0;
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean joAlanyE() {
		// TODO Auto-generated method stub
		return (getAge() < 30 && avg > 4);
	}

}