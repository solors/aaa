package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public abstract class zzgww extends zzgwa {
    private static final Logger zza = Logger.getLogger(zzgww.class.getName());
    private static final boolean zzb = zzhao.zzA();
    public static final /* synthetic */ int zzf = 0;
    zzgwx zze;

    private zzgww() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgww(zzgwv zzgwvVar) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzA(zzgzc zzgzcVar, zzgzv zzgzvVar) {
        int zzaM = ((zzgvs) zzgzcVar).zzaM(zzgzvVar);
        return zzD(zzaM) + zzaM;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzB(int i) {
        if (i > 4096) {
            return 4096;
        }
        return i;
    }

    public static int zzC(String str) {
        int length;
        try {
            length = zzhat.zze(str);
        } catch (zzhas unused) {
            length = str.getBytes(zzgye.zza).length;
        }
        return zzD(length) + length;
    }

    public static int zzD(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int zzE(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    public static int zzy(int i, zzgzc zzgzcVar, zzgzv zzgzvVar) {
        int zzD = zzD(i << 3);
        return zzD + zzD + ((zzgvs) zzgzcVar).zzaM(zzgzvVar);
    }

    public static int zzz(zzgzc zzgzcVar) {
        int zzaY = zzgzcVar.zzaY();
        return zzD(zzaY) + zzaY;
    }

    public final void zzF() {
        if (zzb() == 0) {
            return;
        }
        throw new IllegalStateException("Did not write as much data as expected.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzG(String str, zzhas zzhasVar) throws IOException {
        zza.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzhasVar);
        byte[] bytes = str.getBytes(zzgye.zza);
        try {
            int length = bytes.length;
            zzu(length);
            zza(bytes, 0, length);
        } catch (IndexOutOfBoundsException e) {
            throw new zzgwt(e);
        }
    }

    public abstract void zzK() throws IOException;

    public abstract void zzL(byte b) throws IOException;

    public abstract void zzM(int i, boolean z) throws IOException;

    public abstract void zzN(int i, zzgwj zzgwjVar) throws IOException;

    @Override // com.google.android.gms.internal.ads.zzgwa
    public abstract void zza(byte[] bArr, int i, int i2) throws IOException;

    public abstract int zzb();

    public abstract void zzh(int i, int i2) throws IOException;

    public abstract void zzi(int i) throws IOException;

    public abstract void zzj(int i, long j) throws IOException;

    public abstract void zzk(long j) throws IOException;

    public abstract void zzl(int i, int i2) throws IOException;

    public abstract void zzm(int i) throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzn(int i, zzgzc zzgzcVar, zzgzv zzgzvVar) throws IOException;

    public abstract void zzo(int i, zzgzc zzgzcVar) throws IOException;

    public abstract void zzp(int i, zzgwj zzgwjVar) throws IOException;

    public abstract void zzq(int i, String str) throws IOException;

    public abstract void zzs(int i, int i2) throws IOException;

    public abstract void zzt(int i, int i2) throws IOException;

    public abstract void zzu(int i) throws IOException;

    public abstract void zzv(int i, long j) throws IOException;

    public abstract void zzw(long j) throws IOException;
}
