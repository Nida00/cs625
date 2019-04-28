x  class bubblesort{
public static void main(String [] args){
int num[]={256,12,525,72,392,385,5,192,60,0};
int a,b,t;
int size=10;
System.out.println("original array is");
for (int i=0;i<size;i++)
System.out.print(" " + num [i]);
System.out.println();
for (a=1;a<size;a++)
 for (b=size-1;b>=a;b--)
{
if (num [b-1]> num[b]){
t=num[b-1];
num[b-1]=num[b];
num[b]=t;}}
System.out.println("sorted array is");
for (int i=0;i<size;i++)
System.out.print(" " + num [i]);
System.out.println();}}