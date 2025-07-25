package com.moloco.sdk.internal.services.bidtoken.providers;

import com.moloco.sdk.internal.services.EnumC24376l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.moloco.sdk.internal.services.bidtoken.providers.n */
/* loaded from: classes7.dex */
public final class C24298n {
    @NotNull

    /* renamed from: a */
    public final EnumC24376l f62914a;
    @NotNull

    /* renamed from: b */
    public final String f62915b;
    @Nullable

    /* renamed from: c */
    public final String f62916c;

    public C24298n(@NotNull EnumC24376l orientation, @NotNull String locale, @Nullable String str) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(locale, "locale");
        this.f62914a = orientation;
        this.f62915b = locale;
        this.f62916c = str;
    }

    @Nullable
    /* renamed from: a */
    public final String m46647a() {
        return this.f62916c;
    }

    @NotNull
    /* renamed from: b */
    public final String m46646b() {
        return this.f62915b;
    }

    @NotNull
    /* renamed from: c */
    public final EnumC24376l m46645c() {
        return this.f62914a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24298n)) {
            return false;
        }
        C24298n c24298n = (C24298n) obj;
        if (this.f62914a == c24298n.f62914a && Intrinsics.m17075f(this.f62915b, c24298n.f62915b) && Intrinsics.m17075f(this.f62916c, c24298n.f62916c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((this.f62914a.hashCode() * 31) + this.f62915b.hashCode()) * 31;
        String str = this.f62916c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    @NotNull
    public String toString() {
        return "DeviceSignalInfo(orientation=" + this.f62914a + ", locale=" + this.f62915b + ", keyboardLocale=" + this.f62916c + ')';
    }
}
