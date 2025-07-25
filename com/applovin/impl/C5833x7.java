package com.applovin.impl;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* renamed from: com.applovin.impl.x7 */
/* loaded from: classes2.dex */
public final class C5833x7 {

    /* renamed from: a */
    private final ByteArrayOutputStream f11944a;

    /* renamed from: b */
    private final DataOutputStream f11945b;

    public C5833x7() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.f11944a = byteArrayOutputStream;
        this.f11945b = new DataOutputStream(byteArrayOutputStream);
    }

    /* renamed from: a */
    public byte[] m93216a(C5680v7 c5680v7) {
        this.f11944a.reset();
        try {
            m93215a(this.f11945b, c5680v7.f11463a);
            String str = c5680v7.f11464b;
            if (str == null) {
                str = "";
            }
            m93215a(this.f11945b, str);
            this.f11945b.writeLong(c5680v7.f11465c);
            this.f11945b.writeLong(c5680v7.f11466d);
            this.f11945b.write(c5680v7.f11467f);
            this.f11945b.flush();
            return this.f11944a.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    private static void m93215a(DataOutputStream dataOutputStream, String str) {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }
}
