package com.inmobi.media;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.inmobi.media.w5 */
/* loaded from: classes6.dex */
public final class C19508w5 {

    /* renamed from: b */
    public static final ConcurrentHashMap f48819b = new ConcurrentHashMap();

    /* renamed from: a */
    public final SharedPreferences f48820a;

    public C19508w5(Context context, String str) {
        this.f48820a = context.getSharedPreferences(str, 0);
    }

    @NotNull
    /* renamed from: a */
    public static final C19508w5 m59622a(@NotNull Context context, @NotNull String str) {
        return AbstractC19494v5.m59823a(context, str);
    }

    /* renamed from: b */
    public final void m59616b() {
        SharedPreferences.Editor edit = this.f48820a.edit();
        edit.clear();
        edit.apply();
    }

    /* renamed from: a */
    public final boolean m59621a(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(key, "key");
        if (this.f48820a.contains(key)) {
            SharedPreferences.Editor edit = this.f48820a.edit();
            edit.remove(key);
            edit.apply();
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void m59618a(String key, String str) {
        Intrinsics.checkNotNullParameter(key, "key");
        SharedPreferences.Editor edit = this.f48820a.edit();
        edit.putString(key, str);
        edit.apply();
    }

    /* renamed from: a */
    public final void m59620a(String key, int i) {
        Intrinsics.checkNotNullParameter(key, "key");
        SharedPreferences.Editor edit = this.f48820a.edit();
        edit.putInt(key, i);
        edit.apply();
    }

    /* renamed from: a */
    public final void m59619a(String key, long j) {
        Intrinsics.checkNotNullParameter(key, "key");
        SharedPreferences.Editor edit = this.f48820a.edit();
        edit.putLong(key, j);
        edit.apply();
    }

    /* renamed from: a */
    public final void m59617a(String key, boolean z) {
        Intrinsics.checkNotNullParameter(key, "key");
        SharedPreferences.Editor edit = this.f48820a.edit();
        edit.putBoolean(key, z);
        edit.apply();
    }
}
