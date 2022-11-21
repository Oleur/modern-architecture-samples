package com.example.android.architecture.blueprints.todoapp.di

import com.example.android.architecture.blueprints.todoapp.data.source.DefaultTasksRepository
import com.example.android.architecture.blueprints.todoapp.data.source.TasksDataSource
import com.example.android.architecture.blueprints.todoapp.data.source.TasksRepository
import com.example.android.architecture.blueprints.todoapp.domain.mapper.TaskMapper
import com.example.android.architecture.blueprints.todoapp.domain.usecase.GetTaskUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.CoroutineDispatcher
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DomainModule {

    @Singleton
    @Provides
    fun mapper(): TaskMapper = TaskMapper()

    @Singleton
    @Provides
    fun getTaskUseCase(
        mapper: TaskMapper,
        repository: TasksRepository
    ): GetTaskUseCase = GetTaskUseCase(repository, mapper)
}
