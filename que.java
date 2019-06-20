class qu{
char q[];
int putloc,getloc;
qu(int size){
q=new char [size];
putloc=getloc=0;}
//put character
void put (char ch){
if(putloc==q.length){
System.out.println("queue is full.");
return;}
q[putloc++]=ch;
}
//get character
char get(){
if (getloc==putloc){
System.out.println("queue is empty.");
return (char)0;
}
return q[getloc++];
}
}
//demonstrate the queue class
class que{
public static void main(String args[]){
qu bigq=new qu(100);
qu smallq=new qu(4);
char ch;
int i;
System.out.println("using big queue to store alphabet");
//put
for (i=0;i<26;i++){
bigq.put ((char)('A' + 1));
//display
System.out.print("contents of bigq:");
for (i=0;i<26;i++){
ch=bigq.get ();
if (ch!=(char)0)
System.out.print(ch);
}
System.out.println("\n");
}
System.out.print("using small queue to generate errors");
for(i=0;i<5;i++){
System.out.print("attempting to store" + (char)('Z'- i));
smallq.put((char)('Z'-i));
System.out.println();
}
System.out.println();
System.out.print("contents of smallq:");
for(i=0;i<5;i++){
ch=smallq.get();
if (ch!=(char)0)
System.out.print(ch);
}}}




















