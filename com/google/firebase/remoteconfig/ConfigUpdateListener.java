package com.google.firebase.remoteconfig;

import androidx.annotation.NonNull;

/* loaded from: classes4.dex */
public interface ConfigUpdateListener {
    void onError(FirebaseRemoteConfigException firebaseRemoteConfigException);

    void onUpdate(@NonNull ConfigUpdate configUpdate);
}
