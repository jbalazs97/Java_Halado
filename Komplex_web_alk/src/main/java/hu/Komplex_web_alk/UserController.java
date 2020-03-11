package hu.Komplex_web_alk;

import java.util.Scanner;

public class UserController {

	public static void main(String[] args) {
			int szamol=1;
			
			for (int i = 0; i < szamol; i++) {
				
				System.out.println(i+1+". felhasznalo neve");
				Scanner sc=new Scanner(System.in);
				String felnev=sc.nextLine();
				
				if(felnev.length()>=6 && !felnev.contains(" ")){
					User user= new User(felnev);
					System.out.println(felnev+" Rendben");
				
			}
				else{
					System.out.println("Hiba l�pett fel.");
				}
		
	}

	}
}
