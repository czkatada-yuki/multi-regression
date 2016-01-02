package utils

import breeze.linalg.{ DenseVector, DenseMatrix }
import scala.io.Source

/**
 * Created by katadayuuki on 1/2/16.
 */
object CSVReader {
  def apply(name: String, path: String): List[Array[String]] = {
    try {
      val src = Source.fromFile(s"$path/$name.csv")
      val lines = for (line <- src.getLines()) yield line
      val dataList = lines.toList.map(_.split(","))
      src.close()
      dataList
    } catch {
      case e: Exception => throw new Exception("CSV Extraction Failed")
    }
  }
}
