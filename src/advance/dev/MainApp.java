package advance.dev;

import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Phần a: Nhập vào hai số nguyên a, b và khai báo số nguyên c = a / b
		try {
			System.out.print("Nhập vào số nguyên a: ");
			int a = scanner.nextInt();
			System.out.print("Nhập vào số nguyên b: ");
			int b = scanner.nextInt();

			int c = a / b;
			System.out.println("Kết quả của c = a / b là: " + c);
		} catch (ArithmeticException e) {
			System.out.println("Lỗi: Không thể chia cho 0.");
		}

		// Phần b: Nhập vào một chuỗi và chuyển chuỗi đó sang số nguyên
		scanner.nextLine(); // clear the buffer
		try {
			System.out.print("Nhập vào một chuỗi a: ");
			String a = scanner.nextLine();

			int number = Integer.parseInt(a);
			System.out.println("Số nguyên được chuyển từ chuỗi là: " + number);
		} catch (NumberFormatException e) {
			System.out.println("Lỗi: Chuỗi nhập vào không phải là số.");
		}

		scanner.close();
	}
}
