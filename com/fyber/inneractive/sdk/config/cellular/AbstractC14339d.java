package com.fyber.inneractive.sdk.config.cellular;

import android.content.Context;
import android.net.ConnectivityManager;
import android.telephony.TelephonyManager;
import com.fyber.inneractive.sdk.util.EnumC15433Y;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.fyber.inneractive.sdk.config.cellular.d */
/* loaded from: classes4.dex */
public abstract class AbstractC14339d implements InterfaceC14343h {

    /* renamed from: a */
    public final TelephonyManager f27155a;

    /* renamed from: b */
    public final ConnectivityManager f27156b;

    /* renamed from: c */
    public ArrayList f27157c = new ArrayList();

    public AbstractC14339d(Context context) {
        this.f27155a = (TelephonyManager) context.getSystemService("phone");
        this.f27156b = (ConnectivityManager) context.getSystemService("connectivity");
    }

    /* renamed from: a */
    public abstract void mo77976a();

    /* renamed from: a */
    public abstract void mo77975a(C14336a c14336a);

    /* renamed from: a */
    public abstract void mo77974a(InterfaceC14343h interfaceC14343h);

    @Override // com.fyber.inneractive.sdk.config.cellular.InterfaceC14343h
    /* renamed from: a */
    public final void mo77973a(EnumC15433Y enumC15433Y) {
        ArrayList arrayList = this.f27157c;
        if (arrayList == null) {
            IAlog.m76529a("NetworkDetector: onNetworkUpdated: no update listeners", new Object[0]);
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            InterfaceC14343h interfaceC14343h = (InterfaceC14343h) it.next();
            if (interfaceC14343h != null) {
                interfaceC14343h.mo77973a(enumC15433Y);
            }
        }
    }
}
