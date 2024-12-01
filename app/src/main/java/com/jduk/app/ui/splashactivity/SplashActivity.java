package com.jduk.app.ui.splashactivity;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import com.jduk.app.R;
import com.jduk.app.databinding.ActivityMainBinding;
import com.jduk.app.databinding.ActivitySplashBinding;
import com.jduk.app.ui.mainactivity.MainActivity;
import com.jduk.app.ui.mainactivity.MainActivityViewModel;

public class SplashActivity extends AppCompatActivity {

    private Context context;
    private ActivitySplashBinding binding;


    private final static long SPLASH_TIME_OUT = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_splash);

        binding = DataBindingUtil.setContentView(
                this,
                R.layout.activity_splash
        );

        MainActivityViewModel viewModel = new ViewModelProvider(this)
                .get(MainActivityViewModel.class);

        ImageView imageView = findViewById(R.id.drumsticks);
        ObjectAnimator rotate = ObjectAnimator.ofFloat(imageView, "rotation", 360f, 0f);
        rotate.setRepeatCount(3);
        rotate.setStartDelay(1000);
        rotate.setDuration(1000);
        rotate.start();

        new Handler().postDelayed(() -> {

            commence(this);

            finish();

        }, SPLASH_TIME_OUT);



    }
    public void commence(Context context) {
        Intent intent = new Intent(context, MainActivity.class);
        startActivity(intent);
    }
}