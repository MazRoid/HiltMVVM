package com.mazroid.hilttest.util

import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.inputmethod.InputMethodManager
import androidx.appcompat.app.AppCompatActivity
import com.mazroid.hilttest.R

abstract class BaseActivity : AppCompatActivity() {

    val TAG: String = "AppDebug"

    var dialog: Dialog? = null

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
    }


    fun hideSoftKeyboard() {
        if (currentFocus != null) {
            val inputMethodManager = getSystemService(
                Context.INPUT_METHOD_SERVICE
            ) as InputMethodManager
            inputMethodManager
                .hideSoftInputFromWindow(currentFocus!!.windowToken, 0)
        }
    }

    fun showProgressDialog(context: Context) {

        dialog = Dialog(context)
        dialog?.setContentView(R.layout.progress_dialog)
        dialog?.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        dialog?.setCancelable(true)
        dialog?.setCanceledOnTouchOutside(false);

        dialog?.setOnCancelListener {
        }

        try {
            dialog.let {
                if (!dialog?.isShowing!!)
                    dialog?.show()
                else
                    dialog?.dismiss()
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }


    fun isProgressShowing(): Boolean {
        return dialog?.isShowing ?: false
    }

    fun cancelProgressDialog() {
        dialog?.dismiss()
    }

}











