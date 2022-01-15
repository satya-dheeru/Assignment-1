package javaa;

public class accessmodifers {
public void method1() {
	System.out.println("public access modifiers implemt");
}
private void method2() {
	System.out.println("private access modifiers implemt");
}
 void method3() {
	System.out.println("default access modifiers implement");
}
 protected void method4() {
	 System.out.println("protected access modifiers implement");
 }
 public static void main(String[] args) {
	
  accessmodifers mod=new accessmodifers();
  mod.method1() ;
  mod.method2();
  mod.method3();
  mod.method4();
  
}
}