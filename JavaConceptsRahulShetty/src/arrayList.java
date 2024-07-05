import java.util.ArrayList;

public class arrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> ai = new ArrayList<Integer>();
		ArrayList<String> as = new ArrayList<String>();
		
		ai.add(4);
		ai.add(100);
		
		
		as.add("HI");
		as.add("Hello");
		
		System.out.println(ai);
		System.out.println(as);

		ai.add(1, 250);
		as.add(1, "hhhh");
		
		System.out.println(as.indexOf("HI"));
		
		System.out.println(ai);
		System.out.println(as);
		
		
        ArrayList<String> a = new ArrayList<String>();
        a.add("apple");
        a.add("banana");
        a.add("cherry");
        a.add("mango");
        a.add("apple");
        
        System.out.println(a);
        
        a.remove("apple");
		
        if (a.contains("orange")) {
        	System.out.println("found");
        }else {
        	System.out.println("Not found");
        	
        }
        
        
        System.out.println(a.size());
        for (int i=0;i<a.size();i++){
        	System.out.println(i+a.get(i));
        	
        }
	}

}
