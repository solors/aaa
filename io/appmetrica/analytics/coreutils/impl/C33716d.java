package io.appmetrica.analytics.coreutils.impl;

import android.content.Context;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;

/* renamed from: io.appmetrica.analytics.coreutils.impl.d */
/* loaded from: classes9.dex */
public final class C33716d extends Lambda implements Functions {

    /* renamed from: a */
    public final /* synthetic */ Context f92385a;

    /* renamed from: b */
    public final /* synthetic */ String f92386b;

    /* renamed from: c */
    public final /* synthetic */ int f92387c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33716d(Context context, String str, int i) {
        super(0);
        this.f92385a = context;
        this.f92386b = str;
        this.f92387c = i;
    }

    @Override // kotlin.jvm.functions.Functions
    public final Object invoke() {
        return this.f92385a.getPackageManager().getPackageInfo(this.f92386b, this.f92387c);
    }
}
