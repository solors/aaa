package com.facebook.ads.redexgen.p370X;

import android.graphics.Rect;
import android.os.Handler;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.df */
/* loaded from: assets/audience_network.dex */
public final class C13249df {
    public static String[] A0D = {"hvB6Y5lFyDpOUo5WE2d6RBuRXgbY5ZUm", "NE", "ywY8EvofFV55395JkJDayoeTErGWKbkG", "zJ8LsRBLLSys8CPHp", "gH0zTalybZGhm0qBmcsXdCP28l4r1an9", "kduBCn7ltQGfodptcqURcnO6EcdnH0I2", "cBbzau3JoVbeDspRwe3LG6GIj8yddyUH", "tX"};
    public InterfaceC13252dj A00;
    public boolean A01;
    public final Rect A02;
    public final Rect A03;
    public final Handler A04;
    public final InterfaceC12608T0 A05;
    public final InterfaceC13259dq A06;
    public final ViewpointQeConfig A07;
    public final ViewpointRegistry A08;
    public final InterfaceC11944IA A09;
    public final Runnable A0A;
    public final List<Rect> A0B;
    public final List<DspViewableNode> A0C;

    public C13249df(ViewpointQeConfig viewpointQeConfig, InterfaceC13259dq interfaceC13259dq, InterfaceC12608T0 interfaceC12608T0, InterfaceC11944IA interfaceC11944IA, ViewpointRegistry viewpointRegistry, Handler handler) {
        this(viewpointQeConfig, interfaceC13259dq, interfaceC12608T0, interfaceC11944IA, viewpointRegistry, handler, 100);
    }

    public C13249df(ViewpointQeConfig viewpointQeConfig, InterfaceC13259dq interfaceC13259dq, InterfaceC12608T0 interfaceC12608T0, InterfaceC11944IA interfaceC11944IA, ViewpointRegistry viewpointRegistry, Handler handler, int i) {
        this.A03 = new Rect();
        this.A02 = new Rect();
        this.A0C = new ArrayList();
        this.A0B = new ArrayList();
        this.A01 = false;
        this.A07 = viewpointQeConfig;
        this.A06 = interfaceC13259dq;
        this.A05 = interfaceC12608T0;
        this.A09 = interfaceC11944IA;
        this.A08 = viewpointRegistry;
        this.A04 = handler;
        this.A0A = new RunnableC13250dg(this, i, new Exception());
    }

    private void A03(long j) {
        if (this.A0C.isEmpty()) {
            this.A06.A8m(this.A0B);
            this.A09.A4N(j, this.A0B);
            this.A09.A5v();
            return;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04(long j) {
        this.A06.A8m(this.A0B);
        this.A09.A4N(j, this.A0B);
        if (this.A0C.isEmpty()) {
            this.A08.A08(this.A0C);
            for (final DspViewableNode dspViewableNode : this.A0C) {
                if (this.A07.A00) {
                    this.A08.A07(dspViewableNode, new InterfaceC11912Hd() { // from class: com.facebook.ads.redexgen.X.70
                        @Override // com.facebook.ads.redexgen.p370X.InterfaceC11912Hd
                        public final Object A9K(Object obj) {
                            return C13249df.this.A08(dspViewableNode, (C13257do) obj);
                        }
                    });
                } else {
                    A06(dspViewableNode, this.A08.A02(dspViewableNode));
                }
            }
            this.A09.A5v();
            if (this.A00 != null) {
                InterfaceC13252dj interfaceC13252dj = this.A00;
                String[] strArr = A0D;
                if (strArr[2].charAt(24) != strArr[5].charAt(24)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0D;
                strArr2[6] = "0nrzH38GFR0AnNATGilmIDxGL8fq4UsQ";
                strArr2[4] = "c6vzpxWZV3AO1VWKwqmDQLGTjAEAJtLq";
                interfaceC13252dj.ADV();
            }
            this.A0C.clear();
            return;
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.do != com.instagram.common.viewpoint.core.ViewpointData<?, ?> */
    private void A06(DspViewableNode dspViewableNode, C13257do<?, ?> c13257do) {
        for (Rect rect : this.A0B) {
            Rect containerRect = this.A03;
            if (dspViewableNode.A8l(containerRect, this.A02, rect) && c13257do != C13257do.A08) {
                InterfaceC11944IA interfaceC11944IA = this.A09;
                Rect rect2 = this.A03;
                String[] strArr = A0D;
                if (strArr[1].length() != strArr[7].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0D;
                strArr2[6] = "GkBz7jFj6BmSvOwlnDuwIQ8kdYWcjX9Q";
                strArr2[4] = "0Qzzj3tYyfuWL6OVNzyvBOA9tkBax5QR";
                interfaceC11944IA.A3r(c13257do, rect2, this.A02);
            }
        }
    }

    public final /* synthetic */ C13236dK A08(DspViewableNode dspViewableNode, C13257do c13257do) {
        A06(dspViewableNode, c13257do);
        return null;
    }

    public final void A09() {
        if (this.A00 != null) {
            this.A00.ADV();
        }
        if (this.A01) {
            this.A04.removeCallbacks(this.A0A);
            A03(this.A05.AAy());
        }
        this.A01 = false;
    }

    public final void A0A() {
        if (!this.A01) {
            this.A01 = true;
            this.A04.post(this.A0A);
        }
    }

    public final void A0B(InterfaceC13254dl interfaceC13254dl) {
        this.A09.AGh(interfaceC13254dl);
    }

    public final void A0C(InterfaceC13252dj interfaceC13252dj) {
        this.A00 = interfaceC13252dj;
    }
}
