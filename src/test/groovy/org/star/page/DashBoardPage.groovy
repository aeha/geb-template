package org.star.page

import geb.Page
import org.star.module.NotLoginHeaderModule
import org.star.module.LoginHeaderModule

class DashBoardPage extends Page{
    static url = "home"
    static at = {
        $("h1").text() == "Dash Board"
    }

    static content = {
        header(required:true) {module LoginHeaderModule}
    }

    def clickUser(){
        header.admin.click()
        header.user.click()
    }
}
