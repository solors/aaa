package com.inmobi.media;

import android.content.Context;
import androidx.annotation.WorkerThread;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.inmobi.media.o9 */
/* loaded from: classes6.dex */
public final class C19400o9 {

    /* renamed from: a */
    public final C19508w5 f48560a;

    public C19400o9(@NotNull Context context, @NotNull String sharePrefFile) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sharePrefFile, "sharePrefFile");
        ConcurrentHashMap concurrentHashMap = C19508w5.f48819b;
        this.f48560a = AbstractC19494v5.m59823a(context, sharePrefFile);
    }

    /* renamed from: a */
    public final void m59989a(@NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f48560a.m59618a(key, value);
    }

    /* renamed from: b */
    public final void m59985b(@NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f48560a.m59618a(key, value);
        m59991a(System.currentTimeMillis() / 1000);
    }

    @WorkerThread
    /* renamed from: c */
    public final boolean m59984c(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f48560a.m59621a(key);
    }

    /* renamed from: a */
    public final void m59988a(@NotNull String key, boolean z) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f48560a.m59617a(key, z);
    }

    @WorkerThread
    @Nullable
    /* renamed from: a */
    public final String m59990a(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        C19508w5 c19508w5 = this.f48560a;
        c19508w5.getClass();
        Intrinsics.checkNotNullParameter(key, "key");
        return c19508w5.f48820a.getString(key, null);
    }

    @WorkerThread
    /* renamed from: b */
    public final long m59987b() {
        C19508w5 c19508w5 = this.f48560a;
        c19508w5.getClass();
        Intrinsics.checkNotNullParameter("last_ts", "key");
        return c19508w5.f48820a.getLong("last_ts", 0L);
    }

    /* renamed from: a */
    public final void m59991a(long j) {
        this.f48560a.m59619a("last_ts", j);
    }

    @WorkerThread
    /* renamed from: b */
    public final boolean m59986b(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        C19508w5 c19508w5 = this.f48560a;
        c19508w5.getClass();
        Intrinsics.checkNotNullParameter(key, "key");
        return c19508w5.f48820a.contains(key);
    }

    @WorkerThread
    /* renamed from: a */
    public final void m59992a() {
        this.f48560a.m59616b();
    }
}
