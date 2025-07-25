package com.chartboost.sdk.impl;

import android.view.View;

/* renamed from: com.chartboost.sdk.impl.nc */
/* loaded from: classes3.dex */
public class C10084nc extends C9747bd {

    /* renamed from: d */
    public static C10084nc f22760d = new C10084nc();

    /* renamed from: g */
    public static C10084nc m80986g() {
        return f22760d;
    }

    @Override // com.chartboost.sdk.impl.C9747bd
    /* renamed from: b */
    public void mo80988b(boolean z) {
        for (C9746bc c9746bc : C10300vc.m80229c().m80231b()) {
            c9746bc.m81974k().m80573a(z);
        }
    }

    @Override // com.chartboost.sdk.impl.C9747bd
    /* renamed from: d */
    public boolean mo80987d() {
        for (C9746bc c9746bc : C10300vc.m80229c().m80233a()) {
            View m81980e = c9746bc.m81980e();
            if (m81980e != null && m81980e.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}
