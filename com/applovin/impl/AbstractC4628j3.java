package com.applovin.impl;

import android.content.Context;
import android.view.MotionEvent;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import com.applovin.impl.adview.AppLovinWebViewBase;
import com.applovin.impl.sdk.C5434n;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.applovin.impl.j3 */
/* loaded from: classes2.dex */
public abstract class AbstractC4628j3 extends AppLovinWebViewBase {

    /* renamed from: b */
    private static Boolean f7043b;

    /* renamed from: a */
    private final AtomicReference f7044a;

    public AbstractC4628j3(Context context) {
        super(context);
        this.f7044a = new AtomicReference();
        if (f7043b == null) {
            try {
                WebView.class.getDeclaredMethod("onTouchEvent", MotionEvent.class);
                f7043b = Boolean.TRUE;
            } catch (NoSuchMethodException unused) {
                C5434n.m94898h("AppLovinSdk", "WebView.onTouchEvent() not implemented");
                f7043b = Boolean.FALSE;
            }
        }
    }

    /* renamed from: a */
    public boolean m98319a() {
        if (this.f7044a.get() != null) {
            return true;
        }
        return false;
    }

    @Nullable
    public MotionEvent getAndClearLastClickEvent() {
        return (MotionEvent) this.f7044a.getAndSet(null);
    }

    @Nullable
    public MotionEvent getLastClickEvent() {
        return (MotionEvent) this.f7044a.get();
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f7044a.set(MotionEvent.obtain(motionEvent));
        if (f7043b.booleanValue()) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }
}
