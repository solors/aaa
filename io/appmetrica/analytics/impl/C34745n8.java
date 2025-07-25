package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.n8 */
/* loaded from: classes9.dex */
public final class C34745n8 extends MessageNano {

    /* renamed from: b */
    public static volatile C34745n8[] f94992b;

    /* renamed from: a */
    public byte[] f94993a;

    public C34745n8() {
        m21310a();
    }

    /* renamed from: b */
    public static C34745n8[] m21307b() {
        if (f94992b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f94992b == null) {
                    f94992b = new C34745n8[0];
                }
            }
        }
        return f94992b;
    }

    /* renamed from: a */
    public final C34745n8 m21310a() {
        this.f94993a = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!Arrays.equals(this.f94993a, WireFormatNano.EMPTY_BYTES)) {
            return computeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(1, this.f94993a);
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!Arrays.equals(this.f94993a, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(1, this.f94993a);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C34745n8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag != 10) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f94993a = codedInputByteBufferNano.readBytes();
            }
        }
    }

    /* renamed from: a */
    public static C34745n8 m21308a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C34745n8) MessageNano.mergeFrom(new C34745n8(), bArr);
    }

    /* renamed from: b */
    public static C34745n8 m21306b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C34745n8().mergeFrom(codedInputByteBufferNano);
    }
}
