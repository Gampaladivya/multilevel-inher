// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class demo{  
void eat()
{
    System.out.println("eating...");}  
}  
class Dog extends demo
{  
void bark()
{
    System.out.println("barking...");
    
}  
}  
class BabyDog extends Dog
{  
void weep()
{
    System.out.println("weeping...");}  
}  
class TestInheritance2
{  
public static void main(String args[])
{  
BabyDog d=new BabyDog();  
d.weep();  
d.bark();  
d.eat();  
}
    }  
    java -cp /tmp/Xjcta9mxDJ TestInheritance2
weeping...barking...
eating...
