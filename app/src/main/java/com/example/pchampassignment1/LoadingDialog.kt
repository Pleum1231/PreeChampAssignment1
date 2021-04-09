package com.example.pchampassignment1

import android.app.AlertDialog
import android.view.LayoutInflater
import android.view.View

class LoadingDialog (val activity: MainActivity) {
    private var dialog: AlertDialog? = null

    fun startLoadingDialog() {
        val builder = AlertDialog.Builder(activity)
        val inflater : LayoutInflater = activity.layoutInflater
        builder.setView(inflater.inflate(R.layout.loading_dialog,null))
        builder.setCancelable(false)
        dialog = builder.create()
        dialog?.show()
    }

    fun dismissDialog() {
        dialog!!.dismiss()
    }
}