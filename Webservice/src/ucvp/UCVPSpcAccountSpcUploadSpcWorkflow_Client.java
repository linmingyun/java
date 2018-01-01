
package ucvp;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.xml.namespace.QName;

/**
 * This class was generated by Apache CXF 3.1.10
 * 2017-03-16T23:17:14.272+08:00
 * Generated source version: 3.1.10
 * 
 */
public final class UCVPSpcAccountSpcUploadSpcWorkflow_Client {

    private static final QName SERVICE_NAME = new QName("http://siebel.com/AccountUpload", "UCVP_spcAccount_spcUpload_spcWorkflow");

    private UCVPSpcAccountSpcUploadSpcWorkflow_Client() {
    }

    public static void main(String args[]) throws Exception {
        URL wsdlURL = UCVPSpcAccountSpcUploadSpcWorkflow_Service.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        UCVPSpcAccountSpcUploadSpcWorkflow_Service ss = new UCVPSpcAccountSpcUploadSpcWorkflow_Service(wsdlURL, SERVICE_NAME);
        UCVPSpcAccountSpcUploadSpcWorkflow port = ss.getUCVPSpcAccountSpcUploadSpcWorkflow();  
        
        {
        System.out.println("Invoking ucvpSpcAccountSpcUpload...");
        UCVPSpcAccountSpcUploadInput input = new UCVPSpcAccountSpcUploadInput();
        
        UCVPSpcAccountSpcUploadInput.RequestHead requestHead = new UCVPSpcAccountSpcUploadInput.RequestHead();
        requestHead.setRequestID("1");
        requestHead.setServiceName("S1102001A");
        requestHead.setTargetSystem("DCECODE");
        requestHead.setSourceSystem("ASMPCODE");
        input.setRequestHead(requestHead);
        UCVPSpcAccountSpcUploadInput.RequestBody requestBody = new UCVPSpcAccountSpcUploadInput.RequestBody();
        ListOfUcvpInterBo list = new ListOfUcvpInterBo();
        List<UcvpAccountInter> ucvpAccountInter = list.getUcvpAccountInter();
        UcvpAccountInter inter = new UcvpAccountInter();
        inter.setDataSource("ASMP");
        inter.setSourceType("2");
        inter.setCustId("1111");
        inter.setVIN("1111111111");
        ucvpAccountInter.add(inter);
        list.ucvpAccountInter = ucvpAccountInter;
        requestBody.setListOfUcvpInterBo(list);
        input.setRequestHead(requestHead);
        input.setRequestBody(requestBody);
        
        UCVPSpcAccountSpcUploadOutput _ucvpSpcAccountSpcUpload__return = port.ucvpSpcAccountSpcUpload(input);
        System.out.println("ucvpSpcAccountSpcUpload.result=" + _ucvpSpcAccountSpcUpload__return);


        }

        System.exit(0);
    }

}
