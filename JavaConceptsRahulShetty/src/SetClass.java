import java.util.HashSet;
import java.util.Iterator;

public class SetClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> hs = new HashSet<String>();
		hs.add("PGodi");
		hs.add("Pradeep");
		hs.add("PGodi");
		System.out.println(hs);
		hs.size();
		hs.contains("PGodi");
		
		
		Iterator<String> itr = hs.iterator();
//		itr.next();
//		itr.hasNext();
		
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
