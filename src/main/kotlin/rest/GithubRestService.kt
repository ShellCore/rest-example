package rest

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface GithubRestService {

    @GET("users/{user}")
    fun getBasicUserInfo(@Path("user") user : String) : Call<GitHubUserWrapper>

    @GET("users/{user}/repos")
    fun getUserRepositories(@Path("user") user : String) : Call<GitHubRepositoryInfo>

    @GET("users/{user}/followers")
    fun getUserFollowers(@Path("user") user: String) : Call<List<GitHubFollowerInfo>>
}