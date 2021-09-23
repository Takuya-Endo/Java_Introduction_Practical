package exercise_11;

public class BankTest {
	
	public static void main(String[] args) {
		
		getNameTest();
		
	}
	
	public static void getNameTest() {
		
		Bank testBank = new Bank();
		testBank.setName("テスト銀行");
		String testBankName = testBank.getName();
		if (!"テスト銀行".equals(testBankName)) {
			System.out.println("銀行名エラー");
		} else {
			System.out.println("テスト正常終了");
		}
	}
	
}
