package practice


object currencyConv {

  def main(args:Array[String]): Unit ={

    def convFunc(dollar: Int,convfac:Double): Float ={

      val rupee = dollar*convfac

      println(s"Indian rupees for us dollors ${dollar}")

      rupee.toFloat
    }

    println(convFunc(17,64.64))


  }

}

