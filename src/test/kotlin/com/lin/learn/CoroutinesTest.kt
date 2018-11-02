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

import com.lin.learn.coroutine.doWorld
import kotlinx.coroutines.*
import kotlin.test.*

/**
 * @author Lin.L
 */

class CoroutinesTest {

    private val job = GlobalScope.launch { // launch new coroutine and keep a reference to its Job
        delay(10000L)
        println("World!")
    }


    @Test
    fun testMySuspendingFunction() = runBlocking {
        GlobalScope.launch { // launch new coroutine in background and continue
            delay(1000L)
            println("World!")
        }
        println("Hello,") // main coroutine continues here immediately
        delay(2000L)      // delaying for 2 seconds to keep JVM alive
    }

    @Test
    fun testJob() = runBlocking {
        println("Hello,")
        job.join() // wait until child coroutine completes
    }

    @Test
    fun testSuspend() = runBlocking {
        launch {
            doWorld()
        }
        println("Hello,")
    }

    @Test
    fun testARELightWeight() = runBlocking {
        /*
         * launch Coroutines 10次
         * 在1s后打印10个'.'
         */
        repeat(10) {
            launch {
                delay(1000L)
                print(".")
            }
        }

    }
}