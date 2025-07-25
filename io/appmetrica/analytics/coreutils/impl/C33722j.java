package io.appmetrica.analytics.coreutils.impl;

import android.content.ComponentName;
import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;

/* renamed from: io.appmetrica.analytics.coreutils.impl.j */
/* loaded from: classes9.dex */
public final class C33722j extends Lambda implements Functions {

    /* renamed from: a */
    public final /* synthetic */ Context f92401a;

    /* renamed from: b */
    public final /* synthetic */ ComponentName f92402b;

    /* renamed from: c */
    public final /* synthetic */ int f92403c;

    /* renamed from: d */
    public final /* synthetic */ int f92404d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33722j(Context context, ComponentName componentName, int i, int i2) {
        super(0);
        this.f92401a = context;
        this.f92402b = componentName;
        this.f92403c = i;
        this.f92404d = i2;
    }

    @Override // kotlin.jvm.functions.Functions
    public final Object invoke() {
        this.f92401a.getPackageManager().setComponentEnabledSetting(this.f92402b, this.f92403c, this.f92404d);
        return Unit.f99208a;
    }
}
