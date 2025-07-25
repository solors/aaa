package com.facebook.ads.redexgen.p370X;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.ay */
/* loaded from: assets/audience_network.dex */
public class C13096ay implements InterfaceC111083z {
    public final /* synthetic */ C11782FV A00;
    public final /* synthetic */ C111033u A01;

    public C13096ay(C11782FV c11782fv, C111033u c111033u) {
        this.A00 = c11782fv;
        this.A01 = c111033u;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC111083z
    public final Object A4s(int i) {
        C111013s compatInfo = this.A01.A00(i);
        if (compatInfo == null) {
            return null;
        }
        return compatInfo.A0M();
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC111083z
    public final List<Object> A63(String str, int i) {
        List<C111013s> A03 = this.A01.A03(str, i);
        if (A03 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int infoCount = A03.size();
        for (int i2 = 0; i2 < infoCount; i2++) {
            arrayList.add(A03.get(i2).A0M());
        }
        return arrayList;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC111083z
    public final Object A64(int i) {
        C111013s compatInfo = this.A01.A01(i);
        if (compatInfo == null) {
            return null;
        }
        return compatInfo.A0M();
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC111083z
    public final boolean AEQ(int i, int i2, Bundle bundle) {
        return this.A01.A04(i, i2, bundle);
    }
}
