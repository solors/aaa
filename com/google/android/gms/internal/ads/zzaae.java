package com.google.android.gms.internal.ads;

import com.maticoo.sdk.utils.constant.KeyConstants;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
final class zzaae implements zzca {
    public static final /* synthetic */ int zza = 0;

    static {
        zzfvj.zza(new zzfvf() { // from class: com.google.android.gms.internal.ads.zzaad
            @Override // com.google.android.gms.internal.ads.zzfvf
            public final Object zza() {
                int i = zzaae.zza;
                try {
                    Class<?> cls = Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                    Object invoke = cls.getMethod(KeyConstants.RequestBody.KEY_BUILD, new Class[0]).invoke(cls.getConstructor(new Class[0]).newInstance(new Object[0]), new Object[0]);
                    invoke.getClass();
                    return (zzca) invoke;
                } catch (Exception e) {
                    throw new IllegalStateException(e);
                }
            }
        });
    }

    private zzaae() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzaae(zzaag zzaagVar) {
    }
}
