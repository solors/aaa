package io.appmetrica.analytics.coreutils.impl;

import android.content.Context;
import android.content.Intent;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;

/* renamed from: io.appmetrica.analytics.coreutils.impl.g */
/* loaded from: classes9.dex */
public final class C33719g extends Lambda implements Functions {

    /* renamed from: a */
    public final /* synthetic */ Context f92393a;

    /* renamed from: b */
    public final /* synthetic */ Intent f92394b;

    /* renamed from: c */
    public final /* synthetic */ int f92395c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33719g(Context context, Intent intent, int i) {
        super(0);
        this.f92393a = context;
        this.f92394b = intent;
        this.f92395c = i;
    }

    @Override // kotlin.jvm.functions.Functions
    public final Object invoke() {
        return this.f92393a.getPackageManager().resolveActivity(this.f92394b, this.f92395c);
    }
}
