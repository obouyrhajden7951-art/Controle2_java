package C.livraison;

public class Commande {
	public Commande(String numero, String destination) {
		super();
		this.numero = numero;
		this.destination = destination;
	}

	private String numero;
	private String destination;

	@Override
	public String toString() {
		return "Commnde [numero=" + numero + ", destination=" + destination + "]";
	}

}
