package com.ironsource;

import java.util.Calendar;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C37559r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p804nd.C38513v;

@Metadata
/* renamed from: com.ironsource.z2 */
/* loaded from: classes6.dex */
public final class C21291z2 {
    @NotNull

    /* renamed from: a */
    private final EnumC21045tr f54694a;
    @NotNull

    /* renamed from: b */
    private final EnumC21177we f54695b;
    @NotNull

    /* renamed from: c */
    private final String f54696c;

    /* renamed from: d */
    private final long f54697d;

    public C21291z2(@NotNull EnumC21045tr recordType, @NotNull EnumC21177we adProvider, @NotNull String adInstanceId) {
        Intrinsics.checkNotNullParameter(recordType, "recordType");
        Intrinsics.checkNotNullParameter(adProvider, "adProvider");
        Intrinsics.checkNotNullParameter(adInstanceId, "adInstanceId");
        this.f54694a = recordType;
        this.f54695b = adProvider;
        this.f54696c = adInstanceId;
        this.f54697d = Calendar.getInstance().getTimeInMillis() / 1000;
    }

    @NotNull
    /* renamed from: a */
    public final String m53928a() {
        return this.f54696c;
    }

    @NotNull
    /* renamed from: b */
    public final EnumC21177we m53927b() {
        return this.f54695b;
    }

    @NotNull
    /* renamed from: c */
    public final Map<String, Object> m53926c() {
        Map<String, Object> m17281m;
        m17281m = C37559r0.m17281m(C38513v.m14532a(C21018tj.f53566c, Integer.valueOf(this.f54695b.m54345b())), C38513v.m14532a("ts", String.valueOf(this.f54697d)));
        return m17281m;
    }

    @NotNull
    /* renamed from: d */
    public final Map<String, Object> m53925d() {
        Map<String, Object> m17281m;
        m17281m = C37559r0.m17281m(C38513v.m14532a(C21018tj.f53565b, this.f54696c), C38513v.m14532a(C21018tj.f53566c, Integer.valueOf(this.f54695b.m54345b())), C38513v.m14532a("ts", String.valueOf(this.f54697d)), C38513v.m14532a("rt", Integer.valueOf(this.f54694a.ordinal())));
        return m17281m;
    }

    @NotNull
    /* renamed from: e */
    public final EnumC21045tr m53924e() {
        return this.f54694a;
    }

    /* renamed from: f */
    public final long m53923f() {
        return this.f54697d;
    }
}
