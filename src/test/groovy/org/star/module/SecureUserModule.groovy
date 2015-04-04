package org.star.module

import geb.Module

class SecureUserModule extends Module {
    static content = {

        username {$("#username")}
        password {$("#password")}
        email {$("#email")}
        chkenabled {$("#enabled")}
        createbutton {$("input", name:"create")}
        updatebutton {$("input", name:"update")}



    }
}
