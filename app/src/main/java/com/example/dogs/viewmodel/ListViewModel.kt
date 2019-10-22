package com.example.dogs.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.dogs.model.DogBreed

class ListViewModel: ViewModel() {
    val dogs = MutableLiveData<List<DogBreed>>()
    val dogsLoadError = MutableLiveData<Boolean>()
    val loading = MutableLiveData<Boolean>()

    fun refresh() {
        val dog1 = DogBreed(breedId = "1", dogBreed = "Corgi", lifeSpan = "15 years", breedGroup = "breedGroup", bredFor = "bredFor", temperament = "happy", imageUri = "")
        val dog2 = DogBreed(breedId = "2", dogBreed = "Labrador", lifeSpan = "20 years", breedGroup = "breedGroup", bredFor = "bredFor", temperament = "happy", imageUri = "")
        val dog3 = DogBreed(breedId = "3", dogBreed = "Rottweiler", lifeSpan = "25 years", breedGroup = "breedGroup", bredFor = "bredFor", temperament = "happy", imageUri = "")
        val dogList = arrayListOf<DogBreed>(dog1, dog2, dog3)

        dogs.value = dogList
        dogsLoadError.value = false
        loading.value = false
    }
}