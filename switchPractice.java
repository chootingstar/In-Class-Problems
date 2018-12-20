import java.util.Scanner;
public class SwitchPractice {

	public static void main(String args[]) {
		answer(null);
		//int a = answer(null);
		//I don't understand why I needed this to be null, but it really works.
		//it also makes sense that 'a' would be an int data type. Why did I make it String anyway?
		//System.out.println(a);
		//Apparently I don't need the sysout here, it already gets printed, I don't want it printed twice.
		//I do not even need int a =

	}
	
	
	public static int answer(Class<Integer> class1) {
		Scanner inPut = new Scanner(System.in);
		int inputter = inPut.nextInt();
		int outPut = 0;
		switch (inputter) {
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
		//I don't think I need return outPut; but I'm keeping it
	}
}
