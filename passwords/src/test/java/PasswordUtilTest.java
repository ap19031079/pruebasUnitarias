import org.junit.Test;

import static org.junit.Assert.*;

public class PasswordUtilTest
{
    @Test
    public void weak_when_has_less_than_8_letters () {
       assertEquals( PasswordUtil.SecurityLevel.WEAK, PasswordUtil.assessPassword("1234567"));
    }

    @Test
    public void weak_when_has_only_letters () {
        assertEquals( PasswordUtil.SecurityLevel.WEAK, PasswordUtil.assessPassword("abcdefgh"));
    }
    @Test
    public void medium_when_has_letters_and_numebers () {
        assertEquals( PasswordUtil.SecurityLevel.MEDIUM, PasswordUtil.assessPassword("abcd1234"));
    }
    @Test
    public void strong_when_has_letters_numebers_symbols () {
        assertEquals( PasswordUtil.SecurityLevel.STRONG, PasswordUtil.assessPassword("abcd1234!"));
    }
}