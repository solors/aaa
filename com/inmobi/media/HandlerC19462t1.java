package com.inmobi.media;

import android.os.Handler;
import android.os.Message;
import com.inmobi.ads.InMobiBanner;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.t1 */
/* loaded from: classes6.dex */
public final class HandlerC19462t1 extends Handler {

    /* renamed from: a */
    public final InMobiBanner f48672a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public HandlerC19462t1(com.inmobi.ads.InMobiBanner r4) {
        /*
            r3 = this;
            java.lang.String r0 = "mInmobiBanner"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            java.lang.String r2 = "getMainLooper(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "looper"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r3.<init>(r1)
            r3.f48672a = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.HandlerC19462t1.<init>(com.inmobi.ads.InMobiBanner):void");
    }

    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (msg.what == 1) {
            this.f48672a.refreshBanner$media_release();
        } else {
            Intrinsics.checkNotNullExpressionValue("t1", "TAG");
        }
    }
}
