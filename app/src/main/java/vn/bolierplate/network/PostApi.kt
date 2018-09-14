package vn.bolierplate.network

import android.arch.lifecycle.LiveData
import vn.bolierplate.db.entities.Post
import io.reactivex.Observable
import retrofit2.http.GET
import vn.bolierplate.core.api.ApiResponse
import vn.bolierplate.core.api.Resource

/**
 * The interface which provides methods to get result of webservices
 */
interface PostApi {
    /**
     * Get the list of the pots from the API
     */
    @GET("/bins/chc9c")
    fun getPosts(): LiveData<ApiResponse<Resource<List<Post>>>>
}