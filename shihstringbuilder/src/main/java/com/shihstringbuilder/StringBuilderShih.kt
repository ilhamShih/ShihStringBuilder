package com.shihstringbuilder

import java.lang.StringBuilder

abstract class StringBuilderShih protected constructor(protected var mStringBuilder: StringBuilder, protected var siz: Float, protected var show: Boolean) {
    abstract fun addStringToBuilder(str: String)
    abstract fun updateStringToBuilder(str: String, strNew: String): StringBuilder
    abstract fun addAllStringToBuilder(str: Array<String?>?)
    abstract fun deleteOneLine(str: String): StringBuilder
    abstract fun deleteAllLine(str: String): StringBuilder
    abstract val stringBuilder: StringBuilder
    abstract fun deleteOneLineBaze(): StringBuilder
    abstract fun deleteAll(): StringBuilder
    abstract fun deleteSelection(start: Int, end: Int): StringBuilder
    abstract fun addStringToBuilderSelection(str: String?, start: Int, end: Int, size: Int)
    abstract fun getShow(): Boolean?
    abstract fun setShow(show1: Boolean?)
}