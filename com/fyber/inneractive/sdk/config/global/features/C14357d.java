package com.fyber.inneractive.sdk.config.global.features;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.model.vast.C14608a;

/* renamed from: com.fyber.inneractive.sdk.config.global.features.d */
/* loaded from: classes4.dex */
public final class C14357d extends AbstractC14361h {

    /* renamed from: e */
    public C14608a f27197e;

    public C14357d() {
        super("cta_locale");
    }

    @Override // com.fyber.inneractive.sdk.config.global.features.AbstractC14361h
    /* renamed from: c */
    public final AbstractC14361h mo77947c() {
        C14357d c14357d = new C14357d();
        m77954a(c14357d);
        return c14357d;
    }

    /* renamed from: d */
    public final void m77955d(String str) {
        if (!TextUtils.isEmpty(str) && this.f27197e == null) {
            String mo77933a = mo77933a("install_" + str, null);
            String mo77933a2 = mo77933a("skip_ad_" + str, null);
            this.f27197e = new C14608a(mo77933a, mo77933a2, mo77933a("skip_in_" + str, null));
        }
    }
}
