package io.appmetrica.analytics.coreutils.impl;

import android.content.Context;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;

/* renamed from: io.appmetrica.analytics.coreutils.impl.b */
/* loaded from: classes9.dex */
public final class C33714b extends Lambda implements Functions {

    /* renamed from: a */
    public final /* synthetic */ Context f92380a;

    /* renamed from: b */
    public final /* synthetic */ String f92381b;

    /* renamed from: c */
    public final /* synthetic */ int f92382c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33714b(Context context, String str, int i) {
        super(0);
        this.f92380a = context;
        this.f92381b = str;
        this.f92382c = i;
    }

    @Override // kotlin.jvm.functions.Functions
    public final Object invoke() {
        return this.f92380a.getPackageManager().getApplicationInfo(this.f92381b, this.f92382c);
    }
}
