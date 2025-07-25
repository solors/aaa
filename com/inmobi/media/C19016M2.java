package com.inmobi.media;

import android.os.Bundle;
import androidx.browser.customtabs.CustomTabsCallback;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.M2 */
/* loaded from: classes6.dex */
public final class C19016M2 extends CustomTabsCallback {

    /* renamed from: a */
    public final /* synthetic */ C19029N2 f47462a;

    public C19016M2(C19029N2 c19029n2) {
        this.f47462a = c19029n2;
    }

    @Override // androidx.browser.customtabs.CustomTabsCallback
    public final void onNavigationEvent(int i, Bundle bundle) {
        InterfaceC18959I1 interfaceC18959I1;
        super.onNavigationEvent(i, bundle);
        Intrinsics.checkNotNullExpressionValue("N2", "access$getLOG_TAG$cp(...)");
        InterfaceC18988K2 interfaceC18988K2 = this.f47462a.f47551c;
        if (interfaceC18988K2 != null) {
            C19015M1 c19015m1 = (C19015M1) interfaceC18988K2;
            if (i != 5) {
                if (i == 6 && (interfaceC18959I1 = c19015m1.f47457b) != null) {
                    interfaceC18959I1.mo60855a();
                    return;
                }
                return;
            }
            InterfaceC18959I1 interfaceC18959I12 = c19015m1.f47457b;
            if (interfaceC18959I12 != null) {
                interfaceC18959I12.mo60853b();
            }
        }
    }
}
