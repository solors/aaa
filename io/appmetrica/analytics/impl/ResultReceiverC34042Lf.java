package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* renamed from: io.appmetrica.analytics.impl.Lf */
/* loaded from: classes9.dex */
public final class ResultReceiverC34042Lf extends ResultReceiver {

    /* renamed from: a */
    public final InterfaceC34963vf f93184a;

    public ResultReceiverC34042Lf(Handler handler, InterfaceC34963vf interfaceC34963vf) {
        super(handler);
        this.f93184a = interfaceC34963vf;
    }

    /* renamed from: a */
    public static void m22470a(ResultReceiver resultReceiver, C33896Ff c33896Ff) {
        byte[] m22654a;
        if (resultReceiver != null) {
            Bundle bundle = new Bundle();
            if (c33896Ff == null) {
                m22654a = null;
            } else {
                m22654a = c33896Ff.m22654a();
            }
            bundle.putByteArray("referrer", m22654a);
            resultReceiver.send(1, bundle);
        }
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        if (i == 1) {
            C33896Ff c33896Ff = null;
            try {
                byte[] byteArray = bundle.getByteArray("referrer");
                if (byteArray != null && byteArray.length != 0) {
                    c33896Ff = new C33896Ff(byteArray);
                }
            } catch (Throwable unused) {
            }
            this.f93184a.mo20865a(c33896Ff);
        }
    }
}
