package com.facebook.ads.redexgen.p370X;

import android.content.Context;

/* renamed from: com.facebook.ads.redexgen.X.X4 */
/* loaded from: assets/audience_network.dex */
public final class C12858X4 implements InterfaceC11871Gy {
    public final Context A00;
    public final InterfaceC11871Gy A01;
    public final InterfaceC11894HL<? super InterfaceC11872Gz> A02;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.HL != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.thirdparty.upstream.DataSource> */
    public C12858X4(Context context, InterfaceC11894HL<? super InterfaceC11872Gz> interfaceC11894HL, InterfaceC11871Gy interfaceC11871Gy) {
        this.A00 = context.getApplicationContext();
        this.A02 = interfaceC11894HL;
        this.A01 = interfaceC11871Gy;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.HL != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.thirdparty.upstream.DataSource> */
    public C12858X4(Context context, String str, InterfaceC11894HL<? super InterfaceC11872Gz> interfaceC11894HL) {
        this(context, interfaceC11894HL, new C1111041(str, interfaceC11894HL));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11871Gy
    /* renamed from: A00 */
    public final C12859X5 A4t() {
        return new C12859X5(this.A00, this.A02, this.A01.A4t());
    }
}
