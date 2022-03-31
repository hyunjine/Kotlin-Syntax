package com.hyunjine.kotlinpractice.practice

class ExtensionFunction {
    fun getResult(list: List<Int>): Int = list.plusAll()

    fun List<Int>.plusAll(): Int {
        var addAll: Int = 0
        this.forEach {
            addAll += it
        }

        return addAll
    }
}