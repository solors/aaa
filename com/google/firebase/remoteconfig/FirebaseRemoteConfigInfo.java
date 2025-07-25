package com.google.firebase.remoteconfig;

import androidx.annotation.NonNull;

/* loaded from: classes4.dex */
public interface FirebaseRemoteConfigInfo {
    @NonNull
    FirebaseRemoteConfigSettings getConfigSettings();

    long getFetchTimeMillis();

    int getLastFetchStatus();
}
