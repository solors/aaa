package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzhp;
import com.google.android.gms.internal.measurement.zzhq;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.2 */
/* loaded from: classes5.dex */
public abstract class zzhp<MessageType extends zzhq<MessageType, BuilderType>, BuilderType extends zzhp<MessageType, BuilderType>> implements zzks {
    @Override // 
    /* renamed from: zza */
    public abstract BuilderType zzb(zzio zzioVar, zzix zzixVar) throws IOException;

    public BuilderType zza(byte[] bArr, int i, int i2) throws zzjs {
        try {
            zzio zza = zzio.zza(bArr, 0, i2, false);
            zzb(zza, zzix.zza);
            zza.zzb(0);
            return this;
        } catch (zzjs e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(zza("byte array"), e2);
        }
    }

    @Override // 
    /* renamed from: zzaf */
    public abstract BuilderType clone();

    public BuilderType zza(byte[] bArr, int i, int i2, zzix zzixVar) throws zzjs {
        try {
            zzio zza = zzio.zza(bArr, 0, i2, false);
            zzb(zza, zzixVar);
            zza.zzb(0);
            return this;
        } catch (zzjs e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(zza("byte array"), e2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzks
    public final /* synthetic */ zzks zza(byte[] bArr) throws zzjs {
        return zza(bArr, 0, bArr.length);
    }

    @Override // com.google.android.gms.internal.measurement.zzks
    public final /* synthetic */ zzks zza(byte[] bArr, zzix zzixVar) throws zzjs {
        return zza(bArr, 0, bArr.length, zzixVar);
    }

    private final String zza(String str) {
        String name = getClass().getName();
        return "Reading " + name + " from a " + str + " threw an IOException (should never happen).";
    }
}
