package edu.umd.hcil.cmsc434viewanimationball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.BounceInterpolator;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = (ImageView) findViewById(R.id.imageViewBall);
        Animation ballAnimation = AnimationUtils.loadAnimation(this, R.anim.ball_animation);

        // https://developer.android.com/reference/android/view/animation/Interpolator.html
        // ballAnimation.setInterpolator(new BounceInterpolator());
        imageView.startAnimation(ballAnimation);
    }
}
