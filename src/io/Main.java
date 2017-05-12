package io;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Main {

	public static void main (String [] args)throws Exception{
		
		String filedovescrivere = "PaesiFondatoriBis.txt";
		String filedoveleggere = "PaesiFondatori.txt";
		
		String [] risultato = arrStringhe(filedoveleggere);
		
		print(risultato, filedovescrivere);
		
		
	}
	public static String[] arrStringhe(String file) throws Exception{
		String [] daritorno = new String[5];
		BufferedReader br = 
				new BufferedReader(new FileReader(
						file));
		String line;
		int count = 0;
		while((line = br.readLine())!=null){
			daritorno[count] = line;
			count++;
		}br.close();
		
		System.out.println("dati letti correttamente");
		return daritorno;
	}
	public static void print(String[]s,String file) throws Exception{
		
		PrintWriter out = 
				new PrintWriter(new FileWriter(new File(file)));
		for(int i = 0; i <s.length; i++){
			out.println(s[i]);
		}
		out.close();
		System.out.println("Il file è stato scritto");
	}
}
