class HelloWorld {
  public static void main(String[] args) {
    int num=42;
    String num2="";
    for(int i=0;i<=num;i++){
        num2=Integer.toBinaryString(i);
    }
    System.out.println(num2);
     
  }
}
