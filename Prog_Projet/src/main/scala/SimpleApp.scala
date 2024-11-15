package fr.umontpellier

import org.apache.spark.sql.SparkSession

object SimpleApp {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder
      .appName("Simple Application")
      .master("local[*]")
      .getOrCreate()

    val logFile = "data/README.md" // Should be some file on your system
    val logData = spark.read.textFile(logFile).cache()
    val numAs = logData.filter(line => line.contains("a")).count()
    val numBs = logData.filter(line => line.contains("b")).count()
    val numSPark = logData.filter(line => line.contains("Spark")).count()
    println(s"Lines with a: $numAs, Lines with b: $numBs, Lines with Spark: $numSPark")
    spark.stop()
  }
}
