package com.example.recyclebing

import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Body
import retrofit2.http.POST

data class QuestionRequest(
    val question: String
)

data class AnswerResponse(
    val answer: String?,
    val response: String?,
    val message: String?,
    val status: Int?
)

interface ApiService {
    @POST("ask") // Update with your actual API endpoint if different
    suspend fun askQuestion(@Body request: QuestionRequest): Response<AnswerResponse>

    companion object {
        private const val BASE_URL = "https://your-api-base-url.com/" // Update with your API base URL

        fun create(): ApiService {
            val retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
            return retrofit.create(ApiService::class.java)
        }
    }
}
