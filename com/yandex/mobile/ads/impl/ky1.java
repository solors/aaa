package com.yandex.mobile.ads.impl;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class ky1 {
    @Nullable

    /* renamed from: b */
    private static volatile ky1 f81635b;
    @NotNull

    /* renamed from: c */
    private static final Object f81636c = new Object();

    /* renamed from: d */
    public static final /* synthetic */ int f81637d = 0;
    @NotNull

    /* renamed from: a */
    private final LinkedHashMap f81638a;

    /* renamed from: com.yandex.mobile.ads.impl.ky1$a */
    /* loaded from: classes8.dex */
    public static final class C30758a {
        @NotNull
        /* renamed from: a */
        public static ky1 m32392a() {
            if (ky1.f81635b == null) {
                synchronized (ky1.f81636c) {
                    if (ky1.f81635b == null) {
                        ky1.f81635b = new ky1(0);
                    }
                    Unit unit = Unit.f99208a;
                }
            }
            ky1 ky1Var = ky1.f81635b;
            if (ky1Var != null) {
                return ky1Var;
            }
            throw new IllegalStateException("Required value was null.".toString());
        }
    }

    private ky1() {
        this.f81638a = new LinkedHashMap();
    }

    /* renamed from: b */
    public final void m32393b(@NotNull zn0 referenceType, @NotNull Object keepingObject) {
        Intrinsics.checkNotNullParameter(referenceType, "referenceType");
        Intrinsics.checkNotNullParameter(keepingObject, "keepingObject");
        synchronized (f81636c) {
            Set set = (Set) this.f81638a.get(referenceType);
            if (set == null) {
                set = new LinkedHashSet();
                this.f81638a.put(referenceType, set);
            }
            set.add(keepingObject);
        }
    }

    /* renamed from: a */
    public final void m32395a(@NotNull zn0 referenceType, @NotNull Object keepingObject) {
        Intrinsics.checkNotNullParameter(referenceType, "referenceType");
        Intrinsics.checkNotNullParameter(keepingObject, "keepingObject");
        synchronized (f81636c) {
            Set set = (Set) this.f81638a.get(referenceType);
            if (set != null) {
                set.remove(keepingObject);
            }
        }
    }

    public /* synthetic */ ky1(int i) {
        this();
    }
}
