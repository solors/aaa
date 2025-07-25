package com.yandex.mobile.ads.impl;

import com.monetization.ads.nativeads.CustomizableMediaView;

/* loaded from: classes8.dex */
final class pr1 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ hu0 f84062b;

    /* renamed from: c */
    final /* synthetic */ CustomizableMediaView f84063c;

    /* renamed from: d */
    final /* synthetic */ eu0 f84064d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public pr1(hu0 hu0Var, CustomizableMediaView customizableMediaView, eu0 eu0Var) {
        this.f84062b = hu0Var;
        this.f84063c = customizableMediaView;
        this.f84064d = eu0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f84062b.mo27593b(this.f84063c, this.f84064d);
    }
}
