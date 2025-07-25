package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.impl.sa2;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class ta2 implements sa2 {
    @NotNull

    /* renamed from: a */
    private final sa2 f85567a;

    /* renamed from: b */
    private boolean f85568b;

    /* renamed from: c */
    private boolean f85569c;

    public ta2(@NotNull C29957aq videoTracker) {
        Intrinsics.checkNotNullParameter(videoTracker, "videoTracker");
        this.f85567a = videoTracker;
    }

    @Override // com.yandex.mobile.ads.impl.sa2
    /* renamed from: a */
    public final void mo29044a(@NotNull View view, @NotNull List<k62> friendlyOverlays) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(friendlyOverlays, "friendlyOverlays");
        this.f85567a.mo29044a(view, friendlyOverlays);
        this.f85568b = false;
        this.f85569c = false;
    }

    @Override // com.yandex.mobile.ads.impl.sa2
    /* renamed from: b */
    public final void mo29040b() {
        this.f85567a.mo29040b();
        mo29031k();
    }

    @Override // com.yandex.mobile.ads.impl.sa2
    /* renamed from: c */
    public final void mo29039c() {
        this.f85567a.mo29039c();
    }

    @Override // com.yandex.mobile.ads.impl.sa2
    /* renamed from: d */
    public final void mo29038d() {
        this.f85567a.mo29038d();
    }

    @Override // com.yandex.mobile.ads.impl.sa2
    /* renamed from: e */
    public final void mo29037e() {
        this.f85567a.mo29037e();
        mo29031k();
    }

    @Override // com.yandex.mobile.ads.impl.sa2
    /* renamed from: f */
    public final void mo29036f() {
        this.f85567a.mo29036f();
    }

    @Override // com.yandex.mobile.ads.impl.sa2
    /* renamed from: g */
    public final void mo29035g() {
        this.f85567a.mo29035g();
        mo29031k();
    }

    @Override // com.yandex.mobile.ads.impl.sa2
    /* renamed from: h */
    public final void mo29034h() {
        if (!this.f85568b) {
            this.f85568b = true;
            this.f85567a.mo29034h();
        }
    }

    @Override // com.yandex.mobile.ads.impl.sa2
    /* renamed from: i */
    public final void mo29033i() {
        this.f85567a.mo29033i();
    }

    @Override // com.yandex.mobile.ads.impl.sa2
    /* renamed from: j */
    public final void mo29032j() {
        this.f85567a.mo29032j();
    }

    @Override // com.yandex.mobile.ads.impl.sa2
    /* renamed from: k */
    public final void mo29031k() {
        this.f85567a.mo29031k();
        this.f85568b = false;
        this.f85569c = false;
    }

    @Override // com.yandex.mobile.ads.impl.sa2
    /* renamed from: l */
    public final void mo29030l() {
        this.f85567a.mo29030l();
    }

    @Override // com.yandex.mobile.ads.impl.sa2
    /* renamed from: m */
    public final void mo29029m() {
        this.f85567a.mo29029m();
        mo29034h();
        mo29028n();
    }

    @Override // com.yandex.mobile.ads.impl.sa2
    /* renamed from: n */
    public final void mo29028n() {
        if (!this.f85569c) {
            this.f85569c = true;
            this.f85567a.mo29028n();
        }
    }

    @Override // com.yandex.mobile.ads.impl.sa2
    /* renamed from: a */
    public final void mo29041a(@NotNull String assetName) {
        Intrinsics.checkNotNullParameter(assetName, "assetName");
        this.f85567a.mo29041a(assetName);
        mo29034h();
        mo29028n();
    }

    @Override // com.yandex.mobile.ads.impl.sa2
    /* renamed from: a */
    public final void mo29043a(@NotNull g72 error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f85567a.mo29043a(error);
        mo29031k();
    }

    @Override // com.yandex.mobile.ads.impl.sa2
    /* renamed from: a */
    public final void mo29042a(@NotNull sa2.EnumC31344a quartile) {
        Intrinsics.checkNotNullParameter(quartile, "quartile");
        this.f85567a.mo29042a(quartile);
    }

    @Override // com.yandex.mobile.ads.impl.sa2
    /* renamed from: a */
    public final void mo29045a(float f, long j) {
        this.f85567a.mo29045a(f, j);
    }

    @Override // com.yandex.mobile.ads.impl.sa2
    /* renamed from: a */
    public final void mo29047a() {
        this.f85567a.mo29047a();
    }

    @Override // com.yandex.mobile.ads.impl.sa2
    /* renamed from: a */
    public final void mo29046a(float f) {
        this.f85567a.mo29046a(f);
    }
}
