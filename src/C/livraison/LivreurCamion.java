package C.livraison;

public class LivreurCamion extends Livreur {
	private double tauxMajoration;

	public LivreurCamion(String identifiant, String nom, double tarifKm, double tauxMajoration) {
		super(identifiant, nom, tarifKm);
		this.tauxMajoration = tauxMajoration;
	}

	@Override
	public double calculerFrais(double distance) {
		double montantBase = tarifKm * distance;
		return montantBase * (1 + tauxMajoration);
	}

	@Override
	public void afficherDetails() {
		super.afficherDetails();
		System.out.println("LivreurCamion [tauxMajoration=" + tauxMajoration + "]");
	}

}
