package com.plcoding.stockmarketapp.data.remote

import okhttp3.ResponseBody
import retrofit2.http.GET
import retrofit2.http.Query

interface StockApi {


    @GET("query?function=LISTING_STATUS")
    suspend fun getListing(
        @Query("apikey") apiKey: String
    ): ResponseBody

    companion object {
        const val API_KEY = "MS0US4W6EWP25C9R"
        const val BASE_URL = "https://alphavantage.co"
    }
}