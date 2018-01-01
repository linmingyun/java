
package ucvp;

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
 *         &lt;element name="RequestHead"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="RequestID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="SourceSystem" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="TargetSystem" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="ServiceName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RequestBody"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Siebel_spcOperation_spcObject_spcId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="ListOfUcvpInterBo" type="{http://www.siebel.com/xml/UCVP%20Inter%20BO}ListOfUcvpInterBo"/&gt;
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
    "requestHead",
    "requestBody"
})
@XmlRootElement(name = "UCVP_spcAccount_spcUpload_Input", namespace = "http://siebel.com/AccountUpload")
public class UCVPSpcAccountSpcUploadInput {

    @XmlElement(name = "RequestHead", namespace = "http://siebel.com/AccountUpload", required = true)
    protected RequestHead requestHead;
    @XmlElement(name = "RequestBody", namespace = "http://siebel.com/AccountUpload", required = true)
    protected RequestBody requestBody;

    /**
     * ��ȡrequestHead���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RequestHead }
     *     
     */
    public RequestHead getRequestHead() {
        return requestHead;
    }

    /**
     * ����requestHead���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RequestHead }
     *     
     */
    public void setRequestHead(RequestHead value) {
        this.requestHead = value;
    }

    /**
     * ��ȡrequestBody���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RequestBody }
     *     
     */
    public RequestBody getRequestBody() {
        return requestBody;
    }

    /**
     * ����requestBody���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RequestBody }
     *     
     */
    public void setRequestBody(RequestBody value) {
        this.requestBody = value;
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
     *         &lt;element name="Siebel_spcOperation_spcObject_spcId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="ListOfUcvpInterBo" type="{http://www.siebel.com/xml/UCVP%20Inter%20BO}ListOfUcvpInterBo"/&gt;
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
        "siebelSpcOperationSpcObjectSpcId",
        "listOfUcvpInterBo"
    })
    public static class RequestBody {

        @XmlElement(name = "Siebel_spcOperation_spcObject_spcId", namespace = "http://siebel.com/AccountUpload", required = true)
        protected String siebelSpcOperationSpcObjectSpcId;
        @XmlElement(name = "ListOfUcvpInterBo", namespace = "http://siebel.com/AccountUpload", required = true)
        protected ListOfUcvpInterBo listOfUcvpInterBo;

        /**
         * ��ȡsiebelSpcOperationSpcObjectSpcId���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSiebelSpcOperationSpcObjectSpcId() {
            return siebelSpcOperationSpcObjectSpcId;
        }

        /**
         * ����siebelSpcOperationSpcObjectSpcId���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSiebelSpcOperationSpcObjectSpcId(String value) {
            this.siebelSpcOperationSpcObjectSpcId = value;
        }

        /**
         * ��ȡlistOfUcvpInterBo���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link ListOfUcvpInterBo }
         *     
         */
        public ListOfUcvpInterBo getListOfUcvpInterBo() {
            return listOfUcvpInterBo;
        }

        /**
         * ����listOfUcvpInterBo���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link ListOfUcvpInterBo }
         *     
         */
        public void setListOfUcvpInterBo(ListOfUcvpInterBo value) {
            this.listOfUcvpInterBo = value;
        }

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
     *         &lt;element name="RequestID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="SourceSystem" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="TargetSystem" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="ServiceName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "requestID",
        "sourceSystem",
        "targetSystem",
        "serviceName"
    })
    public static class RequestHead {

        @XmlElement(name = "RequestID", namespace = "http://siebel.com/AccountUpload", required = true)
        protected String requestID;
        @XmlElement(name = "SourceSystem", namespace = "http://siebel.com/AccountUpload", required = true)
        protected String sourceSystem;
        @XmlElement(name = "TargetSystem", namespace = "http://siebel.com/AccountUpload", required = true)
        protected String targetSystem;
        @XmlElement(name = "ServiceName", namespace = "http://siebel.com/AccountUpload", required = true)
        protected String serviceName;

        /**
         * ��ȡrequestID���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRequestID() {
            return requestID;
        }

        /**
         * ����requestID���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRequestID(String value) {
            this.requestID = value;
        }

        /**
         * ��ȡsourceSystem���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSourceSystem() {
            return sourceSystem;
        }

        /**
         * ����sourceSystem���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSourceSystem(String value) {
            this.sourceSystem = value;
        }

        /**
         * ��ȡtargetSystem���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTargetSystem() {
            return targetSystem;
        }

        /**
         * ����targetSystem���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTargetSystem(String value) {
            this.targetSystem = value;
        }

        /**
         * ��ȡserviceName���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getServiceName() {
            return serviceName;
        }

        /**
         * ����serviceName���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setServiceName(String value) {
            this.serviceName = value;
        }

    }

}
