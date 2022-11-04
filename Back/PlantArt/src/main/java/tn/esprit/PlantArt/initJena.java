package tn.esprit.PlantArt;
import net.minidev.json.JSONObject;
import org.apache.jena.ontology.OntModel;
import org.apache.jena.ontology.OntModelSpec;
import org.apache.jena.query.*;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.shared.JenaException;
import org.apache.jena.util.FileManager;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class initJena {
	 private static QueryExecution qe;
	    private static String ontoFile = "plante-ontology.owl";

	    public static ResultSet execQuery(String queryString) {

	        OntModel ontoModel = ModelFactory.createOntologyModel(OntModelSpec.OWL_MEM, null);
	        try {
	            InputStream in = FileManager.get().open(ontoFile);
	            try {
	                ontoModel.read(in, null);

	                Query query = QueryFactory.create(queryString);

	                //Execute the query and obtain results
	                qe = QueryExecutionFactory.create(query, ontoModel);
	                ResultSet results = qe.execSelect();

	                // Output query results
	                //ResultSetFormatter.out(System.out, results, query);

	                return results;

	            } catch (Exception e) {
	                e.printStackTrace();
	            }
//	            LOGGER.info("Ontology " + ontoFile + " loaded.");
	        } catch (JenaException je) {
	            System.err.println("ERROR" + je.getMessage());
	            je.printStackTrace();
	            System.exit(0);
	        }
	        return null;
	    }

	    public static List<JSONObject> findPlants(String queryString) {
	        ResultSet resultSet = execQuery(queryString);
	        List<JSONObject> list = new ArrayList<>();
	        int x=0;
	        while (resultSet.hasNext()) {
	            x++;
	            JSONObject obj = new JSONObject();
	            QuerySolution solution = resultSet.nextSolution();
	            obj.put("id",x);
	            obj.put("politician_name",solution.get("L").toString().split("#")[1]);
	            
	            list.add(obj);
	        }

	        // Important ‑ free up resources used running the query
	        //qe.close();
	        return list;
	    }

	    public static List<JSONObject> describePoliticians(String queryString) {
	        ResultSet resultSet = execQuery(queryString);
	        List<JSONObject> list = new ArrayList<>();
	        while (resultSet.hasNext()) {
	            JSONObject obj = new JSONObject();
	            QuerySolution solution = resultSet.nextSolution();
	            if (solution.get("Z").toString().split("#")[1].equals("NamedIndividual")){
	                continue;
	            }
	            obj.put("property",solution.get("Y").toString().split("#")[1]);
	            obj.put("object",solution.get("Z").toString().split("#")[1]);
	            list.add(obj);
	        }

	        // Important ‑ free up resources used running the query
	        //qe.close();
	        return list;
	    }

	    public static List<JSONObject> getItems(String queryString) {
	        ResultSet resultSet = execQuery(queryString);
	        List<JSONObject> list = new ArrayList<>();
	        int x=0;
	        while (resultSet.hasNext()) {
	            x++;
	            JSONObject obj = new JSONObject();
	            QuerySolution solution = resultSet.nextSolution();
	           
	            obj.put("id",x);
	            
	            obj.put("item",solution.get("X").toString().split("#")[1]);
	           obj.put("prix",solution.get("W").toString().split("#")[0]);
	            obj.put("couleur",solution.get("Y").toString().split("#")[0]);
	            obj.put("image",solution.get("U").toString().split("#")[0]);
	            obj.put("description",solution.get("V").toString().split("#")[0]);
System.out.println(solution);
	            
	            list.add(obj);
	        }

	        // Important ‑ free up resources used running the query
	        //qe.close();
	        System.out.println(list);
	        return list;
	    }

	    
	    public static List<JSONObject> describePlantes(String queryString) {
	        ResultSet resultSet = execQuery(queryString);
	        List<JSONObject> list = new ArrayList<>();
	        while (resultSet.hasNext()) {
	            JSONObject obj = new JSONObject();
	            QuerySolution solution = resultSet.nextSolution();
	            if (solution.get("Y").toString().split("#")[1].equals("NamedIndividual")){
	                continue;
	            }
	            obj.put("property",solution.get("X").toString().split("#")[1]);
	            obj.put("object",solution.get("Y").toString().split("#")[1]);
	            list.add(obj);
	        }

	        // Important ‑ free up resources used running the query
	        //qe.close();
	        return list;
	    }
}
