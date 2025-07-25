package com.facebook.ads.redexgen.p370X;

/* renamed from: com.facebook.ads.redexgen.X.ZO */
/* loaded from: assets/audience_network.dex */
public class C12999ZO implements InterfaceC113908n {
    public final /* synthetic */ String[] A00;

    public C12999ZO(String[] strArr) {
        this.A00 = strArr;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC113908n
    public final boolean A2w(String str) {
        for (String str2 : this.A00) {
            if (str2.equals(str)) {
                return false;
            }
        }
        return true;
    }
}
