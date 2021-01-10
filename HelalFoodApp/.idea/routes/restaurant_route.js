const express = require('express');
const router = express.Router(); //damit ich anfragen wie GET POST bearbeiten kann, router funktion um GET POST anfragen abzufangen
const mongoose = require('mongoose'); //importieren für client
const restaurantController = require('./restaurant_controller');
const Restaurant = require('../../models/restaurant');

// POST request, dafür da um neue restaurant zu speichern
router.post('/', restaurantController.createRestaurant);

// GET all restaurants, Liste von allen Restaurants zurückgeben
//req Request = Anfrage, res Response = Antwort
router.get('/', restaurantController.getAllRestaurantsOrFilterRestaurantsByNameOrAddress);

// GET ID From Restaurants, damit ich exaktes restaurant finden kann
router.get('/:id', restaurantController.getRestaurantById);

// PUT request
// nur den namen des Restaurants updaten
router.put('/:id/name', restaurantController.updateRestaurantNameById);

// PUT request
// nur die Adresse des Restaurants updaten
router.put('/:id/address', restaurantController.updateRestaurantAddressById);


// DELETE Request
router.delete('/:id', restaurantController.deleteRestaurantById);


module.exports = router;