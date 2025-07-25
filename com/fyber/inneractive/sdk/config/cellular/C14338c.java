package com.fyber.inneractive.sdk.config.cellular;

import android.content.Context;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.ArrayList;

/* renamed from: com.fyber.inneractive.sdk.config.cellular.c */
/* loaded from: classes4.dex */
public final class C14338c extends AbstractC14339d {

    /* renamed from: d */
    public final C14337b f27154d;

    public C14338c(Context context) {
        super(context);
        this.f27154d = new C14337b(this.f27155a, this);
    }

    @Override // com.fyber.inneractive.sdk.config.cellular.AbstractC14339d
    /* renamed from: a */
    public final void mo77975a(C14336a c14336a) {
        ArrayList arrayList = this.f27157c;
        if (arrayList != null) {
            try {
                arrayList.add(c14336a);
            } catch (Throwable th) {
                IAlog.m76530a("failed to add networkUpdateListener", th, new Object[0]);
            }
        }
        this.f27154d.m77982b();
    }

    @Override // com.fyber.inneractive.sdk.config.cellular.AbstractC14339d
    /* renamed from: a */
    public final void mo77974a(InterfaceC14343h interfaceC14343h) {
        ArrayList arrayList = this.f27157c;
        if (arrayList != null) {
            try {
                arrayList.remove(interfaceC14343h);
            } catch (Throwable th) {
                IAlog.m76530a("failed to remove networkUpdateListener", th, new Object[0]);
            }
        }
        this.f27154d.m77981c();
    }

    @Override // com.fyber.inneractive.sdk.config.cellular.AbstractC14339d
    /* renamed from: a */
    public final void mo77976a() {
        this.f27154d.m77983a();
        ArrayList arrayList = this.f27157c;
        if (arrayList != null) {
            arrayList.clear();
            this.f27157c = null;
        }
    }
}
