package com.zeus.gmc.sdk.mobileads.columbus.internal.c2oc2o;

import android.annotation.SuppressLint;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.zeus.gmc.sdk.mobileads.columbus.internal.coi222o222.C32707coiic;
import java.lang.ref.WeakReference;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.c2oc2o.cicic */
/* loaded from: classes8.dex */
public class C32491cicic {
    @SuppressLint({"StaticFieldLeak"})
    private static C32491cicic cioccoiococ = new C32491cicic();
    private WeakReference<Context> coo2iico;
    private boolean coi222o222 = false;
    private boolean c2oc2i = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.c2oc2o.cicic$coo2iico */
    /* loaded from: classes8.dex */
    public class C32492coo2iico extends BroadcastReceiver {
        C32492coo2iico() {
            C32491cicic.this = r1;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            C32491cicic c32491cicic;
            boolean z;
            boolean z2;
            if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
                c32491cicic = C32491cicic.this;
                z = c32491cicic.c2oc2i;
                z2 = true;
            } else if (intent.getAction().equals("android.intent.action.SCREEN_ON")) {
                c32491cicic = C32491cicic.this;
                z = c32491cicic.c2oc2i;
                z2 = false;
            } else {
                return;
            }
            c32491cicic.coo2iico(z2, z);
            C32491cicic.this.coi222o222 = z2;
        }
    }

    public static C32491cicic coi222o222() {
        return cioccoiococ;
    }

    public void coo2iico() {
        Context context = this.coo2iico.get();
        if (context == null) {
            return;
        }
        boolean isDeviceLocked = ((KeyguardManager) context.getSystemService("keyguard")).isDeviceLocked();
        coo2iico(this.coi222o222, isDeviceLocked);
        this.c2oc2i = isDeviceLocked;
    }

    public void coo2iico(Context context) {
        if (context == null) {
            return;
        }
        this.coo2iico = new WeakReference<>(context);
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        context.registerReceiver(new C32492coo2iico(), intentFilter);
    }

    public void coo2iico(boolean z, boolean z2) {
        if ((z2 || z) == (this.c2oc2i || this.coi222o222)) {
            return;
        }
        for (C32707coiic c32707coiic : C32488c2oc2i.c2oc2i().coi222o222()) {
            c32707coiic.c2oc2i().coi222o222(z2 || z);
        }
    }
}
