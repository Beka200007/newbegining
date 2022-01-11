package com.beka.newbegining.models

class Users {
    var image=""

    constructor(image: String) {
        this.image = image
    }

    override fun toString(): String {
        return "Users(image='$image')"
    }

}