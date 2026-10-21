package C.livraison;

import java.util.Arrays;


public abstract class Livreur {
	  protected String identifiant;
	    protected String nom;
	    protected double tarifKm;

	    
	    private Livreur responsable;
	    private Livreur[] supervises = new Livreur[0];
	    private int nbSupervises = 0;

	    public Livreur(String identifiant, String nom, double tarifKm) {
	        this.identifiant = identifiant;
	        this.nom = nom;
	        this.tarifKm = tarifKm;
	    }

	    public String getIdentifiant() { return identifiant; }

	    public String getNom() { return nom; }

	    public abstract double calculerFrais(double distance);

	    public void afficherDetails() {
	        System.out.println("Livreur [" + identifiant + "] " + nom
	                + " | tarif/km : " + tarifKm + " DH");
	    }

	    public void setResponsable(Livreur responsable) {
	        if (responsable == this) {
	            System.out.println("Erreur : un livreur ne peut pas être son propre responsable.");
	            return;
	        }
	        if (this.responsable != null) {
	            this.responsable.retirerSupervise(this);
	        }
	        this.responsable = responsable;
	        if (responsable != null) {
	            responsable.ajouterSupervise(this);
	        }
	    }

	    public Livreur getResponsable() { return responsable; }

	    public int getNombreSupervises() { return nbSupervises; }

	    private void ajouterSupervise(Livreur l) {
	        if (nbSupervises == supervises.length) {
	            supervises = Arrays.copyOf(supervises, nbSupervises + 1);
	        }
	        supervises[nbSupervises++] = l;
	    }

	    private void retirerSupervise(Livreur l) {
	        for (int i = 0; i < nbSupervises; i++) {
	            if (supervises[i] == l) {
	                supervises[i] = supervises[nbSupervises - 1];
	                supervises[--nbSupervises] = null;
	                return;
	            }
	        }
	    }

}

