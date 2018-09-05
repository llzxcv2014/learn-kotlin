/**
 * MIT License
 * Copyright (c) 2018 Lin.L
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the right
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is\
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.lin.learn

import java.util.*

/**
 *
 *
 * @author 83945
 */
fun main(args: Array<String>) {
//    val name = if (args.isNotEmpty()) args[0] else "Kotlin"
//    println("Hello, $name")

//    val person = Person("bob", false)
//    println(person.isMarried)
//    println(person.name)
//    person.isMarried = true
//    println(person.isMarried)

    val rectangle = Rectangle(41, 43)
    println(rectangle.isSquare)
    println(createRandomRectangle().isSquare)
}

class Person (
    val name: String,
            var isMarried: Boolean)

class Rectangle(val height:Int, val width: Int) {
    val isSquare: Boolean
        get() {
        return height == width
    }
}

fun createRandomRectangle(): Rectangle {
    val random = Random()
    return Rectangle(random.nextInt(), random.nextInt())
}
