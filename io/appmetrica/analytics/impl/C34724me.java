package io.appmetrica.analytics.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.me */
/* loaded from: classes9.dex */
public final class C34724me implements InterfaceC33818Cc {

    /* renamed from: a */
    public final Context f94923a;

    /* renamed from: b */
    public final String f94924b;

    /* renamed from: c */
    public final String f94925c;

    public C34724me(@NotNull Context context, @NotNull String str, @NotNull String str2) {
        this.f94923a = context;
        this.f94924b = str;
        this.f94925c = str2;
    }

    @NotNull
    /* renamed from: a */
    public final C34724me m21323a(@NotNull Context context, @NotNull String str, @NotNull String str2) {
        return new C34724me(context, str, str2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34724me)) {
            return false;
        }
        C34724me c34724me = (C34724me) obj;
        if (Intrinsics.m17075f(this.f94923a, c34724me.f94923a) && Intrinsics.m17075f(this.f94924b, c34724me.f94924b) && Intrinsics.m17075f(this.f94925c, c34724me.f94925c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f94924b.hashCode();
        return this.f94925c.hashCode() + ((hashCode + (this.f94923a.hashCode() * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "PreferencesBasedModuleEntryPoint(context=" + this.f94923a + ", prefName=" + this.f94924b + ", prefValueName=" + this.f94925c + ')';
    }

    /* renamed from: a */
    public static C34724me m21322a(C34724me c34724me, Context context, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            context = c34724me.f94923a;
        }
        if ((i & 2) != 0) {
            str = c34724me.f94924b;
        }
        if ((i & 4) != 0) {
            str2 = c34724me.f94925c;
        }
        c34724me.getClass();
        return new C34724me(context, str, str2);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC33818Cc
    @NotNull
    /* renamed from: a */
    public final String mo20790a() {
        String string = this.f94923a.getSharedPreferences(this.f94924b, 0).getString(this.f94925c, "");
        return string == null ? "" : string;
    }
}
