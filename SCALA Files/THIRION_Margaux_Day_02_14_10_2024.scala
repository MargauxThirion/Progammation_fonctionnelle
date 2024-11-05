// Databricks notebook source
// MAGIC %md
// MAGIC #PARADIGM

// COMMAND ----------

def f(x: Int): Int = x + 2
def g(x: Int): Int = x + 2
def h(x: Int): Int = f(g(x))

// COMMAND ----------

val input = 4

println(s"g($input) = ${g(input)}")
println(s"f(g($input) = ${f(g(input))}")
println(s"h($input) = ${h(input)}")

// COMMAND ----------

// MAGIC %md
// MAGIC #SCALA PROGRAMMING LANGUAGE

// COMMAND ----------

val name: String = "Scala"
val age: Int = 25

// COMMAND ----------

// MAGIC %md
// MAGIC `x = "Scala"`
// MAGIC `print(x)`
// MAGIC `x = 25`
// MAGIC `print(x)`
// MAGIC
// MAGIC This doesn't work in scala

// COMMAND ----------

// MAGIC %md
// MAGIC #OPERATOR

// COMMAND ----------

val x = 10
val y = 5
val z = x + y

// COMMAND ----------

val z = x.+(y)

// COMMAND ----------

// MAGIC %md
// MAGIC #TRAITS
// MAGIC it's a way to define an interface that a set of related class can share

// COMMAND ----------

trait Shape {
  def area(): Int
}

class Square(length: Int) extends Shape {
  def area = length * length
}

class Rectangle(length: Int, width: Int) extends Shape {
  def area = length * width
}

// COMMAND ----------

val square = new Square(10)
val area = square.area

// COMMAND ----------

// MAGIC %md
// MAGIC #TUPLES 
// MAGIC - It's a container for storing elements of differents types
// MAGIC - It's immutable

// COMMAND ----------

val twoElementContainer = (10, "Bob")
val threeElementContainer = ("15", "Franck", true)

// COMMAND ----------

val first = threeElementContainer._1
val second = threeElementContainer._2
val third = threeElementContainer._3

// COMMAND ----------

// MAGIC %md
// MAGIC #COLLECTION
// MAGIC - `Sequence`  
// MAGIC   - Array  
// MAGIC   - List  
// MAGIC   - Vector : an hybrid class of list and array.  
// MAGIC - `Sets`
// MAGIC - `Maps`

// COMMAND ----------

// MAGIC %md
// MAGIC ##SEQUENCE

// COMMAND ----------

val arr = Array(9, 5, 10, 20)
arr(0) = 50
val first = arr(0)

// COMMAND ----------

val list = List(1, 2, 3, 4)
val list2 = (1 to 20).toList

// COMMAND ----------

val v1 = Vector(0, 1, 2, 3, 4, 5)
val v2 = v1 :+ 6
val v3 = v2 :+ 7

// COMMAND ----------

// MAGIC %md
// MAGIC ##SETS

// COMMAND ----------

val fruits = Set("pomme", "orange", "banane", "ananas", "kiwi")
fruits.contains("fraise")

// COMMAND ----------

// MAGIC %md
// MAGIC ##MAP

// COMMAND ----------

val capitals = Map("France"->"Paris", "Allemagne"->"Berlin", "Royaume-Uni"->"Londre")
val franceCapital = capitals("France")

// COMMAND ----------

// MAGIC %md
// MAGIC
// MAGIC #HIGHER-ORDER METHODS ON COLLECTION CLASSES
// MAGIC
// MAGIC These includes:
// MAGIC   - map
// MAGIC   - flatmap
// MAGIC   - filter
// MAGIC   - foreach
// MAGIC   - reduce

// COMMAND ----------

//Map
val myList = List(1, 2, 3, 4)
val multipliedList = myList.map(_ * 2)

// COMMAND ----------

//Flat Map
val line = "La maison est rouge"
val singleSpace = " "
val words = line.split(singleSpace)
val arrayOfListOfChars = words.map(_.toList)
val arrayOfListOfChars2 = words.flatMap(_.toList)

// COMMAND ----------

//Filter
val numbers = (1 to 10).toList
val pair = numbers.filter(_%2 == 0)

// COMMAND ----------

//For each
val phrase = List("La", "maison", "est", "rouge")
phrase.foreach(println)

// COMMAND ----------

//Reduce
val reduceList = List(2,4,5,7,10)
val sum = reduceList.reduce{(x, y) => x+y}
val product = reduceList.reduce{(x, y) => x*y}
