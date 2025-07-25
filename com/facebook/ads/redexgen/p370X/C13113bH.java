package com.facebook.ads.redexgen.p370X;

import android.content.SharedPreferences;

/* renamed from: com.facebook.ads.redexgen.X.bH */
/* loaded from: assets/audience_network.dex */
public final class C13113bH implements InterfaceC110212Y {
    public final SharedPreferences A00;

    public C13113bH(SharedPreferences sharedPreferences) {
        this.A00 = sharedPreferences;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC110212Y
    public final C13114bI A5o() {
        return new C13114bI(this.A00.edit());
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC110212Y
    public final long A7i(String str, long j) {
        return this.A00.getLong(str, j);
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC110212Y
    public final String A8T(String str, String str2) {
        return this.A00.getString(str, str2);
    }
}
