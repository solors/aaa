package com.inmobi.media;

import android.os.HandlerThread;
import android.os.Looper;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.b4 */
/* loaded from: classes6.dex */
public final class C19213b4 {

    /* renamed from: b */
    public static final /* synthetic */ int f48098b = 0;

    /* renamed from: a */
    public final HandlerC19199a4 f48099a;

    public C19213b4() {
        HandlerThread handlerThread = new HandlerThread("DataCollectionHandler");
        AbstractC18975J3.m60996a(handlerThread, "DataCollectionHandler");
        Looper looper = handlerThread.getLooper();
        Intrinsics.checkNotNullExpressionValue(looper, "getLooper(...)");
        this.f48099a = new HandlerC19199a4(looper);
    }

    /* renamed from: a */
    public final synchronized void m60436a() {
        if (!AbstractC18984Jc.m60988a()) {
            return;
        }
        HandlerC19199a4 handlerC19199a4 = this.f48099a;
        handlerC19199a4.f48065a = false;
        if (!handlerC19199a4.hasMessages(3)) {
            this.f48099a.removeMessages(2);
            this.f48099a.sendEmptyMessage(1);
        } else {
            Intrinsics.checkNotNullExpressionValue("b4", "TAG");
        }
    }
}
