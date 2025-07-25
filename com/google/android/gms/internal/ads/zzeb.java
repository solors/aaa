package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Message;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
final class zzeb implements zzdg {
    @Nullable
    private Message zza;

    private zzeb() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzeb(zzec zzecVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdg
    public final void zza() {
        Message message = this.zza;
        message.getClass();
        message.sendToTarget();
        this.zza = null;
        zzed.zzl(this);
    }

    public final zzeb zzb(Message message, zzed zzedVar) {
        this.zza = message;
        return this;
    }

    public final boolean zzc(Handler handler) {
        Message message = this.zza;
        message.getClass();
        boolean sendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue(message);
        this.zza = null;
        zzed.zzl(this);
        return sendMessageAtFrontOfQueue;
    }
}
