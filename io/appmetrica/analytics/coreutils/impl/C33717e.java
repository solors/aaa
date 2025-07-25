package io.appmetrica.analytics.coreutils.impl;

import android.content.ComponentName;
import android.content.Context;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;

/* renamed from: io.appmetrica.analytics.coreutils.impl.e */
/* loaded from: classes9.dex */
public final class C33717e extends Lambda implements Functions {

    /* renamed from: a */
    public final /* synthetic */ Context f92388a;

    /* renamed from: b */
    public final /* synthetic */ ComponentName f92389b;

    /* renamed from: c */
    public final /* synthetic */ int f92390c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33717e(Context context, ComponentName componentName, int i) {
        super(0);
        this.f92388a = context;
        this.f92389b = componentName;
        this.f92390c = i;
    }

    @Override // kotlin.jvm.functions.Functions
    public final Object invoke() {
        return this.f92388a.getPackageManager().getServiceInfo(this.f92389b, this.f92390c);
    }
}
