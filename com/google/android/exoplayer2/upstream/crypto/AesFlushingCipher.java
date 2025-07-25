package com.google.android.exoplayer2.upstream.crypto;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes4.dex */
public final class AesFlushingCipher {

    /* renamed from: a */
    private final Cipher f36035a;

    /* renamed from: b */
    private final int f36036b;

    /* renamed from: c */
    private final byte[] f36037c;

    /* renamed from: d */
    private final byte[] f36038d;

    /* renamed from: e */
    private int f36039e;

    public AesFlushingCipher(int i, byte[] bArr, @Nullable String str, long j) {
        this(i, bArr, m72675a(str), j);
    }

    /* renamed from: a */
    private static long m72675a(@Nullable String str) {
        long j = 0;
        if (str == null) {
            return 0L;
        }
        for (int i = 0; i < str.length(); i++) {
            long charAt = j ^ str.charAt(i);
            j = charAt + (charAt << 1) + (charAt << 4) + (charAt << 5) + (charAt << 7) + (charAt << 8) + (charAt << 40);
        }
        return j;
    }

    /* renamed from: b */
    private byte[] m72674b(long j, long j2) {
        return ByteBuffer.allocate(16).putLong(j).putLong(j2).array();
    }

    /* renamed from: c */
    private int m72673c(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        try {
            return this.f36035a.update(bArr, i, i2, bArr2, i3);
        } catch (ShortBufferException e) {
            throw new RuntimeException(e);
        }
    }

    public void update(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        boolean z;
        int i4 = i;
        do {
            int i5 = this.f36039e;
            if (i5 > 0) {
                bArr2[i3] = (byte) (bArr[i4] ^ this.f36038d[this.f36036b - i5]);
                i3++;
                i4++;
                this.f36039e = i5 - 1;
                i2--;
            } else {
                int m72673c = m72673c(bArr, i4, i2, bArr2, i3);
                if (i2 == m72673c) {
                    return;
                }
                int i6 = i2 - m72673c;
                int i7 = 0;
                boolean z2 = true;
                if (i6 < this.f36036b) {
                    z = true;
                } else {
                    z = false;
                }
                Assertions.checkState(z);
                int i8 = i3 + m72673c;
                int i9 = this.f36036b - i6;
                this.f36039e = i9;
                if (m72673c(this.f36037c, 0, i9, this.f36038d, 0) != this.f36036b) {
                    z2 = false;
                }
                Assertions.checkState(z2);
                while (i7 < i6) {
                    bArr2[i8] = this.f36038d[i7];
                    i7++;
                    i8++;
                }
                return;
            }
        } while (i2 != 0);
    }

    public void updateInPlace(byte[] bArr, int i, int i2) {
        update(bArr, i, i2, bArr, i);
    }

    public AesFlushingCipher(int i, byte[] bArr, long j, long j2) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CTR/NoPadding");
            this.f36035a = cipher;
            int blockSize = cipher.getBlockSize();
            this.f36036b = blockSize;
            this.f36037c = new byte[blockSize];
            this.f36038d = new byte[blockSize];
            long j3 = j2 / blockSize;
            int i2 = (int) (j2 % blockSize);
            cipher.init(i, new SecretKeySpec(bArr, Util.splitAtFirst(cipher.getAlgorithm(), RemoteSettings.FORWARD_SLASH_STRING)[0]), new IvParameterSpec(m72674b(j, j3)));
            if (i2 != 0) {
                updateInPlace(new byte[i2], 0, i2);
            }
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e) {
            throw new RuntimeException(e);
        }
    }
}
