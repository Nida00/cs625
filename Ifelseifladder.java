class Ifelseifladder{
public static void main(String args[]) 
throws java.io.IOException {
int x;

System.out.println("Assign Value to X from 1 to 4 ");

x = (char) System.in.read();
if(x=='1'){
	System.out.println("x is one");
}

else if(x=='2')
System.out.println("x is two");
else if(x=='3')
System.out.println("x is three");
else if(x=='4')
System.out.println("x is four");
else
System.out.println("x is not between 1 and 4");
}

}