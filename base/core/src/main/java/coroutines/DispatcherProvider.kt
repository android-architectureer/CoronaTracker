package coroutines

import kotlin.coroutines.CoroutineContext

interface DispatcherProvider {
    fun main(): CoroutineContext

    fun ui(): CoroutineContext

    fun io(): CoroutineContext

    fun default(): CoroutineContext

}