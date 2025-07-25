package com.facebook.ads.redexgen.p370X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.common.primitives.SignedBytes;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.0y */
/* loaded from: assets/audience_network.dex */
public final class C109230y extends BroadcastReceiver {
    public static byte[] A04;
    public InterfaceC13199cf A00;
    public InterfaceC109220x A01;
    public C13029Zs A02;
    public String A03;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 17);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{120, 66, 78, 76, 15, 71, SignedBytes.MAX_POWER_OF_TWO, 66, 68, 67, 78, 78, 74, 15, SignedBytes.MAX_POWER_OF_TWO, 69, 82, 15, 67, SignedBytes.MAX_POWER_OF_TWO, 79, 79, 68, 83, 15, 66, 77, 72, 66, 74, 68, 69};
    }

    public C109230y(C13029Zs c13029Zs, String str, InterfaceC13199cf interfaceC13199cf, InterfaceC109220x interfaceC109220x) {
        this.A02 = c13029Zs;
        this.A03 = str;
        this.A01 = interfaceC109220x;
        this.A00 = interfaceC13199cf;
    }

    public final void A02() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(A00(1, 31, 48) + A00(0, 1, 83) + this.A03);
        C110372o.A00(this.A02).A06(this, intentFilter);
    }

    public final void A03() {
        C110372o.A00(this.A02).A05(this);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action == null) {
            return;
        }
        String intentAction = A00(0, 1, 83);
        String[] parts = action.split(intentAction);
        String str = parts[0];
        if (str == null) {
            return;
        }
        String intentAction2 = A00(1, 31, 48);
        if (intentAction2.equals(str)) {
            this.A01.ABN(this.A00);
        }
    }
}
