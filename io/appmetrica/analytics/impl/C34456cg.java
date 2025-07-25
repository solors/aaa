package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigMetaInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.cg */
/* loaded from: classes9.dex */
public final class C34456cg implements RemoteConfigMetaInfo {

    /* renamed from: a */
    public final long f94095a;

    /* renamed from: b */
    public final long f94096b;

    public C34456cg(long j, long j2) {
        this.f94095a = j;
        this.f94096b = j2;
    }

    @NotNull
    /* renamed from: a */
    public final C34456cg m21862a(long j, long j2) {
        return new C34456cg(j, j2);
    }

    /* renamed from: b */
    public final long m21860b() {
        return this.f94096b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34456cg)) {
            return false;
        }
        C34456cg c34456cg = (C34456cg) obj;
        if (this.f94095a == c34456cg.f94095a && this.f94096b == c34456cg.f94096b) {
            return true;
        }
        return false;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigMetaInfo
    public final long getFirstSendTime() {
        return this.f94095a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigMetaInfo
    public final long getLastUpdateTime() {
        return this.f94096b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f94096b) + (Long.hashCode(this.f94095a) * 31);
    }

    @NotNull
    public final String toString() {
        return "RemoteConfigMetaInfoModel(firstSendTime=" + this.f94095a + ", lastUpdateTime=" + this.f94096b + ')';
    }

    /* renamed from: a */
    public final long m21863a() {
        return this.f94095a;
    }

    /* renamed from: a */
    public static C34456cg m21861a(C34456cg c34456cg, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = c34456cg.f94095a;
        }
        if ((i & 2) != 0) {
            j2 = c34456cg.f94096b;
        }
        c34456cg.getClass();
        return new C34456cg(j, j2);
    }
}
