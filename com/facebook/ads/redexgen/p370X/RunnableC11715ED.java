package com.facebook.ads.redexgen.p370X;

import android.util.Log;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.ED */
/* loaded from: assets/audience_network.dex */
public class RunnableC11715ED implements Runnable {
    public static byte[] A02;
    public static String[] A03 = {"9o2RxoXQGzsRG5J758VgWnXZxAzPRq", "slrrPzhosaIRqTN91PQYW8eaCwjzQBbt", "YVDvad", "Ym", "53", "hXaHevQM6mpLzWC0IPGUKBJDuwqdnNoz", "RJB0f5QpOpSi3jWxIV2", "1FVstl0HMzPtGnzHv5PnFy0PCKNLlrql"};
    public final /* synthetic */ C11721EL A00;
    public final /* synthetic */ DownloadAction[] A01;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 108);
            String[] strArr = A03;
            if (strArr[5].charAt(26) == strArr[7].charAt(26)) {
                throw new RuntimeException();
            }
            A03[3] = ApsMetricsDataMap.APSMETRICS_FIELD_NETWORK;
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{78, 101, 125, 100, 102, 101, 107, 110, 71, 107, 100, 107, 109, 111, 120, 103, 82, 69, 68, 94, 68, 67, 94, 89, 80, 23, 86, 84, 67, 94, 88, 89, 68, 23, 81, 86, 94, 91, 82, 83, 25};
    }

    static {
        A01();
    }

    public RunnableC11715ED(C11721EL c11721el, DownloadAction[] downloadActionArr) {
        this.A00 = c11721el;
        this.A01 = downloadActionArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C11709E1 c11709e1;
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            try {
                c11709e1 = this.A00.A09;
                c11709e1.A02(this.A01);
            } catch (IOException e) {
                Log.e(A00(0, 15, 102), A00(15, 26, 91), e);
            }
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }
}
