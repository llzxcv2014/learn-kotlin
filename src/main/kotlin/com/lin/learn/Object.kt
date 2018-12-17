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

open class Car(type: String, length: Double, width: Double)

class BMW(type: String, length: Double, width: Double, feature: String) : Car(type, length, width)


fun main(args: Array<String>) {
    var c: Car = Car("SUV", 123.0, 12.0)
    var b: BMW = BMW("SUV", 123.3, 12.4, "I`m BMW")

    /*
     * 抛出ClassCast异常
     */
    var cAsB: BMW = c as BMW

    /*
     * 此时返回为空
     */
    var newCAsB: BMW? = c as? BMW

    println(cAsB)

    var personString = PersonSecond("test")

    /*
     * 可空类型
     */
    val s: String? = null
}

/*
 * 伴生对象
 * note:
 * Kotlin 中的对象指的是使用 object 关键字定义的 类型声明，
 * 一般用作单例模式和伴生对象
 */
object Resource {
    val name = "Alex"

    fun say() {
        println("Hello")
    }
}


/*
 * 数据类
 *
 * 1. 构造函数、属性和 getter、setter：这是主构造函数的功劳；
 * 2. copy() 函数：这个函数让我们可以复制一个对象，然后修改一下属性
 * 3. equals() 和 hashCode() 函数：数据类会自动重写 equals() 和 hashCode() 方法，可以直接调用。
 * 4. toString() 函数：数据类自动重写的 toString() 方法，都是“类名(属性1=值, 属性2=值，……)”的格式
 * 5. componentN() 函数：这里的 N 与主构造函数中声明的属性数是相同的，
 *    这种函数叫做 析构函数。它能够把对象的属性提取出来，并赋给一个值
 */
data class PersonSecond(var name: String)


/*
 * 密封类
 *
 * 1. 密封类是为 继承 设计的，是一个抽象类
 * 2. 密封类的子类是确定的，除了已经定义好的子类外，它不能再有其他子类
 *
 * 它们都属于 可以把元素地划分到几个确定的子类 的类，
 * 密封类就是专门为这种类提供的封装，可以看作封装类的枚举。
 *
 * 注意：
 *
 * 1. 因为密封类是一个抽象类，所以不能用 data 等非抽象类的修饰符来修饰它，也不用加 open 关键字
 * 2. 密封类的子类，要么写在密封类内部，要么写在父类同一个文件里，
 *    不能出现在其他地方。但子类的子类可以出现在其他地方
 */
sealed class PersonThird(val name: String, var age: Int) {
    class Adult(name: String, age: Int) : PersonThird(name, age)
    class Child(name: String, age: Int) : PersonThird(name, age)
}

// 安全调用属性
/*
 * ?. 安全调用操作符实际上是个语法糖，它会被编译为一个三目运算表达式，
 * 如果 ?. 前的对象不为 null，则调用 ?. 后的方法或属性，否则返回 null
 *
 * Kotlin 的编译器非常智能，如果一个可空变量已经被判断为非空，
 * 再次调用它的方法和变量时，会自动将变量转换为非空类型，实现安全调用
 */
fun printLengthOfString(s: String?) = println(s?.length)
