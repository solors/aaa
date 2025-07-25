package com.google.android.exoplayer2.metadata.emsg;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* loaded from: classes4.dex */
public final class EventMessageEncoder {

    /* renamed from: a */
    private final ByteArrayOutputStream f33913a;

    /* renamed from: b */
    private final DataOutputStream f33914b;

    public EventMessageEncoder() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.f33913a = byteArrayOutputStream;
        this.f33914b = new DataOutputStream(byteArrayOutputStream);
    }

    /* renamed from: a */
    private static void m74090a(DataOutputStream dataOutputStream, String str) throws IOException {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    public byte[] encode(EventMessage eventMessage) {
        this.f33913a.reset();
        try {
            m74090a(this.f33914b, eventMessage.schemeIdUri);
            String str = eventMessage.value;
            if (str == null) {
                str = "";
            }
            m74090a(this.f33914b, str);
            this.f33914b.writeLong(eventMessage.durationMs);
            this.f33914b.writeLong(eventMessage.f33912id);
            this.f33914b.write(eventMessage.messageData);
            this.f33914b.flush();
            return this.f33913a.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
