package com.smaato.sdk.core.dns;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.dns.Record;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Request.java */
/* renamed from: com.smaato.sdk.core.dns.j */
/* loaded from: classes7.dex */
public final class C27094j {
    @NonNull

    /* renamed from: a */
    public final DnsName f71514a;
    @NonNull

    /* renamed from: b */
    public final Record.Type f71515b;
    @NonNull

    /* renamed from: c */
    final Record.Class f71516c;

    /* renamed from: d */
    private final boolean f71517d;

    /* renamed from: e */
    private byte[] f71518e;

    private C27094j(@NonNull DnsName dnsName, @NonNull Record.Type type, @NonNull Record.Class r3, boolean z) {
        Objects.requireNonNull(dnsName);
        this.f71514a = dnsName;
        Objects.requireNonNull(type);
        this.f71515b = type;
        Objects.requireNonNull(r3);
        this.f71516c = r3;
        this.f71517d = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public byte[] m39598a() {
        int i;
        if (this.f71518e == null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            try {
                this.f71514a.writeToStream(dataOutputStream);
                dataOutputStream.writeShort(this.f71515b.getValue());
                int value = this.f71516c.getValue();
                if (this.f71517d) {
                    i = 32768;
                } else {
                    i = 0;
                }
                dataOutputStream.writeShort(value | i);
                dataOutputStream.flush();
                this.f71518e = byteArrayOutputStream.toByteArray();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return this.f71518e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27094j)) {
            return false;
        }
        return Arrays.equals(m39598a(), ((C27094j) obj).m39598a());
    }

    public int hashCode() {
        return Arrays.hashCode(m39598a());
    }

    public String toString() {
        return this.f71514a.getRawAce() + ".\t" + this.f71516c + '\t' + this.f71515b;
    }

    private C27094j(@NonNull DnsName dnsName, @NonNull Record.Type type, @NonNull Record.Class r4) {
        this(dnsName, type, r4, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C27094j(@NonNull DnsName dnsName, @NonNull Record.Type type) {
        this(dnsName, type, Record.Class.IN);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C27094j(@NonNull DataInputStream dataInputStream, byte[] bArr) throws IOException {
        this.f71514a = DnsName.parse(dataInputStream, bArr);
        this.f71515b = Record.Type.getType(dataInputStream.readUnsignedShort());
        this.f71516c = Record.Class.getClass(dataInputStream.readUnsignedShort());
        this.f71517d = false;
    }
}
