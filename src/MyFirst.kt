@file:JvmName("MyKotlinFile")//name change file
fun main(arg: Array<String>){

var area=MyJavaFile.getArea(10,20);
    println("Print area $area")
}

fun add(a: Int,b: Int): Int{
    return a+b

}


/*
after compile we get this  kotlin into java
code create internally
 public class MyFirst.kt{
  public static void main(String arg)
    {
    }
    public static int add(int a, int b){
    return a+b
    }
 *
 */


