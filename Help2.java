class Help2{
public static void main(String[] args) 
throws java.io.IOException {
char choice,ignore;
do{
		System.out.println("Help on:");
		System.out.println(" 1. if");
		System.out.println(" 2. Switch");
		System.out.println("Choose one: ");
		choice = (char) System.in.read();



}
while(choice<'1' | choice>'3');
 

System.out.println("\n");

switch(choice) {
case '1' :
System.out.println("The if:\n");
System.out.println("if(condition) statement;");
System.out.println("else ststement;");
break;
case '2':
System.out.println("The switch:\n");
System.out.println("switch(expression) {");
System.out.println(" case constant:");
System.out.println("   statement sequence");
System.out.println("   break;");
System.out.println("  //. . .");
System.out.println("}");
break;
case '3':
System.out.println("this is 3rd case");
break;
case '4':
System.out.println("this is 4th case");
break;
default:
System.out.println("Selection not found.");
}
}
}


