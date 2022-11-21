package com.example.android.architecture.blueprints.todoapp.domain.usecase

import com.example.android.architecture.blueprints.todoapp.data.Result
import com.example.android.architecture.blueprints.todoapp.data.source.TasksRepository
import com.example.android.architecture.blueprints.todoapp.domain.entity.TaskEntity
import com.example.android.architecture.blueprints.todoapp.domain.mapper.TaskMapper
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject
import com.example.android.architecture.blueprints.todoapp.data.Result.Success as ResultSuccess

class GetTaskUseCase @Inject constructor(
    private val repository: TasksRepository,
    private val mapper: TaskMapper,
) : IGetTaskUseCase {

    override fun getTaskStream(taskId: String): Flow<Result<TaskEntity>> {
        return repository.getTaskStream(taskId).map {
            ResultSuccess(mapper.map((it as ResultSuccess).data))
        }
    }
}
