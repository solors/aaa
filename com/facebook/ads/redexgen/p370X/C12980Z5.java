package com.facebook.ads.redexgen.p370X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Z5 */
/* loaded from: assets/audience_network.dex */
public class C12980Z5 implements InterfaceC11528B2 {
    public final C12974Yz A00 = new C12974Yz();
    public final C12973Yy A01 = new C12973Yy();
    public final InterfaceC11506Ag[] A02;

    public C12980Z5(InterfaceC11506Ag... interfaceC11506AgArr) {
        this.A02 = (InterfaceC11506Ag[]) Arrays.copyOf(interfaceC11506AgArr, interfaceC11506AgArr.length + 2);
        this.A02[interfaceC11506AgArr.length] = this.A00;
        this.A02[interfaceC11506AgArr.length + 1] = this.A01;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11528B2
    public final C11466A2 A3x(C11466A2 c11466a2) {
        this.A00.A0B(c11466a2.A02);
        return new C11466A2(this.A01.A01(c11466a2.A01), this.A01.A00(c11466a2.A00), c11466a2.A02);
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11528B2
    public final InterfaceC11506Ag[] A6S() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11528B2
    public final long A7m(long j) {
        return this.A01.A02(j);
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11528B2
    public final long A8O() {
        return this.A00.A0A();
    }
}
