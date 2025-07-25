package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls;

import android.net.Uri;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C15091j;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C15092k;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC15089h;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.a */
/* loaded from: classes4.dex */
public final class C14846a implements InterfaceC15089h {

    /* renamed from: a */
    public final InterfaceC15089h f28351a;

    /* renamed from: b */
    public final byte[] f28352b;

    /* renamed from: c */
    public final byte[] f28353c;

    /* renamed from: d */
    public CipherInputStream f28354d;

    public C14846a(InterfaceC15089h interfaceC15089h, byte[] bArr, byte[] bArr2) {
        this.f28351a = interfaceC15089h;
        this.f28352b = bArr;
        this.f28353c = bArr2;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC15089h
    /* renamed from: a */
    public final long mo77234a(C15092k c15092k) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                cipher.init(2, new SecretKeySpec(this.f28352b, "AES"), new IvParameterSpec(this.f28353c));
                this.f28354d = new CipherInputStream(new C15091j(this.f28351a, c15092k), cipher);
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                throw new RuntimeException(e);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC15089h
    public final void close() {
        this.f28354d = null;
        this.f28351a.close();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC15089h
    public final int read(byte[] bArr, int i, int i2) {
        CipherInputStream cipherInputStream = this.f28354d;
        if (cipherInputStream != null) {
            int read = cipherInputStream.read(bArr, i, i2);
            if (read < 0) {
                return -1;
            }
            return read;
        }
        throw new IllegalStateException();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC15089h
    /* renamed from: a */
    public final Uri mo77235a() {
        return this.f28351a.mo77235a();
    }
}
