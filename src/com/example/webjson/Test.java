package com.example.webjson;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;



import com.example.webjson.StackQuery.SortBy;
import com.example.webjson.StackQuery.SortOrder;

public class Test {
	
public static void main(String[] args) {
		//https://api.stackexchange.com/2.2/search?
	    //site=stackoverflow&
	    //pagesize=50&
	    //order=desc&
	    //sort=relevance&
	    //tagged=java&
	    //intitle=URLconnection
		try {
		
			StackQuery query = new StackQuery();
			
			query.setSearchTerm("Hello World");
			query.setSortBy(SortBy.RELEVANCE);
			query.setSortOrder(SortOrder.ASCENDING);
			List<QueryResultBean> result = query.execute();
			for(int i = 0; i < result.size(); i++){
				System.out.println(result.get(i).getOwner()
						                 .getDisplay_name());
				System.out.println(result.get(i).getLink());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	

}
