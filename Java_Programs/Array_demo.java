package test;

				/* This is an example of one-Daimentional Array*/

public class Array_demo {
		public static void main(String[] args) {
			//single dimaention array	
			int a[]= new int[3]; 
				a[0]=1;
				a[1]=2;
				a[2]=3;
			
				for(int i=0;i<a.length;i++){
					System.out.println(a[i]);
				}
				
				//array of obects
				abc a1[]= new abc[5];
				a1[0] = new abc();
				a1[0].r=90;
				a1[0].s();
				a1[1] = new abc();
				a1[1].r=900;
				a1[1].s();
		}
}

class abc{
	
	int r;
	void s(){
		System.out.print("d = " + r);
	}
}
