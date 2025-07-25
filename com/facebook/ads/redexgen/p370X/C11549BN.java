package com.facebook.ads.redexgen.p370X;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.facebook.ads.internal.util.activity.AdActivityIntent;
import com.google.common.primitives.SignedBytes;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: com.facebook.ads.redexgen.X.BN */
/* loaded from: assets/audience_network.dex */
public final class C11549BN extends FrameLayout implements InterfaceC12678U9 {
    public static byte[] A0A;
    public static String[] A0B = {"cNW8ZlUzhquZSz6XSi", "gKIjGDOIeaOzZR9qeyStr8duZ", "mQKfIuNnQZgt5ES8sx19fjwTYxycx0Lp", "WvoZHe7VElSdYX15O8PPMcOC5YskUK4l", "BfRVnLJiFu3hDnD", "WxgvJAZOXh", "crPtNK55mSnLeOXFeJGYeBq3ABMrpYK", "K6RBlZSEjGoukPcRXJY4znE0whNpCjIj"};
    public C12530Rk A00;
    public final int A01;
    public final AbstractC13171cD A02;
    public final C13029Zs A03;
    public final InterfaceC12000J7 A04;
    public final C12169Lv A05;
    public final InterfaceC12386PQ A06;
    public final C12397Pb A07;
    public final String A08;
    public final boolean A09;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0A, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 14);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A0A = new byte[]{100, 70, 73, 0, 83, 7, 84, 83, 70, 85, 83, 7, 102, 82, 67, 78, 66, 73, 68, 66, 105, 66, 83, 80, 72, 85, 76, 102, 68, 83, 78, 81, 78, 83, 94, 9, 7, 106, 70, 76, 66, 7, 84, 82, 85, 66, 7, 83, 79, 70, 83, 7, 78, 83, 0, 84, 7, 78, 73, 7, 94, 72, 82, 85, 7, 102, 73, 67, 85, 72, 78, 67, 106, 70, 73, 78, 65, 66, 84, 83, 9, 95, 74, 75, 7, 65, 78, 75, 66, 9, 24, 28, 31, 43, 58, 55, 59, 48, 61, 59, 16, 59, 42, 41, 49, 44, 53, 69, 74, 123, 69, 71, 80, 77, 82, 77, 80, 93, 4, 11, 14, 4, 12, 56, 20, 8, 18, 21, 4, 2, 90, 85, SignedBytes.MAX_POWER_OF_TWO, 93, 66, 81, 117, 80, 112, 85, SignedBytes.MAX_POWER_OF_TWO, 85, 118, 65, 90, 80, 88, 81, 27, 29, 11, 28, 13, 2, 7, 13, 5, 22, 9, 5, 23, 52, 25, 16, 5};
    }

    static {
        A02();
    }

    public C11549BN(C13029Zs c13029Zs, InterfaceC12000J7 interfaceC12000J7, InterfaceC12386PQ interfaceC12386PQ, AbstractC13171cD abstractC13171cD, String str, int i, C12169Lv c12169Lv) {
        super(c13029Zs);
        this.A03 = c13029Zs;
        this.A04 = interfaceC12000J7;
        this.A02 = abstractC13171cD;
        this.A08 = str;
        this.A06 = interfaceC12386PQ;
        this.A01 = i;
        C12397Pb preloadedDynamicWebViewController = AbstractC12398Pc.A02(abstractC13171cD.A0l());
        if (preloadedDynamicWebViewController != null) {
            this.A07 = preloadedDynamicWebViewController;
            this.A09 = true;
        } else {
            this.A07 = new C12397Pb(this.A03, abstractC13171cD, interfaceC12000J7, i);
            AbstractC12398Pc.A03(abstractC13171cD, this.A07);
            this.A09 = false;
        }
        if (c12169Lv != null) {
            this.A05 = c12169Lv;
            this.A07.A0Z(c12169Lv);
        } else {
            this.A05 = this.A07.A0L();
        }
        this.A07.A0c(new C12685UG(this));
        this.A07.A0a(interfaceC12386PQ);
        EnumC12142LU.A04(this, EnumC12142LU.A0B);
        if (C11979Im.A1p(c13029Zs)) {
            c13029Zs.A0A().AHQ(this.A07.A0O(), abstractC13171cD.A1U(), false, false, true);
        }
        A04();
    }

    private final void A03() {
        this.A07.A0d(this);
        if (!this.A09) {
            this.A03.A0E().A5d();
            this.A07.A0X();
        } else {
            this.A03.A0E().A5e();
            if (this.A07.A0k()) {
                if (this.A01 == 4) {
                    if (this.A06 != null) {
                        this.A06.ABp(this);
                    }
                    if (C11979Im.A1p(this.A03)) {
                        InterfaceC12012JJ A0A2 = this.A03.A0A();
                        if (A0B[1].length() != 25) {
                            throw new RuntimeException();
                        }
                        A0B[5] = "";
                        A0A2.ABh();
                    }
                } else {
                    AGz();
                }
            }
        }
        A08();
    }

    private final void A04() {
        C12397Pb.A0B().incrementAndGet();
        A03();
        this.A07.A0W();
    }

    private void A05(Intent intent, AbstractC13171cD abstractC13171cD) {
        intent.putExtra(A01(157, 8, 110), EnumC12069KG.A07);
        intent.putExtra(A01(130, 18, 58), abstractC13171cD);
        intent.addFlags(268435456);
    }

    private final void A06(AbstractC13171cD abstractC13171cD) {
        AdActivityIntent A04 = C12104Kq.A04(this.A03);
        A05(A04, abstractC13171cD);
        try {
            C12104Kq.A0A(this.A03, A04);
        } catch (Exception e) {
            this.A03.A07().AA0(A01(107, 11, 42), AbstractC113568E.A0D, new C113578F(e));
            Log.e(A01(90, 17, 80), A01(0, 90, 41), e);
        }
    }

    private void A07(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C12315OH c12315oh = new C12315OH(this.A03, this.A08, this.A00, this.A05, this.A04, this.A02.A1Q());
        HashMap hashMap = new HashMap();
        hashMap.put(A01(118, 12, 105), A01(148, 9, 96));
        c12315oh.A08(this.A02.A1U(), str, hashMap);
    }

    public final void A08() {
        AbstractC12177M3.A0J(this.A07.A0O());
        addView(this.A07.A0O(), new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12678U9
    public final void A8q() {
        A07(this.A02.A1P().A0G().A05());
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12678U9
    public final void A8r(String str) {
        A07(str);
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12678U9
    public final void A8v() {
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12678U9
    public final void A9j() {
        new Handler(Looper.getMainLooper()).post(new C12684UF(this));
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12678U9
    public final void AC2() {
        A06(this.A02);
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12678U9
    public final void AC6() {
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12678U9
    public final void ACm(boolean z) {
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12678U9
    public final void ADb() {
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12678U9
    public final void AE5(boolean z) {
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12678U9
    public final void AE7(boolean z) {
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12678U9
    public final void AEK(String str) {
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12678U9
    public final void AGz() {
        if (this.A06 != null) {
            this.A06.ABp(this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12678U9
    public final void close() {
    }

    public InterfaceC12000J7 getAdEventManager() {
        return this.A04;
    }

    public C12397Pb getDynamicWebViewController() {
        return this.A07;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        requestDisallowInterceptTouchEvent(true);
        return super.onTouchEvent(motionEvent);
    }

    public void setAdViewabilityChecker(C12530Rk c12530Rk) {
        this.A00 = c12530Rk;
        this.A07.A0e(c12530Rk);
    }
}
