package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.location.Location;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsJVM;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class zp0 {
    @NotNull

    /* renamed from: f */
    private static final Object f89061f = new Object();
    @Nullable

    /* renamed from: g */
    private static volatile zp0 f89062g;

    /* renamed from: h */
    public static final /* synthetic */ int f89063h = 0;
    @NotNull

    /* renamed from: a */
    private final cq0 f89064a;
    @NotNull

    /* renamed from: b */
    private final bq0 f89065b;
    @NotNull

    /* renamed from: c */
    private final as1 f89066c;
    @NotNull

    /* renamed from: d */
    private final vs1 f89067d;
    @NotNull

    /* renamed from: e */
    private final Context f89068e;

    /* renamed from: com.yandex.mobile.ads.impl.zp0$a */
    /* loaded from: classes8.dex */
    public static final class C32009a {
        @NotNull
        /* renamed from: a */
        public static zp0 m26027a(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (zp0.f89062g == null) {
                synchronized (zp0.f89061f) {
                    if (zp0.f89062g == null) {
                        zp0.f89062g = new zp0(context);
                    }
                    Unit unit = Unit.f99208a;
                }
            }
            zp0 zp0Var = zp0.f89062g;
            if (zp0Var != null) {
                return zp0Var;
            }
            throw new IllegalStateException("Required value was null.".toString());
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    /* synthetic */ zp0(android.content.Context r7) {
        /*
            r6 = this;
            com.yandex.mobile.ads.impl.cq0 r2 = new com.yandex.mobile.ads.impl.cq0
            r2.<init>()
            com.yandex.mobile.ads.impl.bq0 r3 = new com.yandex.mobile.ads.impl.bq0
            r3.<init>()
            int r0 = com.yandex.mobile.ads.impl.as1.f76895l
            com.yandex.mobile.ads.impl.as1 r4 = com.yandex.mobile.ads.impl.as1.C29962a.m35776a()
            com.yandex.mobile.ads.impl.vs1 r5 = new com.yandex.mobile.ads.impl.vs1
            r5.<init>()
            r0 = r6
            r1 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.zp0.<init>(android.content.Context):void");
    }

    @Nullable
    /* renamed from: c */
    public final Location m26028c() {
        Location location;
        List m17177c;
        List<? extends Location> m17179a;
        synchronized (f89061f) {
            if (this.f89066c.m35787d()) {
                vs1 vs1Var = this.f89067d;
                Context context = this.f89068e;
                vs1Var.getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                if (!vs1.m28231a(context)) {
                    bq0 bq0Var = this.f89065b;
                    Context context2 = this.f89068e;
                    bq0Var.getClass();
                    ArrayList m35451a = bq0.m35451a(context2);
                    m17177c = CollectionsJVM.m17177c();
                    Iterator it = m35451a.iterator();
                    while (it.hasNext()) {
                        Location mo30087a = ((aq0) it.next()).mo30087a();
                        if (mo30087a != null) {
                            m17177c.add(mo30087a);
                        }
                    }
                    m17179a = CollectionsJVM.m17179a(m17177c);
                    location = this.f89064a.m35180a(m17179a);
                }
            }
            location = null;
        }
        return location;
    }

    private zp0(Context context, cq0 cq0Var, bq0 bq0Var, as1 as1Var, vs1 vs1Var) {
        this.f89064a = cq0Var;
        this.f89065b = bq0Var;
        this.f89066c = as1Var;
        this.f89067d = vs1Var;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.f89068e = applicationContext;
    }
}
