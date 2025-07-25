package com.fyber.inneractive.sdk.player.p376ui;

import android.view.ViewGroup;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.util.AbstractC15458l0;
import com.fyber.inneractive.sdk.util.C15448g0;

/* renamed from: com.fyber.inneractive.sdk.player.ui.f */
/* loaded from: classes4.dex */
public final class C15188f implements InterfaceC15183a {
    @Override // com.fyber.inneractive.sdk.player.p376ui.InterfaceC15183a
    /* renamed from: a */
    public final C15448g0 mo77088a(UnitDisplayType unitDisplayType, int i, int i2, boolean z, C15448g0 c15448g0, int i3, int i4, int i5, int i6) {
        if (unitDisplayType == UnitDisplayType.DEFAULT && z) {
            AbstractC15458l0.m76494a(unitDisplayType, c15448g0, i, i2, i3, i4);
        }
        c15448g0.f30598a = 0;
        c15448g0.f30599b = 0;
        return c15448g0;
    }

    @Override // com.fyber.inneractive.sdk.player.p376ui.InterfaceC15183a
    /* renamed from: a */
    public final C15448g0 mo77089a(UnitDisplayType unitDisplayType, int i, int i2, C15448g0 c15448g0, int i3, ViewGroup viewGroup) {
        C15448g0 c15448g02 = new C15448g0(0, 0);
        if (unitDisplayType == UnitDisplayType.SQUARE) {
            int min = Math.min(c15448g0.f30598a, i3);
            if (viewGroup != null) {
                viewGroup.getLayoutParams().width = min;
                viewGroup.getLayoutParams().height = min;
            }
            AbstractC15458l0.m76494a(unitDisplayType, c15448g02, i, i2, min, min);
        } else {
            AbstractC15458l0.m76494a(unitDisplayType, c15448g02, i, i2, c15448g0.f30598a, c15448g0.f30599b);
        }
        return c15448g02;
    }
}
