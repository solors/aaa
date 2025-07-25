package io.bidmachine.ads.networks.vast;

import androidx.annotation.NonNull;
import io.bidmachine.unified.UnifiedFullscreenAdCallback;
import io.bidmachine.utils.IabUtils;
import p678g1.C33182b;
import p734j1.C37250e;
import p734j1.InterfaceC37262f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: io.bidmachine.ads.networks.vast.b */
/* loaded from: classes9.dex */
public class VastFullScreenAdLoadListener implements InterfaceC37262f {
    @NonNull
    private final UnifiedFullscreenAdCallback callback;

    /* JADX INFO: Access modifiers changed from: package-private */
    public VastFullScreenAdLoadListener(@NonNull UnifiedFullscreenAdCallback unifiedFullscreenAdCallback) {
        this.callback = unifiedFullscreenAdCallback;
    }

    @Override // p734j1.InterfaceC37262f
    public void onVastLoadFailed(@NonNull C37250e c37250e, @NonNull C33182b c33182b) {
        if (c33182b.m24487c() == 6) {
            this.callback.onAdExpired();
        } else {
            this.callback.onAdLoadFailed(IabUtils.mapError(c33182b));
        }
    }

    @Override // p734j1.InterfaceC37262f
    public void onVastLoaded(@NonNull C37250e c37250e) {
        this.callback.onAdLoaded();
    }
}
