package com.facebook.ads.redexgen.p370X;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.3x */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC111063x {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.ads.redexgen.X.3v] */
    public static C111043v A00(final InterfaceC111053w interfaceC111053w) {
        return new AccessibilityNodeProvider() { // from class: com.facebook.ads.redexgen.X.3v
            @Override // android.view.accessibility.AccessibilityNodeProvider
            public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
                return (AccessibilityNodeInfo) InterfaceC111053w.this.A4s(i);
            }

            @Override // android.view.accessibility.AccessibilityNodeProvider
            public final List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
                return InterfaceC111053w.this.A63(str, i);
            }

            @Override // android.view.accessibility.AccessibilityNodeProvider
            public final boolean performAction(int i, int i2, Bundle bundle) {
                return InterfaceC111053w.this.AEQ(i, i2, bundle);
            }
        };
    }
}
