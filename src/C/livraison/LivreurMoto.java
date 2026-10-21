package C.livraison;

public class LivreurMoto extends Livreur {
	public LivreurMoto(String identifiant, String nom, double tarifKm, int anciennete) {
		super(identifiant, nom, tarifKm);
		this.anciennete = anciennete;
	}

	private int anciennete;

	@Override
	public double calculerFrais(double distance) {
		if (anciennete < 3) {
			return tarifKm * distance;
		}
		return (tarifKm + 2) * distance;
	}

	@Override
	public void afficherDetails() {
		super.afficherDetails();
		System.out.println("LivreurMoto [anciennete=" + anciennete + "]");
	}

}
