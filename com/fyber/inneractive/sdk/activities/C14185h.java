package com.fyber.inneractive.sdk.activities;

import com.fyber.inneractive.sdk.click.C14291b;
import com.fyber.inneractive.sdk.click.EnumC14306q;
import com.fyber.inneractive.sdk.click.InterfaceC14304o;

/* renamed from: com.fyber.inneractive.sdk.activities.h */
/* loaded from: classes4.dex */
public final class C14185h implements InterfaceC14304o {

    /* renamed from: a */
    public final /* synthetic */ InneractiveInternalBrowserActivity f26888a;

    public C14185h(InneractiveInternalBrowserActivity inneractiveInternalBrowserActivity) {
        this.f26888a = inneractiveInternalBrowserActivity;
    }

    @Override // com.fyber.inneractive.sdk.click.InterfaceC14304o
    /* renamed from: a */
    public final void mo77802a(C14291b c14291b) {
        if (c14291b.f26999a != EnumC14306q.FAILED) {
            InneractiveInternalBrowserActivity.m78030a(this.f26888a, c14291b);
            this.f26888a.finish();
        }
    }
}
