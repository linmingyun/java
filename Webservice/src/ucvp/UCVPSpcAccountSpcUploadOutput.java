
package ucvp;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Output"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ListOfUCVPInterBOResp"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="UCVPInterBOResp" type="{http://www.siebel.com/xml/UCVP%20Inter%20BO}UCVPInterBOResp" maxOccurs="500" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "output"
})
@XmlRootElement(name = "UCVP_spcAccount_spcUpload_Output", namespace = "http://siebel.com/AccountUpload")
public class UCVPSpcAccountSpcUploadOutput {

    @XmlElement(name = "Output", namespace = "http://siebel.com/AccountUpload", required = true)
    protected Output output;

    /**
     * ��ȡoutput���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Output }
     *     
     */
    public Output getOutput() {
        return output;
    }

    /**
     * ����output���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Output }
     *     
     */
    public void setOutput(Output value) {
        this.output = value;
    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="ListOfUCVPInterBOResp"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="UCVPInterBOResp" type="{http://www.siebel.com/xml/UCVP%20Inter%20BO}UCVPInterBOResp" maxOccurs="500" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "listOfUCVPInterBOResp"
    })
    public static class Output {

        @XmlElement(name = "ListOfUCVPInterBOResp", namespace = "http://siebel.com/AccountUpload", required = true)
        protected ListOfUCVPInterBOResp listOfUCVPInterBOResp;

        /**
         * ��ȡlistOfUCVPInterBOResp���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link ListOfUCVPInterBOResp }
         *     
         */
        public ListOfUCVPInterBOResp getListOfUCVPInterBOResp() {
            return listOfUCVPInterBOResp;
        }

        /**
         * ����listOfUCVPInterBOResp���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link ListOfUCVPInterBOResp }
         *     
         */
        public void setListOfUCVPInterBOResp(ListOfUCVPInterBOResp value) {
            this.listOfUCVPInterBOResp = value;
        }


        /**
         * <p>anonymous complex type�� Java �ࡣ
         * 
         * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="UCVPInterBOResp" type="{http://www.siebel.com/xml/UCVP%20Inter%20BO}UCVPInterBOResp" maxOccurs="500" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "ucvpInterBOResp"
        })
        public static class ListOfUCVPInterBOResp {

            @XmlElement(name = "UCVPInterBOResp", namespace = "http://siebel.com/AccountUpload")
            protected List<UCVPInterBOResp> ucvpInterBOResp;

            /**
             * Gets the value of the ucvpInterBOResp property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the ucvpInterBOResp property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getUCVPInterBOResp().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link UCVPInterBOResp }
             * 
             * 
             */
            public List<UCVPInterBOResp> getUCVPInterBOResp() {
                if (ucvpInterBOResp == null) {
                    ucvpInterBOResp = new ArrayList<UCVPInterBOResp>();
                }
                return this.ucvpInterBOResp;
            }

        }

    }

}
