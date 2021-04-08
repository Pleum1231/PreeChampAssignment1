package com.example.pchampassignment1

import android.app.AlertDialog
import android.view.LayoutInflater

class LoadingDialog (var activity: MainActivity){
    private var dialog: AlertDialog? = null
    fun startLoadingDialog(){
        var builder = AlertDialog.Builder(activity)
        var inflater : LayoutInflater = activity.layoutInflater
        builder.setView(inflater.inflate(R.layout.loading_dialog,null))
        builder.setCancelable(false)
        dialog  = builder.create()
        dialog?.show()
    }

    fun dismissDialog(){
        dialog!!.dismiss()
    }
}