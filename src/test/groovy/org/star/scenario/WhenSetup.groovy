package org.star.scenario

import geb.spock.GebReportingSpec
import org.star.page.*

/**
 * アプリケーションをデプロイ後に利用し始めるときの環境構築を定義する
 */
class WhenSetup extends GebReportingSpec {

    // 安全のために管理者は削除できなくなっている
    def "追加されたユーザはユーザ管理できないし、管理者は管理者アカウントを削除できない"(){
        given: "トップページにアクセスする"
        to TopPage
        when: "管理者としてログインすると"
        login "admin", "admin"
        then: "ダッシュボード画面が表示される"
        at DashBoardPage
        when: "Adminをクリックすると"
        clickUser()
        then: "ユーザ画面が表示される"
        at UserPage
        when: "作成ボタンをクリックすると"
        createUser "test1", "test1", "test@mail.com", true
        then : "ユーザが作成される"
        successMessage
//        sleep(1000)
        getUserItems("test1")
        updateUser "test2", "test2", "test2@mail.com", false

        successMessage
        clickLogOut()

    }

}
