package com.hyunjine.kotlinpractice.practice

import android.util.Log

class PairTriple {

    fun pair() {
        val isGood = Pair("가나다", 123)
        val (function, good) = makePair("하이", "바이")
        val list = isGood.toList()
        Log.d(TAG, "pair: ${list[0]} / ${list[1]}")

        // Pair랑 같음
        val isBest = Triple("가나다", 123, 3000L)
        Log.d(TAG, "pair: ${isBest.first} / ${isBest.second} / ${isBest.third}")
    }

    fun makePair(first: String, second: String) : Pair<String, String>  {
        return Pair(first, second)

    }
}