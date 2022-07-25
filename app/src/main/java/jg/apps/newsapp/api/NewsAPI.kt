package jg.apps.newsapp.api

import jg.apps.newsapp.models.NewsResponse
import jg.apps.newsapp.util.Constants
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsAPI {

    @GET("v2/top-headlines")
    fun getBreakingNews(
        @Query("country")
        countryCode: String = "mx",
        @Query("page")
        pageNumber: Int = 1,
        @Query("apiKey")
        apiKey: String = Constants.API_KEY

    ): Call<NewsResponse>

    @GET("v2/everything")
    fun searchForNews(
        @Query("q")
        searchQuery: String,
        @Query("page")
        pageNumber: Int = 1,
        @Query("apiKey")
        apiKey: String = Constants.API_KEY

    ): Call<NewsResponse>
}