package `in`.redbus.android.kotlinExtensionFunctions

/**
 * Created by ankitaman on 14/02/18.
 */


/**
 * Use as ternary Operator
 *
 * will check for condition else return null
 *
 * ex:-> text = review.isLike then R.string.liked ?: R.string.unliked
 *
 */
infix fun <T> Boolean.ternary(param : T): T? = if(this) param else null