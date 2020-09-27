package com.example.sagar.models.models

import lombok.Data
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id


@Data
@Entity
class BookModels {
    @Id
    @GeneratedValue
    private val bookid: Int? = null
    private val name: String? = null
    private val author: String? = null

}