package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.vg */
/* loaded from: classes6.dex */
public final class C21135vg {
    @NotNull

    /* renamed from: a */
    private final String f54203a;
    @NotNull

    /* renamed from: b */
    private final String f54204b;
    @Nullable

    /* renamed from: c */
    private InterfaceC20732r0 f54205c;

    /* renamed from: d */
    private boolean f54206d;
    @Nullable

    /* renamed from: e */
    private String f54207e;
    @Nullable

    /* renamed from: f */
    private String f54208f;

    public C21135vg(@NotNull String appKey, @NotNull String userId) {
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        Intrinsics.checkNotNullParameter(userId, "userId");
        this.f54203a = appKey;
        this.f54204b = userId;
    }

    /* renamed from: a */
    public static /* synthetic */ C21135vg m54448a(C21135vg c21135vg, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c21135vg.f54203a;
        }
        if ((i & 2) != 0) {
            str2 = c21135vg.f54204b;
        }
        return c21135vg.m54446a(str, str2);
    }

    @NotNull
    /* renamed from: b */
    public final String m54444b() {
        return this.f54204b;
    }

    /* renamed from: c */
    public final boolean m54442c() {
        return this.f54206d;
    }

    @NotNull
    /* renamed from: d */
    public final String m54441d() {
        return this.f54203a;
    }

    @Nullable
    /* renamed from: e */
    public final InterfaceC20732r0 m54440e() {
        return this.f54205c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21135vg)) {
            return false;
        }
        C21135vg c21135vg = (C21135vg) obj;
        if (Intrinsics.m17075f(this.f54203a, c21135vg.f54203a) && Intrinsics.m17075f(this.f54204b, c21135vg.f54204b)) {
            return true;
        }
        return false;
    }

    @Nullable
    /* renamed from: f */
    public final String m54439f() {
        return this.f54208f;
    }

    @Nullable
    /* renamed from: g */
    public final String m54438g() {
        return this.f54207e;
    }

    @NotNull
    /* renamed from: h */
    public final String m54437h() {
        return this.f54204b;
    }

    public int hashCode() {
        return (this.f54203a.hashCode() * 31) + this.f54204b.hashCode();
    }

    @NotNull
    public String toString() {
        return "InitConfig(appKey=" + this.f54203a + ", userId=" + this.f54204b + ')';
    }

    @NotNull
    /* renamed from: a */
    public final C21135vg m54446a(@NotNull String appKey, @NotNull String userId) {
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        Intrinsics.checkNotNullParameter(userId, "userId");
        return new C21135vg(appKey, userId);
    }

    /* renamed from: b */
    public final void m54443b(@Nullable String str) {
        this.f54207e = str;
    }

    /* renamed from: a */
    public final <T> T m54450a(@NotNull InterfaceC19778dl<C21135vg, T> mapper) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        return mapper.mo53929a(this);
    }

    @NotNull
    /* renamed from: a */
    public final String m54451a() {
        return this.f54203a;
    }

    /* renamed from: a */
    public final void m54449a(@Nullable InterfaceC20732r0 interfaceC20732r0) {
        this.f54205c = interfaceC20732r0;
    }

    /* renamed from: a */
    public final void m54447a(@Nullable String str) {
        this.f54208f = str;
    }

    /* renamed from: a */
    public final void m54445a(boolean z) {
        this.f54206d = z;
    }
}
