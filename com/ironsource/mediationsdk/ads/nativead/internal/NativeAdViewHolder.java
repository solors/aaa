package com.ironsource.mediationsdk.ads.nativead.internal;

import android.view.View;
import com.ironsource.mediationsdk.ads.nativead.LevelPlayMediaView;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes6.dex */
public final class NativeAdViewHolder {
    @Nullable

    /* renamed from: a */
    private View f51290a;
    @Nullable

    /* renamed from: b */
    private View f51291b;
    @Nullable

    /* renamed from: c */
    private View f51292c;
    @Nullable

    /* renamed from: d */
    private View f51293d;
    @Nullable

    /* renamed from: e */
    private LevelPlayMediaView f51294e;
    @Nullable

    /* renamed from: f */
    private View f51295f;

    @Nullable
    public final View getAdvertiserView() {
        return this.f51291b;
    }

    @Nullable
    public final View getBodyView() {
        return this.f51293d;
    }

    @Nullable
    public final View getCallToActionView() {
        return this.f51295f;
    }

    @Nullable
    public final View getIconView() {
        return this.f51292c;
    }

    @Nullable
    public final LevelPlayMediaView getMediaView() {
        return this.f51294e;
    }

    @Nullable
    public final View getTitleView() {
        return this.f51290a;
    }

    public final void setAdvertiserView(@Nullable View view) {
        this.f51291b = view;
    }

    public final void setBodyView(@Nullable View view) {
        this.f51293d = view;
    }

    public final void setCallToActionView(@Nullable View view) {
        this.f51295f = view;
    }

    public final void setIconView(@Nullable View view) {
        this.f51292c = view;
    }

    public final void setMediaView(@Nullable LevelPlayMediaView levelPlayMediaView) {
        this.f51294e = levelPlayMediaView;
    }

    public final void setTitleView(@Nullable View view) {
        this.f51290a = view;
    }
}
