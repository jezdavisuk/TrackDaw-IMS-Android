package com.northcoders.jv_android_retrofit_mvvm_2.service;

import retrofit2.Retrofit;

public class RetrofitInstance {

    private static Retrofit retrofit = null;

    private final static String BASE_URL = "http://10.0.2.2:8080/api/v1/";
}
