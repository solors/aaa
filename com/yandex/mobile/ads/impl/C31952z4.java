package com.yandex.mobile.ads.impl;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections._Collections;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.z4 */
/* loaded from: classes8.dex */
public final class C31952z4 {
    @NotNull

    /* renamed from: a */
    private final Object f88704a = new Object();
    @NotNull

    /* renamed from: b */
    private final ad1 f88705b = new ad1();
    @NotNull

    /* renamed from: c */
    private final LinkedHashMap f88706c = new LinkedHashMap();
    @NotNull

    /* renamed from: d */
    private final ArrayList f88707d = new ArrayList();

    /* renamed from: a */
    public final void m26393a() {
        synchronized (this.f88704a) {
            this.f88706c.clear();
            this.f88707d.clear();
            Unit unit = Unit.f99208a;
        }
    }

    @NotNull
    /* renamed from: b */
    public final List<C31792x4> m26389b() {
        List<C31792x4> m17553Z0;
        synchronized (this.f88704a) {
            m17553Z0 = _Collections.m17553Z0(this.f88707d);
        }
        return m17553Z0;
    }

    /* renamed from: c */
    public final void m26388c() {
        EnumC31868y4 adLoadingPhaseType = EnumC31868y4.f88027e;
        Intrinsics.checkNotNullParameter(adLoadingPhaseType, "adLoadingPhaseType");
        m26390a(adLoadingPhaseType, null);
    }

    /* renamed from: a */
    public final void m26392a(@NotNull EnumC31868y4 adLoadingPhaseType) {
        Intrinsics.checkNotNullParameter(adLoadingPhaseType, "adLoadingPhaseType");
        ad1 parametersProvider = this.f88705b;
        Intrinsics.checkNotNullParameter(adLoadingPhaseType, "adLoadingPhaseType");
        Intrinsics.checkNotNullParameter(parametersProvider, "parametersProvider");
        m26391a(adLoadingPhaseType, parametersProvider, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0031 A[Catch: all -> 0x0057, TryCatch #0 {, blocks: (B:4:0x000d, B:12:0x0031, B:13:0x0043, B:15:0x004d, B:16:0x0053, B:7:0x0018, B:9:0x0020), top: B:22:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004d A[Catch: all -> 0x0057, TryCatch #0 {, blocks: (B:4:0x000d, B:12:0x0031, B:13:0x0043, B:15:0x004d, B:16:0x0053, B:7:0x0018, B:9:0x0020), top: B:22:0x000d }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m26391a(@org.jetbrains.annotations.NotNull com.yandex.mobile.ads.impl.EnumC31868y4 r6, @org.jetbrains.annotations.NotNull com.yandex.mobile.ads.impl.bd1 r7, @org.jetbrains.annotations.Nullable com.yandex.mobile.ads.impl.y42 r8) {
        /*
            r5 = this;
            java.lang.String r0 = "adLoadingPhaseType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "parametersProvider"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.Object r0 = r5.f88704a
            monitor-enter(r0)
            java.util.LinkedHashMap r1 = r5.f88706c     // Catch: java.lang.Throwable -> L57
            java.lang.Object r1 = r1.get(r6)     // Catch: java.lang.Throwable -> L57
            java.util.Map r1 = (java.util.Map) r1     // Catch: java.lang.Throwable -> L57
            if (r1 != 0) goto L18
            goto L2e
        L18:
            java.lang.Object r1 = r1.get(r8)     // Catch: java.lang.Throwable -> L57
            java.lang.Long r1 = (java.lang.Long) r1     // Catch: java.lang.Throwable -> L57
            if (r1 == 0) goto L2e
            long r1 = r1.longValue()     // Catch: java.lang.Throwable -> L57
            long r3 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L57
            long r3 = r3 - r1
            java.lang.Long r1 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Throwable -> L57
            goto L2f
        L2e:
            r1 = 0
        L2f:
            if (r1 == 0) goto L43
            long r1 = r1.longValue()     // Catch: java.lang.Throwable -> L57
            java.util.Map r7 = r7.mo28030a(r1)     // Catch: java.lang.Throwable -> L57
            com.yandex.mobile.ads.impl.x4 r1 = new com.yandex.mobile.ads.impl.x4     // Catch: java.lang.Throwable -> L57
            r1.<init>(r6, r7)     // Catch: java.lang.Throwable -> L57
            java.util.ArrayList r7 = r5.f88707d     // Catch: java.lang.Throwable -> L57
            r7.add(r1)     // Catch: java.lang.Throwable -> L57
        L43:
            java.util.LinkedHashMap r7 = r5.f88706c     // Catch: java.lang.Throwable -> L57
            java.lang.Object r6 = r7.get(r6)     // Catch: java.lang.Throwable -> L57
            java.util.Map r6 = (java.util.Map) r6     // Catch: java.lang.Throwable -> L57
            if (r6 == 0) goto L53
            java.lang.Object r6 = r6.remove(r8)     // Catch: java.lang.Throwable -> L57
            java.lang.Long r6 = (java.lang.Long) r6     // Catch: java.lang.Throwable -> L57
        L53:
            kotlin.Unit r6 = kotlin.Unit.f99208a     // Catch: java.lang.Throwable -> L57
            monitor-exit(r0)
            return
        L57:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C31952z4.m26391a(com.yandex.mobile.ads.impl.y4, com.yandex.mobile.ads.impl.bd1, com.yandex.mobile.ads.impl.y42):void");
    }

    /* renamed from: a */
    public final void m26390a(@NotNull EnumC31868y4 adLoadingPhaseType, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(adLoadingPhaseType, "adLoadingPhaseType");
        synchronized (this.f88704a) {
            Map map = (Map) this.f88706c.get(adLoadingPhaseType);
            if (map == null) {
                map = new LinkedHashMap();
            }
            this.f88706c.put(adLoadingPhaseType, map);
            map.put(obj, Long.valueOf(SystemClock.elapsedRealtime()));
            Unit unit = Unit.f99208a;
        }
    }
}
