package com.unity3d.player;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: com.unity3d.player.E */
/* loaded from: classes7.dex */
class C28702E extends ContentObserver {

    /* renamed from: a */
    private InterfaceC28701D f74525a;

    public C28702E(C28703F c28703f, Handler handler, InterfaceC28701D interfaceC28701D) {
        super(handler);
        this.f74525a = interfaceC28701D;
    }

    @Override // android.database.ContentObserver
    public boolean deliverSelfNotifications() {
        return super.deliverSelfNotifications();
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z) {
        InterfaceC28701D interfaceC28701D = this.f74525a;
        if (interfaceC28701D != null) {
            ((OrientationLockListener) interfaceC28701D).m37715a(z);
        }
    }
}
