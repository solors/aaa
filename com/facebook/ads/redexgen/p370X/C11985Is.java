package com.facebook.ads.redexgen.p370X;

import android.view.View;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* renamed from: com.facebook.ads.redexgen.X.Is */
/* loaded from: assets/audience_network.dex */
public final class C11985Is implements SharedViewpointManager {
    public static byte[] A07;
    public static String[] A08 = {"BoSaZzMMCoBoab6kFzr2tWGVTni5", "Vk9jbaVPkS6rtGXBWv67wEIKcLe3GnXQ", "GJsVZyBqNYZRU43kGmqANe", "Uv9MZIJr", "GbPwVrzkFOEMxWNTB1P9oG5CUgrItJXy", "gWutc4DO", "1FOrRj10jdO8", "rnakDij4LZYpzXru71B"};
    public InterfaceC13252dj A00;
    public C13239dV A01;
    public final InterfaceC13263dv A03;
    public final InterfaceC13253dk A04;
    public final ViewpointQeConfig A05;
    public final LinkedHashMap<Integer, Runnable> A06 = new LinkedHashMap<>();
    public final InterfaceC13252dj A02 = new C12004JB(this);

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 106);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A07 = new byte[]{-28};
    }

    static {
        A04();
    }

    public C11985Is(ViewpointQeConfig viewpointQeConfig, InterfaceC13263dv interfaceC13263dv, InterfaceC13253dk interfaceC13253dk) {
        this.A05 = viewpointQeConfig;
        this.A03 = interfaceC13263dv;
        this.A04 = interfaceC13253dk;
    }

    public static C11985Is A01() {
        return new C11985Is(new ViewpointQeConfig(), new C12021JS(), null);
    }

    private void A05(AbstractC13255dm abstractC13255dm, InterfaceC13259dq interfaceC13259dq, InterfaceC11944IA interfaceC11944IA) {
        this.A01 = C13239dV.A00(this.A05, abstractC13255dm, interfaceC13259dq, interfaceC11944IA);
        if (0 != 0) {
            this.A01.A01(null);
        }
        this.A01.A02(this.A02);
        String[] strArr = A08;
        if (strArr[4].charAt(11) == strArr[1].charAt(11)) {
            throw new RuntimeException();
        }
        A08[7] = "2MhPhimmgHBptxasGUILH2";
    }

    private void A06(DspViewableNode dspViewableNode, C13261dt c13261dt) {
        C13239dV c13239dV = this.A01;
        if (c13239dV != null && dspViewableNode != null) {
            if (this.A05.A00 && c13261dt != null) {
                c13239dV.A04(dspViewableNode, c13261dt);
            } else {
                c13239dV.A03(dspViewableNode);
            }
        }
    }

    private void A07(DspViewableNode dspViewableNode, C13261dt c13261dt, C13257do c13257do) {
        C13239dV c13239dV = this.A01;
        if (c13239dV != null && dspViewableNode != null && c13257do != null) {
            if (this.A05.A00 && c13261dt != null) {
                c13257do.A00 = dspViewableNode.hashCode() + A02(0, 1, 27) + c13257do.A05 + c13261dt;
                c13239dV.A05(dspViewableNode, c13261dt, c13257do);
                return;
            }
            c13239dV.A06(dspViewableNode, c13257do);
        }
    }

    public final void A08(View view) {
        A06(view != null ? ViewpointViewNode.A00(view) : null, null);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.do != com.instagram.common.viewpoint.core.ViewpointData<?, ?> */
    public final void A09(View view, C13257do<?, ?> c13257do) {
        A07(view != null ? ViewpointViewNode.A00(view) : null, null, c13257do);
    }

    public final void A0A(AbstractC13255dm abstractC13255dm, View view) {
        if (abstractC13255dm != null && view != null) {
            A05(abstractC13255dm, new C12006JD(view, this.A03), new C112886z(null));
        }
    }
}
