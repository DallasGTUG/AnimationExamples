package com.verizon.devworkshop.AndroidAnimation;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class AnimationActivity extends Activity {
	
	private Button mAlphaButton;
	private Button mRotateButton;
	private Button mScaleButton;
	private Button mTranslateButton;
	private Button mFireballButton;
		
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.main);
        
        setContentView(R.layout.main);
        
        mAlphaButton = (Button) findViewById(R.id.button_alpha);
        mAlphaButton.setOnClickListener(mOnAlphaApply);
        
        mRotateButton = (Button) findViewById(R.id.button_rotate);
        mRotateButton.setOnClickListener(mOnRotateClick);
        
        mScaleButton = (Button) findViewById(R.id.button_scale);
        mScaleButton.setOnClickListener(mOnScaleClick);
        
        mTranslateButton = (Button) findViewById(R.id.button_slide);
        mTranslateButton.setOnClickListener(mOnTranslateClick);
        
        mFireballButton = (Button) findViewById(R.id.button_fire_ball);
        mFireballButton.setOnClickListener(mOnFireBallClick);
        
    }
    
    public static Animation runFadeOutAnimationOn(Activity ctx, View target)
    {
    	  //Animation animation = AnimationUtils.loadAnimation(ctx, R.anim.fade_in); //fade_out
    	 Animation animation = AnimationUtils.loadAnimation(ctx, R.anim.rotate);
    	  target.startAnimation(animation);
    	  return animation;
    }
    
    /**
	 * Click event handler for Rotate button..
	 */
	public OnClickListener mOnAlphaApply = new OnClickListener()
	{

		public void onClick(View v) {
			//runFadeOutAnimationOn(AnimationActivity.this, animationLabel);
			
			Intent alphaIntent = new Intent(AnimationActivity.this, AlphaAnimationActivity.class);
			AnimationActivity.this.startActivity(alphaIntent);

		}
		
	};
	
	 /**
	 * Click event handler for Rotate button.
	 */
	public OnClickListener mOnRotateClick = new OnClickListener()
	{

		public void onClick(View v) {
			Intent rotateIntent = new Intent(AnimationActivity.this, RotateAnimationActivity.class);
			AnimationActivity.this.startActivity(rotateIntent);
		}
		
	};
	
	/**
	 * Click event handler for Scale button.
	 */
	public OnClickListener mOnScaleClick = new OnClickListener()
	{

		public void onClick(View v) {
			Intent scaleIntent = new Intent(AnimationActivity.this, ScaleAnimationActivity.class);
			AnimationActivity.this.startActivity(scaleIntent);
		}
		
	};
	
	/**
	 * Click event handler for Translate button.
	 */
	public OnClickListener mOnTranslateClick = new OnClickListener()
	{

		public void onClick(View v) {
			Intent scaleIntent = new Intent(AnimationActivity.this, TranslateAnimationActivity.class);
			AnimationActivity.this.startActivity(scaleIntent);
		}
		
	};
	
	/**
	 * Click event handler for Translate button.
	 */
	public OnClickListener mOnFireBallClick = new OnClickListener()
	{

		public void onClick(View v) {
			Intent fireballIntent = new Intent(AnimationActivity.this, FireBallAnimationActivity.class);
			AnimationActivity.this.startActivity(fireballIntent);
		}
		
	};
}