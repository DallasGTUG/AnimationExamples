package com.verizon.devworkshop.AndroidAnimation;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class TranslateAnimationActivity extends Activity{
	private Button mApplyButton;
	private TextView animationLabel;
	private ImageView animationImage;
	
	 /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.main);
        
        setContentView(R.layout.layout_translate);
        
        animationLabel = (TextView) findViewById(R.id.animText);
        animationImage = (ImageView) findViewById(R.id.animImage);
        mApplyButton = (Button) findViewById(R.id.apply);
        mApplyButton.setOnClickListener(mOnApply);
        
    }
    
    public static Animation runAnimation(Activity ctx, View target)
    {
    	  //Animation animation = AnimationUtils.loadAnimation(ctx, R.anim.fade_in); //fade_out
    	 Animation animation = AnimationUtils.loadAnimation(ctx, R.anim.slide_right);
    	  target.startAnimation(animation);
    	  return animation;
    }
    
    /**
	 * Click event handler for apply button.
	 */
	public OnClickListener mOnApply = new OnClickListener()
	{

		public void onClick(View v) {
			runAnimation(TranslateAnimationActivity.this,  animationImage);
		}
		
	};
}
