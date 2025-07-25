package com.five_corp.p372ad.internal.handler;

import android.os.HandlerThread;
import android.os.Looper;
import java.util.ArrayList;

/* renamed from: com.five_corp.ad.internal.handler.a */
/* loaded from: classes4.dex */
public final class C13781a {

    /* renamed from: a */
    public final ArrayList f25652a = new ArrayList();

    /* renamed from: b */
    public int f25653b;

    public C13781a(String str) {
        for (int i = 0; i < 3; i++) {
            HandlerThread handlerThread = new HandlerThread("com.five-corp." + str + "-" + i);
            handlerThread.start();
            this.f25652a.add(handlerThread);
        }
        this.f25653b = 0;
    }

    /* renamed from: a */
    public final Looper m78376a() {
        HandlerThread handlerThread;
        if (this.f25653b < this.f25652a.size()) {
            handlerThread = (HandlerThread) this.f25652a.get(this.f25653b);
            this.f25653b++;
        } else if (!this.f25652a.isEmpty()) {
            handlerThread = (HandlerThread) this.f25652a.get(0);
            this.f25653b = 1;
        } else {
            return null;
        }
        return handlerThread.getLooper();
    }
}
