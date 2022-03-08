
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JOptionPane;

import java.util.Arrays;

public class Requirements {
	
	String subject;
	String availability;
	String training;
	int nStaff = 0;
	Requirements requirementsInfo [] = new Requirements[20];
	int i;
	
	public Requirements(String subject, String training, String availability ) {
		this.subject = subject;
		this.availability = availability;
		this.training = training;
	}
	
	public void adminInterface() {
		
		FileReader fr = null;
		try {
			String requirementsFile = "C:\\Users\\Hanna\\OneDrive\\1. MSc IT\\Semester 2\\Software Engineering\\ClassDirectorRequirements.txt";
			fr = new FileReader(requirementsFile);
			Scanner s = new Scanner(fr);
			while(s.hasNextLine()) {
				String line = s.nextLine();
				String[] tokens = line.split(",");
				String subject = tokens[0];
				String training = tokens[1];
				String availability = tokens[2];
				requirementsInfo[nStaff++] = new Requirements(subject, training, availability);
			
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
		
		if(nStaff>0) {
			for (i = 0; i<nStaff; i++) {
				System.out.println(requirementsInfo[i]);
				
			}
			
		}
		
	}
	public String toString() {
		return "Subject: " + subject + "Training Required: " + training + "Scheduled Day for class: " + availability;
	}
	
	}


