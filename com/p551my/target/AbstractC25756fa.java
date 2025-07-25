package com.p551my.target;

import android.view.View;
import com.p551my.target.C25663bb;
import java.util.ArrayList;

/* renamed from: com.my.target.fa */
/* loaded from: classes7.dex */
public abstract class AbstractC25756fa {

    /* renamed from: a */
    public final ArrayList f66850a;

    /* renamed from: b */
    public final InterfaceC25856k2 f66851b;

    /* renamed from: c */
    public boolean f66852c = false;

    public AbstractC25756fa(InterfaceC25856k2 interfaceC25856k2, ArrayList arrayList) {
        this.f66851b = interfaceC25856k2;
        this.f66850a = arrayList;
    }

    /* renamed from: a */
    public final C25663bb.AbstractC25664a m43897a() {
        if (this.f66852c) {
            return null;
        }
        return this.f66851b.mo43659a();
    }

    /* renamed from: a */
    public abstract void mo42234a(View view);

    /* renamed from: a */
    public abstract void mo42231a(boolean z, float f, View view);

    /* renamed from: b */
    public void mo43234b() {
        if (this.f66852c) {
            return;
        }
        this.f66851b.mo43658a(this);
        this.f66852c = true;
        AbstractC25846ja.m43677b("ViewabilityTracker: StatTracker", "i'm killed");
    }

    /* renamed from: c */
    public abstract void mo42229c();
}
