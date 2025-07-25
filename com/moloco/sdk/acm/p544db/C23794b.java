package com.moloco.sdk.acm.p544db;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@TypeConverters({C23793a.class})
@Entity(tableName = "events")
/* renamed from: com.moloco.sdk.acm.db.b */
/* loaded from: classes7.dex */
public final class C23794b {
    @PrimaryKey(autoGenerate = true)

    /* renamed from: a */
    public final long f61763a;
    @NotNull

    /* renamed from: b */
    public final String f61764b;

    /* renamed from: c */
    public final long f61765c;
    @NotNull

    /* renamed from: d */
    public final EnumC23795c f61766d;
    @Nullable

    /* renamed from: e */
    public final Long f61767e;
    @NotNull

    /* renamed from: f */
    public final List<String> f61768f;

    public C23794b(long j, @NotNull String name, long j2, @NotNull EnumC23795c eventType, @Nullable Long l, @NotNull List<String> tags) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(tags, "tags");
        this.f61763a = j;
        this.f61764b = name;
        this.f61765c = j2;
        this.f61766d = eventType;
        this.f61767e = l;
        this.f61768f = tags;
    }

    @Nullable
    /* renamed from: a */
    public final Long m47710a() {
        return this.f61767e;
    }

    @NotNull
    /* renamed from: b */
    public final EnumC23795c m47709b() {
        return this.f61766d;
    }

    /* renamed from: c */
    public final long m47708c() {
        return this.f61763a;
    }

    @NotNull
    /* renamed from: d */
    public final String m47707d() {
        return this.f61764b;
    }

    @NotNull
    /* renamed from: e */
    public final List<String> m47706e() {
        return this.f61768f;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23794b)) {
            return false;
        }
        C23794b c23794b = (C23794b) obj;
        if (this.f61763a == c23794b.f61763a && Intrinsics.m17075f(this.f61764b, c23794b.f61764b) && this.f61765c == c23794b.f61765c && this.f61766d == c23794b.f61766d && Intrinsics.m17075f(this.f61767e, c23794b.f61767e) && Intrinsics.m17075f(this.f61768f, c23794b.f61768f)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final long m47705f() {
        return this.f61765c;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((((Long.hashCode(this.f61763a) * 31) + this.f61764b.hashCode()) * 31) + Long.hashCode(this.f61765c)) * 31) + this.f61766d.hashCode()) * 31;
        Long l = this.f61767e;
        if (l == null) {
            hashCode = 0;
        } else {
            hashCode = l.hashCode();
        }
        return ((hashCode2 + hashCode) * 31) + this.f61768f.hashCode();
    }

    @NotNull
    public String toString() {
        return "EventEntity(id=" + this.f61763a + ", name=" + this.f61764b + ", timestamp=" + this.f61765c + ", eventType=" + this.f61766d + ", data=" + this.f61767e + ", tags=" + this.f61768f + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ C23794b(long r12, java.lang.String r14, long r15, com.moloco.sdk.acm.p544db.EnumC23795c r17, java.lang.Long r18, java.util.List r19, int r20, kotlin.jvm.internal.DefaultConstructorMarker r21) {
        /*
            r11 = this;
            r0 = r20 & 1
            if (r0 == 0) goto L8
            r0 = 0
            r3 = r0
            goto L9
        L8:
            r3 = r12
        L9:
            r0 = r20 & 16
            if (r0 == 0) goto L10
            r0 = 0
            r9 = r0
            goto L12
        L10:
            r9 = r18
        L12:
            r0 = r20 & 32
            if (r0 == 0) goto L1c
            java.util.List r0 = kotlin.collections.C37561t.m17202m()
            r10 = r0
            goto L1e
        L1c:
            r10 = r19
        L1e:
            r2 = r11
            r5 = r14
            r6 = r15
            r8 = r17
            r2.<init>(r3, r5, r6, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.acm.p544db.C23794b.<init>(long, java.lang.String, long, com.moloco.sdk.acm.db.c, java.lang.Long, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
