package com.smaato.sdk.core.openmeasurement;

import android.view.View;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;

/* loaded from: classes7.dex */
public interface ViewabilityTracker {
    @MainThread
    void registerFriendlyObstruction(@NonNull View view);

    @MainThread
    void removeFriendlyObstruction(@NonNull View view);

    @MainThread
    void startTracking();

    @MainThread
    void stopTracking();

    @MainThread
    void trackImpression();

    @MainThread
    void trackLoaded();
}
