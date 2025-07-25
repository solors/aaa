package com.zeus.gmc.sdk.mobileads.columbus.internal.cioccoiococ;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.cioccoiococ.cioccoiococ */
/* loaded from: classes8.dex */
public final class C32659cioccoiococ extends ContentObserver {
    private final C32661coo2iico c2oc2i;
    private float c2oc2o;
    private final InterfaceC32657c2oc2i cioccoiococ;
    private final AudioManager coi222o222;
    private final Context coo2iico;

    public C32659cioccoiococ(Handler handler, Context context, C32661coo2iico c32661coo2iico, InterfaceC32657c2oc2i interfaceC32657c2oc2i) {
        super(handler);
        this.coo2iico = context;
        this.coi222o222 = (AudioManager) context.getSystemService("audio");
        this.c2oc2i = c32661coo2iico;
        this.cioccoiococ = interfaceC32657c2oc2i;
    }

    private void coi222o222() {
        this.cioccoiococ.coo2iico(this.c2oc2o);
    }

    private float coo2iico() {
        return this.c2oc2i.coo2iico(this.coi222o222.getStreamVolume(3), this.coi222o222.getStreamMaxVolume(3));
    }

    public void c2oc2i() {
        this.c2oc2o = coo2iico();
        coi222o222();
        this.coo2iico.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void cioccoiococ() {
        this.coo2iico.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z) {
        super.onChange(z);
        float coo2iico = coo2iico();
        if (coo2iico(coo2iico)) {
            this.c2oc2o = coo2iico;
            coi222o222();
        }
    }

    private boolean coo2iico(float f) {
        return f != this.c2oc2o;
    }
}
