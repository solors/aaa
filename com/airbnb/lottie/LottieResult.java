package com.airbnb.lottie;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* renamed from: com.airbnb.lottie.l */
/* loaded from: classes2.dex */
public final class LottieResult<V> {
    @Nullable

    /* renamed from: a */
    private final V f2247a;
    @Nullable

    /* renamed from: b */
    private final Throwable f2248b;

    public LottieResult(V v) {
        this.f2247a = v;
        this.f2248b = null;
    }

    @Nullable
    /* renamed from: a */
    public Throwable m103257a() {
        return this.f2248b;
    }

    @Nullable
    /* renamed from: b */
    public V m103256b() {
        return this.f2247a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LottieResult)) {
            return false;
        }
        LottieResult lottieResult = (LottieResult) obj;
        if (m103256b() != null && m103256b().equals(lottieResult.m103256b())) {
            return true;
        }
        if (m103257a() == null || lottieResult.m103257a() == null) {
            return false;
        }
        return m103257a().toString().equals(m103257a().toString());
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{m103256b(), m103257a()});
    }

    public LottieResult(Throwable th) {
        this.f2248b = th;
        this.f2247a = null;
    }
}
