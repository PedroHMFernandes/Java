import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lista {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		list.add("Alex");
		list.add("Pedro");
		list.add("Bob Lee");
		list.add("Shrek III");
		list.add(1, "Ronaldo");
		list.add("Anna");
		list.add(2, "Marco");

		for (String name : list) {
			System.out.println(list.indexOf(name) + ": " + name);
		}
		
		List<String> result = list.stream().filter(name -> name.charAt(0) == 'A').collect(Collectors.toList());
		System.out.println("\nResult");
		for (String name : result) {
			System.out.println(result.indexOf(name) + ": " + name);
		}
		
		list.remove("Ronaldo");
		list.remove(2);
		list.removeIf(name -> name.charAt(0) == 'A');

		System.out.println("\nlist");
		for (String name : list) {
			System.out.println(list.indexOf(name) + ": " + name);
		}
	}
}
