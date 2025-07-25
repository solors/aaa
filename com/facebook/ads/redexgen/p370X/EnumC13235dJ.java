package com.facebook.ads.redexgen.p370X;

import java.util.Arrays;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/annotation/AnnotationRetention;", "", "(Ljava/lang/String;I)V", "SOURCE", "BINARY", "RUNTIME", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.facebook.ads.redexgen.X.dJ */
/* loaded from: assets/audience_network.dex */
public enum EnumC13235dJ {
    A06,
    A04,
    A05;
    
    public static byte[] A00;
    public static String[] A01 = {"fFLrYkclouhdNCScOJVITlITEC9eolLv", "ZsxYP5jxTrBpNVdG3", "C95vkx1geO3cBWoagx6NE1xSoeMRhwP9", "iO0R402xG4", "zEdFj9GRV7SaJSnl1uP", "cXEoPWFY8ZWz1GMGWuexrOl99MIgTsP", "fXFXcHbhRt7OOsQru5ewvFqn501YUyRx", "g44IdfNFgL"};
    public static final /* synthetic */ InterfaceC11913He A02;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 77);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-61, -54, -49, -62, -45, -38, -94, -91, -98, -92, -103, -99, -107, -51, -55, -49, -52, -67, -65};
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static EnumC13235dJ[] valuesCustom() {
        EnumC13235dJ[] valuesCustom = values();
        if (A01[4].length() != 0) {
            A01[5] = "kC8OQjnUJR";
            return (EnumC13235dJ[]) valuesCustom.clone();
        }
        throw new RuntimeException();
    }

    static {
        A01();
        A02 = AbstractC13230dB.A01(A03);
    }
}
