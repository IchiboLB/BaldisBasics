package com.cornbeer.baldisbasics.calculator

class CuculatorViewModel {

    private var currentFirstString: String = ""
    private var currentSecondString: String = ""

    fun plus():Int {
        return currentFirstString.toInt() + currentSecondString.toInt()
    }
    fun minus():Int {
        return currentFirstString.toInt() - currentSecondString.toInt()
    }

    fun umnozh():Int {
        return currentFirstString.toInt() * currentSecondString.toInt()
    }

    fun delen():Int {
        val second = currentSecondString.toInt()
        if (second != 0) {
            return currentFirstString.toInt() / currentSecondString.toInt()
        } else {
            throw Exception("Ты даун?")
        }
    }

    fun firstObnova(firstNumb: String) {
        currentFirstString = firstNumb
    }

    fun secondObnova(secondNumb: String) {
        currentSecondString = secondNumb
    }

}