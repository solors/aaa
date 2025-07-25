package com.google.firebase.installations;

import android.util.Base64;
import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.UUID;

/* loaded from: classes4.dex */
public class RandomFidGenerator {

    /* renamed from: a */
    private static final byte f43081a = Byte.parseByte("01110000", 2);

    /* renamed from: b */
    private static final byte f43082b = Byte.parseByte("00001111", 2);

    /* renamed from: a */
    private static String m66757a(byte[] bArr) {
        return new String(Base64.encode(bArr, 11), Charset.defaultCharset()).substring(0, 22);
    }

    /* renamed from: b */
    private static byte[] m66756b(UUID uuid, byte[] bArr) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.putLong(uuid.getMostSignificantBits());
        wrap.putLong(uuid.getLeastSignificantBits());
        return wrap.array();
    }

    @NonNull
    public String createRandomFid() {
        byte[] m66756b = m66756b(UUID.randomUUID(), new byte[17]);
        byte b = m66756b[0];
        m66756b[16] = b;
        m66756b[0] = (byte) ((b & f43082b) | f43081a);
        return m66757a(m66756b);
    }
}
