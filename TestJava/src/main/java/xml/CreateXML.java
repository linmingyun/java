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
		buf.append("<category label='�Ͼ���' />\r\n");
		buf.append("<category label='������' />\r\n");
		buf.append("<category label='������' />\r\n");
		buf.append("<category label='������' />\r\n");
		buf.append("<category label='������' />\r\n");
		buf.append("<category label='��ͨ��' />\r\n");
		buf.append("<category label='���Ƹ���' />\r\n");
		buf.append("<category label='������' />\r\n");
		buf.append("<category label='�γ���' />\r\n");
		buf.append("<category label='������' />\r\n");
		buf.append("<category label='����' />\r\n");
		buf.append("<category label='̩����' />\r\n");
		buf.append("<category label='��Ǩ��' />\r\n");
		buf.append("</categories>\r\n");
		buf.append("<dataSet>\r\n");
		buf.append("<dataset seriesname='ũҵ��ˮ��' color='5aae30' showValues='0'>\r\n");
		buf.append("<set value='17.7506' toolText='ũҵ,17.7506,41.19%' />\r\n");
		buf.append("<set value='17.7506' toolText='ũҵ,17.7506,41.19%' />\r\n");
		buf.append("<set value='17.7506' toolText='ũҵ,17.7506,41.19%' />\r\n");
		buf.append("<set value='17.7506' toolText='ũҵ,17.7506,41.19%' />\r\n");
		buf.append("<set value='17.7506' toolText='ũҵ,17.7506,41.19%' />\r\n");
		buf.append("<set value='17.7506' toolText='ũҵ,17.7506,41.19%' />\r\n");
		buf.append("<set value='17.7506' toolText='ũҵ,17.7506,41.19%' />\r\n");
		buf.append("<set value='17.7506' toolText='ũҵ,17.7506,41.19%' />\r\n");
		buf.append("<set value='17.7506' toolText='ũҵ,17.7506,41.19%' />\r\n");
		buf.append("<set value='17.7506' toolText='ũҵ,17.7506,41.19%' />\r\n");
		buf.append("<set value='17.7506' toolText='ũҵ,17.7506,41.19%' />\r\n");
		buf.append("<set value='17.7506' toolText='ũҵ,17.7506,41.19%' />\r\n");
		buf.append("<set value='17.7506' toolText='ũҵ,17.7506,41.19%' />\r\n");
		buf.append("</dataset>\r\n");
		buf.append("<dataset seriesname='��ҵ��ˮ��' color='987df2' showValues='0'>\r\n");
		buf.append("<set value='17.0800' toolText='��ҵ,17.08,39.64%' />\r\n");
		buf.append("<set value='17.0800' toolText='��ҵ,17.08,39.64%' />\r\n");
		buf.append("<set value='17.0800' toolText='��ҵ,17.08,39.64%' />\r\n");
		buf.append("<set value='17.0800' toolText='��ҵ,17.08,39.64%' />\r\n");
		buf.append("<set value='17.0800' toolText='��ҵ,17.08,39.64%' />\r\n");
		buf.append("<set value='17.0800' toolText='��ҵ,17.08,39.64%' />\r\n");
		buf.append("<set value='17.0800' toolText='��ҵ,17.08,39.64%' />\r\n");
		buf.append("<set value='17.0800' toolText='��ҵ,17.08,39.64%' />\r\n");
		buf.append("<set value='17.0800' toolText='��ҵ,17.08,39.64%' />\r\n");
		buf.append("<set value='17.0800' toolText='��ҵ,17.08,39.64%' />\r\n");
		buf.append("<set value='17.0800' toolText='��ҵ,17.08,39.64%' />\r\n");
		buf.append("<set value='17.0800' toolText='��ҵ,17.08,39.64%' />\r\n");
		buf.append("<set value='17.0800' toolText='��ҵ,17.08,39.64%' />\r\n");
		buf.append("</dataset>\r\n");
		buf.append("<dataset seriesname='������ˮ��     (��λ:��m3)' color='f7af05' showValues='0'>\r\n");
		buf.append("<set value='8.2600' toolText='����,8.26,19.17%' />\r\n");
		buf.append("<set value='8.2600' toolText='����,8.26,19.17%' />\r\n");
		buf.append("<set value='8.2600' toolText='����,8.26,19.17%' />\r\n");
		buf.append("<set value='8.2600' toolText='����,8.26,19.17%' />\r\n");
		buf.append("<set value='8.2600' toolText='����,8.26,19.17%' />\r\n");
		buf.append("<set value='8.2600' toolText='����,8.26,19.17%' />\r\n");
		buf.append("<set value='8.2600' toolText='����,8.26,19.17%' />\r\n");
		buf.append("<set value='8.2600' toolText='����,8.26,19.17%' />\r\n");
		buf.append("<set value='8.2600' toolText='����,8.26,19.17%' />\r\n");
		buf.append("<set value='8.2600' toolText='����,8.26,19.17%' />\r\n");
		buf.append("<set value='8.2600' toolText='����,8.26,19.17%' />\r\n");
		buf.append("<set value='8.2600' toolText='����,8.26,19.17%' />\r\n");
		buf.append("<set value='8.2600' toolText='����,8.26,19.17%' />\r\n");
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
