package com.hyunjine.kotlinpractice.practice

import android.os.SystemClock
import android.util.Log
import kotlin.time.seconds

const val TAG = "winter"
class Generic {
    fun main() {
        val startTime = SystemClock.elapsedRealtime()
        for (i: Int in 1..100) {
            cast()
        }

        val finishTime = SystemClock.elapsedRealtime()
        Log.d("result", "main: ${(finishTime - startTime)}")

    }
}

fun generic() {
    val a = UsingGeneric<A>(A())
    val b = UsingGeneric<B>(B())
    val c = UsingGeneric<C>(C())
    a.test()
    b.test()
    c.test()
}

fun cast() {
    val a = Using(A())
    val b = Using(B())
    val c = Using(C())
    a.test()
    b.test()
    c.test()
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