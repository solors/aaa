package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.x7 */
/* loaded from: classes6.dex */
public final class C21215x7 {
    @NotNull

    /* renamed from: a */
    private String f54436a;
    @NotNull

    /* renamed from: b */
    private String f54437b;
    @NotNull

    /* renamed from: c */
    private String f54438c;

    public C21215x7(@NotNull String cachedAppKey, @NotNull String cachedUserId, @NotNull String cachedSettings) {
        Intrinsics.checkNotNullParameter(cachedAppKey, "cachedAppKey");
        Intrinsics.checkNotNullParameter(cachedUserId, "cachedUserId");
        Intrinsics.checkNotNullParameter(cachedSettings, "cachedSettings");
        this.f54436a = cachedAppKey;
        this.f54437b = cachedUserId;
        this.f54438c = cachedSettings;
    }

    /* renamed from: a */
    public static /* synthetic */ C21215x7 m54169a(C21215x7 c21215x7, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c21215x7.f54436a;
        }
        if ((i & 2) != 0) {
            str2 = c21215x7.f54437b;
        }
        if ((i & 4) != 0) {
            str3 = c21215x7.f54438c;
        }
        return c21215x7.m54167a(str, str2, str3);
    }

    @NotNull
    /* renamed from: b */
    public final String m54166b() {
        return this.f54437b;
    }

    @NotNull
    /* renamed from: c */
    public final String m54164c() {
        return this.f54438c;
    }

    @NotNull
    /* renamed from: d */
    public final String m54162d() {
        return this.f54436a;
    }

    @NotNull
    /* renamed from: e */
    public final String m54161e() {
        return this.f54438c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21215x7)) {
            return false;
        }
        C21215x7 c21215x7 = (C21215x7) obj;
        if (Intrinsics.m17075f(this.f54436a, c21215x7.f54436a) && Intrinsics.m17075f(this.f54437b, c21215x7.f54437b) && Intrinsics.m17075f(this.f54438c, c21215x7.f54438c)) {
            return true;
        }
        return false;
    }

    @NotNull
    /* renamed from: f */
    public final String m54160f() {
        return this.f54437b;
    }

    public int hashCode() {
        return (((this.f54436a.hashCode() * 31) + this.f54437b.hashCode()) * 31) + this.f54438c.hashCode();
    }

    @NotNull
    public String toString() {
        return "CachedResponse(cachedAppKey=" + this.f54436a + ", cachedUserId=" + this.f54437b + ", cachedSettings=" + this.f54438c + ')';
    }

    @NotNull
    /* renamed from: a */
    public final C21215x7 m54167a(@NotNull String cachedAppKey, @NotNull String cachedUserId, @NotNull String cachedSettings) {
        Intrinsics.checkNotNullParameter(cachedAppKey, "cachedAppKey");
        Intrinsics.checkNotNullParameter(cachedUserId, "cachedUserId");
        Intrinsics.checkNotNullParameter(cachedSettings, "cachedSettings");
        return new C21215x7(cachedAppKey, cachedUserId, cachedSettings);
    }

    /* renamed from: b */
    public final void m54165b(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f54438c = str;
    }

    /* renamed from: c */
    public final void m54163c(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f54437b = str;
    }

    @NotNull
    /* renamed from: a */
    public final String m54170a() {
        return this.f54436a;
    }

    /* renamed from: a */
    public final void m54168a(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f54436a = str;
    }
}
