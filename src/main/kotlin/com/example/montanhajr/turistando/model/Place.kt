package com.example.montanhajr.turistando.model

import lombok.Data
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Data
@Entity
data class Place (
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val idPlace: Long,
   val name: String,
   val country: String?,
   val imageUrl: String?,
   val latitude: String?,
   val longitude: String?
)