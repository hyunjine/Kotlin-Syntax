package com.hyunjine.kotlinpractice.practice

import android.util.Log

/**
 * 1. apply: return 자기 자신    / this
 * 2. run  : return 마지막 코드  / this
 * 3. let  : return 자기 자신    / it
 * 4. also : return 마지막 코드  / it
 * 5. with : return 마지막 코드  / this / 파라미터 방식
 */
object ScopeFunction {
    const val TAG = "winter"
    private lateinit var mClass: MyClass

    fun start() {

        val mApply = getClass().apply {
            a = a.plus("마바사")
            b = b.plus("efg")
        }
        Log.d(TAG, "apply: $mApply")

        val mRun = getClass().run {
            a = a.plus("마바사")
            b = b.plus("efg")
        }
        Log.d(TAG, "run: $mRun")

        val mLet = getClass().let {
            it.a = it.a.plus("마바사")
            it.b = it.b.plus("efg")
        }
        Log.d(TAG, "let: $mLet")

        val mAlso = getClass().also {
            it.a = it.a.plus("마바사")
            it.b = it.b.plus("efg")
        }
        Log.d(TAG, "also: $mAlso")

        val mWith = with(getClass()) {
            a = a.plus("마바사")
            b = b.plus("efg")
        }
        Log.d(TAG, "with: $mWith")

        val empty = test()
        Log.d(TAG, "empty: $empty")
    }

    private fun test(): Unit {

    }

    private fun getClass() = MyClass("가나다", "abc")
}

data class MyClass(
    var a: String,
    var b: String
)