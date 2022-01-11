package com.beka.newbegining.models

class Horadaptersmodel {
var image=0
    var name=""

    constructor(image: Int, name: String) {
        this.image = image
        this.name = name
    }

    override fun toString(): String {
        return "hor_adapters_model(image=$image, name='$name')"
    }

}