package com.nirajan.droid.movies.base

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import com.airbnb.mvrx.BaseMvRxActivity

abstract class BaseActivity : BaseMvRxActivity() {

    /** Call [AppCompatActivity.setContentView] with that [LayoutRes] id. */
    @LayoutRes protected abstract fun getLayoutId(): Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutId())
    }
}