package vn.edu.taipp.projectfinalexam.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface ApiService {


    Gson gson = new GsonBuilder()
            .setDateFormat("yyyy-MM-dd HH:mm:ss")
            .create();

    ApiService apiService = new Retrofit.Builder()
            .baseUrl("https://quanlyduan-production.up.railway.app/api/")
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()
            .create(ApiService.class);
    @GET("{endpoint}")
    Call<ResponseBody> get(@Path(value = "endpoint", encoded = true) String endpoint);

    // 2. SHOW request (cụ thể một đối tượng)
    @GET("{endpoint}/{id}")
    Call<ResponseBody> show(@Path(value = "endpoint", encoded = true) String endpoint,
                            @Path("id") String id);

    // 3. POST request
    @POST("{endpoint}")
    Call<ResponseBody> post(@Path(value = "endpoint", encoded = true) String endpoint,
                            @Body RequestBody data);

    // 4. PUT request
    @PUT("{endpoint}")
    Call<ResponseBody> put(@Path(value = "endpoint", encoded = true) String endpoint,
                           @Body RequestBody data);

    // 5. DELETE request
    @DELETE("{endpoint}/{id}")
    Call<ResponseBody> delete(@Path(value = "endpoint", encoded = true) String endpoint,
                              @Path("id") String id);

}
