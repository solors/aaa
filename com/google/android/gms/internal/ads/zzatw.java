package com.google.android.gms.internal.ads;

import com.mbridge.msdk.foundation.tools.SameMD5;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.CountDownLatch;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
final class zzatw implements Runnable {
    private zzatw() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzatw(zzatx zzatxVar) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        CountDownLatch countDownLatch;
        try {
            zzaty.zzd(MessageDigest.getInstance(SameMD5.TAG));
            countDownLatch = zzaty.zzb;
        } catch (NoSuchAlgorithmException unused) {
            countDownLatch = zzaty.zzb;
        } catch (Throwable th) {
            zzaty.zzb.countDown();
            throw th;
        }
        countDownLatch.countDown();
    }
}
