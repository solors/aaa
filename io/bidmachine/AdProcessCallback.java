package io.bidmachine;

import androidx.annotation.NonNull;
import io.bidmachine.core.VisibilitySource;
import io.bidmachine.utils.BMError;

/* loaded from: classes9.dex */
public interface AdProcessCallback {
    void processClicked();

    void processClosed();

    void processDestroy();

    void processExpired();

    void processFillAd();

    void processFinished();

    void processLoadFail(@NonNull BMError bMError);

    void processLoadSuccess();

    void processShowFail(@NonNull BMError bMError);

    void processShown();

    void processStartVisibilityTracker();

    void processVisibilityTrackerImpression();

    boolean processVisibilityTrackerShown();

    void setVisibilitySource(@NonNull VisibilitySource visibilitySource);
}
