package com.br.pratica06;

import java.io.IOException;
import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) throws IOException {
		
		Cliente cliente1 = new Cliente("teste", 1, 1.1);
		Arquivo arquivo = new Arquivo();
//		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
//		clientes.add(cliente1);
//		clientes.add(cliente2);
		System.out.println(cliente1);
		arquivo.addToFile(cliente1);
		arquivo.readFile();

	}

}
