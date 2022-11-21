package com.example.android.architecture.blueprints.todoapp.domain.usecase

import com.example.android.architecture.blueprints.todoapp.domain.entity.TaskEntity
import com.example.android.architecture.blueprints.todoapp.data.Result
import kotlinx.coroutines.flow.Flow

interface IGetTaskUseCase {

    fun getTaskStream(taskId: String): Flow<Result<TaskEntity>>
}
