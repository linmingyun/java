package xml;

import java.io.FileWriter;
import java.io.IOException;

public class CreateXML {

	public static void main(String[] args) {
		StringBuffer buf = new StringBuffer();
		buf.append("<?xml version='1.0' encoding='GBK'?>\r\n");
		buf.append("<chart caption='' baseFontSize='12' palette='2' bgColor='FFFFFF,3399CC' bgAlpha='10,10' ");
		buf.append("shownames='1' showvalues='0' numberPrefix='' showSum='1' decimals='2' ");
		buf.append("useRoundEdges='1' alternateHGridColor='3399CC' alternateHGridAlpha='5' ");
		buf.append("divLineColor='3399CC' divLineAlpha='20' chartBottomMargin='10' plotSpacePercent='40'>\r\n");
		buf.append("<categories font='Arial' fontSize='12' fontColor='000000' divLineColor='3399CC' divLineAlpha='20'>\r\n");
		buf.append("<category label='南京市' />\r\n");
		buf.append("<category label='无锡市' />\r\n");
		buf.append("<category label='徐州市' />\r\n");
		buf.append("<category label='常州市' />\r\n");
		buf.append("<category label='苏州市' />\r\n");
		buf.append("<category label='南通市' />\r\n");
		buf.append("<category label='连云港市' />\r\n");
		buf.append("<category label='淮安市' />\r\n");
		buf.append("<category label='盐城市' />\r\n");
		buf.append("<category label='扬州市' />\r\n");
		buf.append("<category label='镇江市' />\r\n");
		buf.append("<category label='泰州市' />\r\n");
		buf.append("<category label='宿迁市' />\r\n");
		buf.append("</categories>\r\n");
		buf.append("<dataSet>\r\n");
		buf.append("<dataset seriesname='农业用水量' color='5aae30' showValues='0'>\r\n");
		buf.append("<set value='17.7506' toolText='农业,17.7506,41.19%' />\r\n");
		buf.append("<set value='17.7506' toolText='农业,17.7506,41.19%' />\r\n");
		buf.append("<set value='17.7506' toolText='农业,17.7506,41.19%' />\r\n");
		buf.append("<set value='17.7506' toolText='农业,17.7506,41.19%' />\r\n");
		buf.append("<set value='17.7506' toolText='农业,17.7506,41.19%' />\r\n");
		buf.append("<set value='17.7506' toolText='农业,17.7506,41.19%' />\r\n");
		buf.append("<set value='17.7506' toolText='农业,17.7506,41.19%' />\r\n");
		buf.append("<set value='17.7506' toolText='农业,17.7506,41.19%' />\r\n");
		buf.append("<set value='17.7506' toolText='农业,17.7506,41.19%' />\r\n");
		buf.append("<set value='17.7506' toolText='农业,17.7506,41.19%' />\r\n");
		buf.append("<set value='17.7506' toolText='农业,17.7506,41.19%' />\r\n");
		buf.append("<set value='17.7506' toolText='农业,17.7506,41.19%' />\r\n");
		buf.append("<set value='17.7506' toolText='农业,17.7506,41.19%' />\r\n");
		buf.append("</dataset>\r\n");
		buf.append("<dataset seriesname='工业用水量' color='987df2' showValues='0'>\r\n");
		buf.append("<set value='17.0800' toolText='工业,17.08,39.64%' />\r\n");
		buf.append("<set value='17.0800' toolText='工业,17.08,39.64%' />\r\n");
		buf.append("<set value='17.0800' toolText='工业,17.08,39.64%' />\r\n");
		buf.append("<set value='17.0800' toolText='工业,17.08,39.64%' />\r\n");
		buf.append("<set value='17.0800' toolText='工业,17.08,39.64%' />\r\n");
		buf.append("<set value='17.0800' toolText='工业,17.08,39.64%' />\r\n");
		buf.append("<set value='17.0800' toolText='工业,17.08,39.64%' />\r\n");
		buf.append("<set value='17.0800' toolText='工业,17.08,39.64%' />\r\n");
		buf.append("<set value='17.0800' toolText='工业,17.08,39.64%' />\r\n");
		buf.append("<set value='17.0800' toolText='工业,17.08,39.64%' />\r\n");
		buf.append("<set value='17.0800' toolText='工业,17.08,39.64%' />\r\n");
		buf.append("<set value='17.0800' toolText='工业,17.08,39.64%' />\r\n");
		buf.append("<set value='17.0800' toolText='工业,17.08,39.64%' />\r\n");
		buf.append("</dataset>\r\n");
		buf.append("<dataset seriesname='生活用水量     (单位:亿m3)' color='f7af05' showValues='0'>\r\n");
		buf.append("<set value='8.2600' toolText='生活,8.26,19.17%' />\r\n");
		buf.append("<set value='8.2600' toolText='生活,8.26,19.17%' />\r\n");
		buf.append("<set value='8.2600' toolText='生活,8.26,19.17%' />\r\n");
		buf.append("<set value='8.2600' toolText='生活,8.26,19.17%' />\r\n");
		buf.append("<set value='8.2600' toolText='生活,8.26,19.17%' />\r\n");
		buf.append("<set value='8.2600' toolText='生活,8.26,19.17%' />\r\n");
		buf.append("<set value='8.2600' toolText='生活,8.26,19.17%' />\r\n");
		buf.append("<set value='8.2600' toolText='生活,8.26,19.17%' />\r\n");
		buf.append("<set value='8.2600' toolText='生活,8.26,19.17%' />\r\n");
		buf.append("<set value='8.2600' toolText='生活,8.26,19.17%' />\r\n");
		buf.append("<set value='8.2600' toolText='生活,8.26,19.17%' />\r\n");
		buf.append("<set value='8.2600' toolText='生活,8.26,19.17%' />\r\n");
		buf.append("<set value='8.2600' toolText='生活,8.26,19.17%' />\r\n");
		buf.append("</dataset>\r\n");
		buf.append("</dataSet>\r\n");
		buf.append("</chart>\r\n");
		
		FileWriter fw = null;
		try {
			fw = new FileWriter("D:\\Java\\ShangHai\\jswr\\web\\XML_FusionCharts\\xxxx.xml");
			fw.write(buf.toString());
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
