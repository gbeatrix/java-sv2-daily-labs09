package day03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaesarTest {
    @Test
    void testEncryption(){
        Encryption caesar = new Caesar(13);
        String round1 = caesar.encrypts("almafa");
        String round2 = caesar.encrypts(round1);
        assertNotEquals("ALMAFA", round1);
        assertEquals("ALMAFA", round2);
    }
}