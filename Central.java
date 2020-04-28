interface A{  public void aaa(); }

//interface yang extends dari interface A
 interface B extends A{

   public void aaa();

 }

/*	class implements kedua interface dan 
	menyediakan implementasi menuju method
*/
class Central implements A,B{

   public void aaa(){

   System.out.println("aaa");
   
    }

   public static void main(String arg[]){

   System.out.println("main");
   
   Central obj = new Central();
   //memanggil method implement dalam class
   obj.aaa();

   }

}
