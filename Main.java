import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    String[] list1 = { "a", "b", "c" };
    String[] list2 = { "a", "b", "c" }; // Change  Digital signatures identical for these two lists.
    //  If I now change anything in list two and get the hashes again, you see that you can get a completely different digital signature.

    System.out.println(Arrays.hashCode(list1));
    System.out.println(Arrays.hashCode(list2));
  }
}
// The hashCode() method is defined in Java Object class which computes the hash values of given input objects.
// It returns an integer whose value represents the hash value of the input object.
// The hashCode() method is used to generate the hash values of objects.
// This is the foundation of a blockchain because a blockchain is a list of blocks a chain of blocks and each block holds the digital signature
// of the previous block and the digital signature of the next block is based upon the digital signature of the current block, so they are always together.
// The next signature will be based on the current signature, and the current signature is based on the previous signature. So if you change anything back in the past,
//  you will break all of the signatures they will look completely different.
//  Digital signatures are hashes and are part of the blockchain technology.
