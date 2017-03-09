import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Month [] months = Month.values();
		Season [] seasons = Season.values();

		

		Scanner scanner = new Scanner(System.in);

		boolean exist = false;
		String userSeason = null;
		int userDays = 0;
		
		
		while (true){
			
			System.out.println("enter some month");
			String userMonth = scanner.next();
			
			

			for (int i = 0; i < months.length; i++) {

				if (userMonth.equalsIgnoreCase(months[i].name())) {
					System.out.println(userMonth + " exist");
					exist = true;
					userSeason = months[i].getSeason().name();
					userDays = months[i].getDays();
					break;
				}

			}

			if (exist == false) {
				System.out.println(userMonth + " doesn't exist");
				break;
			}
			System.out.println("______________________");
			System.out.println(" ");
		
			System.out.println("enter 1 - all month this season");
			System.out.println("enter 2 - Months with the same number of days");
			System.out.println("enter 3 - Months with fewer days");
			System.out.println("enter 4 - Months with the most days");
			System.out.println("enter 5 - Next season");
			System.out.println("enter 6 - Previous season");
			System.out.println("enter 7 - Months with an even number of days");
			System.out.println("enter 8 - Months with an odd number of days");
			System.out.println("enter 9 - Check for pairing");
			
			
			int choise = scanner.nextInt();
			
			
			switch (choise){
			
				case 1:{
					
					System.out.println(" ");
					
					for (int i = 0; i < months.length; i++) {

						if (userSeason.equalsIgnoreCase(months[i].getSeason().name())) {
							System.out.println(months[i].name()+" is "+userSeason);
						}

					}
					
					System.out.println(" ");
					System.out.println("_______________");
					break;
				}
				case 2:{

					System.out.println(" ");
					
					for (int i = 0; i < months.length; i++) {

						if (userDays == months[i].getDays()){
							System.out.println(months[i].name() +" - "+ months[i].getDays()+" days");
						}

					}
					
					System.out.println(" ");
					System.out.println("_______________");
					break;	
				}
			
				case 3:{

					System.out.println(" ");
					
					for (int i = 0; i < months.length; i++) {

						if (userDays > months[i].getDays()){
							System.out.println(months[i].name() +" - "+ months[i].getDays()+" days");
						}

					}
					
					System.out.println(" ");
					System.out.println("_______________");
					break;
				}
			
				case 4:{

					System.out.println(" ");
					
					for (int i = 0; i < months.length; i++) {

						if (userDays < months[i].getDays()){
							System.out.println(months[i].name() +" - "+ months[i].getDays()+" days");
						}

					}
					
					System.out.println(" ");
					System.out.println("_______________");
					break;
				}
				
				case 5:{

					System.out.println(" ");
					
					if (userSeason.equalsIgnoreCase(seasons[3].name())) {
						System.out.println("This season - "+seasons[3].name()+". Next season - " + Season.values()[0]);
						break;
					}
					
					for (int i = 0; i < seasons.length; i++) {
						
						if (userSeason.equalsIgnoreCase(seasons[i].name())) {
							System.out.println("This season - "+seasons[i].name()+". Next season - " + Season.values()[i+1]);
							System.out.println(" ");
							System.out.println("_______________");
							break;
						}

					}
					
					System.out.println(" ");
					break;
				}

				case 6:{

					System.out.println(" ");
					
					if (userSeason.equalsIgnoreCase(seasons[0].name())) {
						System.out.println("This season - "+seasons[0].name()+". Next season - " + Season.values()[3]);
						break;
					}
					
					for (int i = 0; i < seasons.length; i++) {

						if (userSeason.equalsIgnoreCase(seasons[i].name())) {
							System.out.println("This season - "+seasons[i].name()+". Previous season - " + Season.values()[i-1]);
							System.out.println(" ");
							System.out.println("_______________");
							break;
						}

					}
					System.out.println(" ");
					break;
				}

				case 7:{
					for (int i = 0; i < months.length; i++) {
						if(months[i].getDays() % 2 == 0){
							System.out.println(months[i].name() +" "+ months[i].getDays());
						}
					}
					break;
				}

				case 8:{
					for (int i = 0; i < months.length; i++) {
						if(months[i].getDays() % 2 != 0){
							System.out.println(months[i].name() +" "+ months[i].getDays());
						}
					}
					break;
				}

				case 9:{
						if(userDays % 2 == 0){
							System.out.println(userMonth +" "+ userDays+" - The number is even ");
						}else{
							System.out.println(userMonth +" "+ userDays +" - The number is not even ");
						}
						System.out.println(" ");
					break;
	
				}

			}
		

	}
			
		
	}
}
