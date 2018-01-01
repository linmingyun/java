
package ucvp;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ucvp package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ListOfUcvpInterBo_QNAME = new QName("http://www.siebel.com/xml/UCVP%20Inter%20BO", "ListOfUcvpInterBo");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ucvp
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UCVPSpcAccountSpcUploadInput }
     * 
     */
    public UCVPSpcAccountSpcUploadInput createUCVPSpcAccountSpcUploadInput() {
        return new UCVPSpcAccountSpcUploadInput();
    }

    /**
     * Create an instance of {@link UCVPSpcAccountSpcUploadOutput }
     * 
     */
    public UCVPSpcAccountSpcUploadOutput createUCVPSpcAccountSpcUploadOutput() {
        return new UCVPSpcAccountSpcUploadOutput();
    }

    /**
     * Create an instance of {@link UCVPSpcAccountSpcUploadOutput.Output }
     * 
     */
    public UCVPSpcAccountSpcUploadOutput.Output createUCVPSpcAccountSpcUploadOutputOutput() {
        return new UCVPSpcAccountSpcUploadOutput.Output();
    }

    /**
     * Create an instance of {@link ListOfUcvpInterBo }
     * 
     */
    public ListOfUcvpInterBo createListOfUcvpInterBo() {
        return new ListOfUcvpInterBo();
    }

    /**
     * Create an instance of {@link ListOfUcvpInterBoTopElmt }
     * 
     */
    public ListOfUcvpInterBoTopElmt createListOfUcvpInterBoTopElmt() {
        return new ListOfUcvpInterBoTopElmt();
    }

    /**
     * Create an instance of {@link UCVPInterBOResp }
     * 
     */
    public UCVPInterBOResp createUCVPInterBOResp() {
        return new UCVPInterBOResp();
    }

    /**
     * Create an instance of {@link UcvpAccountInter }
     * 
     */
    public UcvpAccountInter createUcvpAccountInter() {
        return new UcvpAccountInter();
    }

    /**
     * Create an instance of {@link UCVPSpcAccountSpcUploadInput.RequestHead }
     * 
     */
    public UCVPSpcAccountSpcUploadInput.RequestHead createUCVPSpcAccountSpcUploadInputRequestHead() {
        return new UCVPSpcAccountSpcUploadInput.RequestHead();
    }

    /**
     * Create an instance of {@link UCVPSpcAccountSpcUploadInput.RequestBody }
     * 
     */
    public UCVPSpcAccountSpcUploadInput.RequestBody createUCVPSpcAccountSpcUploadInputRequestBody() {
        return new UCVPSpcAccountSpcUploadInput.RequestBody();
    }

    /**
     * Create an instance of {@link UCVPSpcAccountSpcUploadOutput.Output.ListOfUCVPInterBOResp }
     * 
     */
    public UCVPSpcAccountSpcUploadOutput.Output.ListOfUCVPInterBOResp createUCVPSpcAccountSpcUploadOutputOutputListOfUCVPInterBOResp() {
        return new UCVPSpcAccountSpcUploadOutput.Output.ListOfUCVPInterBOResp();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfUcvpInterBo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siebel.com/xml/UCVP%20Inter%20BO", name = "ListOfUcvpInterBo")
    public JAXBElement<ListOfUcvpInterBo> createListOfUcvpInterBo(ListOfUcvpInterBo value) {
        return new JAXBElement<ListOfUcvpInterBo>(_ListOfUcvpInterBo_QNAME, ListOfUcvpInterBo.class, null, value);
    }

}
