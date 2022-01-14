package Tests;

import com.company.Main.CaeserCipher;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    private CaeserCipher caeserCipher = new CaeserCipher();

    @org.junit.jupiter.api.Test
    void main() {
    }

    @Test
    void testCaeserCipherOffsetBy12(){
        assertEquals("tai mdq kag pauzs fapmk", caeserCipher.cipher("how are you doing today", 12));
    }

    @Test
    void testEmptyString(){
        assertEquals("", caeserCipher.cipher("", 12));
    }

    @Test
    void testCeasarCipherOffsetBy11(){
        assertEquals("tai mdq kag pauzs fapmk", caeserCipher.cipher("how are you doing today", 11));
    }

}