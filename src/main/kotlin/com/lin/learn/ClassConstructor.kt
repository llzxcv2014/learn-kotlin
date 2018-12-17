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
// reference: https://blog.csdn.net/xlh1191860939/article/details/79412319
fun main(args: Array<String>) {
    var five = UserFifth("five", 12)
    println(five.username)
}

/*
 * note: Kotlin的构造函数分为主构造器（primary constructor）
 * 和次级构造器（secondary constructor）
 */
//--------------- 主构造器（primary constructor） --------------
/*
 * 1. 关键字constructor：在Java中，构造方法名须和类名相同；
 * 而在Kotlin中，是通过constructor关键字来标明的，
 * 且对于Primary Constructor而言，
 * 它的位置是在类的首部（class header）而不是在类体中（class body）。
 *
 * 2. 关键字init：init{}它被称作是初始化代码块（Initializer Block），
 * 它的作用是为了Primary Constructor服务的，
 * 由于Primary Constructor是放置在类的首部，
 * 是不能包含任何初始化执行语句的，这是语法规定的，
 * 那么这个时候就有了init的用武之地，
 * 我们可以把初始化执行语句放置在此处，为属性进行赋值。
 */

/*
 * 第一种方式
 */
class User constructor(name: String, age: Int) {
    private val name: String
    private val age: Int

    /*
     * 初始化代码块
     */
    init {
        this.name = name
        this.age = age
    }
}

/*
 * 第二种方式
 */
class UserSecond(name: String, age: Int) {
    private val name: String
    private val age: Int

    /*
     * 初始化代码块
     */
    init {
        this.name = name
        this.age = age
    }
}

/*
 * 不使用init块
 */
class UserThird(name: String, age: Int) {
    private val name: String = name
    private val age: Int = age
}

/*
 * 第四种方式我们可以直接在Primary Constructor中定义类的属性
 */
class UserFourth(private val name: String, private val age: Int)

/*
 *  当我们定义一个类时，我们如果没有为其显式提供Primary Constructor，
 *  Kotlin编译器会默认为其生成一个无参主构造
 */

//-------------------- 次级构造器（secondary constructor）------------------

class UserFifth() {
    var username: String = ""
    var age: Int = 0

    constructor(username: String, age: Int) : this() {
        this.username = username
        this.age = age
    }
}

/*
 * lateinit
 *
 * Kotlin 强制要求类内定义的非抽象属性都要初始化，
 * 但是有些属性不需要在新建实例时初始化，
 * 或可能需要外部注入来初始化，
 * 这些时候我们都无法按照 Kotlin 的要求初始化属性。
 * 为了避免编译错误，可以使用 lateinit 关键字修饰属性。
 */
class UserSixth() {
    lateinit var username: String
    var age: Int = 0

    constructor(username: String, age: Int) : this() {
        this.username = username
        this.age = age
    }
}

