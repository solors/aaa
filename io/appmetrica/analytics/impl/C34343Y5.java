package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.Y5 */
/* loaded from: classes9.dex */
public final class C34343Y5 extends MessageNano {

    /* renamed from: c */
    public static volatile C34343Y5[] f93804c;

    /* renamed from: a */
    public byte[] f93805a;

    /* renamed from: b */
    public byte[] f93806b;

    public C34343Y5() {
        m22077a();
    }

    /* renamed from: b */
    public static C34343Y5[] m22074b() {
        if (f93804c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f93804c == null) {
                    f93804c = new C34343Y5[0];
                }
            }
        }
        return f93804c;
    }

    /* renamed from: a */
    public final C34343Y5 m22077a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f93805a = bArr;
        this.f93806b = bArr;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f93805a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f93805a);
        }
        if (!Arrays.equals(this.f93806b, bArr2)) {
            return computeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(2, this.f93806b);
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f93805a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f93805a);
        }
        if (!Arrays.equals(this.f93806b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f93806b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C34343Y5 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f93805a = codedInputByteBufferNano.readBytes();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f93806b = codedInputByteBufferNano.readBytes();
            }
        }
    }

    /* renamed from: b */
    public static C34343Y5 m22073b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C34343Y5().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C34343Y5 m22075a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C34343Y5) MessageNano.mergeFrom(new C34343Y5(), bArr);
    }
}
