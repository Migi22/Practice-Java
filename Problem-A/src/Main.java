import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// Problem A
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Prolem A");
		
		try {
			
			int t; //Number of test cases
			int d; // total distance
			int count_cases = 1; // This will count the attempts of the program (for UX)
			int cases;
			
			double p_i; //additional charges for the year they want to go
			double m_i; // per number of meters for the year they want to go
			double p_2018; // additional charges of the current year
			double m_2018; // per number of meters for the current year
			
			double totalFare_i;
			double totalFare_2018;
			
			String outPut = "";
			
				
			System.out.print("Input the total cases: ");
			t = sc.nextInt();
			cases = t;
			
			if(t >= 1 && t <= 10000) {//The if-else for the total cases. For the constraints
				
				//The next lines are for the distance cases
				System.out.print("Input total distance travel: ");
				d = sc.nextInt();
				
				//Looping depends for the total cases
				while (t > 0) {
					
					
					do { // checks for the constraints 0 < p_i < 150000000
                        System.out.print("\nCase: "+count_cases+"/"+cases+"\nEnter additional charges of the year that you want to go: ");
                        p_i = sc.nextDouble();

                        if (p_i > 0 && p_i < 150000000) {
                            break; // exit the loop if correct input by user
                        } else {
                            System.err.println("Invalid input! Additional charges must be between 1 and 150,000,000.");
                        }
                    } while (true);
					
					do { // checks for the constraints 0 < m_i < 150000000
                        System.out.print("Enter per number of meters of the year that you want to go: ");
                        m_i = sc.nextDouble();

                        if (m_i > 0 && m_i < 2147483647) {
                            break; // exit the loop if correct input by user
                        } else {
                            System.err.println("Invalid input! Per Number of Meters must be between 1 and 2,147,483,647.");
                        }
                    } while (true);
					
					do { // checks for the constraints 0 < p_2018 < 150000000
                        System.out.print("Enter additional charges of the year 2018: ");
                        p_2018 = sc.nextDouble();

                        if (p_2018 > 0 && p_2018 < 150000000) {
                            break; // exit the loop if correct input by user
                        } else {
                            System.err.println("Invalid input! Additional charges must be between 1 and 150,000,000.");
                        }
                    } while (true);
					
					do { // checks for the constraints 0 < m_2018 < 150000000
                        System.out.print("Enter per number of meters of the year 2018: ");
                        m_2018 = sc.nextDouble();

                        if (m_2018 > 0 && m_2018 < 2147483647) {
                            break; // exit the loop if correct input by user
                        } else {
                            System.err.println("Invalid input! Per Number of Meters must be between 1 and 2,147,483,647.");
                        }
                    } while (true);
					
					// calculates the fares
					totalFare_i = p_i * (d / m_i);
					totalFare_2018 = p_2018 * (d / m_2018);
					
					// condition is fare in the year i is cheaper than 2018
					String temp_String = "";
					
					if (totalFare_i < totalFare_2018) {
						double temp = totalFare_2018 - totalFare_i;

						
						//checks if the number is a whole number already
						if (Math.floor(temp) == temp) {
							temp_String = String.format("%.0f%n", temp);
							outPut += temp_String;
						} else {
							temp_String = String.format("%.2f%n", temp);
							outPut += temp_String;
						}
						
					} else {
						outPut += temp_String+"Back to the Future nalang, bes.\n";
				
					}
					
					count_cases++; //increment the attempt of cases
					t--; // decrement every test cases done
				}
				//End of the loop
				System.out.println("\nOutput: \n"+outPut); // prints the output
				
			} else {// else for the Total Test cases
				System.err.println("The test cases should not below 1 and not above 10,000.");
			}// end of if-else for the Total Test cases
			
				
		} catch (Exception e) {
			System.err.println(e);
		} finally {
			sc.close();
		}
		
	}

}
