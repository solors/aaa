package com.facebook.ads.redexgen.p370X;

import android.content.SharedPreferences;

/* renamed from: com.facebook.ads.redexgen.X.bI */
/* loaded from: assets/audience_network.dex */
public class C13114bI implements InterfaceC110202X {
    public final SharedPreferences.Editor A00;

    public C13114bI(SharedPreferences.Editor editor) {
        this.A00 = editor;
    }

    public final C13114bI A00(String str, long j) {
        this.A00.putLong(str, j);
        return this;
    }

    public final C13114bI A01(String str, String str2) {
        this.A00.putString(str, str2);
        return this;
    }

    public final void A02() {
        this.A00.apply();
    }
}
