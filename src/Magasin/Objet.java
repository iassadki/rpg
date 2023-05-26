package Magasin;

public class Objet {

	public String nomObjet;
	public int prixObjet;
	public int pvAjoutes;

	public Objet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Objet(String nomObjet, int prixObjet, int pvAjoutes) {
		super();
		this.nomObjet = nomObjet;
		this.prixObjet = prixObjet;
		this.pvAjoutes = pvAjoutes;
	}

	public int getPvAjoutes() {
		return pvAjoutes;
	}

	public void setPvAjoutes(int pvAjoutes) {
		this.pvAjoutes = pvAjoutes;
	}

	public String getNomObjet() {
		return nomObjet;
	}

	public void setNomObjet(String nomObjet) {
		this.nomObjet = nomObjet;
	}

	public int getPrixObjet() {
		return prixObjet;
	}

	public void setPrixObjet(int prixObjet) {
		this.prixObjet = prixObjet;
	}

	@Override
	public String toString() {
		return "Objet [nomObjet=" + nomObjet + ", prixObjet=" + prixObjet + ", pvAjoutes=" + pvAjoutes + "]";
	}

}
