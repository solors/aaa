package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class jc0 {
    @NotNull

    /* renamed from: a */
    private final xo1 f80862a;
    @NotNull

    /* renamed from: b */
    private final Context f80863b;
    @NotNull

    /* renamed from: c */
    private final kc0 f80864c;
    @NotNull

    /* renamed from: d */
    private final lc0 f80865d;

    public /* synthetic */ jc0(Context context) {
        this(context, new xo1());
    }

    @Nullable
    /* renamed from: a */
    public final C31967zb m32945a() {
        ResolveInfo resolveInfo;
        this.f80865d.getClass();
        Intent intent = lc0.m32295a();
        xo1 xo1Var = this.f80862a;
        Context context = this.f80863b;
        xo1Var.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        C31967zb c31967zb = null;
        try {
            resolveInfo = context.getPackageManager().resolveService(intent, 0);
        } catch (Throwable unused) {
            um0.m28726c(new Object[0]);
            resolveInfo = null;
        }
        if (resolveInfo != null) {
            try {
                gc0 gc0Var = new gc0();
                if (this.f80863b.bindService(intent, gc0Var, 1)) {
                    C31967zb m32595a = this.f80864c.m32595a(gc0Var);
                    this.f80863b.unbindService(gc0Var);
                    c31967zb = m32595a;
                } else {
                    um0.m28728a(new Object[0]);
                }
            } catch (Throwable unused2) {
                um0.m28726c(new Object[0]);
            }
        }
        return c31967zb;
    }

    public jc0(@NotNull Context context, @NotNull xo1 safePackageManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(safePackageManager, "safePackageManager");
        this.f80862a = safePackageManager;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.f80863b = applicationContext;
        this.f80864c = new kc0();
        this.f80865d = new lc0();
    }
}
