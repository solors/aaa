package com.smaato.sdk.core.util;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;

@AutoValue
/* loaded from: classes7.dex */
public abstract class Pair<F, S> {
    @NonNull
    /* renamed from: of */
    public static <F, S> Pair<F, S> m39354of(@Nullable F f, @Nullable S s) {
        return new AutoValue_Pair(f, s);
    }

    @Nullable
    public abstract F first();

    @Nullable
    public abstract S second();
}
