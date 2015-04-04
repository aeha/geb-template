package org.star.module

import geb.Module

class LoginHeaderModule extends Module {
    static content = {

        admin {$(".item-admin a")}
        user {$(".item-secureUser a")}
        logoutbutton {$("#logout a")}
    }
}
