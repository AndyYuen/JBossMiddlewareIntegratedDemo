
package homeloancustxml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="socialSecurityNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="annualIncome" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="adress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="salesPrice" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="downPayment" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="amortization" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *       &lt;/sequence>
 *       &lt;attribute name="infoType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "name",
    "socialSecurityNumber",
    "annualIncome",
    "adress",
    "salesPrice",
    "downPayment",
    "amortization"
})
@XmlRootElement(name = "Application")
public class Application {

    @XmlElement(required = true)
    protected String name;
    protected int socialSecurityNumber;
    protected int annualIncome;
    @XmlElement(required = true)
    protected String adress;
    protected int salesPrice;
    protected int downPayment;
    protected byte amortization;
    @XmlAttribute(name = "infoType")
    protected String infoType;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the socialSecurityNumber property.
     * 
     */
    public int getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    /**
     * Sets the value of the socialSecurityNumber property.
     * 
     */
    public void setSocialSecurityNumber(int value) {
        this.socialSecurityNumber = value;
    }

    /**
     * Gets the value of the annualIncome property.
     * 
     */
    public int getAnnualIncome() {
        return annualIncome;
    }

    /**
     * Sets the value of the annualIncome property.
     * 
     */
    public void setAnnualIncome(int value) {
        this.annualIncome = value;
    }

    /**
     * Gets the value of the adress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdress() {
        return adress;
    }

    /**
     * Sets the value of the adress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdress(String value) {
        this.adress = value;
    }

    /**
     * Gets the value of the salesPrice property.
     * 
     */
    public int getSalesPrice() {
        return salesPrice;
    }

    /**
     * Sets the value of the salesPrice property.
     * 
     */
    public void setSalesPrice(int value) {
        this.salesPrice = value;
    }

    /**
     * Gets the value of the downPayment property.
     * 
     */
    public int getDownPayment() {
        return downPayment;
    }

    /**
     * Sets the value of the downPayment property.
     * 
     */
    public void setDownPayment(int value) {
        this.downPayment = value;
    }

    /**
     * Gets the value of the amortization property.
     * 
     */
    public byte getAmortization() {
        return amortization;
    }

    /**
     * Sets the value of the amortization property.
     * 
     */
    public void setAmortization(byte value) {
        this.amortization = value;
    }

    /**
     * Gets the value of the infoType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfoType() {
        return infoType;
    }

    /**
     * Sets the value of the infoType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfoType(String value) {
        this.infoType = value;
    }

}
