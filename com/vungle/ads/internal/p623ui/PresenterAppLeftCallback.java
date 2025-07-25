package com.vungle.ads.internal.p623ui;

import com.vungle.ads.internal.presenter.AdEventListener;
import com.vungle.ads.internal.util.ActivityManager;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.vungle.ads.internal.ui.b */
/* loaded from: classes7.dex */
public final class PresenterAppLeftCallback implements ActivityManager.InterfaceC29504b {
    @Nullable
    private final AdEventListener bus;
    @Nullable
    private final String placementRefId;

    public PresenterAppLeftCallback(@Nullable AdEventListener adEventListener, @Nullable String str) {
        this.bus = adEventListener;
        this.placementRefId = str;
    }

    @Override // com.vungle.ads.internal.util.ActivityManager.InterfaceC29504b
    public void onLeftApplication() {
        AdEventListener adEventListener = this.bus;
        if (adEventListener != null) {
            adEventListener.onNext("open", "adLeftApplication", this.placementRefId);
        }
    }
}
