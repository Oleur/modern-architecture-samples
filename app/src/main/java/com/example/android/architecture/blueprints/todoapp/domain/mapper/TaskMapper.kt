package com.example.android.architecture.blueprints.todoapp.domain.mapper

import com.example.android.architecture.blueprints.todoapp.data.Task
import com.example.android.architecture.blueprints.todoapp.domain.entity.TaskEntity
import javax.inject.Inject

class TaskMapper @Inject constructor() {

    fun map(task: Task): TaskEntity {
        return TaskEntity(
            id = task.id,
            title = task.title,
            desc = task.description,
            isCompleted = task.isCompleted
        )
    }
}
