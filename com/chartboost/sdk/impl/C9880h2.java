package com.chartboost.sdk.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.chartboost.sdk.impl.h2 */
/* loaded from: classes3.dex */
public final class C9880h2 {

    /* renamed from: a */
    public final Context f22153a;

    public C9880h2(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f22153a = context;
    }

    /* renamed from: a */
    public final int m81581a() {
        return AbstractC10111p3.m80852f(this.f22153a);
    }

    /* renamed from: b */
    public final String m81580b() {
        return AbstractC10111p3.m80851g(this.f22153a).m81034b();
    }

    /* renamed from: c */
    public final EnumC10095o3 m81579c() {
        EnumC10095o3 enumC10095o3;
        Context context = this.f22153a;
        if (!AbstractC10111p3.m80854d(context)) {
            enumC10095o3 = EnumC10095o3.f22835d;
        } else if (AbstractC10111p3.m80853e(context)) {
            enumC10095o3 = EnumC10095o3.f22836e;
        } else if (AbstractC10111p3.m80855c(context)) {
            enumC10095o3 = EnumC10095o3.f22837f;
        } else {
            enumC10095o3 = EnumC10095o3.f22834c;
        }
        C9763c7.m81922a("NETWORK TYPE: " + enumC10095o3, (Throwable) null, 2, (Object) null);
        return enumC10095o3;
    }

    /* renamed from: d */
    public final boolean m81578d() {
        if (m81579c() == EnumC10095o3.f22837f) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final boolean m81577e() {
        return AbstractC10111p3.m80854d(this.f22153a);
    }

    /* renamed from: f */
    public final EnumC10065n7 m81576f() {
        return AbstractC10111p3.m80851g(this.f22153a);
    }
}
