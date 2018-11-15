package digital.hash.blockchainsimpleexample;

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

    private String previousHash;

    private String[] transactions; // data

    private String hashBlock;

    private long timeStamp; // as number of milliseconds since 1/1/1970.


    /**
     * Block Constructor .
     *
     * @param previousHash
     * @param transactions
     */
    public Block(String previousHash, String[] transactions) {
        this.previousHash = previousHash;
        this.transactions = transactions;
        this.timeStamp = new Date().getTime();

        this.hashBlock = calculateHash();
    }

    /**
     * Calculate the hash from all partsof the block
     *
     * @return String - Hashec
     */
    public String calculateHash() {
        String calculatedHash = StringUtil.applySha256(
                this.previousHash + Long.toString(this.timeStamp) + this.transactions);

        return calculatedHash;
    }

    /**
     * Retrieve the value of previousHash.
     * @return A int data type.
     */
    public String getPreviousHash() {
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
    public String getHashBlock() {
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
