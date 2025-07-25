package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.tm */
/* loaded from: classes9.dex */
public final class C34918tm implements TempCacheStorage.Entry {

    /* renamed from: a */
    public final long f95421a;

    /* renamed from: b */
    public final String f95422b;

    /* renamed from: c */
    public final long f95423c;

    /* renamed from: d */
    public final byte[] f95424d;

    public C34918tm(long j, @NotNull String str, long j2, @NotNull byte[] bArr) {
        this.f95421a = j;
        this.f95422b = str;
        this.f95423c = j2;
        this.f95424d = bArr;
    }

    public final boolean equals(@Nullable Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.m17075f(C34918tm.class, cls)) {
            return false;
        }
        if (obj != null) {
            C34918tm c34918tm = (C34918tm) obj;
            if (this.f95421a != c34918tm.f95421a || !Intrinsics.m17075f(this.f95422b, c34918tm.f95422b) || this.f95423c != c34918tm.f95423c) {
                return false;
            }
            return Arrays.equals(this.f95424d, c34918tm.f95424d);
        }
        throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.impl.db.storage.TempCacheEntry");
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage.Entry
    @NotNull
    public final byte[] getData() {
        return this.f95424d;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage.Entry
    public final long getId() {
        return this.f95421a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage.Entry
    @NotNull
    public final String getScope() {
        return this.f95422b;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage.Entry
    public final long getTimestamp() {
        return this.f95423c;
    }

    public final int hashCode() {
        int hashCode = this.f95422b.hashCode();
        int hashCode2 = Long.hashCode(this.f95423c);
        return Arrays.hashCode(this.f95424d) + ((hashCode2 + ((hashCode + (Long.hashCode(this.f95421a) * 31)) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "TempCacheEntry(id=" + this.f95421a + ", scope='" + this.f95422b + "', timestamp=" + this.f95423c + ", data=array[" + this.f95424d.length + "])";
    }
}
