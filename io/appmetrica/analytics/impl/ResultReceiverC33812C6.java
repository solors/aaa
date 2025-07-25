package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* renamed from: io.appmetrica.analytics.impl.C6 */
/* loaded from: classes9.dex */
public final class ResultReceiverC33812C6 extends ResultReceiver {

    /* renamed from: a */
    public final InterfaceC33787B6 f92672a;

    public ResultReceiverC33812C6(Handler handler, InterfaceC33787B6 interfaceC33787B6) {
        super(handler);
        this.f92672a = interfaceC33787B6;
    }

    /* renamed from: a */
    public static void m22739a(ResultReceiver resultReceiver, C34606i4 c34606i4) {
        if (resultReceiver != null) {
            Bundle bundle = new Bundle();
            c34606i4.m21552b(bundle);
            resultReceiver.send(1, bundle);
        }
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        this.f92672a.mo20847a(i, bundle);
    }

    /* renamed from: a */
    public static void m22740a(ResultReceiver resultReceiver, EnumC34095Nk enumC34095Nk, C34606i4 c34606i4) {
        if (resultReceiver != null) {
            Bundle bundle = new Bundle();
            bundle.putInt("startup_error_key_code", enumC34095Nk.f93286a);
            c34606i4.m21552b(bundle);
            resultReceiver.send(2, bundle);
        }
    }
}
