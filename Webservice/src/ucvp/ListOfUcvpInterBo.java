
package ucvp;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ListOfUcvpInterBo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ListOfUcvpInterBo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UcvpAccountInter" type="{http://www.siebel.com/xml/UCVP%20Inter%20BO}UcvpAccountInter" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfUcvpInterBo", propOrder = {
    "ucvpAccountInter"
})
public class ListOfUcvpInterBo {

    @XmlElement(name = "UcvpAccountInter")
    protected List<UcvpAccountInter> ucvpAccountInter;

    /**
     * Gets the value of the ucvpAccountInter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ucvpAccountInter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUcvpAccountInter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UcvpAccountInter }
     * 
     * 
     */
    public List<UcvpAccountInter> getUcvpAccountInter() {
        if (ucvpAccountInter == null) {
            ucvpAccountInter = new ArrayList<UcvpAccountInter>();
        }
        return this.ucvpAccountInter;
    }

}
