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
 * kotlin操作符
 *
 * @reference https://zhuanlan.zhihu.com/p/26546977
 *
 * 1. 与 Java 中完全相同的，如加减乘除等基本数学运算等；
 * 2. Java 中有，但是用途不同的，比如冒号；
 * 3. Java 中有而 Kotlin 中没有的，重点 ；
 * 4. Java 中没有而 Kotlin 中有的，重点。
 *
 * kotlin:
 * a?.equals(b) ?: (b===null)
 * 等价于java
 * if (a != null) {
 *     return a.equals(b);
 * } else {
 *     return b == null;
 * }
 *
 * @author Lin.L
 */

fun main(arg: Array<String>) {

    val list: List<String> = arrayListOf("1", "2", "3", "4")

    /*
     * 与 Java 中的不同之处在于，
     * Kotlin 中这个运算符不仅可以用在数组变量后，
     * 也可以用在集合变量后，可以方便地调用和操作数组和集合中的元素。
     */
    println(list[1])

    val p = Person("test", true)

    /*
     * 相当于Java中的instanceof
     */
    println(p is Person)
}
