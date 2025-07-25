package com.p551my.target;

import android.view.View;
import java.util.ArrayList;

/* renamed from: com.my.target.wa */
/* loaded from: classes7.dex */
public final class C26197wa extends AbstractC25756fa {
    public C26197wa(InterfaceC25856k2 interfaceC25856k2, ArrayList arrayList) {
        super(interfaceC25856k2, arrayList);
    }

    @Override // com.p551my.target.AbstractC25756fa
    /* renamed from: a */
    public void mo42234a(View view) {
    }

    /* renamed from: a */
    public static C26197wa m42552a(InterfaceC25856k2 interfaceC25856k2, ArrayList arrayList) {
        return new C26197wa(interfaceC25856k2, arrayList);
    }

    @Override // com.p551my.target.AbstractC25756fa
    /* renamed from: a */
    public void mo42231a(boolean z, float f, View view) {
        if (AbstractC26075s1.m42940a(f, 0.0f) == 1) {
            C25735ea.m43958a(this.f66850a, view.getContext());
            AbstractC25846ja.m43677b("ViewabilityTracker: ShowStatTracker", "ViewIn tracked, kill self");
            mo43234b();
        }
    }

    @Override // com.p551my.target.AbstractC25756fa
    /* renamed from: c */
    public void mo42229c() {
    }
}
