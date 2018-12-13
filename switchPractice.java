import java.util.Scanner;
public class SwitchPractice {

	public static void main(String args[]) {

	}
	
	
	public int answer(int a) {
		Scanner inPut = new Scanner(System.in);
		int outPut = inPut.nextInt();
		switch (outPut) {
		case 1:
			outPut+=4;
			break;
		case 2:
			outPut+=8;
			break;
		case 3:
			outPut-=3;
			break;
		case 4:
			outPut-=2;
			break;
		case 5:
			outPut=outPut*5;
			break;
		case 6:
			outPut=outPut%4;
			break;
		case 7:
			outPut=17;
			break;
		case 8:
			outPut++;
			break;
		case 9:
			++outPut;
			break;
		case 10:
			outPut=1;
			break;
		default:
			outPut=0;
		}
		
		System.out.println(outPut);
		return outPut;
	}
}
