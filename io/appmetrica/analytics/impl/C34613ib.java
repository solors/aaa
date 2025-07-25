package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.backport.Function;
import java.io.File;

/* renamed from: io.appmetrica.analytics.impl.ib */
/* loaded from: classes9.dex */
public final class C34613ib implements Function, Consumer {
    @Override // io.appmetrica.analytics.coreapi.internal.backport.Function
    @Nullable
    /* renamed from: a */
    public final C34532fb apply(@NonNull File file) {
        String m22569a = AbstractC33941Ha.m22569a(file);
        if (!TextUtils.isEmpty(m22569a)) {
            try {
                return new C34532fb(m22569a);
            } catch (Throwable unused) {
                return null;
            }
        }
        return null;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    /* renamed from: b */
    public final void consume(@NonNull File file) {
        try {
            file.delete();
        } catch (Throwable unused) {
        }
    }
}
