//package chapterThree;
//
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class InvoiceTest {
//    @Test
//    void testPartNumber() {
//        //given
//        Invoice invoice = new Invoice("85545477", "good", 50, 1000.00);
//        //when
//        invoice.setPartNumber("85545477");
//        //check
//        assertEquals("85545477", invoice.getPartNumber());
//    }
//
//    @Test
//    void testPartDescription() {
//        //given
//        Invoice invoice = new Invoice("85545477", "good", 50, 1000.00);
//        //when
//        invoice.setDescription("good");
//        //check
//        assertEquals("good", invoice.getPartDescription());
//    }
//
//    @Test
//    void testQuantity() {
//        //given
//        Invoice invoice = new Invoice("85545477", "good", 50, 1000.00);
//        //when
//        invoice.setQuantity(50);
//        //check
//        assertEquals(50, invoice.getQuantity());
//    }
//
//    @Test
//    void testPrice() {
//        //given
//        Invoice invoice = new Invoice("85545477", "good", 50, 1000.00);
//        //when
//        invoice.setPrice(1000.00);
//        //check
//        assertEquals(1000.00, invoice.getPrice());
//    }
//    @Test
//    void testInvoiceAmount(){
//        //given
//        Invoice invoice =  new Invoice("85545477", "good", 50, 1000.00);
//        //when
//        invoice.setInvoiceAmount();
//        //check
//        assertEquals(invoice.getInvoiceAmount());
//
//    }
//}