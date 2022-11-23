package com.inti;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class UtileTest {

	Utile u;
	List<Double> listeSalaires;

	@Before
	public void setup() {
		u = new Utile();
		listeSalaires = new ArrayList<>();
	}

	@After
	public void afterTest() {
		System.out.println("Fin du test");
	}

	@BeforeClass
	public static void beforeClass() {
		System.out.println("Début de tous les tests");
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("Fin de tous les tests");
	}

	@Test
	public void calculMoyenneAvecListeSalairesReels() throws Exception {

		listeSalaires.add(1000.0);
		listeSalaires.add(2000.0);
		listeSalaires.add(3000.0);

		double moyenne = u.calculMoyenne(listeSalaires);

		assertEquals(moyenne, 2000.0, 1);
	}

	@Test(expected = Exception.class)
	public void calculMoyenneAvecListeSalairesVide() throws Exception {

		double moyenne = u.calculMoyenne(listeSalaires);

		fail("Liste vide");
	}

	@Test(expected = Exception.class)
	public void calculMoyenneAvecListeSalairesNull() throws Exception {

		double moyenne = u.calculMoyenne(null);

		fail("Liste vide");
	}

}
