package com.p551my.target;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

/* renamed from: com.my.target.za */
/* loaded from: classes7.dex */
public final class C26276za extends AbstractC25765g1 {

    /* renamed from: f */
    public boolean f68425f;

    /* renamed from: g */
    public float f68426g;

    /* renamed from: h */
    public Context f68427h;

    public C26276za(InterfaceC25856k2 interfaceC25856k2, ArrayList arrayList, long j) {
        super(interfaceC25856k2, arrayList, j);
        this.f68425f = false;
        this.f68426g = 0.0f;
    }

    /* renamed from: a */
    public final void m42232a(boolean z, float f) {
        this.f68426g = Math.max(this.f68426g, f);
        long m42228d = m42228d();
        if (!z || m42228d >= 60000) {
            m42235a(this.f68426g, m42228d);
            return;
        }
        AbstractC25846ja.m43677b("ViewabilityTracker: ViewabilityDurationStatTracker", "No need to send ViewabilityDurationStat (isVisible = true, currentDurationMillis = " + m42228d + ")");
    }

    /* renamed from: b */
    public final void m42230b(float f, long j) {
        String valueOf = String.valueOf((int) f);
        String format = String.format(Locale.getDefault(), "%.1f", Float.valueOf(((float) Math.min(j, 60000L)) / 1000.0f));
        HashMap hashMap = new HashMap();
        hashMap.put("viewability_percent", valueOf);
        hashMap.put("viewability_duration", format);
        AbstractC25846ja.m43677b("ViewabilityTracker: ViewabilityDurationStatTracker", "Sending ViewabilityDuration stat (max visible percent = " + valueOf + ", duration = " + format + " sec)");
        C25735ea.m43952c(this.f66850a, hashMap, this.f68427h);
    }

    @Override // com.p551my.target.AbstractC25756fa
    /* renamed from: c */
    public void mo42229c() {
        if (this.f68425f) {
            m42235a(this.f68426g, m42228d());
        } else {
            this.f66867e = 0L;
        }
        this.f68427h = null;
    }

    /* renamed from: d */
    public final long m42228d() {
        return System.currentTimeMillis() - this.f66867e;
    }

    /* renamed from: a */
    public final void m42235a(float f, long j) {
        m42230b(f, j);
        AbstractC25846ja.m43677b("ViewabilityTracker: ViewabilityDurationStatTracker", "ViewabilityDuration tracked, kill self");
        mo43234b();
    }

    /* renamed from: a */
    public static C26276za m42233a(InterfaceC25856k2 interfaceC25856k2, ArrayList arrayList, long j) {
        return new C26276za(interfaceC25856k2, arrayList, j);
    }

    @Override // com.p551my.target.AbstractC25756fa
    /* renamed from: a */
    public void mo42231a(boolean z, float f, View view) {
        if (this.f68425f) {
            m42232a(z, f);
        } else if (m43883a(z)) {
            this.f68425f = true;
            this.f68426g = f;
            AbstractC25846ja.m43677b("ViewabilityTracker: ViewabilityDurationStatTracker", "Start tracking viewability");
        }
    }

    @Override // com.p551my.target.AbstractC25756fa
    /* renamed from: a */
    public void mo42234a(View view) {
        this.f68427h = view.getContext().getApplicationContext();
    }
}
