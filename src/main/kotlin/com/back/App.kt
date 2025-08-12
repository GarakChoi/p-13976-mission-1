package com.back

import com.back.global.bean.SingletonScope.systemController
import com.back.global.bean.SingletonScope.wiseSayingController
import com.back.global.rq.Rq

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class App() {
    fun run() {

        println("== 명언 앱 ==")

        while (true) {
            print("명령) ")
            val input = readlnOrNull()!!.trim()

            val rq = Rq(input)

            when (rq.action) {
                "종료" -> {
                    systemController.actionExit(rq)
                    break
                }

                "빌드" -> wiseSayingController.actionBuild(rq)
                "등록" -> wiseSayingController.actionWrite(rq)
                "목록" -> wiseSayingController.actionList(rq)
                "삭제" -> wiseSayingController.actionDelete(rq)
                "수정" -> wiseSayingController.actionModify(rq)
            }
        }
    }
}
