package io.bidmachine.models;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.models.RequestParams;

/* loaded from: classes9.dex */
public abstract class RequestParams<SelfType extends RequestParams<SelfType>> {
    public static <T extends RequestParams<T>> T resolveParams(@Nullable T t, @Nullable T t2) {
        if (t == null) {
            return t2;
        }
        if (t2 != null) {
            t.merge(t2);
        }
        return t;
    }

    public abstract void merge(@NonNull SelfType selftype);
}
