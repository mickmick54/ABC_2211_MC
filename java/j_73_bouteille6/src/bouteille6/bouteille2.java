package bouteille6;

public class bouteille2 {
	private String nom;
	private double contenanceEnL;
	private final double capaciteEnL;
	private boolean estOuverte;

	// Constucteur par defaut
	public bouteille2() {
		nom = " ";
		contenanceEnL = 0.9;
		capaciteEnL = 1;
		estOuverte = true;
	}

	// Constructeur classique

	public bouteille2(String _nom, double _contenanceEnL, double _capaciteEnL, boolean _estOuverte) {
		this.nom = _nom;
		this.contenanceEnL = _contenanceEnL;
		this.capaciteEnL = _capaciteEnL;
		this.estOuverte = _estOuverte;
	}

	// methodes

	public boolean ouvrir() {
		if (!this.estOuverte) {
			this.estOuverte = true;
			return true;
		} else {
			return false;

		}
	}

	public boolean fermer() {
		if (this.estOuverte) {
			this.estOuverte = false;
			return true;
		} else {
			return false;

		}
	}

	public boolean remplirTout() {
		if (this.estOuverte) {
			if (this.contenanceEnL < this.capaciteEnL) {
				this.contenanceEnL = this.capaciteEnL;
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	public boolean remplir(double quantiteEnL) {
		double plein = quantiteEnL + this.contenanceEnL;
		if (this.estOuverte) {
			if(plein<=capaciteEnL) {
				contenanceEnL = plein;
				return true;
			}
			else {
				return false;
			}

		} else {
			return false;
		}

	}
	
	public boolean viderTout() {
		if(estOuverte) {
			if(contenanceEnL >0 ) {
				contenanceEnL =0;
				return true; 
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}
	
	public boolean  vider(double quantiteEnL) {
		if(this.estOuverte) {
			if(quantiteEnL > 0) {
				if(this.contenanceEnL - quantiteEnL >= 0) {
					this.contenanceEnL = this.contenanceEnL - quantiteEnL;
					//this.contenanceEnL -= quantiteEnL;
					return true;
				}else {
					return  false;
				}
			}else {
				return false;
			}
		}else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Nom " + nom + " Contenant " + contenanceEnL + " Capcite " + capaciteEnL + " est Ouverte " + estOuverte;
	}
}