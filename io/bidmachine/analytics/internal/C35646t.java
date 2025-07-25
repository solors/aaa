package io.bidmachine.analytics.internal;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: io.bidmachine.analytics.internal.t */
/* loaded from: classes9.dex */
public final class C35646t implements InterfaceC35653x {
    /* renamed from: a */
    private final byte[] m20117a(String str, byte[] bArr, byte[] bArr2, byte[] bArr3, int i) {
        Mac mac = Mac.getInstance(str);
        if (i > mac.getMacLength() * 255) {
            throw new GeneralSecurityException("size too large");
        }
        if (bArr2 == null || bArr2.length == 0) {
            mac.init(new SecretKeySpec(new byte[mac.getMacLength()], str));
        } else {
            mac.init(new SecretKeySpec(bArr2, str));
        }
        byte[] bArr4 = new byte[i];
        mac.init(new SecretKeySpec(mac.doFinal(bArr), str));
        byte[] bArr5 = new byte[0];
        int i2 = 1;
        int i3 = 0;
        while (true) {
            mac.update(bArr5);
            if (bArr3 != null) {
                mac.update(bArr3);
            }
            mac.update((byte) i2);
            bArr5 = mac.doFinal();
            if (bArr5.length + i3 >= i) {
                System.arraycopy(bArr5, 0, bArr4, i3, i - i3);
                return bArr4;
            }
            System.arraycopy(bArr5, 0, bArr4, i3, bArr5.length);
            i3 += bArr5.length;
            i2++;
        }
    }

    @Override // io.bidmachine.analytics.internal.InterfaceC35653x
    /* renamed from: a */
    public byte[] mo20106a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return m20117a("HMACSHA256", bArr, bArr3, bArr2, 32);
    }
}
