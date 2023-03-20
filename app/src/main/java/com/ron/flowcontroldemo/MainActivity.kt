package com.ron.flowcontroldemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        demoIfElse()
        demoIfElseIfElse()
        demoNestedIfElse()
        demoSingleIf()
        demoWhen()
        demoWhileLoop()
        demoForLoop()
        demoNestedLoop()
        demoBreak()
        demoContinue()
        demoLabel()
    }

    private fun demoIfElse() {
        println("--demoIfElse()-----------------")
        val score = 85
        var text1 = "$score 分，"
        if (score >= 85) {
            text1 += "贏得 10,000 元獎學金！"
        } else {
            text1 += "再努力！"
        }
        println("text1: $text1")

        // 可改成 if expression，大括弧內容只有一行可以省略大括弧
        val text2 = if (score >= 85) "贏得 10,000 元獎學金！" else "再努力！"
        println("text2: $text2")
    }

    private fun demoIfElseIfElse() {
        println("--demoIfElseIfElse()-----------------")
        val score = 86
        var text1 = "$score 分，"
        if (score >= 85) {
            text1 += "贏得 10,000 元獎學金！"
        } else if (score >= 75) {
            text1 += "贏得 5,000 元獎學金！"
        } else {
            text1 += "再努力！"
        }
        println("text1: $text1")

        // 可改成 if expression
        val text2 =
            if (score >= 85) "贏得 10,000 元獎學金！"
            else if (score >= 75) "贏得5,000元獎學金！"
            else "再努力！"
        println("text2: $text2")
    }

    private fun demoNestedIfElse() {
        println("--demoNestedIfElse()-----------------")
        val score = 87
        var text1 = "$score 分，"
        if (score >= 75) {
            if (score >= 85) {
                text1 += "贏得 10,000 元獎學金！"
            } else {
                text1 += "贏得 5,000 元獎學金！"
            }
        } else {
            text1 += "再努力!"
        }
        println("text1: $text1")

        // 可改成 if expression
        val text2 =
            if (score >= 75)
                if (score >= 85) "贏得 10,000 元獎學金！"
                else "贏得 5,000 元獎學金！"
            else "再努力!"
        println("text2: $text2")
    }

    private fun demoSingleIf() {
        println("--demoSingleIf()-----------------")
        val tired = true
        val headache = true
        var count = 0
        var text = "新冠疫苗副作用:\n"
        if (tired) {
            count++
            text += "$count. 疲倦\n"
        }
        if (headache) {
            count++
            text += "$count. 頭痛\n"
        }
        println("text: $text")
    }

    private fun demoWhen() {
        println("--demoWhen()-----------------")
        val rating = 5
        val text1: String
        when (rating) {
            1 -> text1 = "贏得 10,000 元獎學金"
            2 -> text1 = "贏得 5,000 元獎學金"
            3 -> text1 = "贏得 2,000 元獎學金"
            else -> text1 = "還要再努力"
        }
        println("text1: $text1")
        // 可改成 when expression
        val text2 =
            when (rating) {
                1 -> "贏得 10,000 元獎學金"
                2 -> "贏得 5,000 元獎學金"
                3 -> "贏得 2,000 元獎學金"
                else -> "還要再努力"
            }
        println("text2: $text2")

        // 也支援文字類型
        val season = "spring"
        val text3 =
            when (season) {
                // 相同內容可以並列 (值以逗號區隔)
                "spring", "autumn" -> "春、秋"
                "summer" -> "夏"
                "winter" -> "冬"
                else -> "季節輸入錯誤"
            }
        println("text3: $text3")
    }

    private fun demoWhileLoop() {
        println("--demoWhileLoop()-----------------")
        var text1 = ""
        var i = 1
        while (i < 10) {
            text1 += "$i "
            i++
        }
        println("text1: $text1")

        var text2 = ""
        var j = 11
        do {
            text2 += "$j "
            j++
        } while (j <= 10)
        println("text2: $text2")
    }

    private fun demoForLoop() {
        println("--demoForLoop()-----------------")
        var text1 = ""
        for (i in 1..10) {
            text1 += "$i "
        }
        println("text1: $text1")

        var text2 = ""
        for (i in 1 until 10) {
            text2 += "$i "
        }
        println("text2: $text2")

        var text3 = ""
        for (i in 1..10 step 2) {
            text3 += "$i "
        }
        println("text3: $text3")

        var text4 = ""
        for (i in 10 downTo 1) {
            text4 += "$i "
        }
        println("text4: $text4")
    }

    private fun demoNestedLoop() {
        println("--demoNestedLoop()-----------------")
        var text = "\n"
        for (i in 1..5) {
            for (j in 1..10) {
                text += "$j "
            }
            text += "\n"
        }
        println("text: $text")
    }

    private fun demoBreak() {
        println("--demoBreak()-----------------")
        var text = ""
        val floorStop = 5
        for (floor in 1..10) {
            if (floor >= floorStop) {
                text += "停在${floor}樓 "
                break
            }
            text += "${floor}樓  "
        }
        println("text: $text")
    }

    private fun demoContinue() {
        println("--demoContinue()-----------------")
        var text = ""
        val floorSkip = 4
        for (floor in 1..10) {
            if (floor == floorSkip) {
                text += "(跳過${floor}樓) "
                continue
            }
            text += "${floor}樓 "
        }
        println("text: $text")
    }

    private fun demoLabel() {
        println("--demoLabel()-----------------")
        var text = "\n"
        val cabinetNo = 2
        val drawerNo = 3
        labelCabinet@
        for (cabinet in 1..3) {
            text += "$cabinet 號櫃子:\n"
            for (drawer in 1..3) {
                if (cabinet == cabinetNo && drawer == drawerNo) {
                    text += "  $drawer 號抽屜 發現鑰匙，停止搜尋"
                    break@labelCabinet
                }
                text += "  $drawer 號抽屜 沒發現\n"
            }
        }
        println("text: $text")
    }
}