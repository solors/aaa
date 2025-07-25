package com.taurusx.tax.p604i.p605t;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.amazon.device.ads.DtbConstants;
import com.taurusx.tax.p578b.p581e.C28219a;
import com.taurusx.tax.p578b.p581e.C28237j;
import com.taurusx.tax.p604i.C28445h;

/* renamed from: com.taurusx.tax.i.t.b */
/* loaded from: classes7.dex */
public class C28463b implements C28445h.InterfaceC28446a {

    /* renamed from: a */
    public final /* synthetic */ DialogC28460a f73895a;

    public C28463b(DialogC28460a dialogC28460a) {
        this.f73895a = dialogC28460a;
    }

    @Override // com.taurusx.tax.p604i.C28445h.InterfaceC28446a
    /* renamed from: a */
    public void mo37825a() {
    }

    @Override // com.taurusx.tax.p604i.C28445h.InterfaceC28446a
    /* renamed from: a */
    public void mo37824a(C28219a c28219a, C28237j c28237j) {
    }

    @Override // com.taurusx.tax.p604i.C28445h.InterfaceC28446a
    /* renamed from: a */
    public boolean mo37823a(String str) {
        Log.d("AdTuneAlert", "onJump: url = " + str);
        if (TextUtils.equals(str, "taurusx://adoClosed")) {
            this.f73895a.m38079a();
            return true;
        } else if (TextUtils.isEmpty(str)) {
            return false;
        } else {
            if (str.startsWith("http://") || str.startsWith(DtbConstants.HTTPS)) {
                try {
                    Activity m38077c = this.f73895a.m38077c();
                    if (m38077c != null) {
                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                        intent.addFlags(268435456);
                        m38077c.startActivity(intent);
                        return true;
                    }
                    return false;
                } catch (Exception e) {
                    e.printStackTrace();
                    return false;
                }
            }
            return false;
        }
    }

    @Override // com.taurusx.tax.p604i.C28445h.InterfaceC28446a
    /* renamed from: b */
    public void mo37822b() {
    }
}
