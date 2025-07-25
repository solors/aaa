package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class gz0 implements ly0, my0, db1 {
    @NotNull

    /* renamed from: a */
    private final ArrayList f79808a = new ArrayList();
    @NotNull

    /* renamed from: b */
    private final ArrayList f79809b = new ArrayList();
    @NotNull

    /* renamed from: c */
    private final ArrayList f79810c = new ArrayList();

    /* renamed from: a */
    public final void m33754a(@NotNull ly0 mobileAdsSchemeImpressionListener) {
        Intrinsics.checkNotNullParameter(mobileAdsSchemeImpressionListener, "mobileAdsSchemeImpressionListener");
        this.f79808a.add(mobileAdsSchemeImpressionListener);
    }

    @Override // com.yandex.mobile.ads.impl.ly0
    /* renamed from: b */
    public final void mo27999b() {
        Iterator it = this.f79808a.iterator();
        while (it.hasNext()) {
            ((ly0) it.next()).mo27999b();
        }
    }

    @Override // com.yandex.mobile.ads.impl.db1
    /* renamed from: c */
    public final void mo29676c() {
        Iterator it = this.f79810c.iterator();
        while (it.hasNext()) {
            ((db1) it.next()).mo29676c();
        }
    }

    @Override // com.yandex.mobile.ads.impl.ly0
    /* renamed from: e */
    public final void mo27998e() {
        Iterator it = this.f79808a.iterator();
        while (it.hasNext()) {
            ((ly0) it.next()).mo27998e();
        }
    }

    /* renamed from: a */
    public final void m33753a(@NotNull my0 mobileAdsSchemeRewardListener) {
        Intrinsics.checkNotNullParameter(mobileAdsSchemeRewardListener, "mobileAdsSchemeRewardListener");
        this.f79809b.add(mobileAdsSchemeRewardListener);
    }

    /* renamed from: a */
    public final void m33755a(@NotNull db1 onCloseButtonListener) {
        Intrinsics.checkNotNullParameter(onCloseButtonListener, "onCloseButtonListener");
        this.f79810c.add(onCloseButtonListener);
    }

    @Override // com.yandex.mobile.ads.impl.my0
    /* renamed from: a */
    public final void mo28000a() {
        Iterator it = this.f79809b.iterator();
        while (it.hasNext()) {
            ((my0) it.next()).mo28000a();
        }
    }

    @Override // com.yandex.mobile.ads.impl.db1
    /* renamed from: a */
    public final void mo29678a(boolean z) {
        Iterator it = this.f79810c.iterator();
        while (it.hasNext()) {
            ((db1) it.next()).mo29678a(z);
        }
    }
}
