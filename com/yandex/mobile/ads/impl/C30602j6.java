package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.j6 */
/* loaded from: classes8.dex */
public final class C30602j6 extends Throwable {
    @NotNull

    /* renamed from: b */
    private final String f80760b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30602j6(@NotNull String description) {
        super(description);
        Intrinsics.checkNotNullParameter(description, "description");
        this.f80760b = description;
    }

    @NotNull
    /* renamed from: a */
    public final String m33039a() {
        return this.f80760b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C30602j6) && Intrinsics.m17075f(this.f80760b, ((C30602j6) obj).f80760b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f80760b.hashCode();
    }

    @Override // java.lang.Throwable
    @NotNull
    public final String toString() {
        String str = this.f80760b;
        return "AdPresentationError(description=" + str + ")";
    }
}
