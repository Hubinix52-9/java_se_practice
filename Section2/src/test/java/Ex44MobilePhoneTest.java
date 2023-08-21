import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Ex44MobilePhoneTest {

    private Ex44MobilePhone mobilePhone;

    @Before
    public void setUp() {
        mobilePhone = new Ex44MobilePhone("1234567890");
    }

    @Test
    public void newContactTest() {
        Ex44MobilePhone.Contact contact = Ex44MobilePhone.Contact.createContact("Alice", "9876543210");
        Assert.assertTrue(mobilePhone.addNewContact(contact));
    }

    @Test
    public void updateContactTest() {
        Ex44MobilePhone.Contact oldContact = Ex44MobilePhone.Contact.createContact("Alice", "9876543210");
        Ex44MobilePhone.Contact newContact = Ex44MobilePhone.Contact.createContact("Alice Smith", "1234567890");

        mobilePhone.addNewContact(oldContact);
        Assert.assertTrue(mobilePhone.updateContact(oldContact, newContact));
    }

    @Test
    public void removeContactTest() {
        Ex44MobilePhone.Contact contact = Ex44MobilePhone.Contact.createContact("Alice", "9876543210");
        mobilePhone.addNewContact(contact);
        Assert.assertTrue(mobilePhone.removeContact(contact));
    }

    @Test
    public void queryContactTest() {
        Ex44MobilePhone.Contact contact = Ex44MobilePhone.Contact.createContact("Alice", "9876543210");
        mobilePhone.addNewContact(contact);
        Assert.assertEquals(contact, mobilePhone.queryContact("Alice"));
    }

    @Test
    public void printContactsTest() {
        Ex44MobilePhone.Contact contact1 = Ex44MobilePhone.Contact.createContact("Alice", "9876543210");
        Ex44MobilePhone.Contact contact2 = Ex44MobilePhone.Contact.createContact("Bob", "1234567890");
        mobilePhone.addNewContact(contact1);
        mobilePhone.addNewContact(contact2);

        String expectedOutput = "Contact List:\n1. Alice -> 9876543210\n2. Bob -> 1234567890\n";
        String printedOutput = capturePrintOutput(() -> mobilePhone.printContacts());

        Assert.assertEquals(expectedOutput, printedOutput);
    }

    private String capturePrintOutput(Runnable action) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        action.run();

        System.setOut(originalOut);
        return outputStream.toString();
    }
}