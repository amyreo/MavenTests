package com.inti;

import java.util.List;

public class Utile {

	public double calculMoyenne(List<Double> listeSalaires) throws Exception {

		if (listeSalaires != null) {
			if (listeSalaires.size() != 0) {
				double somme = 0, moyenne = 0;
				for (Double double1 : listeSalaires) {
					somme += double1;
				}
				return somme / listeSalaires.size();
			} else {
				throw new Exception();
			}
		} else {
			throw new Exception();
		}

	}
}
