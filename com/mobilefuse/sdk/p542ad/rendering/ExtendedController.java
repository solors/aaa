package com.mobilefuse.sdk.p542ad.rendering;

import android.app.Activity;
import android.view.View;
import com.mobilefuse.sdk.AdLifecycleEvent;
import com.mobilefuse.sdk.AdLifecycleEventListener;
import com.mobilefuse.sdk.ExtendedAdType;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.mobilefuse.sdk.ad.rendering.ExtendedController */
/* loaded from: classes7.dex */
public abstract class ExtendedController {
    protected Activity activity;
    private AdCloseListener adCloseListener;
    protected View adContent;
    protected AdLifecycleEventListener adLifecycleEventListener;
    protected int adWidth = -1;
    protected int adHeight = -1;

    /* renamed from: com.mobilefuse.sdk.ad.rendering.ExtendedController$AdCloseListener */
    /* loaded from: classes7.dex */
    public interface AdCloseListener {
        void onAdClosed() throws Throwable;
    }

    public void bindContent(View view, Activity activity) throws Throwable {
        this.adContent = view;
        this.activity = activity;
        bindContentImpl(view, activity);
    }

    protected abstract void bindContentImpl(View view, Activity activity) throws Throwable;

    public int getAdHeight() {
        return this.adHeight;
    }

    public AdLifecycleEventListener getAdLifecycleEventListener() {
        return this.adLifecycleEventListener;
    }

    public int getAdWidth() {
        return this.adWidth;
    }

    public abstract ExtendedAdType getExtendedAdType() throws Throwable;

    protected abstract void onAdCloseRequested() throws Throwable;

    protected void onAdLifecycleEvent(AdLifecycleEvent adLifecycleEvent) throws Throwable {
        onAdLifecycleEvent(adLifecycleEvent, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void onAdReadyToClose() throws Throwable {
        AdCloseListener adCloseListener = this.adCloseListener;
        if (adCloseListener != null) {
            adCloseListener.onAdClosed();
            this.adCloseListener = null;
        }
    }

    public final void requestAdClose(AdCloseListener adCloseListener) throws Throwable {
        this.adCloseListener = adCloseListener;
        onAdCloseRequested();
    }

    public void setAdHeight(int i) {
        this.adHeight = i;
    }

    public void setAdLifecycleEventListener(AdLifecycleEventListener adLifecycleEventListener) {
        this.adLifecycleEventListener = adLifecycleEventListener;
    }

    public void setAdWidth(int i) {
        this.adWidth = i;
    }

    public void setConfig(JSONObject jSONObject) throws Throwable {
        if (jSONObject.has("adWidth")) {
            this.adWidth = jSONObject.getInt("adWidth");
        }
        if (jSONObject.has("adHeight")) {
            this.adHeight = jSONObject.getInt("adHeight");
        }
    }

    public void unbindContent() throws Throwable {
        unbindContentImpl();
    }

    protected abstract void unbindContentImpl() throws Throwable;

    protected void onAdLifecycleEvent(AdLifecycleEvent adLifecycleEvent, Map<String, String> map) throws Throwable {
        ExtendedAdType extendedAdType = getExtendedAdType();
        AdLifecycleEventListener adLifecycleEventListener = this.adLifecycleEventListener;
        if (adLifecycleEventListener != null) {
            adLifecycleEventListener.onAdLifecycleEvent(adLifecycleEvent, extendedAdType, map);
        }
    }

    public void invalidateLayout() throws Throwable {
    }

    public void onAdmLoaded() throws Throwable {
    }
}
