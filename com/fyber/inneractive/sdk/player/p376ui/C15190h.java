package com.fyber.inneractive.sdk.player.p376ui;

import android.view.ViewGroup;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.util.AbstractC15458l0;
import com.fyber.inneractive.sdk.util.AbstractC15459m;
import com.fyber.inneractive.sdk.util.C15448g0;

/* renamed from: com.fyber.inneractive.sdk.player.ui.h */
/* loaded from: classes4.dex */
public final class C15190h implements InterfaceC15183a {
    @Override // com.fyber.inneractive.sdk.player.p376ui.InterfaceC15183a
    /* renamed from: a */
    public final C15448g0 mo77088a(UnitDisplayType unitDisplayType, int i, int i2, boolean z, C15448g0 c15448g0, int i3, int i4, int i5, int i6) {
        if (c15448g0 == null) {
            return null;
        }
        if (unitDisplayType == UnitDisplayType.SQUARE) {
            int min = Math.min(i3, i5) - AbstractC15459m.m76491a(i6 * 2);
            c15448g0.f30598a = min;
            c15448g0.f30599b = min;
        } else if (unitDisplayType == UnitDisplayType.LANDSCAPE) {
            int min2 = Math.min(i3, i5) - AbstractC15459m.m76491a(i6 * 2);
            c15448g0.f30598a = min2;
            c15448g0.f30599b = (min2 * 9) / 16;
        } else if (unitDisplayType == UnitDisplayType.MRECT) {
            c15448g0.f30598a = AbstractC15459m.m76491a(300);
            c15448g0.f30599b = AbstractC15459m.m76491a(250);
        } else if (unitDisplayType == UnitDisplayType.DEFAULT && z) {
            AbstractC15458l0.m76494a(unitDisplayType, c15448g0, i, i2, i3, i4);
        } else {
            c15448g0.f30598a = 0;
            c15448g0.f30599b = 0;
        }
        return c15448g0;
    }

    @Override // com.fyber.inneractive.sdk.player.p376ui.InterfaceC15183a
    /* renamed from: a */
    public final C15448g0 mo77089a(UnitDisplayType unitDisplayType, int i, int i2, C15448g0 c15448g0, int i3, ViewGroup viewGroup) {
        C15448g0 c15448g02 = new C15448g0(0, 0);
        if (unitDisplayType == UnitDisplayType.SQUARE) {
            int i4 = c15448g0.f30598a;
            AbstractC15458l0.m76494a(unitDisplayType, c15448g02, i, i2, i4, i4);
        } else {
            AbstractC15458l0.m76494a(unitDisplayType, c15448g02, i, i2, c15448g0.f30598a, c15448g0.f30599b);
        }
        return c15448g02;
    }
}
