package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgvr;
import com.google.android.gms.internal.ads.zzgvs;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public abstract class zzgvs<MessageType extends zzgvs<MessageType, BuilderType>, BuilderType extends zzgvr<MessageType, BuilderType>> implements zzgzc {
    protected int zzq = 0;

    public static <T> void zzaQ(Iterable<T> iterable, List<? super T> list) {
        zzgvr.zzbd(iterable, list);
    }

    protected static void zzaR(zzgwj zzgwjVar) throws IllegalArgumentException {
        if (zzgwjVar.zzp()) {
            return;
        }
        throw new IllegalArgumentException("Byte string is not UTF-8.");
    }

    private String zzdF(String str) {
        String name = getClass().getName();
        return "Serializing " + name + " to a " + str + " threw an IOException (should never happen).";
    }

    public int zzaL() {
        throw new UnsupportedOperationException();
    }

    public int zzaM(zzgzv zzgzvVar) {
        return zzaL();
    }

    @Override // com.google.android.gms.internal.ads.zzgzc
    public zzgwj zzaN() {
        try {
            int zzaY = zzaY();
            zzgwj zzgwjVar = zzgwj.zzb;
            byte[] bArr = new byte[zzaY];
            zzgws zzgwsVar = new zzgws(bArr, 0, zzaY);
            zzcY(zzgwsVar);
            zzgwsVar.zzF();
            return new zzgwg(bArr);
        } catch (IOException e) {
            throw new RuntimeException(zzdF("ByteString"), e);
        }
    }

    public zzgzh zzaO() {
        throw new UnsupportedOperationException("mutableCopy() is not implemented.");
    }

    public zzhag zzaP() {
        return new zzhag(this);
    }

    public void zzaS(int i) {
        throw new UnsupportedOperationException();
    }

    public void zzaT(OutputStream outputStream) throws IOException {
        int zzaY = zzaY();
        zzgwu zzgwuVar = new zzgwu(outputStream, zzgww.zzB(zzgww.zzD(zzaY) + zzaY));
        zzgwuVar.zzu(zzaY);
        zzcY(zzgwuVar);
        zzgwuVar.zzK();
    }

    public void zzaU(OutputStream outputStream) throws IOException {
        zzgwu zzgwuVar = new zzgwu(outputStream, zzgww.zzB(zzaY()));
        zzcY(zzgwuVar);
        zzgwuVar.zzK();
    }

    public byte[] zzaV() {
        try {
            int zzaY = zzaY();
            byte[] bArr = new byte[zzaY];
            zzgws zzgwsVar = new zzgws(bArr, 0, zzaY);
            zzcY(zzgwsVar);
            zzgwsVar.zzF();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException(zzdF("byte array"), e);
        }
    }
}
