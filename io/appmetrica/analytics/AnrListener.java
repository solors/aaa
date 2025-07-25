package io.appmetrica.analytics;

import androidx.annotation.WorkerThread;

/* loaded from: classes9.dex */
public interface AnrListener {
    @WorkerThread
    void onAppNotResponding();
}
