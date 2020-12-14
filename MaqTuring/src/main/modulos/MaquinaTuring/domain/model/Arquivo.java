package main.modulos.MaquinaTuring.domain.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Arquivo {
	public static ArrayList<String> lerArquivo(String arquivo) {
		try {
			FileReader file = new FileReader(arquivo);

			BufferedReader br = new BufferedReader(file);

			ArrayList<String> linha = new ArrayList<>();

			while (br.ready()) {
				linha.add(br.readLine());
			}
			br.close();
			return linha;

		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
