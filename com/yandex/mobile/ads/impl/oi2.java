package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes8.dex */
public final class oi2 {

    /* renamed from: a */
    private boolean f83535a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m30981a(Context context) {
        if (context != null) {
            if (this.f83535a) {
                return;
            }
            this.f83535a = true;
            ej2.m34515a().m34513a(context);
            ii2.m33265a().m33264a(context);
            ki2.m32542a(context);
            ti2.m29147a().m29146a(context);
            return;
        }
        throw new IllegalArgumentException("Application Context cannot be null");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean m30982a() {
        return this.f83535a;
    }
}
