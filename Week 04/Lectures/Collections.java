import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Collections {

	public static void main(String[] args) {
		
		/*List
		 *
		 *Allows duplicates
		 *keeps elements ordered by index
		 *Allows null values
		 *Common implementations: ArrayList (most common), LinkedList, Vector
		 *
		 */
		List<String> students = new ArrayList<String>();
		students.add("Rob");
		students.add("Sam");
		students.add("Tom");
		students.add(null);
		
		for(String student : students) {
			System.out.println(student);
		}
		System.out.println(" ");
		System.out.println(students.get(2));
		System.out.println(students.get(0));
		
System.out.println(" ");
System.out.println(" ");
System.out.println(" ");
System.out.println(" ");
		
		
		/*Set
		 * 
		 * Does not allow duplicates
		 * Unordered
		 * Allows null
		 * Common implementations: HashSet (most common), LinkedHashSet, TreeSet
		 * 
		 */
		
		Set<String> states = new HashSet<String>();
		states.add("Alabama");
		states.add("Alaska");
		states.add("California");
		states.add("Arizona");
		states.add(null);
		states.add("Arizona");
		
		System.out.println(states.size());
		System.out.println(states.contains("Delaware"));
		
		System.out.println(" ");
		
		for (String state : states) {
			System.out.println(state);
		}
		
		System.out.println(" ");
		
		//states.remove("Alabama"); removes value from Set
		
		if (states.contains("Arizona")) {
			states.remove("Alaska");
		}
		
		for (String state : states) {
			System.out.println(state);
		}
		
System.out.println(" ");
System.out.println(" ");
System.out.println(" ");
System.out.println(" ");		
		
		/*Map
		 * 
		 * Map<K,V> Key, Value
		 * Key value pairs (dictionary) The first value will be a key and the second value is going to be the value of the key (e.g. below)
		 * first(key)        second(value)
		 *   Word      :     *definition*
		 *   Values can be duplicate, but not keys
		 *   Common Implementations: HashMap, LinkedHashMap, TreeMap, Hashtable
		 * 
		 */
		
		Map<Integer, String> racerRanks = new HashMap<Integer, String>();
		racerRanks.put(1, "Tommy");
		racerRanks.put(2, "Jim");
		racerRanks.put(3, "Raul");
		
		System.out.println(" " + racerRanks.get(1));
		
		//racerRanks.remove(1); removes key from indicated map.
		
		Set<Integer> racerKeys = racerRanks.keySet();
		for (Integer key : racerKeys) {
			System.out.println(key + " : " + racerRanks.get(key));
		}
		
System.out.println(" ");
		
		Collection<String> racers = racerRanks.values();
		for (String racer : racers) {
			System.out.println(racer);
		}
		
		Map<String, String> dictionary = new HashMap<String, String>();
		dictionary.put("Word", "definition inserted here");
		dictionary.put("Augment", "To upgrade");
		dictionary.put("ostentatious", "vulgarious activity");
		
		
		
		
		
		

	}

}
