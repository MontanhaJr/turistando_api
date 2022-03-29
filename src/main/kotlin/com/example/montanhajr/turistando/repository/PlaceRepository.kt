package com.example.montanhajr.turistando.repository

import com.example.montanhajr.turistando.model.Place
import org.springframework.data.jpa.repository.JpaRepository

interface PlaceRepository : JpaRepository<Place, Long> {
}