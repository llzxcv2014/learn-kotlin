/*
 * MIT License
 *
 * Copyright (c) 2018 Lin.L
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.lin.learn

/**
 * @author Lin.L
 */

/**
 * 比较大小，若if语句当作表达式，则必须有else部分
 */
fun max(a: Int, b: Int) = if (a <= b) b else a


val arrayInt = intArrayOf(1, 2, 3, 4, 5)

fun printArr(arr: IntArray) {
    for (item in arr) {
        println("$item")
    }

    /*
     * array.indices获取数组索引
     */
    for (i in arrayInt.indices) {
        println("arrayInt[$i] is ${arrayInt[i]}")
    }

    /*
     * 获取索引和实例
     */
    for ((index, value) in arrayInt.withIndex()) {
        println("arrayInt[$index] is $value")

    }
}

fun main(args: Array<String>) {
    printArr(arrayInt)
}