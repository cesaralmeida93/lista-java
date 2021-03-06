package com.br.pratica06;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Arquivo {

	private String fileName = "C:\\Users\\cesar\\eclipse-workspace\\praticas\\pratica06\\src\\com\\br\\pratica06\\arquivo.txt";
	
	public ArrayList<Cliente> readFile() throws IOException {
		ArrayList<Cliente> clients = new ArrayList<Cliente>();
		BufferedReader br = null;
		
		try {

			br = new BufferedReader(new FileReader(fileName));

			String line;
			while ((line = br.readLine()) != null) {
				String parameters[] = new String[3];
				parameters = line.split(";");
				Cliente cliente = new Cliente(parameters[0], Integer.parseInt(parameters[1]), Double.parseDouble(parameters[2]));
				clients.add(cliente);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				br.close();
			}
		}
		
		return clients;
		
	}
	
	public void addToFile(Cliente cliente) {
		try {
	      FileWriter myWriter = new FileWriter(fileName, true);
	      myWriter.write(cliente.toString());
	      myWriter.close();
	    } catch (IOException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }
	}
	
//	public void addToFile(ArrayList<Cliente> clientes) {
//		try {
//	      FileWriter myWriter = new FileWriter(fileName, true);
//	      for (Cliente cliente : clientes) {
//		      myWriter.write(cliente.toString());
//	      }
//	      myWriter.close();
//	    } catch (IOException e) {
//	      System.out.println("An error occurred.");
//	      e.printStackTrace();
//	    }
//	}

}
