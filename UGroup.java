import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

public class UGroup {

	public static ConcurrentHashMap<Integer, Boolean> al = new ConcurrentHashMap<Integer, Boolean>();
	static int input;
	
	//Constructor to generate all those cyclic primes of a number
	public UGroup(int n) {
		int temp = n;
		input = n;
		while (isPrime(temp) && ((temp = circularLeftRotation(temp)) != n)){
			if (isPrime(temp) == true) {
				al.put(circularLeftRotation(temp), true);
			} else{
				al.put(circularLeftRotation(temp), false);
			}
		}
		
	}
	
	//Cyclic Rotation of Numbers
	public static int circularLeftRotation(int num) {
		int unitDigit = num % 10;
		num = num / 10;
		int temp = 1;
		while (num / temp != 0){
			temp *= 10;
		}
		return num + unitDigit * temp;
	}
	 
	//Checking is prime or not
	public boolean isPrime(int num) {
		if (num < 2)
			return false;
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	//Iscyclic rotation for numbers
	public boolean isCyclic(){
		boolean status = false;
		ArrayList<Boolean> statusList  = new ArrayList<Boolean>();
		for (Integer name: al.keySet()){
            String key =name.toString();
            boolean value = al.get(name);  
            statusList.add(value);
		}
		for (int i = 0; i < statusList.size(); i++) {
			if (statusList.get(i) == true) {
				status  = true;
			}
		}
		if (statusList.contains(false))
			return status = false;
		return status;
	}
	
	//Integer Numgen()
	public int numGen(){
		return al.size();
	}
	
	//Integer Gegen()
	public int getGen(final int i){
		ArrayList<Integer> array = new ArrayList<Integer>();
		for (Integer key : al.keySet() ) {
		    array.add(key);
		}
		return array.get(i-1);
	}
	
	//Int nummem() member
	public int numMem(){
		String k = input+"";
		return k.length();
	}
	
	//int getmem()
	public int getMem(int i) {
		String temp = Integer.toString(input);
		int[] newGuess = new int[temp.length()];
		for (int l = 0; l < temp.length(); l++)
		{
		    newGuess[l] = temp.charAt(l) - '0';
		}
		return newGuess[i-1];
	}
	
	
	//main method
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a value of n : ");
		int n = scan.nextInt();
		UGroup ug = new UGroup(n);
		boolean iscyclic = ug.isCyclic(); 
		System.out.println("This is cyclic group : "+iscyclic);
		if (iscyclic) {
			System.out.println("Enter a value of getGen : ");
			int i = scan.nextInt();
			String m = n+"";
			int len = m.length();
			if (i > len) {
				System.out.println("Value of i should be less than the number length");
				i = scan.nextInt();
			}
			int size = ug.numGen();
			System.out.println("Returns the number of generators if this is a cyclic group : "+size);
			int number = ug.getGen(i);
			System.out.println("Returns the i+1 generator (index from 0..numGen-1) : "+number);
			int length = ug.numGen();
			length = length+1;
			System.out.println("Returns the number of members in the group : "+length);
			int indexNumber = ug.getMem(i);
			System.out.println("Returns the i+1 member of the group : "+indexNumber);
		} else {
			System.out.println("This is not cyclic group");
		}
		scan.close();
	}
}
