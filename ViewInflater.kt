package `in`.redbus.android.kotlinExtensionFunctions

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by ankitaman on 24/01/18.
 */
fun ViewGroup.inflate(layoutRes: Int): View {
    return LayoutInflater.from(context).inflate(layoutRes, this, false)
}