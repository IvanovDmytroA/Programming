package ua.org.oa.ivanovd.homework2.stringUtils;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Администратор on 23.05.2016.
 */
public class StringUtilsTest {

    @Test
    public void upendStrings() throws Exception {
        assertEquals(StringUtils.upendStrings("Hello world!"), "!dlrow olleH");;
    }

    @Test
    public void checkPalindrome() throws Exception {
        assertTrue(StringUtils.checkPalindrome("А роза упала на лапу Азора"));
    }

    @Test
    public void checkStringLength() throws Exception {
        assertEquals(StringUtils.checkStringLength("Rashid"), "Rashidoooooo");
    }

    @Test
    public void swapWords() throws Exception {
        assertEquals(StringUtils.swapWords("What a beautiful read. It was insane game. Ggs, guys!"),
                "guys! a beautiful read. It was insane game. Ggs, What");
    }

    @Test
    public void swapWordsInSentences() throws Exception {
        assertEquals(StringUtils.swapWordsInSentences("I can't tell you anything about that. Even if you deserve this."),
                "that can't tell you anything about I. this if you deserve Even.");
    }

    @Test
    public void checkCharacters() throws Exception {
        assertFalse(StringUtils.checkCharacters("aaabbcccccd"));
    }

    @Test
    public void isDate() throws Exception {
        assertTrue(StringUtils.isDate("09.11.1982"));
    }

    @Test
    public void isEmail() throws Exception {
        assertTrue(StringUtils.isEmail("hfzlbvf3003@gmail.com"));
    }

    @Test
    public void findPhoneNumbers() throws Exception {
        StringUtils.findPhoneNumbers("Номера телефонов: " +
            "+8(057)222-12-31 и +8(055)56-483-12");
    }
}
