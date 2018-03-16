package `in`.redbus.android.kotlinExtensionFunctions

import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable

/**
 * Created by ankitaman on 25/01/18.
 */
fun Disposable.addToCompositeDisposable(composite: CompositeDisposable) {
    composite.add(this)
}