package com.shihstringbuilder

 object Test {

    @JvmStatic
    fun main(args: Array<String>) {

        val myActivity: ShihString
        val mStringBuilder = StringBuilder()
        val siz = 40f
        myActivity = ShihString(mStringBuilder, siz, false)
        myActivity.addStringToBuilder("Привет Пока ")
        myActivity.deleteAllLine("Пока")
        println(myActivity.stringBuilder)

    }
}