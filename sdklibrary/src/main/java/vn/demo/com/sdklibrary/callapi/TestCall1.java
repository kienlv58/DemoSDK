package vn.demo.com.sdklibrary.callapi;

import android.util.Log;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import vn.demo.com.sdklibrary.ApiUtils;
import vn.demo.com.sdklibrary.model.TestModel;

/**
 * Created by kien.lovan on 11/20/2017.
 */

public class TestCall1 {
    public static String TAG = "TEST_API";

    public static void call1() {

        Call<TestModel> mCall = ApiUtils.getAPIService().savePost("my title", "my body", 1);
        mCall.enqueue(new Callback<TestModel>() {
            @Override
            public void onResponse(Call<TestModel> call, Response<TestModel> response) {
                if (response.isSuccessful()) {
                    Log.i(TAG, "post submitted to API." + response.body().toString());
                }
            }

            @Override
            public void onFailure(Call<TestModel> call, Throwable t) {

            }
        });
    }
}
