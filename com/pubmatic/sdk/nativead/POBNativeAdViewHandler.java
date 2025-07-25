package com.pubmatic.sdk.nativead;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes7.dex */
public class POBNativeAdViewHandler implements View.OnClickListener {
    @Nullable

    /* renamed from: a */
    private View f70443a;
    @Nullable

    /* renamed from: b */
    private POBNativeAdViewListener f70444b;

    /* renamed from: c */
    private boolean f70445c = false;

    public void onAdViewAttachedToWindow() {
        POBNativeAdViewListener pOBNativeAdViewListener;
        if (!this.f70445c && (pOBNativeAdViewListener = this.f70444b) != null) {
            this.f70445c = true;
            View view = this.f70443a;
            if (view != null) {
                pOBNativeAdViewListener.onRecordImpression(view);
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@NonNull View view) {
        if (this.f70444b != null && this.f70443a != null) {
            Object tag = view.getTag();
            if (tag instanceof Integer) {
                this.f70444b.onAssetClicked(this.f70443a, ((Integer) view.getTag()).intValue());
            } else if (tag instanceof String) {
                this.f70444b.onNonAssetClicked(this.f70443a, (String) view.getTag());
            } else {
                this.f70444b.onRecordClick(this.f70443a);
            }
        }
    }

    public void setAdView(@Nullable View view) {
        this.f70443a = view;
    }

    public void setListener(@Nullable POBNativeAdViewListener pOBNativeAdViewListener) {
        this.f70444b = pOBNativeAdViewListener;
    }
}
