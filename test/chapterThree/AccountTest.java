//package chapterThree;
//
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class AccountTest {
//    @Test
//    public void accountCanDepositTest() {
//
//        //given
//        Account yetundeAccount = new Account();
//        //when
//        yetundeAccount.deposit(150);
//        //check
//        int yetundeBalance = yetundeAccount.getBalance();
//        assertEquals(150, yetundeBalance);
//
//    }
//
//    @Test
//    public void accountCanTakeMoreThanOneDeposit() {
//        //given
//        Account yetundeAccount = new Account();
//        //when
//        yetundeAccount.deposit(120);
//        yetundeAccount.deposit(80);
//        //check
//        int yetundeBalance = yetundeAccount.getBalance();
//        assertEquals(200, yetundeBalance);
//    }
//
//    @Test
//    public void accountCannotTakeNegativeDepositTest() {
//        //given
//        Account isrealAccount = new Account();
//        //when
//        isrealAccount.deposit(2300);
//        isrealAccount.deposit(-200);
//        //check
//        assertEquals(2300, isrealAccount.getBalance());
//    }
//    @Test
//    public void accountCanWithdrawTest(){
//        //given
//        Account goodnewsAccount= new Account();
//        //when
//        goodnewsAccount.deposit(1_0000);
//        goodnewsAccount.withdraw(2000);
//        //check
//        assertEquals(1_0000, goodnewsAccount.getBalance());
//    }
//    @Test
//    public void accountCannotWithdrawTest(){
//        Account goodnewsAccount= new Account();
//        goodnewsAccount.deposit(500);
//        goodnewsAccount.withdraw(600);
//    }
//    @Test
//    public void accountCanWithdrawWithPinCorrectTest(){
//        //given
//        Account goodnewsAccount= new Account();
//        //when
//        goodnewsAccount.deposit(10_000);
//        goodnewsAccount.withdraw(2_000, 1234);
//        //check
//        assertEquals(8_000, goodnewsAccount.getBalance());
//    }
//}