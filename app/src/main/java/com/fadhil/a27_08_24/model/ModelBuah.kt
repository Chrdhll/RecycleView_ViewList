package com.fadhil.a27_08_24.model

import android.hardware.biometrics.BiometricManager.Strings
import com.fadhil.a27_08_24.R

class ModelBuah (
    val image : Int, val nama : String
)

//kita bikin array data

object Mocklist{

    fun getModel() : List<ModelBuah> {
        val itemModel1 = ModelBuah(
            R.drawable.apple,
            nama = "Apple"
        )
        val itemModel2 = ModelBuah(
            R.drawable.grapes,
            nama = "Anggur"
        )
        val itemModel3 = ModelBuah(
            R.drawable.orange,
            nama = "Jeruk"
        )
        val itemModel4 = ModelBuah(
            R.drawable.pear,
            nama = "Pear"
        )
        val itemModel5 = ModelBuah(
            R.drawable.strawberry,
            nama = "Strawberry"
        )

        val itemList : ArrayList<ModelBuah> = ArrayList()
        itemList.add(itemModel1)
        itemList.add(itemModel2)
        itemList.add(itemModel3)
        itemList.add(itemModel4)
        itemList.add(itemModel5)

        return itemList
    }
}
