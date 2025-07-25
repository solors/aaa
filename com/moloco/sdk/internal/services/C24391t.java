package com.moloco.sdk.internal.services;

import android.content.Context;
import android.content.pm.PackageInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.C38508r;
import p804nd.Result;

/* renamed from: com.moloco.sdk.internal.services.t */
/* loaded from: classes7.dex */
public final class C24391t implements InterfaceC24390s {
    @NotNull

    /* renamed from: a */
    public final Context f63126a;
    @Nullable

    /* renamed from: b */
    public C24389r f63127b;

    public C24391t(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f63126a = context;
    }

    @Override // com.moloco.sdk.internal.services.InterfaceC24390s
    @NotNull
    public C24389r invoke() {
        Object m14549b;
        C24389r c24389r = this.f63127b;
        if (c24389r == null) {
            try {
                Result.C38506a c38506a = Result.f101870c;
                Context context = this.f63126a;
                String obj = context.getPackageManager().getApplicationLabel(context.getApplicationInfo()).toString();
                PackageInfo m46500a = C24392u.m46500a(this.f63126a);
                String str = m46500a.packageName;
                Intrinsics.checkNotNullExpressionValue(str, "it.packageName");
                String str2 = m46500a.versionName;
                Intrinsics.checkNotNullExpressionValue(str2, "it.versionName");
                C24389r c24389r2 = new C24389r(obj, str, str2);
                this.f63127b = c24389r2;
                m14549b = Result.m14549b(c24389r2);
            } catch (Throwable th) {
                Result.C38506a c38506a2 = Result.f101870c;
                m14549b = Result.m14549b(C38508r.m14540a(th));
            }
            if (Result.m14544g(m14549b)) {
                m14549b = null;
            }
            C24389r c24389r3 = (C24389r) m14549b;
            if (c24389r3 == null) {
                return new C24389r("", "", "");
            }
            return c24389r3;
        }
        return c24389r;
    }
}
