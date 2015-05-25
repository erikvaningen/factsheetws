//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.02.10 at 10:33:11 AM CET 
//

package org.fao.fi.fisheryresources.domain.stocksby;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FIGISReferenceType", propOrder = { "foreignID" })
@XmlSeeAlso( { WaterAreaRef.class, SpeciesRef.class })
public abstract class FIGISReference {

	/**
	 * should this be a list?
	 */

	@XmlElement(name = "ForeignID", required = true)
	private ForeignID foreignID;

	/**
	 * Gets the value of the foreignID property.
	 * 
	 * @return possible object is {@link ForeignID }
	 * 
	 */
	public ForeignID getForeignID() {
		return foreignID;
	}

	/**
	 * Sets the value of the foreignID property.
	 * 
	 * @param value
	 *            allowed object is {@link ForeignID }
	 * 
	 */
	public void setForeignID(ForeignID value) {
		this.foreignID = value;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((foreignID == null) ? 0 : foreignID.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		FIGISReference other = (FIGISReference) obj;
		if (foreignID == null) {
			if (other.foreignID != null) {
				return false;
			}
		} else if (!foreignID.equals(other.foreignID)) {
			return false;
		}
		return true;
	}

}