package com.applovin.impl;

import android.content.Context;
import com.applovin.impl.C4165c6;
import com.applovin.impl.InterfaceC4509h5;

/* renamed from: com.applovin.impl.v5 */
/* loaded from: classes2.dex */
public final class C5678v5 implements InterfaceC4509h5.InterfaceC4510a {

    /* renamed from: a */
    private final Context f11448a;

    /* renamed from: b */
    private final InterfaceC5862xo f11449b;

    /* renamed from: c */
    private final InterfaceC4509h5.InterfaceC4510a f11450c;

    public C5678v5(Context context, InterfaceC5862xo interfaceC5862xo, InterfaceC4509h5.InterfaceC4510a interfaceC4510a) {
        this.f11448a = context.getApplicationContext();
        this.f11449b = interfaceC5862xo;
        this.f11450c = interfaceC4510a;
    }

    @Override // com.applovin.impl.InterfaceC4509h5.InterfaceC4510a
    /* renamed from: b */
    public C5603u5 mo93968a() {
        C5603u5 c5603u5 = new C5603u5(this.f11448a, this.f11450c.mo93968a());
        InterfaceC5862xo interfaceC5862xo = this.f11449b;
        if (interfaceC5862xo != null) {
            c5603u5.mo94272a(interfaceC5862xo);
        }
        return c5603u5;
    }

    public C5678v5(Context context, String str) {
        this(context, str, (InterfaceC5862xo) null);
    }

    public C5678v5(Context context, String str, InterfaceC5862xo interfaceC5862xo) {
        this(context, interfaceC5862xo, new C4165c6.C4167b().m100243a(str));
    }
}
