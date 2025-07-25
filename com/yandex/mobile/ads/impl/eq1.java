package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.as1;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class eq1 {
    @NotNull

    /* renamed from: b */
    private static final Object f78751b = new Object();
    @Nullable

    /* renamed from: c */
    private static volatile eq1 f78752c;

    /* renamed from: d */
    public static final /* synthetic */ int f78753d = 0;
    @NotNull

    /* renamed from: a */
    private final HashMap f78754a;

    /* renamed from: com.yandex.mobile.ads.impl.eq1$a */
    /* loaded from: classes8.dex */
    public static final class C30265a {
        @NotNull
        /* renamed from: a */
        public static eq1 m34464a() {
            eq1 eq1Var;
            eq1 eq1Var2 = eq1.f78752c;
            if (eq1Var2 == null) {
                synchronized (eq1.f78751b) {
                    eq1Var = eq1.f78752c;
                    if (eq1Var == null) {
                        eq1Var = new eq1(0);
                        eq1.f78752c = eq1Var;
                    }
                }
                return eq1Var;
            }
            return eq1Var2;
        }
    }

    private eq1() {
        this.f78754a = new HashMap();
    }

    /* renamed from: a */
    public final void m34468a(@NotNull Context context, @NotNull yp1 sdkConfiguration) {
        HashSet hashSet;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkConfiguration, "sdkConfiguration");
        synchronized (f78751b) {
            hashSet = new HashSet(this.f78754a.keySet());
            int i = as1.f76895l;
            as1.C29962a.m35776a().m35795a(context, sdkConfiguration);
            Unit unit = Unit.f99208a;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((nq1) it.next()).mo31437a(context, sdkConfiguration);
        }
    }

    public /* synthetic */ eq1(int i) {
        this();
    }

    /* renamed from: a */
    public final void m34467a(@NotNull aq1 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (f78751b) {
            if (!this.f78754a.containsKey(listener)) {
                this.f78754a.put(listener, null);
            }
            Unit unit = Unit.f99208a;
        }
    }
}
