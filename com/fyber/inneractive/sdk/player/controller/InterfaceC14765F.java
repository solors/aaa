package com.fyber.inneractive.sdk.player.controller;

import android.view.View;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.ignite.EnumC14568m;
import com.fyber.inneractive.sdk.util.C15411B;
import com.fyber.inneractive.sdk.util.C15446f0;
import com.fyber.inneractive.sdk.util.EnumC15447g;

/* renamed from: com.fyber.inneractive.sdk.player.controller.F */
/* loaded from: classes4.dex */
public interface InterfaceC14765F {
    /* renamed from: a */
    C15411B mo76609a(C15446f0 c15446f0, EnumC15447g enumC15447g);

    /* renamed from: a */
    C15411B mo76608a(String str, C15446f0 c15446f0, boolean z);

    /* renamed from: a */
    void mo76613a(View view);

    /* renamed from: a */
    void mo76612a(View view, String str);

    /* renamed from: a */
    void mo76607a(String str, String str2);

    /* renamed from: a */
    void mo76606a(boolean z);

    /* renamed from: a */
    void mo76605a(boolean z, Orientation orientation);

    /* renamed from: c */
    void mo76602c();

    /* renamed from: e */
    void mo76601e();

    /* renamed from: f */
    void mo76599f();

    /* renamed from: h */
    void mo76598h();

    /* renamed from: i */
    void mo76597i();

    /* renamed from: j */
    void mo76596j();

    /* renamed from: o */
    EnumC14568m mo76644o();

    void onCompleted();

    void onPlayerError();

    void onProgress(int i, int i2);
}
