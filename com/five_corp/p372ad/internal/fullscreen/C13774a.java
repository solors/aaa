package com.five_corp.p372ad.internal.fullscreen;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import com.five_corp.p372ad.AdActivity;
import com.five_corp.p372ad.C13611f;
import com.five_corp.p372ad.internal.C14068s;
import com.five_corp.p372ad.internal.EnumC14106t;
import com.five_corp.p372ad.internal.fullscreen.C13774a;

/* renamed from: com.five_corp.ad.internal.fullscreen.a */
/* loaded from: classes4.dex */
public final class C13774a {

    /* renamed from: a */
    public final Handler f25633a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    public InterfaceC13775b f25634b = null;

    /* renamed from: a */
    public final void m78389a() {
        InterfaceC13775b interfaceC13775b = this.f25634b;
        if (interfaceC13775b != null) {
            ((C13611f) interfaceC13775b).m78547a(0, new C14068s(EnumC14106t.f26398J6, null, null, null));
            this.f25634b = null;
        }
    }

    /* renamed from: a */
    public final void m78388a(Context context, InterfaceC13775b interfaceC13775b) {
        if (this.f25634b != null) {
            ((C13611f) interfaceC13775b).m78547a(0, new C14068s(EnumC14106t.f26390I6, null, null, null));
            return;
        }
        this.f25634b = interfaceC13775b;
        this.f25633a.postDelayed(new Runnable() { // from class: b2.a
            @Override // java.lang.Runnable
            public final void run() {
                C13774a.this.m78389a();
            }
        }, 1000L);
        try {
            context.startActivity(new Intent(context, AdActivity.class).setFlags(268435456));
        } catch (Exception e) {
            ((C13611f) interfaceC13775b).m78547a(0, new C14068s(EnumC14106t.f26406K6, null, e, null));
            this.f25634b = null;
        }
    }
}
