package exercise_11;

public class BankTest {
	
	public static void main(String[] args) {
		
		getNameTest();
		setNameTest();
		
	}
	
	public static void getNameTest() {
		Bank testBank = new Bank();
		testBank.setName("テスト銀行");
		String testBankName = testBank.getName();
		if (!"テスト銀行".equals(testBankName)) {
			System.out.println("銀行名エラー");
		} else {
			System.out.println("getNameテスト正常終了");
		}
	}
	
	public static void setNameTest() {
		Bank testBank = new Bank();
		testBank.setName("テスト銀行");
		if (!"テスト銀行".equals(testBank.getName())) {
			System.out.println("銀行名エラー");
		}
		testBank.setName("テスト");
		if (!"テスト".equals(testBank.getName())) {
			System.out.println("銀行名エラー");
		}
		try {
			testBank.setName("銀行");
			System.out.println("銀行名文字数エラー未検知");
		} catch (IllegalArgumentException e) {
			System.out.println("setNameテスト正常終了");
		}
	}
	
}
