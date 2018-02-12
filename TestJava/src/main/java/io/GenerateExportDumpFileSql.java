package io;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 生成导出dump文件的sql语句
 * Created by Administrator on 2018/2/5.
 */
public class GenerateExportDumpFileSql {

    public static void main(String[] args) {
        String fileName = "D:\\IO\\INPUT\\vin.txt";
        String entityCode = "D:\\IO\\INPUT\\entitycode.txt";
        String netCode = "D:\\IO\\INPUT\\netcode.txt";
        String sstCode = "D:\\IO\\INPUT\\sstcode.txt";
        splitJoint(fileName);
        generateSqlLastYear(splitJoint(entityCode),splitJoint(netCode),splitJoint(sstCode));
    }

    public static void generateSqlLastYear(String entityCode, String netCode, String sstCode) {
        String custSqlStart = "expdp sbpopt/**** tables=TT_VW_POTENTIAL_CUSTOMER query=\\\"where ENTITY_CODE in \\(";
        String custSqlEnd = "\\) and create_date \\> trunc\\(sysdate \\- 365\\)\\\" dumpfile= pcustomer.dmp logfile=pcustomer.log  directory=DP";
        String intentSqlStart = "expdp sbpopt/**** tables=TT_VW_CUSTOMER_INTENT query=\\\"where ENTITY_CODE in \\(";
        String intentSqlEnd = "\\) and create_date \\> trunc\\(sysdate \\- 365\\)\\\" dumpfile=follow.dmp logfile=follow.log  directory=DP";
        String followSqlStart = "expdp sbpopt/**** tables=TT_VW_FOLLOW_UP query=\\\"where ENTITY_CODE in \\(";
        String followSqlEnd = "\\) and create_date \\> trunc\\(sysdate \\- 365\\)\\\" dumpfile=intent.dmp logfile=intent.log  directory=DP";
        String succSqlStart = "expdp sbpopt/**** tables=TT_VW_SUCCESS query=\\\"where ENTITY_CODE in \\(";
        String succSqlEnd = "\\) and create_date \\> trunc\\(sysdate \\- 365\\)\\\" dumpfile=success.dmp logfile= success.log  directory=DP";
        String loseSqlStart = "expdp sbpopt/**** tables=TT_VW_LOSE query=\\\"where ENTITY_CODE in \\(";
        String loseSqlEnd = "\\) and create_date \\> trunc\\(sysdate \\- 365\\)\\\" dumpfile=lose.dmp logfile= lose.log  directory=DP";
        String showroomSqlStart = "expdp sbpopt/**** tables=tt_vw_showroom_reception query=\\\"where ENTITY_CODE in \\(";
        String showroomSqlEnd = "\\) and create_date \\> trunc\\(sysdate \\- 365\\)\\\" dumpfile=showroom.dmp logfile= showroom.log  directory=DP";
        String assignSqlStart = "expdp sbpopt/**** tables=TT_OEM_CUSTOMER_ASSIGN query=\\\"where ENTITY_CODE in \\(";
        String assignSqlEnd = "\\) and create_date \\> trunc\\(sysdate \\- 365\\)\\\" dumpfile=assign.dmp logfile= assign.log  directory=DP";
        String sanbaoSqlStart = "expdp sbpopt/**** tables=TT_SANBAO_VEHICLE query=\\\"where net_code in \\(";
        String sanbaoSqlEnd = "\\) and create_date \\> trunc\\(sysdate \\- 365\\)\\\" dumpfile=vehicle.dmp logfile= vehicle.log  directory=DP";
        String bussSqlStart = "expdp sbpopt/**** tables=TT_UC_BUSINESS query=\\\"where dlr_id in \\(";
        String bussSqlEnd = "\\)\\\" dumpfile=business.dmp logfile= business.log  directory=DP";
        String tivwoemSqlStart = "expdp sbpvit/**** tables=TI_VW_OEM_CUSTOMER query=\\\"where vdealer_id in \\(";
        String tivwoemSqlEnd = "\\) and create_date \\> trunc\\(sysdate \\- 365\\)\\\" dumpfile=oemcustomer.dmp logfile= oemcustomer.log  directory=DP";

        String custSql = custSqlStart + entityCode + custSqlEnd;
        String intentSql = intentSqlStart + entityCode + intentSqlEnd;
        String followSql = followSqlStart + entityCode + followSqlEnd;
        String succSql = succSqlStart + entityCode + succSqlEnd;
        String loseSql = loseSqlStart + entityCode + loseSqlEnd;
        String showroomSql = showroomSqlStart +  entityCode + showroomSqlEnd;
        String assignSql = assignSqlStart + entityCode + assignSqlEnd;
        String sanbaoSql = sanbaoSqlStart + netCode + sanbaoSqlEnd;
        String bussSql = bussSqlStart + sstCode + bussSqlEnd;
        String tivwoemSql = tivwoemSqlStart + netCode + tivwoemSqlEnd;

        List<String> list = new ArrayList<String>();
        list.add(custSql);
        list.add(intentSql);
        list.add(followSql);
        list.add(succSql);
        list.add(loseSql);
        list.add(showroomSql);
        list.add(assignSql);
        list.add(sanbaoSql);
        list.add(bussSql);
        list.add(tivwoemSql);

        String filePath = "D:\\IO\\OUTPUT\\";
        String fileName = "dump.txt";

        createFile(list,filePath,fileName);

        for (String sql : list) {
            System.out.println(sql + "\n");
        }
    }

