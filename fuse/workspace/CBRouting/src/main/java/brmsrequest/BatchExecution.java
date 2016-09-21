
package brmsrequest;

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
 *         &lt;element name="insert">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="com.redhat.brms.mortgageappvalidation.Application">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="socialSecurityNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="annualIncome" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="salesPrice" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="downPayment" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="amortization" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="out-identifier" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="fire-all-rules" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *       &lt;attribute name="lookup" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "insert",
    "fireAllRules"
})
@XmlRootElement(name = "batch-execution")
public class BatchExecution {

    @XmlElement(required = true)
    protected BatchExecution.Insert insert;
    @XmlElement(name = "fire-all-rules", required = true)
    protected String fireAllRules;
    @XmlAttribute(name = "lookup")
    protected String lookup;

    /**
     * Gets the value of the insert property.
     * 
     * @return
     *     possible object is
     *     {@link BatchExecution.Insert }
     *     
     */
    public BatchExecution.Insert getInsert() {
        return insert;
    }

    /**
     * Sets the value of the insert property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchExecution.Insert }
     *     
     */
    public void setInsert(BatchExecution.Insert value) {
        this.insert = value;
    }

    /**
     * Gets the value of the fireAllRules property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFireAllRules() {
        return fireAllRules;
    }

    /**
     * Sets the value of the fireAllRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFireAllRules(String value) {
        this.fireAllRules = value;
    }

    /**
     * Gets the value of the lookup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLookup() {
        return lookup;
    }

    /**
     * Sets the value of the lookup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLookup(String value) {
        this.lookup = value;
    }


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
     *         &lt;element name="com.redhat.brms.mortgageappvalidation.Application">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="socialSecurityNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="annualIncome" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="salesPrice" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="downPayment" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="amortization" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="out-identifier" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "comRedhatBrmsMortgageappvalidationApplication"
    })
    public static class Insert {

        @XmlElement(name = "com.redhat.brms.mortgageappvalidation.Application", required = true)
        protected BatchExecution.Insert.ComRedhatBrmsMortgageappvalidationApplication comRedhatBrmsMortgageappvalidationApplication;
        @XmlAttribute(name = "out-identifier")
        protected String outIdentifier;

        /**
         * Gets the value of the comRedhatBrmsMortgageappvalidationApplication property.
         * 
         * @return
         *     possible object is
         *     {@link BatchExecution.Insert.ComRedhatBrmsMortgageappvalidationApplication }
         *     
         */
        public BatchExecution.Insert.ComRedhatBrmsMortgageappvalidationApplication getComRedhatBrmsMortgageappvalidationApplication() {
            return comRedhatBrmsMortgageappvalidationApplication;
        }

        /**
         * Sets the value of the comRedhatBrmsMortgageappvalidationApplication property.
         * 
         * @param value
         *     allowed object is
         *     {@link BatchExecution.Insert.ComRedhatBrmsMortgageappvalidationApplication }
         *     
         */
        public void setComRedhatBrmsMortgageappvalidationApplication(BatchExecution.Insert.ComRedhatBrmsMortgageappvalidationApplication value) {
            this.comRedhatBrmsMortgageappvalidationApplication = value;
        }

        /**
         * Gets the value of the outIdentifier property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOutIdentifier() {
            return outIdentifier;
        }

        /**
         * Sets the value of the outIdentifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOutIdentifier(String value) {
            this.outIdentifier = value;
        }


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
         *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="salesPrice" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="downPayment" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="amortization" type="{http://www.w3.org/2001/XMLSchema}byte"/>
         *       &lt;/sequence>
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
            "address",
            "salesPrice",
            "downPayment",
            "amortization"
        })
        public static class ComRedhatBrmsMortgageappvalidationApplication {

            @XmlElement(required = true)
            protected String name;
            protected int socialSecurityNumber;
            protected int annualIncome;
            @XmlElement(required = true)
            protected String address;
            protected int salesPrice;
            protected int downPayment;
            protected byte amortization;

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
             * Gets the value of the address property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAddress() {
                return address;
            }

            /**
             * Sets the value of the address property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAddress(String value) {
                this.address = value;
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

        }

    }

}
