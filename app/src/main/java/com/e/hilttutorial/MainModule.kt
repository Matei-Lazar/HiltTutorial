package com.e.hilttutorial

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(ActivityComponent::class)
object MainModule {

    @ActivityScoped // a singleton for when we use ActivityComponent
    @Provides
    @Named("string2")
    fun provideTestString2(@ApplicationContext context: Context) = context.getString(R.string.string_to_inject) // when we need a dependency and we need a context for that we use that @

    @ActivityScoped // a singleton for when we use ActivityComponent
    @Provides
    @Named("string3")
    fun provideTestString3(
        @ApplicationContext context: Context,
    @Named("string1") testString1: String
        ) = "${context.getString(R.string.string_to_inject)} - $testString1"
}