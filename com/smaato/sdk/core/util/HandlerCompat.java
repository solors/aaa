package com.smaato.sdk.core.util;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;

/* loaded from: classes7.dex */
public abstract class HandlerCompat {
    private HandlerCompat() {
    }

    @NonNull
    public static Handler create(@NonNull Looper looper) {
        Handler createAsync;
        if (Build.VERSION.SDK_INT >= 28) {
            createAsync = Handler.createAsync(Looper.getMainLooper());
            return createAsync;
        }
        return new Handler(Looper.getMainLooper());
    }
}
