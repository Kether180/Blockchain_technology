import java.util.ArrayList;

public class Main2 {
  ArrayList<Block> blockchainn = new ArrayList<>();

  public static void main(String[] args) {
    String[] genesisTransactions = {
      "Peter sent 100 DKK to Anton",
      "Anton sent 10 DKK to Chang",
    };
    Block genesisBlock = new Block(0, genesisTransactions);

    String[] block2Transactions = {
      "Anton sent 100 DKK to Chang",
      "Peter sent 10 lkr to Anton",
    };
    Block block2 = new Block(genesisBlock.getBlockHash(), block2Transactions);

    System.out.println("Hash of genesis block " + genesisBlock.getBlockHash());
    System.out.println("Hash of block2 " + block2.getBlockHash());
  }
}
// The blockchain, an ArrayList of blocks, so it’s an array of blocks.
// We need to create a genesis block because each block chain needs a genesis block that is hard-coded,
// the reason is that as you can see each block has the hash of the previous block.
// However, the Genesis block is the first block, so it has no previous block so we need to hard code.
