package com.smaato.sdk.core.network;

import androidx.annotation.NonNull;

/* loaded from: classes7.dex */
public interface Callback {
    void onFailure(@NonNull Call call, @NonNull Exception exc);

    void onResponse(@NonNull Call call, @NonNull Response response);
}
