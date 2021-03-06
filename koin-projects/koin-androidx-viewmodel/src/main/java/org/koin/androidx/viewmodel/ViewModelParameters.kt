package org.koin.androidx.viewmodel

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.ViewModelStoreOwner
import org.koin.core.parameter.ParametersDefinition
import org.koin.core.qualifier.Qualifier
import org.koin.core.scope.Scope
import kotlin.reflect.KClass

class ViewModelParameters<T : Any>(
        val clazz: KClass<T>,
        val owner: LifecycleOwner,
        val scope: Scope = Scope.GLOBAL,
        val qualifier: Qualifier? = null,
        val from: ViewModelStoreOwnerDefinition? = null,
        val parameters: ParametersDefinition? = null
)

typealias ViewModelStoreOwnerDefinition = () -> ViewModelStoreOwner