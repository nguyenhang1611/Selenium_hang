package main;

/**
 * 
 * arithmetic class
 * 
 * @author hangin
 * @since 20160527
 *
 */

public class arithmetic {

	// Thuoc tinh(Properties)
	public static int x;
	public static int y;

	/**
	 * Ham khoi tao 2 tham so(Contructions)
	 * 
	 * @author HangNT
	 * @since 20160527
	 */
	public arithmetic(int a, int b) {
		x = a;
		y = b;
	}

	/**
	 * Thuc hanh cac phep toan so hoc: phep cong
	 * 
	 * @author HangNT
	 * @since 20160527
	 */
	public int sum(int a, int b) {
		return (a + b);
	}

	/**
	 * Thuc hanh cac phep toan so hoc: phep tru
	 * 
	 * @author HangNT
	 * @since 20160527
	 */
	public int sub(int a, int b) {
		return (a - b);
	}

	/**
	 * Thuc hanh cac phep toan so hoc: phep nhan
	 * 
	 * @author HangNT
	 * @since 20160527
	 */
	public int multi(int a, int b) {
		return (a * b);
	}

	/**
	 * Thuc hanh cac phep toan so hoc: phep chia lay phan nguyen
	 * 
	 * @author HangNT
	 * @since 20160527
	 */
	public int div(int a, int b) {
		return (a / b);
	}

	/**
	 * Thuc hanh cac phep toan so hoc: phep chia lay phan du
	 * 
	 * @author HangNT
	 * @since 20160527
	 */
	public int mod(int a, int b) {
		return (a % b);
	}

	/**
	 * Thuc hanh cac phep toan so hoc: tang 1 so len 1
	 * 
	 * @author HangNT
	 * @since 20160527
	 */
	public int addOne(int a) {
		return (++a);
	}

	/**
	 * Thuc hanh cac phep toan so hoc: giam 1 so xuong 1
	 * 
	 * @author HangNT
	 * @since 20160527
	 */
	public int subOne(int a) {
		return (--a);
	}

	/**
	 * Thuc hanh phep toan logic, quan he/ cac lenh dieu kien: Ham so sanh 2 so
	 * nguyen
	 * 
	 * @author HangNT
	 * @since 20160527
	 */
	public void compare(int a, int b) {
		System.out.print("\nSo sanh hai so " + a + " & " + b + " : ");
		if (a == b)
			System.out.print(a + " = " + b);
		else if (a < b)
			System.out.println(a + " < " + b);
		else
			System.out.println(a + " > " + b);

	}

	/**
	 * Thuc hanh phep toan logic, quan he/ cac lenh dieu kien: So sanh tich 2 so
	 * nguyen voi 0
	 * @author HangNT
	 * @since 20160527
	 */
	public void mulCompareWithZero(int a, int b) {
		System.out.print("\nKiem tra (" + a + "*" + b + ") = 0 hay khac 0 : ");
		if (a == 0 || b == 0) {
			System.out.println("Tich (" + a + "*" + b + ") = 0");
		} else if (a != 0 && b != 0) {
			System.out.println("Tich (" + a + "*" + b + ") khac 0");
		}
	}

	/**
	 * Thuc hanh vong lap: Vong lap for Ham in ra so tu 1 -> 10
	 * 
	 * @author HangNT
	 * @since 20160527
	 */
	public void printOneToTen() {
		System.out.println("\nVONG LAP FOR:");
		System.out.println("In ra so tu 1 -> 10:");
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + "\t");
		}
	}

	/**
	 * Thuc hanh vong lap: Vong lap while Ham in ra cac so chan tu 1 -> 10
	 * 
	 * @author HangNT
	 * @since 20160527
	 */
	public void evenNumber() {
		int i = 0;
		System.out.println("\n\nVONG LAP WHILE:");
		System.out.println("Cac so chan trong khoang tu 1 ->10 la:");
		while (i < 10) {
			if (i % 2 == 0)
				System.out.print(i + "\t");
			i++;
		}
	}

	/**
	 * Thuc hanh vong lap: Vong lap do-while Ham in ra cac so le tu 1 -> 10
	 * 
	 * @author HangNT
	 * @since 20160527
	 */
	public void oddNumber() {
		int i = 0;
		System.out.println("\n\nVONG LAP DO-WHILE:");
		System.out.println("Cac so le trong khoang tu 1 ->10 la: ");
		do {
			if (i % 2 != 0)
				System.out.print(i + "\t");
			i++;
		} while (i < 10);
	}

	/**
	 * In ra thang trong nam tuong ung voi gia tri input
	 * 
	 * @author HangNT
	 * 
	 */
	public void switchCase(int i) {
		System.out.print("\nThang nay la: ");
		switch (i) {
		case 1:
			System.out.println("Thang mot");
			break;
		case 2:
			System.out.println("Thang hai");
			break;
		case 3:
			System.out.println("Thang ba");
			break;
		case 4:
			System.out.println("Thang tu");
			break;
		case 5:
			System.out.println("Thang nam");
			break;
		case 6:
			System.out.println("Thang sau");
			break;
		case 7:
			System.out.println("Thang bay");
			break;
		case 8:
			System.out.println("Thang tam");
			break;
		case 9:
			System.out.println("Thang chin");
			break;
		case 10:
			System.out.println("Thang muoi");
			break;
		case 11:
			System.out.println("Thang muoi mot");
			break;
		case 12:
			System.out.println("Thang muoi hai");
			break;
		default:
			System.out.println("Gia tri khong hop le! Vui long nhap gia tri tu 1 -> 12");
			break;
		}
	}

	/**
	 * @author HangNT
	 * @param args
	 * @since 20160527
	 */
	public static void main(String[] args) {

		arithmetic arith = new arithmetic(5, 6);

		// Goi cac ham thuc hanh cac phep toan so hoc
		System.out.println("\n******************CAC HAM THUC HANH CAC PHEP TOAN SO HOC*******************");
		System.out.println("Tong (" + x + " + " + y + ") la " + arith.sum(x, y));
		System.out.println("Hieu (" + x + " - " + y + ") la " + arith.sub(x, y));
		System.out.println("Tich (" + x + " * " + y + ") la " + arith.multi(x, y));
		System.out.println("Ket qua chia lay phan nguyen cua " + x + " cho " + y + " la " + arith.div(x, y));
		System.out.println("Ket qua chia lay phan du cua " + x + " cho " + y + " la " + arith.mod(x, y));
		System.out.println("So " + x + " sau khi tang len 1 = " + arith.addOne(x));
		System.out.println("So " + x + " sau khi giam xuong 1 = " + arith.subOne(x));

		// Goi cac ham thuc hanh vong lap
		System.out.print("\n******************CAC HAM THUC HANH VONG LAP*******************");
		arith.printOneToTen();
		arith.evenNumber();
		arith.oddNumber();
		arith.switchCase(x);

		// Goi ham thuc hanh cac phep logic va quan he/ cac lenh dieu kien
		System.out.print("\n\n***************HAM THUC HANH PHEP TOAN LOGIC/ QUAN HE/ LENH DIEU KIEN****************");
		arith.compare(x, y);
		arith.mulCompareWithZero(x, y);

	}

}
