package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.0.2 */
/* loaded from: classes5.dex */
final /* synthetic */ class zznh {
    static final /* synthetic */ int[] zza;

    static {
        int[] iArr = new int[zzim.values().length];
        zza = iArr;
        try {
            iArr[zzim.POLICY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            zza[zzim.GRANTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            zza[zzim.DENIED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            zza[zzim.UNINITIALIZED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
