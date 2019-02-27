public class WaterSong {
public static void main(String[] args){
 int waternum = 9;
 String word = "bottels";
 while(waternum > 0)
{
   if(waternum==1)
{ 
  word="bottel";
}
  System.out.println(waternum + " " + word + "of water on wall");
  System.out.println(waternum + " " + word + "of water");
  System.out.println("take one down");
  System.out.println("pass it around");
  waternum = waternum-1;
  if(waternum > 0)
{  
   System.out.println(waternum + " " + word + "of water on wall");
 }
else
{
  System.out.println("no more water bottels");
 }
}
}
}
 
 
 