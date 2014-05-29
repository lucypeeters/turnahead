package com.programmeren4.turnahead;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

// één klasse en static -> kost veel tijd om te initialiseren -> dus WRAPPER KLASSE	
// voor interactie met JPA
//
	public final class EMF {
	    private static final EntityManagerFactory emfInstance =
	        Persistence.createEntityManagerFactory("transactions-optional");

	    private EMF() {}

	    public static EntityManagerFactory get() {
	        return emfInstance;
	    }
	
}
