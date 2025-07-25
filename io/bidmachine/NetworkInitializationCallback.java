package io.bidmachine;

import androidx.annotation.NonNull;

/* loaded from: classes9.dex */
public interface NetworkInitializationCallback {
    void onFail(@NonNull String str);

    void onSuccess();
}
