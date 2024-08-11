package gradeBook;

 import java.util.Scanner;

//This program gives out the grades of different test scores

public class gradeBook {
	public static void main(String[] args){
		String[] students = {"","","","",""};
		int[] sGrades = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		int[] sAverage = {0,0,0,0,0};
		Scanner keyboard = new Scanner(System.in);
		
		//Send a message to the user;
		System.out.println("Give the names of four students Please \r");
		
		//Send the user to methods for the students
		studentOne(students, sGrades, sAverage);
		studentTwo(students, sGrades, sAverage);
		studentThree(students, sGrades, sAverage);
		studentFour(students, sGrades, sAverage);
		studentFive(students, sGrades, sAverage);
		
		//Set rules for the values
	
	}
	
	public static int[] studentOne(String[] students, int[] sGrades, int[] sAverage){
		
		//Declare the Scanner
		Scanner keyboard = new Scanner(System.in);
		
		//Get the name of student 1
		System.out.println("Give student 1 name: ");
		students[0] = keyboard.nextLine(); 
		
		//Get the student's grades
		System.out.println("Give the value of grade 1:");
		sGrades[0] = keyboard.nextInt();
		
		System.out.println("Give the value of grade 2:");
		sGrades[1] = keyboard.nextInt();
		
		System.out.println("Give the value of grade 3:");
		sGrades[2] = keyboard.nextInt();
		
		System.out.println("Give the value of grade 4:");
		sGrades[3] = keyboard.nextInt();
		
		//Get the average
		sAverage[4] = sGrades[0] + sGrades[1] + sGrades[2] + sGrades[3] / 4;
		
		//Return the value
		return sAverage;
	}
	
	public static int[] studentTwo(String[] students, int[] sGrades, int[] sAverage){
		
		//Declare the Scanner
		Scanner keyboard = new Scanner(System.in);
		
		//Get the name of student 1
		System.out.println("Give student 2 name: ");
		students[1] = keyboard.nextLine(); 
		
		//Get the student's grades
		System.out.println("Give the value of grade 1:");
		sGrades[4] = keyboard.nextInt();
		
		System.out.println("Give the value of grade 2:");
		sGrades[5] = keyboard.nextInt();
		
		System.out.println("Give the value of grade 3:");
		sGrades[6] = keyboard.nextInt();
		
		System.out.println("Give the value of grade 4:");
		sGrades[7] = keyboard.nextInt();
		
		//Get the average
		sAverage[4] = sGrades[4] + sGrades[5] + sGrades[6] + sGrades[7] / 4;
		
		//Return the value
		return sAverage;
	}
	
	public static int[] studentThree(String[] students, int[] sGrades, int[] sAverage){
		
		//Declare the Scanner
		Scanner keyboard = new Scanner(System.in);
		
		//Get the name of student 1
		System.out.println("Give student 3 name: ");
		students[2] = keyboard.nextLine(); 
		
		//Get the student's grades
		System.out.println("Give the value of grade 1:");
		sGrades[8] = keyboard.nextInt();
		
		System.out.println("Give the value of grade 2:");
		sGrades[9] = keyboard.nextInt();
		
		System.out.println("Give the value of grade 3:");
		sGrades[10] = keyboard.nextInt();
		
		System.out.println("Give the value of grade 4:");
		sGrades[11] = keyboard.nextInt();
		
		//Get the average
		sAverage[4] = sGrades[8] + sGrades[9] + sGrades[10] + sGrades[11] / 4;
		
		//Return the value
		return sAverage;
	}
	
	public static int[] studentFour(String[] students, int[] sGrades, int[] sAverage){
		
		//Declare the Scanner
		Scanner keyboard = new Scanner(System.in);
		
		//Get the name of student 1
		System.out.println("Give student 4 name: ");
		students[3] = keyboard.nextLine(); 
		
		//Get the student's grades
		System.out.println("Give the value of grade 1:");
		sGrades[12] = keyboard.nextInt();
		
		System.out.println("Give the value of grade 2:");
		sGrades[13] = keyboard.nextInt();
		
		System.out.println("Give the value of grade 3:");
		sGrades[14] = keyboard.nextInt();
		
		System.out.println("Give the value of grade 4:");
		sGrades[15] = keyboard.nextInt();
		
		//Get the average
		sAverage[4] = sGrades[12] + sGrades[13] + sGrades[14] + sGrades[15] / 4;
		
		//Return the value
		return sAverage;
	}
	
	public static int[] studentFive(String[] students, int[] sGrades, int[] sAverage){
		
		//Declare the Scanner
		Scanner keyboard = new Scanner(System.in);
		
		//Get the name of student 1
		System.out.println("Give student 1 name: ");
		students[4] = keyboard.nextLine(); 
		
		//Get the student's grades
		System.out.println("Give the value of grade 1:");
		sGrades[16] = keyboard.nextInt();
		
		System.out.println("Give the value of grade 2:");
		sGrades[17] = keyboard.nextInt();
		
		System.out.println("Give the value of grade 3:");
		sGrades[18] = keyboard.nextInt();
		
		System.out.println("Give the value of grade 4:");
		sGrades[19] = keyboard.nextInt();
		
		//Get the average
		sAverage[4] = sGrades[16] + sGrades[17] + sGrades[18] + sGrades[19] / 4;
		
		//Return the value
		return sAverage;
	}
}
