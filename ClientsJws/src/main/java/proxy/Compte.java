
package proxy;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour compte complex type.</p>
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.</p>
 * 
 * <pre>{@code
 * <complexType name="compte">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="code" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="datecreation" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="solde" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "compte", propOrder = {
    "code",
    "datecreation",
    "solde"
})
public class Compte {

    protected int code;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datecreation;
    protected double solde;

    /**
     * Obtient la valeur de la propriété code.
     * 
     */
    public int getCode() {
        return code;
    }

    /**
     * Définit la valeur de la propriété code.
     * 
     */
    public void setCode(int value) {
        this.code = value;
    }

    /**
     * Obtient la valeur de la propriété datecreation.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatecreation() {
        return datecreation;
    }

    /**
     * Définit la valeur de la propriété datecreation.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatecreation(XMLGregorianCalendar value) {
        this.datecreation = value;
    }

    /**
     * Obtient la valeur de la propriété solde.
     * 
     */
    public double getSolde() {
        return solde;
    }

    /**
     * Définit la valeur de la propriété solde.
     * 
     */
    public void setSolde(double value) {
        this.solde = value;
    }

}
