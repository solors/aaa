package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.widget.RelativeLayout;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class ma0 implements InterfaceC31919yq {
    @NotNull

    /* renamed from: a */
    private final InterfaceC30799lo f82103a;

    public ma0(@NotNull InterfaceC30799lo closeButtonController) {
        Intrinsics.checkNotNullParameter(closeButtonController, "closeButtonController");
        this.f82103a = closeButtonController;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31919yq
    @NotNull
    /* renamed from: a */
    public final RelativeLayout mo26643a(@NotNull ab0 contentView, @NotNull C30149d8 adResponse) {
        Intrinsics.checkNotNullParameter(contentView, "contentView");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Context context = contentView.getContext();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        Intrinsics.m17074g(context);
        Intrinsics.checkNotNullParameter(context, "context");
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setBackgroundColor(0);
        relativeLayout.setLayoutParams(layoutParams);
        relativeLayout.addView(contentView, new RelativeLayout.LayoutParams(-1, -1));
        relativeLayout.addView(this.f82103a.mo25974d(), C29997b8.m35578a(context, contentView));
        return relativeLayout;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31919yq
    /* renamed from: b */
    public final void mo26641b() {
        this.f82103a.mo25976b();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31919yq
    /* renamed from: c */
    public final void mo26640c() {
        this.f82103a.mo25975c();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31919yq
    /* renamed from: d */
    public final void mo26639d() {
        this.f82103a.invalidate();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31919yq
    /* renamed from: a */
    public final void mo26645a() {
        this.f82103a.mo25978a();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31919yq
    /* renamed from: a */
    public final void mo26642a(boolean z) {
        this.f82103a.mo25977a(z);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31919yq
    /* renamed from: a */
    public final void mo26644a(@NotNull RelativeLayout rootLayout) {
        Intrinsics.checkNotNullParameter(rootLayout, "rootLayout");
        rootLayout.setBackground(C29924a8.f76732b);
    }
}
