package com.hyunjine.kotlinpractice.practice

import android.util.Log

const val TAG = "winter"
class Generic {
    fun main() {
        Using(A()).test()
        Using(B()).test()
        Using(C()).test()
//        UsingGeneric<A>(A()).test()
//        UsingGeneric<B>(B()).test()
//        UsingGeneric<C>(C()).test()
    }
}

open class A {
    open fun shout() {
        Log.d(TAG, "A1: shout")
        Log.d(TAG, "A2: shout")
        Log.d(TAG, "A3: shout")
        Log.d(TAG, "A4: shout")
        Log.d(TAG, "A5: shout")
    }
}

class B: A() {
    override fun shout() {
        Log.d(TAG, "B1: shout")
        Log.d(TAG, "B2: shout")
        Log.d(TAG, "B3: shout")
        Log.d(TAG, "B4: shout")
        Log.d(TAG, "B5: shout")
    }
}

class C: A() {
    override fun shout() {
        Log.d(TAG, "C1: shout")
        Log.d(TAG, "C2: shout")
        Log.d(TAG, "C3: shout")
        Log.d(TAG, "C4: shout")
        Log.d(TAG, "C5: shout")
    }
}

class UsingGeneric<T: A> (private val t: T) {
    fun test() {
        t.shout()
    }
}

class Using(private val t: A) {
    fun test() {
        t.shout()
    }
}