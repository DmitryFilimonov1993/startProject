package com.example.testkotlin

class UserRole(var role: String) {

    fun initList():List<UserRole>{
        val items = listOf(
            UserRole("Admin"),
            UserRole("Manager"),
            UserRole("Developer"),
            UserRole("Developer"),
            UserRole("Dima"),
            UserRole("Ilya"),
            UserRole("Maxim"),
            UserRole("Natalya"),
            UserRole("Tany"),
            UserRole("Arnold"),
            UserRole("dave"),
            UserRole("Trata"),
            UserRole("Cran"),
            UserRole("Cfa"),
            UserRole("Andrey"),
            UserRole("Stepan"),
            UserRole("Petr"))
        return items
    }
}