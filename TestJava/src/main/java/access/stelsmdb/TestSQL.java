package access.stelsmdb;

import java.sql.*;

/*
 This class demonstrates how to read MDB files by using JDBC API.
*/

public class TestSQL {

  public static void main(String[] args) {
    try {
      // load the driver into memory
      Class.forName("jstels.jdbc.mdb.MDBDriver2");

      // create a connection. The first command line parameter is assumed to
      // be the MDB file in which data tables are held
      Connection conn = DriverManager.getConnection("jdbc:jstels:mdb:" + args[0]);

      // create a Statement object to execute the query with
      Statement stmt = conn.createStatement();

      // execute a query
      ResultSet rs = stmt.executeQuery(
		"SELECT  prod.description AS \"Product\", regs.regionname AS \"Region\", " +
		"minprice, stdprice, FORMATDATETIME(startdate, \'dd " +
		"MMMMM yyyy\' ) AS \"Start Date\", FORMATDATETIME(enddate, \'dd MMMMM yyyy\') " +
		"AS \"End Date\" FROM prices ps JOIN regions regs ON " +
		"ps.regionid = regs.id JOIN products prod ON prod.prodid = ps.prodid " +
		"\nORDER BY \"Product\"");

      // read the data and put it to the console
      for (int j = 1; j <= rs.getMetaData().getColumnCount(); j++) {
	System.out.print(rs.getMetaData().getColumnName(j) + "\t");
      }
      System.out.println();

      while (rs.next()) {
	for (int j = 1; j <= rs.getMetaData().getColumnCount(); j++) {
	  System.out.print(rs.getObject(j) + "\t");
	}
	System.out.println();
      }

      // close the objects
      rs.close();
      stmt.close();
      conn.close();
    }
    catch (Exception e) {
      e.printStackTrace();
    }
  }
}
