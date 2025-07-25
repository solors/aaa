package com.zeus.gmc.sdk.mobileads.columbus.internal.c2cciooo;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.c2cciooo.cc2o22co2c */
/* loaded from: classes8.dex */
public class HandlerC32451cc2o22co2c extends Handler {
    private WeakReference<Handler.Callback> coo2iico;

    public HandlerC32451cc2o22co2c(Handler.Callback callback) {
        this.coo2iico = new WeakReference<>(callback);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        WeakReference<Handler.Callback> weakReference = this.coo2iico;
        if (weakReference != null && weakReference.get() != null) {
            this.coo2iico.get().handleMessage(message);
        }
    }

    public HandlerC32451cc2o22co2c(Handler.Callback callback, Looper looper) {
        super(looper);
        this.coo2iico = new WeakReference<>(callback);
    }
}
