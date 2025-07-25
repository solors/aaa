package com.p551my.target;

import android.view.View;
import java.util.ArrayList;

/* renamed from: com.my.target.x8 */
/* loaded from: classes7.dex */
public final class C26224x8 extends AbstractC25756fa {

    /* renamed from: d */
    public final ArrayList f68285d;

    public C26224x8(InterfaceC25856k2 interfaceC25856k2, ArrayList arrayList, ArrayList arrayList2) {
        super(interfaceC25856k2, arrayList);
        this.f68285d = arrayList2;
    }

    @Override // com.p551my.target.AbstractC25756fa
    /* renamed from: a */
    public void mo42231a(boolean z, float f, View view) {
    }

    /* renamed from: a */
    public static C26224x8 m42434a(InterfaceC25856k2 interfaceC25856k2, ArrayList arrayList, ArrayList arrayList2) {
        return new C26224x8(interfaceC25856k2, arrayList, arrayList2);
    }

    @Override // com.p551my.target.AbstractC25756fa
    /* renamed from: a */
    public void mo42234a(View view) {
        C25735ea.m43958a(this.f66850a, view.getContext());
        C25735ea.m43958a(this.f68285d, view.getContext());
        AbstractC25846ja.m43677b("ViewabilityTracker: RenderStatTracker", "Render tracked, kill self");
        mo43234b();
    }

    @Override // com.p551my.target.AbstractC25756fa
    /* renamed from: c */
    public void mo42229c() {
    }
}
