package com.facebook.ads.redexgen.p370X;

import android.view.View;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.do */
/* loaded from: assets/audience_network.dex */
public final class C13257do<ModelType, StateType> {
    public static byte[] A07;
    public static final C13257do A08;
    public String A00;
    public boolean A01;
    public final C13257do A02;
    public final ModelType A03;
    public final StateType A04;
    public final String A05;
    public final List<InterfaceC13260dr<ModelType, StateType>> A06;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 26);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A07 = new byte[]{78, 113, 125, 111, 104, 119, 113, 118, 108, 92, 121, 108, 121, 56, 107, 112, 119, 109, 116, 124, 56, 118, 119, 108, 56, 123, 119, 118, 108, 121, 113, 118, 56, 121, 56, 110, 113, 125, 111, 56, 121, 107, 56, 117, 119, 124, 125, 116, 83, 91, 70, 66, 79};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final void A03(InterfaceC13247dd interfaceC13247dd) {
        for (InterfaceC13260dr<ModelType, StateType> interfaceC13260dr : this.A06) {
            interfaceC13260dr.A5y(this, interfaceC13247dd);
        }
        if (interfaceC13247dd.A8h(this) == EnumC13248de.A02) {
            this.A01 = true;
        }
    }

    static {
        A02();
        A08 = new C13257do(null, null, A01(48, 5, 44), A01(48, 5, 44), Collections.emptyList(), A08);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.do != com.instagram.common.viewpoint.core.ViewpointData<ModelType, StateType> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.dp != com.instagram.common.viewpoint.core.ViewpointData$Builder<ModelType, StateType> */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C13257do(com.facebook.ads.redexgen.p370X.C13258dp<ModelType, StateType> r8) {
        /*
            r7 = this;
            java.lang.Object r1 = com.facebook.ads.redexgen.p370X.C13258dp.A01(r8)
            java.lang.Object r2 = com.facebook.ads.redexgen.p370X.C13258dp.A02(r8)
            java.lang.String r3 = com.facebook.ads.redexgen.p370X.C13258dp.A03(r8)
            java.lang.String r4 = com.facebook.ads.redexgen.p370X.C13258dp.A03(r8)
            java.util.List r0 = com.facebook.ads.redexgen.p370X.C13258dp.A04(r8)
            if (r0 != 0) goto L23
            java.util.List r5 = java.util.Collections.emptyList()
        L1a:
            com.facebook.ads.redexgen.X.do r6 = com.facebook.ads.redexgen.p370X.C13258dp.A00(r8)
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        L23:
            java.util.List r5 = com.facebook.ads.redexgen.p370X.C13258dp.A04(r8)
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p370X.C13257do.<init>(com.facebook.ads.redexgen.X.dp):void");
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.do != com.instagram.common.viewpoint.core.ViewpointData<ModelType, StateType> */
    public C13257do(ModelType modeltype, StateType statetype, String str, String str2, List<InterfaceC13260dr<ModelType, StateType>> list, C13257do c13257do) {
        if (!(modeltype instanceof View)) {
            this.A03 = modeltype;
            this.A04 = statetype;
            this.A05 = str;
            this.A00 = str2;
            this.A02 = c13257do;
            this.A01 = false;
            this.A06 = list;
            return;
        }
        throw new IllegalArgumentException(A01(0, 48, 2));
    }

    public static <ModelType, StateType> C13258dp<ModelType, StateType> A00(ModelType model, StateType state, String str) {
        return new C13258dp<>(model, state, str);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.do != com.instagram.common.viewpoint.core.ViewpointData<ModelType, StateType> */
    public final boolean A04() {
        return this.A01;
    }
}
