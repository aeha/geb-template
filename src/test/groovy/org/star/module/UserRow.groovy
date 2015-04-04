package org.star.module

import geb.Module

class UserRow extends Module {
    static content = {
        cell { $("td", it) }
        userName { cell(0).text() }
        email { cell(1).text().toInteger() }
        updatebutton { cell(2).$("a", 0) }
        deletebutton { cell(2).$("a", 1) }
    }
}
