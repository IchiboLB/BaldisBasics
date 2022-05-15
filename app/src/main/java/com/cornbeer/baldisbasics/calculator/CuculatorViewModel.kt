package com.cornbeer.baldisbasics.calculator

class CuculatorViewModel {

    private var currentFirstString: String = ""
    private var currentSecondString: String = ""

    fun plus(firstNumb: Int, secondNumb: Int):Int {
        return firstNumb + secondNumb
    }
    fun minus(firstNumb: Int, secondNumb: Int):Int {
        return firstNumb - secondNumb
    }

    fun firstObnova(firstNumb: String) {
        currentFirstString = firstNumb
    }

    fun secondObnova(secondNumb: String) {
        currentSecondString = secondNumb
    }

}