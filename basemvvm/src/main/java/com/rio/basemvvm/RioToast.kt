package com.rio.basemvvm

import android.content.Context
import android.widget.Toast

class RioToast {

    companion object{
        fun ShowToast(context: Context,messsage:String){
            Toast.makeText(context,messsage,Toast.LENGTH_LONG).show()
        }
    }
}