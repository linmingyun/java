package ucvp;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.1.10
 * 2017-03-16T23:17:14.444+08:00
 * Generated source version: 3.1.10
 * 
 */
@WebService(targetNamespace = "http://siebel.com/AccountUpload", name = "UCVP_spcAccount_spcUpload_spcWorkflow")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface UCVPSpcAccountSpcUploadSpcWorkflow {

    @WebMethod(operationName = "UCVP_spcAccount_spcUpload", action = "document/http://siebel.com/AccountUpload:UCVP_spcAccount_spcUpload")
    @WebResult(name = "UCVP_spcAccount_spcUpload_Output", targetNamespace = "http://siebel.com/AccountUpload", partName = "UCVP_spcAccount_spcUpload_Output")
    public UCVPSpcAccountSpcUploadOutput ucvpSpcAccountSpcUpload(
            @WebParam(partName = "UCVP_spcAccount_spcUpload_Input", name = "UCVP_spcAccount_spcUpload_Input", targetNamespace = "http://siebel.com/AccountUpload")
                    UCVPSpcAccountSpcUploadInput ucvpSpcAccountSpcUploadInput
    );
}
