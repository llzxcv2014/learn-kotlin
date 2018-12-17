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

fun main(args: Array<String>) {

}

/*
 * 需要注意的是，如果类不是 open 的，
 * 那么它内部的属性和函数都不能是 open 的。
 * 理由很简单，不会被继承的类，不可能有属性和函数被覆盖。
 */
open class ExtPerson() {
    lateinit var username: String

    open var age = 0
    open fun say() = "My name is $username, $age years old."
}

/*
 * note:
 *
 * Kotlin 中没有 extends 关键字，声明一个类继承自另一个标记为 open 的类的方法是：
 * class 子类[(主构造方法参数)]: 父类[(主构造方法参数)] {……}
 *
 * 可以这样理解，冒号 : 在 Kotlin 中表示前者属于后者类型，
 * 比如我们定义变量时用冒号声明变量的类型，
 * 定义函数时用冒号声明函数的返回类型。
 * 而在继承中，子类实际上就属于父类的类型，
 * 所以没有必要再专门用一个 extends 关键字声明父类，只需要用冒号。
 *
 * 注意：
 * 1. 不允许用 val 属性覆盖 var 属性
 * 此外，Kotlin 还允许用 var 属性覆盖 val 属性
 * （只需给子类中的属性添加一个 setter 方法），
 * 但不允许用 val 属性覆盖 var 属性
 *
 * 2. 可以在主构造函数中定义要覆盖的属性
 */
class Student() : ExtPerson() {
    override var age = 1
    override fun say() = "I'm a student named $username, $age years old."
}

/*
 * Kotlin 的接口与 Java 8 中的接口类似，
 * 使用 interface 关键字定义接口，允许方法有默认实现
 *
 * 注意
 * 1. Kotlin 接口不能有构造函数，也就是说 Kotlin 接口定义时，
 * 接口名后是不能加主构造函数的
 *
 * 2. Kotlin 接口中函数可以有默认实现，也可以没有，
 * 区别只在于函数有没有函数体，
 * 这与 Java 8 中需要用 default 关键字声明有默认实现的方法有所不同
 *
 * 3. Kotlin 接口允许存在抽象变量
 * 4. Kotlin 接口的属性只能是抽象的
 *
 * 总结一下，Kotlin 通过静态内部类
 * + 添加默认实现方法的方式实现了
 * JDK 1.6 中不支持的接口默认方法，给接口的设计带来了便利。
 */
interface KotlinInterface {
    var prop: Int
    fun foo(prop: Int)
    fun bar() {
        println("bar")
    }
}