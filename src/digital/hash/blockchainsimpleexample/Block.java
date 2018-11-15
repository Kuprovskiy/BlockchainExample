package digital.hash.blockchainsimpleexample;

import java.util.Arrays;
import java.util.Date;

/**
 * Block.java - is a container data structure .
 *
 * @author  Oleh Kuprovskyi
 * @since   2014-03-31 | 11/15/2018
 * @see     <a href="https://hash.digital/@oleh.kuprovskyi">hash.digital/@oleh.kuprovskyi</a>
 * @version 1.0
 */
public class Block {

    private int previousHash;

    private String[] transactions; // data

    private int hashBlock;

    private long timeStamp; // as number of milliseconds since 1/1/1970.


    /**
     * Block Constructor .
     *
     * @param previousHash
     * @param transactions
     */
    public Block(int previousHash, String[] transactions) {
        this.previousHash = previousHash;
        this.transactions = transactions;
        this.timeStamp = new Date().getTime();

        Object[] contains = {Arrays.hashCode(transactions), previousHash};
        this.hashBlock = Arrays.hashCode(contains);
    }

    /**
     * Retrieve the value of previousHash.
     * @return A int data type.
     */
    public int getPreviousHash() {
        return previousHash;
    }

    /**
     * Retrieve the list of transactions.
     * @return A String[] data type.
     */
    public String[] getTransactions() {
        return transactions;
    }

    /**
     * Retrieve the value of hashBlock.
     * @return int data type.
     */
    public int getHashBlock() {
        return hashBlock;
    }

    /**
     * Retrieve the value of timeStamp.
     * @return long data type.
     */
    public long getTimeStamp() {
        return timeStamp;
    }
}
