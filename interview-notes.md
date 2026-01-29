What is java ?

Java is high level ,class based object based progaming language
and its platform independent,scure,robust and more scalable
- Java  written once and run any where
- History 1991(Green Talks)- started James Goshling and passed in year 1995 by Sun Microsystem
- Now  currently   with Orcale
- named Green-Talk -Ook - 
- it used to make like mobile application,web application etc

Fetures:
* Simple - Java is quite similar easy to then  to C syntax and no pointer concept
* Object oriented - java code is wirte based on Object only
* Plateform indedpendent- we can compiled to byte code and run any where
* Secured - does not support pointer concept  and because of garbage collector
its delete unused memory and so its very secure\
* Robust - exception handling mechanism
* Dynamic - Java supports memory allocation and it support runtime ploymorsphsim
* Interpreted - considered both complied and interpreted language and read line by line and convert the byte code to machine code
* Mutlithreaded - supports multi function to excuted simultaneously
* High Perforemence - just in tie comkpiles byte code to native code
* Portable -  easy to cary to any other platform with securely

How java internal funtion and tools and kit used ?
- JDK - Java Development kit which have JRE and development tools of java like javac,jar,jshell
complie by file.name.java -> complie-> classname.class byte code(jvm)
- JRE - JAVA RUntime Environment its setup of jvm which have libraries and contian of jvm used run of java apllication
- JVM -JAVA virtual machine which excute the byte code to machine code
its process mostly class loader thee class file that which memory like|:
method area - static related and class level datas
Heap - the all obj memory stored in heap memory
java stack - one methods or single thread create stack memory
PC registers- programe counter register that maintain current address
- native methods - which stores native progamming address like c, c++
excution engine nothing but byte code to machine code(jit complier which already used it will reuse it not seprate memory)
What is variables ?
Varibales to store value, which means  its just container to store the data

or the name of memory location .
there is variable decalaration(int a) and initialization(int b =200)
The three types:
1. Instance varaible
2. static type
3. Local variable

Instance variable :
* when value of variable is varied from obj to obj such type is instance variable
* they declare the variable inside class but outside the method or bloacks or constructor is instance varaible
* they create when obj is created and destroy when delete
* we cannot directly access the static method but by with obj reference we can acess

Static Method:
* if value of obj not varied from obj to obj  it static method
* it same ways outside and inside,but use of static keyword when outside
* we can access static variable both instance and satatic method
* And also with static can use with class name
* share the resoureces for instances of class and we cant  use in method area and only in class area|(but in method area in class loading time alone)

Loacal variale
* its varible decalred inside the body of method  is called local variable(only within method)
* its take less memory in laocal variable and reuse the name in different method

What is data type?
The is used to spcify wen type of data we can store
(we can find how many bit (-2^(n-1) to 2^(n-1)-1)
- Primitive datatype-
 * |Integer - byte,short,int,long
 * Floating Point - float,double
 * Character - char
 * Boolean - boolean
- Non Primitive
* Classes
* Interfaces
* Arrays
* String

how to input from user?
USing Scanner  class used to take input from the user at runtime
like name age salary and they store in java.util.Scanner 
- methods are next|Int - int
- nextDouble() - double
- nextFloat() - float
- nextLong( - long
- nextBoolean() - ture/flase
- next() - single word
- nextLine() - full sentence


Which we use psvm(stri arg) what is about and how we use ?

What is operator and types ?
Operator use to perform spcific tasks and then use of mathematical operations
- Arithmetic operator :
pre-increment
double increment ++var//if 11 it will increase to 12
post-increment
var++//if 11 it will show 11 but that value printed then give 12
pre-decrement
post-decrement//same vice but minus
- Assignment operator
Assigning the value ex: int i=11 i+=2 i-=3;//i=i+2
- Arithmetic operator
Simple mathematic operation
- Relational operator-comparing the value like < > <= >= ==
- Bitwise operator
- Logical operator (&&-both conditon true ||-any one condition is true)
- Ternary operator(contion? value1:value2)

what is type casting?
Converting the one datatype to another
- Widening(Implicit)-Automatic
Small to Big ex:int a=12; double b=a;
- Narrowing (Explicit)- Manual
Big-small data loss

What the condition statement?
its flow of programing
- condition statment:
if - one condition 
if else - one condition or last statment
else if - multiple condition it will give
- Loops (repeat work automatically)
  A loop executes a block of code multiple times until a condition fails.
* for loop-when you know how many times can excute
* while loop - it not fixed it iterations
* do-while loop - Executes at least once (even if condition false)

What is Array and explain it ?
Arrays are used to multi values in single variable
and same data type ,uisng continous memory locations,access using indexes and fixed size
- Stored in Heap memory
- They are objects
- can sotre in primitive or obj references start with obj references
What is oops concept and the types?
there are seven types
1. Class
- Its the blueprint of object 
-  its also have state(datas) and behaviour but its only logical view
- its share common properties and behaviour
- And it doesn't have memory syntax :class classname{}
2. Object
- its instance of class or real entity
- And they have combination of state and behaviours
- And  they create memory allocation
- the syntax like class_name referecence_variable= new defaultconsturctor;
which new create the memeory allocation