package sg.bigo.ads.common.p926n;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: sg.bigo.ads.common.n.b */
/* loaded from: classes10.dex */
public final class HandlerC43724b extends Handler {

    /* renamed from: a */
    private String f114429a;

    public HandlerC43724b(String str, Looper looper) {
        super(looper);
        this.f114429a = str;
    }

    @Override // android.os.Handler
    public final void dispatchMessage(Message message) {
        super.dispatchMessage(message);
    }

    @Override // android.os.Handler
    public final boolean sendMessageAtTime(Message message, long j) {
        return super.sendMessageAtTime(message, j);
    }

    @Override // android.os.Handler
    public final String toString() {
        return "HandlerEx (" + this.f114429a + ") {}";
    }
}
