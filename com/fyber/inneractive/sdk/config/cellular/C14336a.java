package com.fyber.inneractive.sdk.config.cellular;

import android.content.Context;
import com.fyber.inneractive.sdk.util.EnumC15433Y;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.fyber.inneractive.sdk.config.cellular.a */
/* loaded from: classes4.dex */
public final class C14336a implements InterfaceC14343h {

    /* renamed from: a */
    public final AbstractC14339d f27148a;

    /* renamed from: c */
    public final ArrayList f27150c = new ArrayList();

    /* renamed from: b */
    public EnumC15433Y f27149b = EnumC15433Y.UNKNOWN;

    public C14336a(Context context) {
        this.f27148a = AbstractC14340e.m77980a(context);
    }

    @Override // com.fyber.inneractive.sdk.config.cellular.InterfaceC14343h
    /* renamed from: a */
    public final void mo77973a(EnumC15433Y enumC15433Y) {
        this.f27149b = enumC15433Y;
        Iterator it = this.f27150c.iterator();
        while (it.hasNext()) {
            ((InterfaceC14343h) it.next()).mo77973a(this.f27149b);
        }
    }
}
