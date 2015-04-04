package org.star.page

import geb.Page
import org.star.module.LoginHeaderModule
import org.star.module.NotLoginHeaderModule
import org.star.module.SecureUserModule
import org.star.module.UserRow

class UserPage extends Page{
    static at = {
        $(id:"form")
    }
    static content = {
        header(required:true) {module SecureUserModule}
        loginheader(required:true) {module LoginHeaderModule}
        userItems { moduleList UserRow, $(".table tr").tail()}
        successMessage(wait:"slow", required:false) {$(".alert-info")}
    }
    def createUser(username, password, email, chkenabled){
        header.username = username
        header.password = password
        header.email = email
        header.chkenabled = chkenabled
        header.createbutton.click()
    }

    def updateUser(username, password, email, chkenabled){
        header.username = username
        header.password = password
        header.email = email
        header.chkenabled = chkenabled
        header.updatebutton.click()
    }

    def getUserItems(targetUserName){

        userItems.find{it.userName == targetUserName}.updatebutton.click()
    }

    def clickLogOut(){
        loginheader.logoutbutton.click()
    }
}
