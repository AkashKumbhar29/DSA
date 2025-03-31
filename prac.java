class prac
{
    public static void main(String a[])
    {
        //Print any statement
        System.out.println("Learning java");
    //store value in variable
  /* 
        int n = 1;
        int b = 2;
        int result = n+b;
        System.out.println("The result is :"+result);
   */
        //type casting is explicit conversion of the data type
      /*    float m =5.6f;
         int g = (int)m;
         System.out.println(m);
         System.out.println("Converted to int "+g); */
     
         //The logic used here is modulus as the limit of byte is 256 and as we wanted to convert a 258bits into byte so it converts like 258%256=2
   /*       int l = 258;
         byte k = (byte)l;
         System.out.println("onverted int to byte :" + k); */
      
      //Logical opeartors &-and ; |-or ; !-not

      int c = 2;
      int b = 3;
      int y = 4;
      int z = 5;

      boolean r = y<z && c<b;
      boolean s = y>z && c<b;
      boolean t = y<z || c>b;
      boolean u = y>z || c>b;
      boolean q = y>z !! c >b;

    
      System.out.println(r);
      System.out.println(s);
      System.out.println(t);
      System.out.println(u);


        }
}