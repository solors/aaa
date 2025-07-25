package com.meevii.soniclib;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.beatles.unity.delegate.unity.DelegateActivity;
import com.unity3d.player.UnityPlayer;

/* loaded from: classes5.dex */
public class UnitySplashSDK {
    private static UnitySplashSDK mInstance;
    private ImageView bgView = null;
    public volatile boolean isShowing = false;
    private UnityPlayer mUnityPlayer = null;

    /* renamed from: com.meevii.soniclib.UnitySplashSDK$a */
    /* loaded from: classes5.dex */
    public class C23345a extends AnimatorListenerAdapter {
        C23345a() {
            UnitySplashSDK.this = r1;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            UnitySplashSDK.this.mUnityPlayer.removeView(UnitySplashSDK.this.bgView);
            UnitySplashSDK.this.bgView = null;
            Log.d("Unity Splash", "hideSplash Done");
        }
    }

    public static UnitySplashSDK getInstance() {
        if (mInstance == null) {
            synchronized (UnitySplashSDK.class) {
                if (mInstance == null) {
                    mInstance = new UnitySplashSDK();
                }
            }
        }
        return mInstance;
    }

    public static void hideSplash(int i) {
        getInstance().onHideSplash(i);
    }

    public /* synthetic */ void lambda$onHideSplash$0(int i) {
        try {
            ImageView imageView = this.bgView;
            if (imageView == null) {
                return;
            }
            imageView.animate().alpha(0.0f).setDuration(i).setListener(new C23345a()).start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void onCreate(Activity activity, Bundle bundle) {
        Log.e("UnitySplashSDK onCreate", activity.getComponentName().getClassName());
        this.mUnityPlayer = ((DelegateActivity) activity).getPlayer();
        onShowSplash(activity);
    }

    public void onHideSplash(final int i) {
        Log.d("UnitySplashSDK", "onHideSplash: ");
        this.isShowing = false;
        UnityPlayer.currentActivity.runOnUiThread(new Runnable() { // from class: com.meevii.soniclib.a
            {
                UnitySplashSDK.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                UnitySplashSDK.this.lambda$onHideSplash$0(i);
            }
        });
    }

    public void onShowSplash(Activity activity) {
        if (this.bgView != null) {
            return;
        }
        this.isShowing = true;
        try {
            ImageView imageView = new ImageView(UnityPlayer.currentActivity);
            this.bgView = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
            this.bgView.setBackgroundResource(C23336R.C23338drawable.launch_screen);
            this.mUnityPlayer.addView(this.bgView, layoutParams);
        } catch (Exception e) {
            Log.e("UnitySplashSDK", e.getMessage());
        }
    }
}
