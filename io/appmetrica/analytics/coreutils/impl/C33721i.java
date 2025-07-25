package io.appmetrica.analytics.coreutils.impl;

import android.content.Context;
import android.content.Intent;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;

/* renamed from: io.appmetrica.analytics.coreutils.impl.i */
/* loaded from: classes9.dex */
public final class C33721i extends Lambda implements Functions {

    /* renamed from: a */
    public final /* synthetic */ Context f92398a;

    /* renamed from: b */
    public final /* synthetic */ Intent f92399b;

    /* renamed from: c */
    public final /* synthetic */ int f92400c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33721i(Context context, Intent intent, int i) {
        super(0);
        this.f92398a = context;
        this.f92399b = intent;
        this.f92400c = i;
    }

    @Override // kotlin.jvm.functions.Functions
    public final Object invoke() {
        return this.f92398a.getPackageManager().resolveService(this.f92399b, this.f92400c);
    }
}
