package day1;

public interface Mymath {
	public static void main(String[] args){}
	public static double getSum(int n){
		int sum=0;
		for(int i=1;i<=n;i++){
			sum=sum+i;
		}
		System.out.println("总和等于:"+sum);
		return sum;
	}
}
