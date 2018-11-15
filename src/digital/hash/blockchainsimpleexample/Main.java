package digital.hash.blockchainsimpleexample;

/**
 * Main.java = Hello New|Digital World!
 *             Hello Blockchain!
 *
 * @author  Oleh Kuprovskyi
 * @since   2014-03-31 | 11/15/2018
 * @see     <a href="https://hash.digital/@oleh.kuprovskyi">hash.digital/@oleh.kuprovskyi</a>
 * @version 1.0
 */
public class Main {

    /**
     * Hash = digital signature
     * <p>
     * Each block will have:
     *   - List of transactions
     *   - Previous Hash
     *   - Hash
     *
     * @param args
     */
    public static void main(String[] args) {

        String[] genesisTransactions = {"a satoshi sent oleh 999999 bitcoin", "New/Digital World"};
        Block genesisBlock = new Block(0, genesisTransactions);

        String[] block2Transactions = {"oleh sent 9 bitcoin to satoshi", "satoshi sent 99 bitcoin to domino pizza"};
        Block block2 = new Block(genesisBlock.getHashBlock(), block2Transactions);

        String[] block3Transactions = {"oleh sent 999 to mom"};
        Block block3 = new Block(block2.getHashBlock(), block3Transactions);

        System.out.println("Hash of genesis block:");
        System.out.println(genesisBlock.getHashBlock());

        System.out.println("Hash of block 2:");
        System.out.println(block2.getHashBlock());

        System.out.println("Hash of block 3:");
        System.out.println(block3.getHashBlock());
    }
}
