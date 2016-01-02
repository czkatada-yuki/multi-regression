package logics

import breeze.linalg.{ DenseMatrix, DenseVector }

/**
 * Created by katadayuuki on 1/2/16.
 */
object LinearRegression {
  def regress(observations: DenseMatrix[Double], outputs: DenseVector[Double]): DenseVector[Double] = {
    val cov = DenseMatrix.zeros[Double](observations.cols, observations.cols) + (observations.t * observations)
    val scaled = DenseVector.zeros[Double](observations.cols) + (observations.t * outputs)
    cov \ scaled
  }
}
