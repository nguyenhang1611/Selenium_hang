package test.java.scripts;

/**
 * main class call to object of arithmetic class
 * 
 * @author HangNT
 *
 */

public class mainClass {
	public static void main(String[] args) {
		int x = 8;
		int y = 9;
		arithmetic arith1 = new arithmetic(x, y);
		// Goi cac ham thuc hanh cac phep toan so hoc
		System.out.println("\n******************CAC HAM THUC HANH CAC PHEP TOAN SO HOC*******************");
		System.out.println("Tong (" + x + " + " + y + ") la " + arith1.sum(x, y));
		System.out.println("Hieu (" + x + " - " + y + ") la " + arith1.sub(x, y));
		System.out.println("Tich (" + x + " * " + y + ") la " + arith1.multi(x, y));
		System.out.println("Ket qua chia lay phan nguyen cua " + x + " cho " + y + " la " + arith1.div(x, y));
		System.out.println("Ket qua chia lay phan du cua " + x + " cho " + y + " la " + arith1.mod(x, y));
		System.out.println("So " + x + " sau khi tang len 1 = " + arith1.addOne(x));
		System.out.println("So " + x + " sau khi giam xuong 1 = " + arith1.subOne(x));
		// Goi cac ham thuc hanh vong lap
		System.out.print("\n******************CAC HAM THUC HANH VONG LAP*******************");
		arith1.printOneToTen();
		arith1.evenNumber();
		arith1.oddNumber();
		arith1.switchCase(x);
		// Goi ham thuc hanh cac phep logic va quan he/ cac lenh dieu kien
		System.out.print("\n\n***************HAM THUC HANH PHEP TOAN LOGIC/ QUAN HE/ LENH DIEU KIEN****************");
		arith1.compare(x, y);
		arith1.mulCompareWithZero(x, y);
	}
}
