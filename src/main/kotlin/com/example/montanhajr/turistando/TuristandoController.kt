package com.example.montanhajr.turistando

import com.example.montanhajr.turistando.model.Place
import com.example.montanhajr.turistando.repository.PlaceRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/v1")
class TuristandoController {

    @Autowired
    lateinit var placeRepository: PlaceRepository

    @GetMapping("/places")
    private fun getPlaces() : String {
        return "Show"
    }

    @PostMapping("newPlace")
    private fun addPlace(@RequestBody place: Place) : String {
        placeRepository.save(place)
        return "${place.country}"
    }
}