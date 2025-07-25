package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.L0 */
/* loaded from: classes6.dex */
public final class HandlerC19000L0 extends Handler {

    /* renamed from: a */
    public boolean f47421a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC19000L0(Looper looper) {
        super(looper);
        Intrinsics.checkNotNullParameter(looper, "looper");
        this.f47421a = true;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        boolean z;
        Intrinsics.checkNotNullParameter(msg, "msg");
        z = C19040O0.f47576c;
        if (z) {
            return;
        }
        int i = msg.what;
        if (i == 1001 && this.f47421a) {
            this.f47421a = false;
            C19040O0.m60839a(C19040O0.f47574a, false);
            Intrinsics.checkNotNullExpressionValue(C19040O0.m60838b(), "access$getTAG$p(...)");
        } else if (i == 1002 && !this.f47421a) {
            this.f47421a = true;
            C19040O0.m60839a(C19040O0.f47574a, true);
            Intrinsics.checkNotNullExpressionValue(C19040O0.m60838b(), "access$getTAG$p(...)");
        }
    }
}
