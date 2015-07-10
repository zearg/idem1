package org.jboss.as.quickstarts.greeter.domain;

import javax.ejb.Stateless;

@Stateless
public class OtherEjb {

	public String isHere() {
		return "Yes!";
	}
}
