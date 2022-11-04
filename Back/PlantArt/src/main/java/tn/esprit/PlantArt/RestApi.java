package tn.esprit.PlantArt;

import tn.esprit.PlantArt.initJena;

import net.minidev.json.JSONObject;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import tn.esprit.PlantArt.initJena;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RestApi {
	
	//Arrosages
	 @CrossOrigin
	    @RequestMapping("/getArrosoires")
	    public List<JSONObject> getArrosires() {

	        String queryString =
	        		"PREFIX pol: <http://www.semanticweb.org/maisoninfo/ontologies/2022/9/plante-ontology#>" +
	                        "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>" +
	                        "PREFIX rdfs:  <http://www.w3.org/2000/01/rdf-schema#>" +
	                        "SELECT ?X ?Y ?Z ?W ?V ?U WHERE{ ?X rdf:type pol:Arrosoir; pol:couleur ?Y; pol:taille ?Z; pol:prix ?W; pol:description ?V; pol:image ?U .}";
	        List<JSONObject> resultSet = initJena.getItems(queryString);
	        System.out.println(queryString);
	        return resultSet;
	    }
	 @CrossOrigin
	    @RequestMapping("/getProgrammateurs")
	    public List<JSONObject> getProgrammateurs() {

	        String queryString =
	        		"PREFIX pol: <http://www.semanticweb.org/maisoninfo/ontologies/2022/9/plante-ontology#>" +
	                        "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>" +
	                        "PREFIX rdfs:  <http://www.w3.org/2000/01/rdf-schema#>" +
	                        "SELECT ?X ?Y ?Z ?W ?V ?U WHERE{ ?X rdf:type pol:Programmateurs; pol:couleur ?Y; pol:taille ?Z; pol:prix ?W; pol:description ?V; pol:image ?U .}";
	        List<JSONObject> resultSet = initJena.getItems(queryString);
	        System.out.println(queryString);
	        return resultSet;
	    }
	 //plante exterieur 
	 
	 @CrossOrigin
	    @RequestMapping("/getArbres")
	    public List<JSONObject> getArbres() {

	        String queryString =
	        		"PREFIX pol: <http://www.semanticweb.org/maisoninfo/ontologies/2022/9/plante-ontology#>" +
	                        "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>" +
	                        "PREFIX rdfs:  <http://www.w3.org/2000/01/rdf-schema#>" +
	                        "SELECT ?X ?Y ?Z ?W ?V ?U  WHERE{ ?X rdf:type pol:Arbres; pol:couleur ?Y; pol:taille ?Z; pol:prix ?W; pol:description ?V; pol:image ?U .}";
	        List<JSONObject> resultSet = initJena.getItems(queryString);
	        System.out.println(queryString);
	        return resultSet;
	    }
	 @CrossOrigin
	    @RequestMapping("/getArbuste")
	    public List<JSONObject> getArbuste() {

	        String queryString =
	        		"PREFIX pol: <http://www.semanticweb.org/maisoninfo/ontologies/2022/9/plante-ontology#>" +
	                        "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>" +
	                        "PREFIX rdfs:  <http://www.w3.org/2000/01/rdf-schema#>" +
	                        "SELECT ?X ?Y ?Z ?W ?V ?U WHERE{ ?X rdf:type pol:Arbuste; pol:couleur ?Y; pol:taille ?Z; pol:prix ?W; pol:description ?V; pol:image ?U .}";
	        List<JSONObject> resultSet = initJena.getItems(queryString);
	        System.out.println(queryString);
	        return resultSet;
	    }
	 @CrossOrigin
	    @RequestMapping("/getAromatique")
	    public List<JSONObject> getAromatique() {

	        String queryString =
	        		"PREFIX pol: <http://www.semanticweb.org/maisoninfo/ontologies/2022/9/plante-ontology#>" +
	                        "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>" +
	                        "PREFIX rdfs:  <http://www.w3.org/2000/01/rdf-schema#>" +
	                        "SELECT ?X ?Y  ?W ?V ?U WHERE{ ?X rdf:type pol:Aromatique; pol:couleur ?Y;  pol:prix ?W; pol:description ?V; pol:image ?U .}";
	        List<JSONObject> resultSet = initJena.getItems(queryString);
	        System.out.println(queryString);
	        return resultSet;
	    }
	 
	 //plante interieur
	 @CrossOrigin
	    @RequestMapping("/getFleuries")
	    public List<JSONObject> getFleuries() {

	        String queryString =
	        		"PREFIX pol: <http://www.semanticweb.org/maisoninfo/ontologies/2022/9/plante-ontology#>" +
	                        "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>" +
	                        "PREFIX rdfs:  <http://www.w3.org/2000/01/rdf-schema#>" +
	                        "SELECT ?X ?Y ?Z ?W ?V ?U WHERE{ ?X rdf:type pol:Fleuries; pol:couleur ?Y; pol:taille ?Z; pol:prix ?W; pol:description ?V; pol:image ?U .}";
	        List<JSONObject> resultSet = initJena.getItems(queryString);
	        System.out.println(queryString);
	        return resultSet;
	    }
	 @CrossOrigin
	    @RequestMapping("/getSucculentes")
	    public List<JSONObject> getSucculentes() {

	        String queryString =
	        		"PREFIX pol: <http://www.semanticweb.org/maisoninfo/ontologies/2022/9/plante-ontology#>" +
	                        "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>" +
	                        "PREFIX rdfs:  <http://www.w3.org/2000/01/rdf-schema#>" +
	                        "SELECT ?X ?Y ?Z ?W ?V ?U WHERE{ ?X rdf:type pol:Succulentes; pol:couleur ?Y; pol:taille ?Z; pol:prix ?W; pol:description ?V; pol:image ?U .}";
	        List<JSONObject> resultSet = initJena.getItems(queryString);
	        System.out.println(queryString);
	        return resultSet;
	    }
	 
	 @CrossOrigin
	    @RequestMapping("/getVerte")
	    public List<JSONObject> getVerte() {

	        String queryString =
	        		"PREFIX pol: <http://www.semanticweb.org/maisoninfo/ontologies/2022/9/plante-ontology#>" +
	                        "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>" +
	                        "PREFIX rdfs:  <http://www.w3.org/2000/01/rdf-schema#>" +
	                        "SELECT ?X ?Y ?Z ?W ?V ?U WHERE{ ?X rdf:type pol:Verte; pol:couleur ?Y; pol:taille ?Z; pol:prix ?W; pol:description ?V; pol:image ?U .}";
	        List<JSONObject> resultSet = initJena.getItems(queryString);
	        System.out.println(queryString);
	        return resultSet;
	    }
	 
	 
	 @CrossOrigin
	    @RequestMapping("/getArrosages1")
	    public List<JSONObject> getArrosages1() {

	        String queryString =
	        		"PREFIX pol: <http://www.semanticweb.org/maisoninfo/ontologies/2022/9/plante-ontology#Anthurium_Rouge>" +
	                        "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>" +
	                        "PREFIX rdfs:  <http://www.w3.org/2000/01/rdf-schema#>" +
	                        "SELECT ?X ?Y WHERE{ ?X rdf:type pol:Arbres; pol:couleur ?Y .}";
	        List<JSONObject> resultSet = initJena.describePlantes(queryString);
	        System.out.println(queryString);
	        return resultSet;
	    }
	 @CrossOrigin
	    @RequestMapping("/getPots1")
	    public List<JSONObject> getPots1() {

	        String queryString =
	        		"PREFIX pol: <http://www.semanticweb.org/maisoninfo/ontologies/2022/9/plante-ontology#>" +
	                        "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>" +
	                        "PREFIX rdfs:  <http://www.w3.org/2000/01/rdf-schema#Pots>" +
	                        "SELECT ?X WHERE { ?Y rdfs:subClassOf* pol:Pots ." +
	                                            "?X rdf:type ?Y}";
	        List<JSONObject> resultSet = initJena.describePoliticians(queryString);
	        System.out.println(queryString);
	        return resultSet;
	    }

	 
	 
	 @CrossOrigin
	    @RequestMapping("/describePolitician")
	    public List<JSONObject> describePolitician(@RequestParam String nom) {

	        String queryString =
	                "PREFIX pol: <http://www.semanticweb.org/maisoninfo/ontologies/2022/9/plante-ontology#>" +
	                        "SELECT ?Y ?Z WHERE { pol:" + nom + " ?Y ?Z .}";
	        List<JSONObject> resultSet = initJena.describePlantes(queryString);
	        System.out.println(queryString);
	        return resultSet;
	    }
	 
	 
	 
	 @CrossOrigin
	    @RequestMapping("/describePolitician1")
	    public List<JSONObject> describePolitician1(@RequestParam String nom) {

	        String queryString =
	                "PREFIX pol: <http://www.semanticweb.org/maisoninfo/ontologies/2022/9/plante-ontology#>" +
	                        "SELECT ?Y ?Z WHERE{pol:" +nom +" ?Y ?Z .}";
	        List<JSONObject> resultSet = initJena.describePlantes(queryString);
	        System.out.println(queryString);
	        return resultSet;
	    }
	 
	 @CrossOrigin	  
		@RequestMapping("/getPlante")
		 public List<JSONObject> getPlante(@RequestParam String nom) {

		        String queryString =
		                "PREFIX pol: <http://www.semanticweb.org/maisoninfo/ontologies/2022/9/plante-ontology#>" +
		                        
		                        "SELECT ?Y ?Z WHERE { pol:" + nom + " ?Y ?Z .}";
		        
		        List<JSONObject> resultSet = initJena.describePlantes(queryString);
		        System.out.println(queryString);
		        return resultSet;
		    }
}
