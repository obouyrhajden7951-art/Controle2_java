package C.livraison;


public class Main {
	public static void main(String[] args) {
		LivreurMoto m1 = new LivreurMoto("M1", "Amine", 10, 0);
		LivreurMoto m2 = new LivreurMoto("M1", "Amine", 8, 0);
		LivreurCamion c1 = new LivreurCamion("C1", "Youssef", 15, 0);
		LivreurCamion c2 = new LivreurCamion("C2", "Karim", 12, 0);

		Livreur[] livreurs = { m1, m2, c1, c2 };

		Commande cd1 = new Commande("CH345", "Marrakech");
		Commande cd2 = new Commande("CP909", "Rabat");

		m2.setResponsable(m1);
		c1.setResponsable(m1);
		c2.setResponsable(c1);

		System.out.println("Affichage des informations de tous les livreurs");
		for (Livreur l : livreurs) {
			l.afficherDetails();
			if (l.getResponsable() != null) {
				System.out.println("leur Responsable est  : " + l.getResponsable().getNom());
			}
		}

		Livraison[] livraisons = new Livraison[4];
		livraisons[0] = new Livraison(m1, cd1, 30);
		livraisons[1] = new Livraison(m2, cd2, 20);
		livraisons[2] = new Livraison(c1, cd1, 40);
		livraisons[3] = new Livraison(c2, cd2, 50);

		System.out.println("Affichage du récapitulatif de toutes les livraisons");
		double total = 0;
		for (Livraison lv : livraisons) {
			lv.afficherRecapitulatif();
			total += lv.calculerMontant();
		}

		System.out.println("le montant total des livraisons : " + total + " DH");
		System.out.println(
				"le nombre de livreurs directement supervisés par" + m1.getNom() + " ;  " + m1.getNombreSupervises());
	}
}
