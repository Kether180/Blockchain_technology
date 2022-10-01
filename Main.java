import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    String[] list1 = { "a", "b", "c" };
    String[] list2 = { "a", "b", "c" };

    System.out.println(Arrays.hashCode(list1));
    System.out.println(Arrays.hashCode(list2));
  }
}
// The hashCode() method is defined in Java Object class which computes the hash values of given input objects.
// It returns an integer whose value represents the hash value of the input object.
// The hashCode() method is used to generate the hash values of objects.24 Jul 2021
