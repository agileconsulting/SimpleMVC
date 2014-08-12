package agileConsulting.simpleMVC.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SearchService {

 public	List<Emp> findEmpl(int deptno, Date startDate, Date endDate){
	 List<Emp> retVal = new ArrayList<Emp>();
	 String sql="Select Dname, Deptno";
	 return retVal;
 }
}
