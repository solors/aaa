package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.res.Configuration;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.b1 */
/* loaded from: classes8.dex */
public final class C29980b1 {
    @NotNull

    /* renamed from: a */
    private final HashSet<InterfaceC30529i1> f76986a;
    @NotNull

    /* renamed from: b */
    private final HashSet<InterfaceC30065c1> f76987b;

    /* renamed from: c */
    private int f76988c;

    public C29980b1(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f76986a = new HashSet<>();
        this.f76987b = new HashSet<>();
        this.f76988c = m35721a(context);
    }

    /* renamed from: a */
    public final void m35719a(@NotNull InterfaceC30065c1 focusListener) {
        Intrinsics.checkNotNullParameter(focusListener, "focusListener");
        this.f76987b.add(focusListener);
    }

    /* renamed from: b */
    public final void m35718b() {
        Iterator<InterfaceC30065c1> it = this.f76987b.iterator();
        while (it.hasNext()) {
            it.next().mo26079a();
        }
    }

    /* renamed from: a */
    private static int m35721a(Context context) {
        return context.getResources().getConfiguration().orientation;
    }

    /* renamed from: b */
    public final void m35717b(@NotNull InterfaceC30065c1 focusListener) {
        Intrinsics.checkNotNullParameter(focusListener, "focusListener");
        this.f76987b.remove(focusListener);
    }

    /* renamed from: a */
    public final void m35720a(@NotNull Configuration config) {
        Intrinsics.checkNotNullParameter(config, "config");
        int i = config.orientation;
        if (i != this.f76988c) {
            Iterator<InterfaceC30529i1> it = this.f76986a.iterator();
            while (it.hasNext()) {
                it.next().m33393a();
            }
            this.f76988c = i;
        }
    }

    /* renamed from: a */
    public final void m35722a() {
        Iterator<InterfaceC30065c1> it = this.f76987b.iterator();
        while (it.hasNext()) {
            it.next().mo26076b();
        }
    }
}
