package com.yandex.mobile.ads.impl;

import com.monetization.ads.exo.metadata.emsg.EventMessage;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* loaded from: classes8.dex */
public final class p30 {

    /* renamed from: a */
    private final ByteArrayOutputStream f83703a;

    /* renamed from: b */
    private final DataOutputStream f83704b;

    public p30() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.f83703a = byteArrayOutputStream;
        this.f83704b = new DataOutputStream(byteArrayOutputStream);
    }

    /* renamed from: a */
    public final byte[] m30847a(EventMessage eventMessage) {
        this.f83703a.reset();
        try {
            DataOutputStream dataOutputStream = this.f83704b;
            dataOutputStream.writeBytes(eventMessage.f66235b);
            dataOutputStream.writeByte(0);
            String str = eventMessage.f66236c;
            if (str == null) {
                str = "";
            }
            DataOutputStream dataOutputStream2 = this.f83704b;
            dataOutputStream2.writeBytes(str);
            dataOutputStream2.writeByte(0);
            this.f83704b.writeLong(eventMessage.f66237d);
            this.f83704b.writeLong(eventMessage.f66238e);
            this.f83704b.write(eventMessage.f66239f);
            this.f83704b.flush();
            return this.f83703a.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
