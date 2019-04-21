class Help3{
public static void main(String[] args) 
throws java.io.IOException {
char choice,ignore;
for(;;){
do{
		System.out.println("Help on:");
		System.out.println(" 1. if");
		System.out.println(" 2. Switch");
		System.out.println("Choose one: ");
		System.out.println(" for terminate the loop press q for Quite");
		choice = (char) System.in.read();
do{
	ignore=(char) System.in.read();
}
	while (ignore!='\n'); 
		
}

while(choice<'1' | choice>'4' & choice!='q');
if(choice=='q') break;
 

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
}
System.out.println();
}
}
}


