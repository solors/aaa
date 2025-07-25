package com.inmobi.media;

import com.inmobi.ads.InMobiNative;
import com.inmobi.ads.controllers.PublisherCallbacks;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.inmobi.media.B7 */
/* loaded from: classes6.dex */
public abstract class AbstractC18867B7 extends PublisherCallbacks {
    @NotNull

    /* renamed from: a */
    private WeakReference<InMobiNative> f47114a;

    public AbstractC18867B7(InMobiNative inMobiNative) {
        Intrinsics.checkNotNullParameter(inMobiNative, "inMobiNative");
        this.f47114a = new WeakReference<>(inMobiNative);
    }

    @NotNull
    public final WeakReference<InMobiNative> getNativeRef() {
        return this.f47114a;
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onImraidLog(@NotNull String log) {
        AbstractC19033N6 mPubListener;
        Intrinsics.checkNotNullParameter(log, "log");
        InMobiNative inMobiNative = this.f47114a.get();
        if (inMobiNative == null || (mPubListener = inMobiNative.getMPubListener()) == null) {
            return;
        }
        mPubListener.onImraidLog(inMobiNative, log);
    }

    public final void setNativeRef(@NotNull WeakReference<InMobiNative> weakReference) {
        Intrinsics.checkNotNullParameter(weakReference, "<set-?>");
        this.f47114a = weakReference;
    }
}
