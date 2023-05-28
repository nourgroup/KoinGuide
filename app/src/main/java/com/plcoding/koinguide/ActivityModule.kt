package com.plcoding.koinguide

import org.koin.core.qualifier.named
import org.koin.dsl.module
import org.koin.dsl.scoped

val activityModule = module {
    scope<MainActivity> {
        scoped(qualifier = named("hello")) { "Hello" }
        scoped(qualifier = named("bye")) { "Bye" }
    }
}