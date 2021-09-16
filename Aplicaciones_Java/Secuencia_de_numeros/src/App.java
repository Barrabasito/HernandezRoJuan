public class App {
    public static void main(String[] args) throws Exception {
    int a=1,b=2,c=10,s=0,x=1;;
    System.out.println(a);
    System.out.println(b);
    
    //for(int x=1; x<=c; x++){
       // s=a+b;
       // System.out.println(s);
       // a=b;
        //b=s;
    //}
//do{
   // s=a+b;
   // System.out.println(s);
   // a=b;
   // b=s;
   // x++;
//}while(x<=c);

    while(x<=c){
        s=a+b;
        System.out.println(s);
        a=b;
        b=s;
        x++;
    }
    }
}
