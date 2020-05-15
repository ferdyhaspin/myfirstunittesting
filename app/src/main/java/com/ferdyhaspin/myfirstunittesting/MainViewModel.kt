package com.ferdyhaspin.myfirstunittesting

/**
 * Created by ferdyhaspin & ilhamelmujib on 10/05/20.
 * Copyright (c) 2020 Bank Syariah Mandiri - Super Apps All rights reserved.
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