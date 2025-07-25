package com.moloco.sdk.internal.error;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.moloco.sdk.internal.error.a */
/* loaded from: classes7.dex */
public final class C23964a {
    @Nullable

    /* renamed from: a */
    public final String f62041a;

    public C23964a() {
        this(null, 1, null);
    }

    @Nullable
    /* renamed from: a */
    public final String m47260a() {
        return this.f62041a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C23964a) && Intrinsics.m17075f(this.f62041a, ((C23964a) obj).f62041a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f62041a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @NotNull
    public String toString() {
        return "ErrorMetadata(mtid=" + this.f62041a + ')';
    }

    public C23964a(@Nullable String str) {
        this.f62041a = str;
    }

    public /* synthetic */ C23964a(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
