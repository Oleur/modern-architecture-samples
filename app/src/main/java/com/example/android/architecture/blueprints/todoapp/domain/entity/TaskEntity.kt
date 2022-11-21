package com.example.android.architecture.blueprints.todoapp.domain.entity

data class TaskEntity(
    val id: String,
    val title: String,
    val desc: String,
    val isCompleted: Boolean = false,
)
