package com.queensuber.hackherstarterapp.api

import com.queensuber.hackherstarterapp.data.NewsResponse
import retrofit2.Response
import retrofit2.http.GET

interface NewsService {

    @GET("top-headlines")
    suspend fun getTopHeadlines(): Response<NewsResponse>
}

