package com.example.doggodogshow

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

import androidx.lifecycle.viewModelScope


import kotlinx.coroutines.launch


class MainViewModel : ViewModel() {


        private val _currentlyDisplayedImage = MutableLiveData<DogImage>()
        val currentlyDisplayedImage : LiveData<DogImage> = _currentlyDisplayedImage

        init{

            getNewDog()
        }

        public fun getNewDog(){
            viewModelScope.launch {
                _currentlyDisplayedImage.value = DogImageApi.retrofitService.getRandomDogImage()
            }
        }

    }