    public static void createFile(List<String> list, String filePath, String fileName) {
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter(filePath+fileName));
            for (String sql : list) {
                bw.write(sql);
                bw.newLine();
                bw.newLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void generateSqlWithDate() {
        String custSqlStart = "expdp sbpopt/**** tables=TT_VW_POTENTIAL_CUSTOMER query=\\\"where ENTITY_CODE in \\(";
        String custSqlEnd = "\\) and create_date \\> to_date\\(\\'20180101\\',\\'yyyymmdd\\'\\)\\\" dumpfile= pcustomer.dmp logfile=pcustomer.log  directory=DP";
        String intentSqlStart = "expdp sbpopt/**** tables=TT_VW_CUSTOMER_INTENT query=\\\"where ENTITY_CODE in \\(";
        String intentSqlEnd = "\\) and create_date \\> to_date\\(\\'20180101\\',\\'yyyymmdd\\'\\)\\\" dumpfile=follow.dmp logfile=follow.log  directory=DP";
        String followSqlStart = "expdp sbpopt/**** tables=TT_VW_FOLLOW_UP query=\\\"where ENTITY_CODE in \\(";
        String followSqlEnd = "\\) and create_date \\> to_date\\(\\'20180101\\',\\'yyyymmdd\\'\\)\\\" dumpfile=intent.dmp logfile=intent.log  directory=DP";
        String succSqlStart = "expdp sbpopt/**** tables=TT_VW_SUCCESS query=\\\"where ENTITY_CODE in \\(";
        String succSqlEnd = "\\) and create_date \\> to_date\\(\\'20180101\\',\\'yyyymmdd\\'\\)\\\" dumpfile=success.dmp logfile= success.log  directory=DP";
        String loseSqlStart = "expdp sbpopt/**** tables=TT_VW_LOSE query=\\\"where ENTITY_CODE in \\(";
        String loseSqlEnd = "\\) and create_date \\> to_date\\(\\'20180101\\',\\'yyyymmdd\\'\\)\\\" dumpfile=lose.dmp logfile= lose.log  directory=DP";
        String showroomSqlStart = "expdp sbpopt/**** tables=tt_vw_showroom_reception query=\\\"where ENTITY_CODE in \\(";
        String showroomSqlEnd = "\\) and create_date \\> to_date\\(\\'20180101\\',\\'yyyymmdd\\'\\)\\\" dumpfile=showroom.dmp logfile= showroom.log  directory=DP";
        String assignSqlStart = "expdp sbpopt/**** tables=TT_OEM_CUSTOMER_ASSIGN query=\\\"where ENTITY_CODE in \\(";
        String assignSqlEnd = "\\) and create_date \\> to_date\\(\\'20180101\\',\\'yyyymmdd\\'\\)\\\" dumpfile=assign.dmp logfile= assign.log  directory=DP";
        String sanbaoSqlStart = "expdp sbpopt/**** tables=TT_SANBAO_VEHICLE query=\\\"where net_code in \\(";
        String sanbaoSqlEnd = "\\) and create_date \\> to_date\\(\\'20180101\\',\\'yyyymmdd\\'\\)\\\" dumpfile=vehicle.dmp logfile= vehicle.log  directory=DP";
        String bussSqlStart = "expdp sbpopt/**** tables=TT_UC_BUSINESS query=\\\"where dlr_id in \\(";
        String bussSqlEnd = "\\)\\\" dumpfile=business.dmp logfile= business.log  directory=DP";
        String tivwoemSqlStart = "expdp sbpvit/**** tables=TI_VW_OEM_CUSTOMER query=\\\"where vdealer_id in \\(";
        String tivwoemSqlEnd = "\\) and create_date \\> to_date\\(\\'20180101\\',\\'yyyymmdd\\'\\)\\\" dumpfile=oemcustomer.dmp logfile= oemcustomer.log  directory=DP";
    }

    /**
     * 拼接字符串
     * @param fileName
     * @return
     */
    public static String splitJoint(String fileName) {
        String num = "";
        String str = "";
        String linux = "";
        String line = "";
        int i = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            while ((line = br.readLine()) != null) {
                if (i == 0) {
                    num += line.trim();
                    str += "'" + line.trim() + "'";
                    linux += "\\'" + line.trim() + "\\'";
                } else {
                    num += "," + line.trim();
                    str += ",'" + line.trim() + "'";
                    linux += ",\\'" + line.trim() + "\\'";
                }
                i++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Total:"+i);
        System.out.println(num);
        System.out.println(str);
        System.out.println(linux+"\n");
        return linux;
    }
}
