
package ucvp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ListOfUcvpInterBoTopElmt complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ListOfUcvpInterBoTopElmt"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
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
@XmlType(name = "ListOfUcvpInterBoTopElmt", propOrder = {
    "listOfUcvpInterBo"
})
public class ListOfUcvpInterBoTopElmt {

    @XmlElement(name = "ListOfUcvpInterBo", required = true)
    protected ListOfUcvpInterBo listOfUcvpInterBo;

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
