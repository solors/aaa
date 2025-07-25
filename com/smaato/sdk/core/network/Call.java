package com.smaato.sdk.core.network;

import androidx.annotation.NonNull;
import java.io.IOException;

/* loaded from: classes7.dex */
public interface Call {

    /* loaded from: classes7.dex */
    public interface Factory {
        @NonNull
        Call newCall(@NonNull Request request);
    }

    void cancel();

    void enqueue(@NonNull Callback callback);

    @NonNull
    Response execute() throws IOException;

    @NonNull
    Request request();
}
