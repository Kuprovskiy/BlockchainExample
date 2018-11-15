package digital.hash.blockchainsimpleexample;

import java.security.MessageDigest;

/**
 * StringUtil.java - class for converting bytes to hex data and back again
 *
 * @author  Oleh Kuprovskyi
 * @since   2014-03-31 | 11/15/2018
 * @see     <a href="https://hash.digital/@oleh.kuprovskyi">hash.digital/@oleh.kuprovskyi</a>
 * @version 1.0
 */
public class StringUtil {

    /**
     * Applies Sha256 to a string and returns the result
     *
     * @param input
     * @return string of hexadecimal characters
     */
    public static String applySha256(String input) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            //Applies sha256 to our input,
            byte[] hash = digest.digest(input.getBytes("UTF-8"));
            return bytesToHex(hash);
        } catch(Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * A custom byte to hex converter
     *
     * @param hash
     * @return String - hashed value in hexadecimal
     */
    private static String bytesToHex(byte[] hash) {
        StringBuffer hexString = new StringBuffer();
        for (int i = 0; i < hash.length; i++) {
            String hex = Integer.toHexString(0xff & hash[i]);
            if (hex.length() == 1) hexString.append('0');
                hexString.append(hex);
        }
        return hexString.toString();
    }
}
