package com.shihstringbuilder

import android.util.Log
import java.lang.Exception
import java.lang.StringBuilder

class ShihString(mStringBuilder: StringBuilder, siz: Float, show: Boolean) : StringBuilderShih(
    mStringBuilder, siz, show
) {
    /**
     * Добавить одну запись в конструктор
     * Пример
     * @param mShihString.addStringToBuilder("Value_1 Value_2 Value_3")
     */
    override fun addStringToBuilder(str: String) {
        if (str.isNotEmpty()) {
            stringBuilder.append(str)
        }
    }

    /**
     * Обновить запись в конструкторе
     */
    override fun updateStringToBuilder(str: String, strNew: String): StringBuilder {
        if (stringBuilder.lastIndexOf(str) > -1 && stringBuilder.isNotEmpty()) if (stringBuilder.lastIndexOf(str) > -1) {
            if (stringBuilder.isNotEmpty()) {
                val i = stringBuilder.lastIndexOf(str)
                stringBuilder.replace(i, i + str.length, strNew)
            }
        }
        return stringBuilder
    }

    /**
     * Добавить Массив строк в конструктор
     */
    override fun addAllStringToBuilder(str: Array<String?>?) {
        for (i2 in str!!.indices)
            stringBuilder.append(str[i2])
    }

    /**
     * Удалить одну запись в конструкторе
     * * Пример
     * @param mShihString.deleteOneLine("Value_1")
     */
    override fun deleteOneLine(str: String): StringBuilder {
        if (stringBuilder.lastIndexOf(str) > -1 && stringBuilder.isNotEmpty())
            if (stringBuilder.lastIndexOf(str) > -1) {
            if (stringBuilder.isNotEmpty()) {
                val i = stringBuilder.lastIndexOf(str)
                stringBuilder.delete(i, i + str.length)
            }
        }
        return stringBuilder
    }

    /**
     * Удалить все похожие записи в конструкторе
     */
    override fun deleteAllLine(str: String): StringBuilder {
        if (stringBuilder.lastIndexOf(str) > -1 && stringBuilder.isNotEmpty())
            for (i2 in stringBuilder.indices)
                if (stringBuilder.lastIndexOf(str) > -1 && stringBuilder.isNotEmpty()) {
                    val i = stringBuilder.lastIndexOf(str)
                    stringBuilder.delete(i, i + str.length)
                } else {
                    break
                }
        return stringBuilder
    }

    /**
     * Возврат StringBuilder
     * @param mShihString.stringBuilder
     */
    override val stringBuilder: StringBuilder get() = mStringBuilder


    override fun deleteOneLineBaze(): StringBuilder {
        if (stringBuilder.isNotEmpty()) {
            val coll = stringBuilder.length
            stringBuilder.delete(coll - 1, coll)
        }
        return stringBuilder
    }


    override fun deleteAll(): StringBuilder {
        if (stringBuilder.isNotEmpty()) {
            val coll = stringBuilder.length
            stringBuilder.delete(0, coll)
        }
        return stringBuilder
    }

    override fun deleteSelection(start: Int, end: Int): StringBuilder {
        if (stringBuilder.isNotEmpty())
            if (start >= 0 && end >= 1)
                stringBuilder.delete(start, end)
        return stringBuilder
    }

    /**
     * Добавить одну запись в StringBuilder
     */
    override fun addStringToBuilderSelection(str: String?, start: Int, end: Int, size: Int) {
        val iControlStart: Int
        if (start >= 0 && end >= 0) {
            iControlStart = if (size == 0) 0 else { start }
            try {
                stringBuilder.insert(iControlStart, str)
            } catch (e: Exception) {
                Log.d("TAG", "Error addStringToBuilderSelection()")
            }
        }
    }

    override fun getShow(): Boolean {
        return show
    }

    override fun setShow(show1: Boolean?) {
        show = show1!!
    }

    fun minusSize(siz1: Float) {
        siz -= siz1
    }

    fun plusSize(siz1: Float) {
        siz += siz1
    }

    fun resetSize(): Float {
        return 40f.also { siz = it }
    }

    val size: Float
        get() = siz

}