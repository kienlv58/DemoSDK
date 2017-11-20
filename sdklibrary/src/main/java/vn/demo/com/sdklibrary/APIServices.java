package vn.demo.com.sdklibrary;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import vn.demo.com.sdklibrary.model.TestModel;

/**
 * Created by kien.lovan on 11/20/2017.
 */

public interface APIServices {
    @POST("/posts")
    @FormUrlEncoded
    Call<TestModel> savePost(@Field("title") String title,
                             @Field("body") String body,
                             @Field("userId") long userId);
}
