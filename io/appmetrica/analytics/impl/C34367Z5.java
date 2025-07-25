package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.Z5 */
/* loaded from: classes9.dex */
public final class C34367Z5 extends MessageNano {

    /* renamed from: c */
    public static volatile C34367Z5[] f93864c;

    /* renamed from: a */
    public byte[] f93865a;

    /* renamed from: b */
    public C34473d6 f93866b;

    public C34367Z5() {
        m22052a();
    }

    /* renamed from: b */
    public static C34367Z5[] m22049b() {
        if (f93864c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f93864c == null) {
                    f93864c = new C34367Z5[0];
                }
            }
        }
        return f93864c;
    }

    /* renamed from: a */
    public final C34367Z5 m22052a() {
        this.f93865a = WireFormatNano.EMPTY_BYTES;
        this.f93866b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!Arrays.equals(this.f93865a, WireFormatNano.EMPTY_BYTES)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f93865a);
        }
        C34473d6 c34473d6 = this.f93866b;
        if (c34473d6 != null) {
            return computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(2, c34473d6);
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!Arrays.equals(this.f93865a, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(1, this.f93865a);
        }
        C34473d6 c34473d6 = this.f93866b;
        if (c34473d6 != null) {
            codedOutputByteBufferNano.writeMessage(2, c34473d6);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C34367Z5 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f93865a = codedInputByteBufferNano.readBytes();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                if (this.f93866b == null) {
                    this.f93866b = new C34473d6();
                }
                codedInputByteBufferNano.readMessage(this.f93866b);
            }
        }
    }

    /* renamed from: b */
    public static C34367Z5 m22048b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C34367Z5().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C34367Z5 m22050a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C34367Z5) MessageNano.mergeFrom(new C34367Z5(), bArr);
    }
}
