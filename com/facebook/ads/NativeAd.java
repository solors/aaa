package com.facebook.ads;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import com.facebook.ads.internal.api.NativeAdApi;
import com.facebook.ads.internal.api.NativeAdBaseApi;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.ads.internal.util.common.Preconditions;
import com.facebook.infer.annotation.Nullsafe;
import java.util.List;

@Keep
@UiThread
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: classes3.dex */
public class NativeAd extends NativeAdBase {
    private NativeAdApi mNativeAdApi;

    @Keep
    /* loaded from: classes3.dex */
    public enum AdCreativeType {
        IMAGE,
        VIDEO,
        CAROUSEL,
        UNKNOWN
    }

    public NativeAd(Context context, String str) {
        super(context, str);
        this.mNativeAdApi = DynamicLoaderFactory.makeLoader(context).createNativeAdApi(this, this.mNativeAdBaseApi);
    }

    public AdCreativeType getAdCreativeType() {
        return this.mNativeAdApi.getAdCreativeType();
    }

    public NativeAdApi getNativeAdApi() {
        return this.mNativeAdApi;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    public VideoAutoplayBehavior getVideoAutoplayBehavior() {
        return this.mNativeAdApi.getVideoAutoplayBehavior();
    }

    public void registerViewForInteraction(View view, MediaView mediaView) {
        Preconditions.checkIsOnMainThread();
        this.mNativeAdApi.registerViewForInteraction(view, mediaView);
    }

    public NativeAd(Context context, NativeAdBaseApi nativeAdBaseApi) {
        super(nativeAdBaseApi);
        this.mNativeAdApi = DynamicLoaderFactory.makeLoader(context).createNativeAdApi(this, this.mNativeAdBaseApi);
    }

    public void registerViewForInteraction(View view, MediaView mediaView, @Nullable MediaView mediaView2) {
        Preconditions.checkIsOnMainThread();
        this.mNativeAdApi.registerViewForInteraction(view, mediaView, mediaView2);
    }

    public NativeAd(Context context, NativeAdBase nativeAdBase) {
        super(context, nativeAdBase);
        this.mNativeAdApi = DynamicLoaderFactory.makeLoader(context).createNativeAdApi(nativeAdBase, this, this.mNativeAdBaseApi);
    }

    public void registerViewForInteraction(View view, MediaView mediaView, @Nullable List<View> list) {
        Preconditions.checkIsOnMainThread();
        this.mNativeAdApi.registerViewForInteraction(view, mediaView, list);
    }

    public void registerViewForInteraction(View view, MediaView mediaView, @Nullable MediaView mediaView2, @Nullable List<View> list) {
        Preconditions.checkIsOnMainThread();
        this.mNativeAdApi.registerViewForInteraction(view, mediaView, mediaView2, list);
    }

    public void registerViewForInteraction(View view, MediaView mediaView, @Nullable ImageView imageView) {
        Preconditions.checkIsOnMainThread();
        this.mNativeAdApi.registerViewForInteraction(view, mediaView, imageView);
    }

    public void registerViewForInteraction(View view, MediaView mediaView, @Nullable ImageView imageView, @Nullable List<View> list) {
        Preconditions.checkIsOnMainThread();
        this.mNativeAdApi.registerViewForInteraction(view, mediaView, imageView, list);
    }
}
