package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.f2 */
/* loaded from: classes8.dex */
public final class C30284f2 {
    @NotNull

    /* renamed from: b */
    private static final Object f78881b = new Object();
    @Nullable

    /* renamed from: c */
    private static volatile C30284f2 f78882c;

    /* renamed from: d */
    public static final /* synthetic */ int f78883d = 0;
    @NotNull

    /* renamed from: a */
    private final C30218e2 f78884a;

    /* renamed from: com.yandex.mobile.ads.impl.f2$a */
    /* loaded from: classes8.dex */
    public static final class C30285a {
        @NotNull
        /* renamed from: a */
        public static C30284f2 m34382a(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (C30284f2.f78882c == null) {
                synchronized (C30284f2.f78881b) {
                    if (C30284f2.f78882c == null) {
                        int i = up0.f86348b;
                        Intrinsics.checkNotNullParameter(context, "context");
                        C30284f2.f78882c = new C30284f2(up0.m28713a(context, "YadPreferenceFile"));
                    }
                    Unit unit = Unit.f99208a;
                }
            }
            C30284f2 c30284f2 = C30284f2.f78882c;
            if (c30284f2 != null) {
                return c30284f2;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    private C30284f2(C30218e2 c30218e2) {
        this.f78884a = c30218e2;
    }

    @NotNull
    /* renamed from: c */
    public final C30218e2 m34383c() {
        return this.f78884a;
    }

    /* synthetic */ C30284f2(sp0 sp0Var) {
        this(new C30218e2(sp0Var));
    }
}
