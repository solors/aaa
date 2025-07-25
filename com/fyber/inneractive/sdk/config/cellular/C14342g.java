package com.fyber.inneractive.sdk.config.cellular;

import android.content.Context;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.ArrayList;

/* renamed from: com.fyber.inneractive.sdk.config.cellular.g */
/* loaded from: classes4.dex */
public final class C14342g extends AbstractC14339d {

    /* renamed from: d */
    public final C14341f f27160d;

    public C14342g(Context context) {
        super(context);
        this.f27160d = new C14341f(this.f27156b, this);
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
        this.f27160d.m77978b();
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
        this.f27160d.m77977c();
    }

    @Override // com.fyber.inneractive.sdk.config.cellular.AbstractC14339d
    /* renamed from: a */
    public final void mo77976a() {
        this.f27160d.m77979a();
        ArrayList arrayList = this.f27157c;
        if (arrayList != null) {
            arrayList.clear();
            this.f27157c = null;
        }
    }
}
