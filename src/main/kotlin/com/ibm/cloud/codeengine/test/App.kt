package com.ibm.cloud.codeengine.test

import java.io.IOException
import java.nio.charset.Charset
import org.apache.commons.io.IOUtils

fun main(args : Array<String>) {
    println("Hello there!")
    IOUtils.write("This is the main class", System.out, Charset.forName("UTF-8"));
}
