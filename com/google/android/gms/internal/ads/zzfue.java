package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.regex.Pattern;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzfue extends zzfua implements Serializable {
    private final Pattern zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfue(Pattern pattern) {
        pattern.getClass();
        this.zza = pattern;
    }

    public final String toString() {
        return this.zza.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfua
    public final zzftz zza(CharSequence charSequence) {
        return new zzfud(this.zza.matcher(charSequence));
    }
}
