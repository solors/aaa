package com.mbridge.msdk.mbbid.out;

/* loaded from: classes6.dex */
public class BidLossCode {

    /* renamed from: a */
    private static int f57389a;

    private BidLossCode(int i) {
        f57389a = i;
    }

    public static BidLossCode bidPriceNotHighest() {
        return new BidLossCode(102);
    }

    public static BidLossCode bidTimeOut() {
        return new BidLossCode(2);
    }

    public static BidLossCode bidWinButNotShow() {
        return new BidLossCode(3001);
    }

    public int getCurrentCode() {
        return f57389a;
    }
}
