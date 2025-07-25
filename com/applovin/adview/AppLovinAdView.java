package com.applovin.adview;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.applovin.impl.adview.C4005a;
import com.applovin.impl.sdk.C5434n;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinSdk;

/* loaded from: classes2.dex */
public class AppLovinAdView extends RelativeLayout {
    public static final String NAMESPACE = "http://schemas.applovin.com/android/1.0";

    /* renamed from: a */
    private C4005a f4113a;

    public AppLovinAdView(AppLovinAdSize appLovinAdSize, Context context) {
        this(appLovinAdSize, (String) null, context);
    }

    /* renamed from: a */
    private void m101299a(AppLovinAdSize appLovinAdSize, String str, AppLovinSdk appLovinSdk, Context context, AttributeSet attributeSet) {
        if (!isInEditMode()) {
            C4005a c4005a = new C4005a();
            this.f4113a = c4005a;
            c4005a.m100969a(this, context, appLovinAdSize, str, appLovinSdk, attributeSet);
            return;
        }
        m101300a(attributeSet, context);
    }

    public void destroy() {
        C4005a c4005a = this.f4113a;
        if (c4005a != null) {
            c4005a.m100951b();
        }
    }

    public C4005a getController() {
        return this.f4113a;
    }

    public AppLovinAdSize getSize() {
        C4005a c4005a = this.f4113a;
        if (c4005a != null) {
            return c4005a.m100918m();
        }
        return null;
    }

    public String getZoneId() {
        C4005a c4005a = this.f4113a;
        if (c4005a != null) {
            return c4005a.m100916n();
        }
        return null;
    }

    public void loadNextAd() {
        C4005a c4005a = this.f4113a;
        if (c4005a != null) {
            c4005a.m100900v();
        } else {
            C5434n.m94897i("AppLovinSdk", "Unable to load next ad: AppLovinAdView is not initialized.");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C4005a c4005a = this.f4113a;
        if (c4005a != null) {
            c4005a.m100984B();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        C4005a c4005a = this.f4113a;
        if (c4005a != null) {
            c4005a.m100983C();
        }
        super.onDetachedFromWindow();
    }

    public void pause() {
        C4005a c4005a = this.f4113a;
        if (c4005a != null) {
            c4005a.m100980F();
        }
    }

    public void renderAd(AppLovinAd appLovinAd) {
        C4005a c4005a = this.f4113a;
        if (c4005a != null) {
            c4005a.m100940c(appLovinAd);
        }
    }

    public void resume() {
        C4005a c4005a = this.f4113a;
        if (c4005a != null) {
            c4005a.m100978H();
        }
    }

    public void setAdClickListener(AppLovinAdClickListener appLovinAdClickListener) {
        C4005a c4005a = this.f4113a;
        if (c4005a != null) {
            c4005a.m100958a(appLovinAdClickListener);
        }
    }

    public void setAdDisplayListener(AppLovinAdDisplayListener appLovinAdDisplayListener) {
        C4005a c4005a = this.f4113a;
        if (c4005a != null) {
            c4005a.m100957a(appLovinAdDisplayListener);
        }
    }

    public void setAdLoadListener(AppLovinAdLoadListener appLovinAdLoadListener) {
        C4005a c4005a = this.f4113a;
        if (c4005a != null) {
            c4005a.m100956a(appLovinAdLoadListener);
        }
    }

    public void setAdViewEventListener(AppLovinAdViewEventListener appLovinAdViewEventListener) {
        C4005a c4005a = this.f4113a;
        if (c4005a != null) {
            c4005a.m100967a(appLovinAdViewEventListener);
        }
    }

    public void setExtraInfo(@NonNull String str, @Nullable Object obj) {
        if (str != null) {
            C4005a c4005a = this.f4113a;
            if (c4005a != null) {
                c4005a.m100953a(str, obj);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("No key specified");
    }

    @Override // android.view.View
    public String toString() {
        return "AppLovinAdView{zoneId='" + getZoneId() + "\", size=" + getSize() + '}';
    }

    public AppLovinAdView(AppLovinAdSize appLovinAdSize, String str, Context context) {
        super(context);
        m101299a(appLovinAdSize, str, null, context, null);
    }

    public AppLovinAdView(AppLovinSdk appLovinSdk, AppLovinAdSize appLovinAdSize, Context context) {
        this(appLovinSdk, appLovinAdSize, null, context);
    }

    public AppLovinAdView(AppLovinSdk appLovinSdk, AppLovinAdSize appLovinAdSize, String str, Context context) {
        super(context.getApplicationContext());
        m101299a(appLovinAdSize, str, appLovinSdk, context, null);
    }

    /* renamed from: a */
    private void m101300a(AttributeSet attributeSet, Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        TextView textView = new TextView(context);
        textView.setBackgroundColor(Color.rgb(220, 220, 220));
        textView.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        textView.setText("AppLovin Ad");
        textView.setGravity(17);
        addView(textView, displayMetrics.widthPixels, (int) TypedValue.applyDimension(1, 50.0f, displayMetrics));
    }

    public AppLovinAdView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AppLovinAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m101299a(null, null, null, context, attributeSet);
    }
}
