package modules.module

import dagger.Module
import dagger.Provides
import error.ErrorFactory
import kotlinx.coroutines.Deferred
import modules.adapter.CallAdapter
import modules.adapter.ApiCallAdapter
import modules.api.ApiResponse
import javax.inject.Singleton

@Module(includes = [ApiModule::class])
class CoreDataModule {
    @Singleton
    @Provides
    fun provideApiCallAdapter(errorFactory: ErrorFactory): CallAdapter<Deferred<ApiResponse<out Any?>>> =
        ApiCallAdapter(errorFactory)
}