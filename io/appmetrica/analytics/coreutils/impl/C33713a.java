package io.appmetrica.analytics.coreutils.impl;

import android.content.ComponentName;
import android.content.Context;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;

/* renamed from: io.appmetrica.analytics.coreutils.impl.a */
/* loaded from: classes9.dex */
public final class C33713a extends Lambda implements Functions {

    /* renamed from: a */
    public final /* synthetic */ Context f92377a;

    /* renamed from: b */
    public final /* synthetic */ ComponentName f92378b;

    /* renamed from: c */
    public final /* synthetic */ int f92379c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33713a(Context context, ComponentName componentName, int i) {
        super(0);
        this.f92377a = context;
        this.f92378b = componentName;
        this.f92379c = i;
    }

    @Override // kotlin.jvm.functions.Functions
    public final Object invoke() {
        return this.f92377a.getPackageManager().getActivityInfo(this.f92378b, this.f92379c);
    }
}
