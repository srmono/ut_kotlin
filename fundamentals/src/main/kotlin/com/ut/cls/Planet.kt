package com.ut.cls

class Planet(val name: String, val diameter: Int){
    init {
       println("We have been creating plant with name: $name")
    }

    private  val radius: Int = diameter/2;

    constructor(name: String, diameter: Int, ga: Boolean): this(name, diameter)
    constructor(name: String, diameter: Int, ga: Boolean, hasLife: Boolean): this(name, diameter)
}