package com.facebook.ads.redexgen.p370X;

import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.DF */
/* loaded from: assets/audience_network.dex */
public final class C11663DF {
    public final int A00;
    public final String A01;
    public final List<C11662DE> A02;
    public final byte[] A03;

    public C11663DF(int i, String str, List<C11662DE> list, byte[] bArr) {
        List<C11662DE> unmodifiableList;
        this.A00 = i;
        this.A01 = str;
        if (list == null) {
            unmodifiableList = Collections.emptyList();
        } else {
            unmodifiableList = Collections.unmodifiableList(list);
        }
        this.A02 = unmodifiableList;
        this.A03 = bArr;
    }
}
