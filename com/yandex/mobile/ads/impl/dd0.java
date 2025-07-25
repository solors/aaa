package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import com.monetization.ads.core.identifiers.p548ad.huawei.ServiceConnectionC25460a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class dd0 implements InterfaceC30228ec {
    @NotNull

    /* renamed from: a */
    private final xo1 f78043a;
    @NotNull

    /* renamed from: b */
    private final Context f78044b;
    @NotNull

    /* renamed from: c */
    private final fd0 f78045c;
    @NotNull

    /* renamed from: d */
    private final gd0 f78046d;

    public /* synthetic */ dd0(Context context) {
        this(context, new xo1());
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30228ec
    @Nullable
    /* renamed from: a */
    public final C31967zb mo34639a() {
        ResolveInfo resolveInfo;
        this.f78046d.getClass();
        Intent intent = gd0.m33881a();
        xo1 xo1Var = this.f78043a;
        Context context = this.f78044b;
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
                ServiceConnectionC25460a serviceConnectionC25460a = new ServiceConnectionC25460a();
                if (this.f78044b.bindService(intent, serviceConnectionC25460a, 1)) {
                    C31967zb m34172a = this.f78045c.m34172a(serviceConnectionC25460a);
                    this.f78044b.unbindService(serviceConnectionC25460a);
                    c31967zb = m34172a;
                } else {
                    um0.m28728a(new Object[0]);
                }
            } catch (Throwable unused2) {
                um0.m28726c(new Object[0]);
            }
        }
        return c31967zb;
    }

    public dd0(@NotNull Context context, @NotNull xo1 safePackageManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(safePackageManager, "safePackageManager");
        this.f78043a = safePackageManager;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.f78044b = applicationContext;
        this.f78045c = new fd0();
        this.f78046d = new gd0();
    }
}
