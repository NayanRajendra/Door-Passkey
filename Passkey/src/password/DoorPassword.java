package password;

import java.util.Scanner;

public class DoorPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the room key/password");
		int n=sc.nextInt();
		if(n==101) {
			System.out.println("Door opened");
		}
		else {
			System.out.println("Access denied");
			System.out.println("Please enter correct password");
			System.out.println();
		}

	}
  }

