package utils

import org.specs2.mutable.Specification

/**
 * Created by katadayuuki on 1/3/16.
 */
class CSVReaderSpec extends Specification {
  "CSVReader" should {
    "extract sample csv file" in {
      val readFile = CSVReader("sample", "src/test/resources").map(_.toList)
      readFile equals List(
        List("sample_data", "sample_data1", "sample_data2"),
        List("2015-06-18", "0", "28109"),
        List("2015-07-13", "0", "11219")
      )
    }
  }

}
