public class deret {
	
	public static void main(String[] args){
		
		int a = 1, b;
		double x, y, z=0, hasil = 1;

		System.out.print(+a);
			for(a=1; a<=9; a++){
				b=a+1;
				System.out.print(" + ");
				System.out.print(+a + "/" + b + " ");
			}
			
			for(x=1; x<=9; x++){
				y=x+1;
				z=x/y;
				hasil+=z;
			}
		
		System.out.print(" = " + hasil);
	}
} 