package com.zeus.gmc.sdk.mobileads.columbus.internal.ci22c2;

import android.util.Log;
import com.zeus.gmc.sdk.mobileads.columbus.internal.c2cciooo.C32456cici2o2oo;
import com.zeus.gmc.sdk.mobileads.columbus.util.MLog;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.ci22c2.c2oc2o */
/* loaded from: classes8.dex */
public abstract class AbstractRunnableC32566c2oc2o implements Runnable {
    private String coi222o222;
    private String coo2iico;

    public AbstractRunnableC32566c2oc2o(String str, String str2) {
        this.coo2iico = C32456cici2o2oo.coo2iico(str);
        this.coi222o222 = C32456cici2o2oo.coo2iico(str2);
    }

    protected abstract void coo2iico() throws Exception;

    @Override // java.lang.Runnable
    public final void run() {
        try {
            coo2iico();
        } catch (Throwable th) {
            Log.e(MLog.addAdPrefix(this.coo2iico), String.format("AD-ThrowableCaughtRunnable message: %s", this.coi222o222), th);
        }
    }
}
