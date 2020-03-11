package hu.Komplex_web_alk;

public class User {
	
	private String nev;

	public User(String nev) {
		super();
		this.nev = nev;
	}
	
	public String getNev() {
		return nev;
	}

	public void setNev(String nev) {
		this.nev = nev;
	}

	@Override
	public String toString() {
		
		return "User [nev="+ nev + "]";
	}
	
	

	

	
	
	
	

}
