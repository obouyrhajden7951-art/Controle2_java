package C.livraison;
public class Livraison {
	private double distance;
	private Livreur livreur;
	private Commande commande;

	public Livraison(Livreur livreur, Commande commande, double distance) {
		this.livreur = livreur;
		this.commande = commande;
		this.distance = distance;
	}

	public double calculerMontant() {
		return livreur.calculerFrais(distance);
	}

	public void afficherRecapitulatif() {
		livreur.afficherDetails();
		System.out.println(" " + commande);
		System.out.println("la distance parcourue est : " + distance);
		System.out.println("le montant de la livraison est :" + calculerMontant());
	}
}
