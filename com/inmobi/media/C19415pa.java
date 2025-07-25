package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.inmobi.media.pa */
/* loaded from: classes6.dex */
public final class C19415pa {

    /* renamed from: a */
    public final String f48584a;

    /* renamed from: b */
    public final Class f48585b;

    public C19415pa(@NotNull String fieldName, @NotNull Class<?> originClass) {
        Intrinsics.checkNotNullParameter(fieldName, "fieldName");
        Intrinsics.checkNotNullParameter(originClass, "originClass");
        this.f48584a = fieldName;
        this.f48585b = originClass;
    }

    @NotNull
    /* renamed from: a */
    public final C19415pa m59959a(@NotNull String fieldName, @NotNull Class<?> originClass) {
        Intrinsics.checkNotNullParameter(fieldName, "fieldName");
        Intrinsics.checkNotNullParameter(originClass, "originClass");
        return new C19415pa(fieldName, originClass);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19415pa)) {
            return false;
        }
        C19415pa c19415pa = (C19415pa) obj;
        if (Intrinsics.m17075f(this.f48584a, c19415pa.f48584a) && Intrinsics.m17075f(this.f48585b, c19415pa.f48585b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f48585b.hashCode() + (this.f48584a.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "RuleKey(fieldName=" + this.f48584a + ", originClass=" + this.f48585b + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static /* synthetic */ C19415pa m59960a(C19415pa c19415pa, String str, Class cls, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c19415pa.f48584a;
        }
        if ((i & 2) != 0) {
            cls = c19415pa.f48585b;
        }
        return c19415pa.m59959a(str, cls);
    }
}
