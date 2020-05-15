package com.ferdyhaspin.myfirstunittesting

/**
 * Created by ferdyhaspin  on 10/05/20.
 * Copyright (c) 2020 My Fisrt Unit Testing All rights reserved.
 */
class MainViewModel(
    private val cuboidModel: CuboidModel
) {

    fun getCircumference(): Double = cuboidModel.getCircumference()

    fun getSurfaceArea(): Double = cuboidModel.getSurfaceArea()

    fun getVolume(): Double = cuboidModel.getVolume()

    fun save(l: Double, w: Double, h: Double) {
        cuboidModel.save(l, w, h)
    }
}