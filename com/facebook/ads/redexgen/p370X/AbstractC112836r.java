package com.facebook.ads.redexgen.p370X;

import java.io.Serializable;
import java.util.Arrays;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b&\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lkotlin/jvm/internal/Lambda;", "R", "Lkotlin/jvm/internal/FunctionBase;", "Ljava/io/Serializable;", "arity", "", "(I)V", "getArity", "()I", "toString", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.facebook.ads.redexgen.X.6r */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC112836r<R> implements InterfaceC11907HY<R>, Serializable {
    public static byte[] A01;
    public final int A00;

    static {
        A04();
    }

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 115);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A01 = new byte[]{60, 43, 32, 42, 43, 60, 2, 47, 35, 44, 42, 47, 26, 33, 29, 58, 60, 39, 32, 41, 102, 96, 96, 96, 103};
    }

    public AbstractC112836r(int i) {
        this.A00 = i;
    }

    public final String toString() {
        String A012 = AbstractC13226d6.A01(this);
        C13227d7.A06(A012, A03(0, 25, 61));
        return A012;
    }
}
