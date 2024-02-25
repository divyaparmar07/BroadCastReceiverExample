package com.example.broadcastreceiverexample

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast

class BroadCastExample : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        val isAirplaneMode : Boolean = intent!!.getBooleanExtra("state",false)
//        Toast.makeText(context,"The device is in airplane mode.",Toast.LENGTH_LONG).show()
        if (isAirplaneMode)
        {
//            Toast.makeText(context,"The device is in airplane mode.",Toast.LENGTH_LONG).show()
            Log.d("receiver","The device is in airplane mode.")
        }
        else
        {
//            Toast.makeText(context,"The device is not in airplane mode.",Toast.LENGTH_LONG).show()
            Log.d("receiver","The device is not in airplane mode.")
        }
    }
}