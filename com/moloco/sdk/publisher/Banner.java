package com.moloco.sdk.publisher;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import ge.C33329j;
import ge.C33361p0;
import ge.InterfaceC33421z;
import ge.StateFlow;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata
/* loaded from: classes7.dex */
public abstract class Banner extends FrameLayout implements AdLoad, Destroyable {
    public static final int $stable = 8;
    @NotNull
    private final InterfaceC33421z<Boolean> _isViewShown;
    @Nullable
    private BannerAdShowListener adShowListener;
    @NotNull
    private final StateFlow<Boolean> isViewShown;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Banner(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        setTag("MolocoBannerView");
        InterfaceC33421z<Boolean> m24033a = C33361p0.m24033a(Boolean.FALSE);
        this._isViewShown = m24033a;
        this.isViewShown = C33329j.m24098c(m24033a);
    }

    @Nullable
    public BannerAdShowListener getAdShowListener() {
        return this.adShowListener;
    }

    @NotNull
    public StateFlow<Boolean> isViewShown() {
        return this.isViewShown;
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NotNull View changedView, int i) {
        Intrinsics.checkNotNullParameter(changedView, "changedView");
        this._isViewShown.setValue(Boolean.valueOf(changedView.isShown()));
    }

    public void setAdShowListener(@Nullable BannerAdShowListener bannerAdShowListener) {
        this.adShowListener = bannerAdShowListener;
    }
}
