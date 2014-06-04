package code_mathron;

import java.util.ArrayList;

public class SortObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<OrderRequest> olist = new ArrayList<OrderRequest>();
		OrderRequest or10 = new OrderRequest(10);
		olist.add(or10);
		OrderRequest or2 = new OrderRequest(2);
		olist.add(or2);
		OrderRequest or5 = new OrderRequest(5);
		olist.add(or5);
		OrderRequest temp = null;
//		olist.remove(2);
//		temp = or2;
//		olist.add(2, temp);
		
		for(int i = 0; i < olist.size(); i++){
			System.out.println(olist.get(i).toString() + "====" +olist.get(i).getHandleTime());
		}

		
		for(int i = 0; i < olist.size(); i++){
			for(int j = 0; j < i; j++){
				if((olist.get(j)).getHandleTime() > (olist.get(i)).getHandleTime()){
					
					temp = olist.get(i);
					olist.remove(i);
					olist.add(i, olist.get(j));
					olist.remove(j);
					olist.add(j, temp);
					
				}

			}
		}

		for(int i = 0; i < olist.size(); i++){
			System.out.println(olist.get(i).toString() + "====" + olist.get(i).getHandleTime());
		}
		
	}

	
}
