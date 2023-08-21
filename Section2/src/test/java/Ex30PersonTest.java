import org.junit.Assert;
import org.junit.Test;

public class Ex30PersonTest {
    @Test
    public void getAndSetFirstNameTest(){
        Ex30Person pers = new Ex30Person();

        pers.setFirstName("Hubert");
        Assert.assertEquals("Hubert", pers.getFirstName());

        pers.setFirstName("123");
        Assert.assertEquals("123", pers.getFirstName());

        pers.setFirstName(" ");
        Assert.assertEquals(" ", pers.getFirstName());
    }
    @Test
    public void getAndSetLastNameTest(){
        Ex30Person pers = new Ex30Person();

        pers.setLastName("Hubert");
        Assert.assertEquals("Hubert", pers.getLastName());

        pers.setLastName("123");
        Assert.assertEquals("123", pers.getLastName());

        pers.setLastName(" ");
        Assert.assertEquals(" ", pers.getLastName());
    }
    @Test
    public void getAndSetAgeTest(){
        Ex30Person pers = new Ex30Person();

        pers.setAge(15);
        Assert.assertEquals(15, pers.getAge());

        pers.setAge(101);
        Assert.assertEquals(0, pers.getAge());

        pers.setAge(-5);
        Assert.assertEquals(0, pers.getAge());
    }
    @Test
    public void isTeenTest(){
        Ex30Person pers = new Ex30Person();

        pers.setAge(15);
        Assert.assertTrue(pers.isTeen());

        pers.setAge(13);
        Assert.assertTrue(pers.isTeen());

        pers.setAge(50);
        Assert.assertFalse(pers.isTeen());
    }
    @Test
    public void getFullNameTest(){
        Ex30Person pers = new Ex30Person();

        pers.setFirstName("Hubert");
        pers.setLastName("Przewozniak");
        Assert.assertEquals("Hubert Przewozniak", pers.getFullName());

        pers.setFirstName("Hubert");
        pers.setLastName("");
        Assert.assertEquals("Hubert", pers.getFullName());

        pers.setFirstName("");
        pers.setLastName("Przewozniak");
        Assert.assertEquals("Przewozniak", pers.getFullName());

        pers.setFirstName("");
        pers.setLastName("");
        Assert.assertEquals("", pers.getFullName());
    }
}
