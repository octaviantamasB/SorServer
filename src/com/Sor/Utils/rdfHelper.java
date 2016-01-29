package com.Sor.Utils;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import java.io.*;
import org.apache.jena.util.FileManager;
public class rdfHelper {
	//https://jena.apache.org/tutorials/rdf_api.html#ch-Reading%20RDF
public void read(String inputFileName){
	 // create an empty model
	 Model model = ModelFactory.createDefaultModel();

	 // use the FileManager to find the input file
	 InputStream in = FileManager.get().open( inputFileName );
	if (in == null) {
	    throw new IllegalArgumentException(
	                                 "File: " + inputFileName + " not found");
	}

	// read the RDF/XML file
	model.read(in, null);
	//The second argument to the read() method call is the URI which 
	//will be used for resolving relative URI's. As there are no relative URI references 
	//in the test file, it is allowed to be empty. vc-db-1.rdf

	// write it to standard out
	model.write(System.out);}
}
