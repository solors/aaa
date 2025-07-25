package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzgjy extends zzgjz {
    public zzgjy(byte[] bArr) throws GeneralSecurityException {
        super(bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzgjz
    final zzgjx zza(byte[] bArr, int i) throws InvalidKeyException {
        return new zzgjw(bArr, i);
    }
}
