package io.bidmachine;

import androidx.annotation.NonNull;
import io.bidmachine.core.VisibilitySource;
import io.bidmachine.utils.BMError;

/* renamed from: io.bidmachine.h5 */
/* loaded from: classes9.dex */
class SimpleAdProcessCallback implements AdProcessCallback {
    @Override // io.bidmachine.AdProcessCallback
    public boolean processVisibilityTrackerShown() {
        return false;
    }

    @Override // io.bidmachine.AdProcessCallback
    public void processClicked() {
    }

    @Override // io.bidmachine.AdProcessCallback
    public void processClosed() {
    }

    @Override // io.bidmachine.AdProcessCallback
    public void processDestroy() {
    }

    @Override // io.bidmachine.AdProcessCallback
    public void processExpired() {
    }

    @Override // io.bidmachine.AdProcessCallback
    public void processFillAd() {
    }

    @Override // io.bidmachine.AdProcessCallback
    public void processFinished() {
    }

    @Override // io.bidmachine.AdProcessCallback
    public void processLoadSuccess() {
    }

    @Override // io.bidmachine.AdProcessCallback
    public void processShown() {
    }

    @Override // io.bidmachine.AdProcessCallback
    public void processStartVisibilityTracker() {
    }

    @Override // io.bidmachine.AdProcessCallback
    public void processVisibilityTrackerImpression() {
    }

    @Override // io.bidmachine.AdProcessCallback
    public void processLoadFail(@NonNull BMError bMError) {
    }

    @Override // io.bidmachine.AdProcessCallback
    public void processShowFail(@NonNull BMError bMError) {
    }

    @Override // io.bidmachine.AdProcessCallback
    public void setVisibilitySource(@NonNull VisibilitySource visibilitySource) {
    }
}
