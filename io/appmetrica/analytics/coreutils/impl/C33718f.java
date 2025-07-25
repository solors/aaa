package io.appmetrica.analytics.coreutils.impl;

import android.content.Context;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;

/* renamed from: io.appmetrica.analytics.coreutils.impl.f */
/* loaded from: classes9.dex */
public final class C33718f extends Lambda implements Functions {

    /* renamed from: a */
    public final /* synthetic */ Context f92391a;

    /* renamed from: b */
    public final /* synthetic */ String f92392b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33718f(Context context, String str) {
        super(0);
        this.f92391a = context;
        this.f92392b = str;
    }

    @Override // kotlin.jvm.functions.Functions
    public final Object invoke() {
        return Boolean.valueOf(this.f92391a.getPackageManager().hasSystemFeature(this.f92392b));
    }
}
