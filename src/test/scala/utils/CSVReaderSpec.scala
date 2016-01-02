package utils

import org.specs2.mutable.Specification

/**
 * Created by katadayuuki on 1/3/16.
 */
class CSVReaderSpec extends Specification {
  "CSVReader" should {
    "extract sample csv file" in {
      val readFile = CSVReader("sample", "src/test/resources").map(_.toList)
      readFile mustEqual List(
        List("sample_data", "sample_data1", "sample_data2"),
        List("2015-06-18", "0", "28109"),
        List("2015-07-13", "0", "11219")
      )
    }

    "throw Exception with non-existing filename" in {
      CSVReader("NA", "src/test/resources") must throwA("CSV Extraction Failed")
    }

    "throw Exception with non-existing filepath" in {
      CSVReader("sample", "NA") must throwA("CSV Extraction Failed")
    }

  }

}
