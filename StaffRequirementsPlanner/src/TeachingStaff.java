import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class TeachingStaff  {
	
	ArrayList <String> name = new ArrayList<String>();
	ArrayList <String> availability = new ArrayList<String>();
	ArrayList <String> training = new ArrayList<String>();
	ArrayList <String> subject = new ArrayList<String>();

	public TeachingStaff(String name) {
				
	}
	
	public void printStaffList() {
		FileReader fr = null;
		try {
			String requirementsFile = "C:\\Users\\Hanna\\OneDrive\\1. MSc IT\\Semester 2\\Software Engineering\\StaffNames.txt";
			fr = new FileReader(requirementsFile);
			Scanner s = new Scanner(fr);
			while(s.hasNextLine()) {
				String line = s.nextLine();
				String[] columns = line.split(",");
				name.add(columns[0]);
				subject.add(columns[1]);
				training.add(columns[2]);
				availability.add(columns[3]);	
			}
			System.out.println(name);
			System.out.print(subject);
			ListOfStaff staffList [] = new ListOfStaff[10];
			
			for(int i=0; i<10; i++) {
				
				staffList (new ListOfStaff(name[i],subject[i],training[i],availability[i]));
				
			}
			
		
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			if(fr!=null) {
			try {
				fr.close();
			}
			catch(IOException e) {
				e.printStackTrace();
			}
			}
		}
	

	}
	
	
	  for (int count = 0; count < .length; count++) {
	        if (//user input.equals(firstNameLetter[count])) {
	            System.out.println(firstNameNumber[count]);
	        }
	    }
}

