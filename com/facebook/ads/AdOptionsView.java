package com.facebook.ads;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.api.AdComponentFrameLayout;
import com.facebook.ads.internal.api.AdOptionsViewApi;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.infer.annotation.Nullsafe;

@Keep
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: classes3.dex */
public class AdOptionsView extends AdComponentFrameLayout {
    private final AdOptionsViewApi mAdOptionsViewApi;

    @Keep
    /* loaded from: classes3.dex */
    public enum Orientation {
        HORIZONTAL,
        VERTICAL
    }

    public AdOptionsView(Context context, NativeAdBase nativeAdBase, @Nullable NativeAdLayout nativeAdLayout) {
        super(context);
        AdOptionsViewApi createAdOptionsView = DynamicLoaderFactory.makeLoader(context).createAdOptionsView(context, nativeAdBase, nativeAdLayout, this);
        this.mAdOptionsViewApi = createAdOptionsView;
        attachAdComponentViewApi(createAdOptionsView);
    }

    public void setIconColor(int i) {
        this.mAdOptionsViewApi.setIconColor(i);
    }

    public void setIconSizeDp(int i) {
        this.mAdOptionsViewApi.setIconSizeDp(i);
    }

    public void setSingleIcon(boolean z) {
        this.mAdOptionsViewApi.setSingleIcon(z);
    }

    public AdOptionsView(Context context, NativeAdBase nativeAdBase, @Nullable NativeAdLayout nativeAdLayout, Orientation orientation, int i) {
        super(context);
        AdOptionsViewApi createAdOptionsView = DynamicLoaderFactory.makeLoader(context).createAdOptionsView(context, nativeAdBase, nativeAdLayout, orientation, i, this);
        this.mAdOptionsViewApi = createAdOptionsView;
        attachAdComponentViewApi(createAdOptionsView);
    }
}
