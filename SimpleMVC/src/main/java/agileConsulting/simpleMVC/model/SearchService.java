package agileConsulting.simpleMVC.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SearchService {

 public	List<Emp> findEmpl(int deptno) throws Exception {
	 List<Emp> retVal = new ArrayList<Emp>();
	 String sql="select Department.name dname, employee.name ename from ";
	 		sql+=" EMPLOYEE, DEPARTMENT"; 
	 		sql+=" where employee.deptno=Department.Deptno and employee.deptno='"+deptno+"'";
	 		Connection conn= null;
	 		Statement stmt = null;
	 	    ResultSet rset = null;
	 try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
	 		conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.17.130:1521:xe","scott","tiger");
	 	    stmt = conn.createStatement();
	 	    rset = stmt.executeQuery(sql);
            while (rset.next()) {
				Emp impiegato = new Emp();
				impiegato.setDeptName(rset.getString("dname"));
			    impiegato.setName(rset.getString("ename"));
			    retVal.add(impiegato);
            }
	 		
	
	} catch (Exception e) {
		throw (e);
	} finally 		{
		if (conn!=null) {
			conn.close();
		}
		if (stmt!=null) {
			stmt.close();
		}
		if (rset!=null) {
			rset.close();
		}
	}
return retVal;
 }
}
