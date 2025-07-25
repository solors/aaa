package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.dt */
/* loaded from: classes6.dex */
public final class C19788dt {
    @Nullable

    /* renamed from: a */
    private String f49827a;

    public C19788dt() {
        this(null, 1, null);
    }

    /* renamed from: a */
    public static /* synthetic */ C19788dt m58846a(C19788dt c19788dt, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c19788dt.f49827a;
        }
        return c19788dt.m58845a(str);
    }

    @Nullable
    /* renamed from: b */
    public final String m58844b() {
        return this.f49827a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C19788dt) && Intrinsics.m17075f(this.f49827a, ((C19788dt) obj).f49827a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f49827a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @NotNull
    public String toString() {
        return "TestSuiteSettings(controllerUrl=" + this.f49827a + ')';
    }

    public C19788dt(@Nullable String str) {
        this.f49827a = str;
    }

    @NotNull
    /* renamed from: a */
    public final C19788dt m58845a(@Nullable String str) {
        return new C19788dt(str);
    }

    /* renamed from: b */
    public final void m58843b(@Nullable String str) {
        this.f49827a = str;
    }

    public /* synthetic */ C19788dt(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }

    @Nullable
    /* renamed from: a */
    public final String m58847a() {
        return this.f49827a;
    }
}
