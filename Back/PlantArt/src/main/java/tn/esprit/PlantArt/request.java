package tn.esprit.PlantArt;

public class request {
	 private String plante;
	 private String accessoires;
	 
	 public request(String plante, String accessoires) {
	        this.plante = plante;
	        this.accessoires = accessoires;
	     
	    }

	    public String getPlante() {
	        return plante;
	    }

	    public void setPlante(String plante) {
	        this.plante = plante;
	    }

	    public String getAccessoires() {
	        return accessoires;
	    }

	    public void setAccessoires(String accessoires) {
	        this.accessoires = accessoires;
	    }

	 
}
