package `in`.redbus.android.kotlinExtensionFunctions


/**
 * Use as ternary Operator
 *
 * will check for condition else return null
 *
 * ex:-> text = review.isLike then R.string.liked ?: R.string.unliked
 *
 */
infix fun <T> Boolean.ternary(param : T): T? = if(this) param else null