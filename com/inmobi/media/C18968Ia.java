package com.inmobi.media;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.inmobi.media.Ia */
/* loaded from: classes6.dex */
public final class C18968Ia {

    /* renamed from: a */
    public static final C18968Ia f47347a = new C18968Ia();

    /* renamed from: b */
    public static String f47348b = null;

    /* renamed from: c */
    public static String f47349c = "dir";

    /* renamed from: a */
    public static final void m61030a(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        f47349c = str;
    }

    /* renamed from: b */
    public static /* synthetic */ void m61029b() {
    }

    @VisibleForTesting
    @NotNull
    /* renamed from: c */
    public static final String m61026c() {
        return "10.7.8";
    }

    @Nullable
    /* renamed from: d */
    public static final String m61025d() {
        return f47349c;
    }

    @Nullable
    /* renamed from: f */
    public static final String m61023f() {
        return f47348b;
    }

    /* renamed from: b */
    public static final void m61027b(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        f47348b = str;
    }

    @NotNull
    /* renamed from: a */
    public static final String m61034a() {
        return !TextUtils.isEmpty("") ? "pr-SAND-10.7.8-20241004-" : "pr-SAND-10.7.8-20241004";
    }

    @Nullable
    /* renamed from: a */
    public final String m61033a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ConcurrentHashMap concurrentHashMap = C19508w5.f48819b;
        C19508w5 m59823a = AbstractC19494v5.m59823a(context, "sdk_version_store");
        Intrinsics.checkNotNullParameter("sdk_version", "key");
        return m59823a.f48820a.getString("sdk_version", null);
    }

    /* renamed from: b */
    public final boolean m61028b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ConcurrentHashMap concurrentHashMap = C19508w5.f48819b;
        C19508w5 m59823a = AbstractC19494v5.m59823a(context, "sdk_version_store");
        Intrinsics.checkNotNullParameter("db_deletion_failed", "key");
        return m59823a.f48820a.getBoolean("db_deletion_failed", false);
    }

    /* renamed from: a */
    public final void m61032a(@NotNull Context context, @Nullable String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        ConcurrentHashMap concurrentHashMap = C19508w5.f48819b;
        AbstractC19494v5.m59823a(context, "sdk_version_store").m59618a("sdk_version", str);
    }

    /* renamed from: a */
    public final void m61031a(@NotNull Context context, boolean z) {
        Intrinsics.checkNotNullParameter(context, "context");
        ConcurrentHashMap concurrentHashMap = C19508w5.f48819b;
        AbstractC19494v5.m59823a(context, "sdk_version_store").m59617a("db_deletion_failed", z);
    }

    /* renamed from: e */
    public static /* synthetic */ void m61024e() {
    }

    /* renamed from: g */
    public static /* synthetic */ void m61022g() {
    }
}
