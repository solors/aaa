package com.taurusx.tax.p594e;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.taurusx.tax.log.LogUtil;

/* renamed from: com.taurusx.tax.e.o */
/* loaded from: classes7.dex */
public class C28354o extends C28337h {

    /* renamed from: b */
    public Context f73611b;

    public C28354o(C28363r0 c28363r0) {
        super(c28363r0);
        this.f73611b = c28363r0.getContext();
    }

    /* renamed from: a */
    public final boolean m38222a(String str) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        intent.addFlags(268435456);
        try {
            this.f73572a.getContext().startActivity(intent);
            return true;
        } catch (Exception unused) {
            LogUtil.m37905d("MraidBrowserController", "Unable to open intent.");
            return false;
        }
    }
}
