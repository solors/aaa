package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
final class zzbzr extends ScheduledThreadPoolExecutor {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbzr(int i, ThreadFactory threadFactory) {
        super(3, threadFactory);
    }
}
