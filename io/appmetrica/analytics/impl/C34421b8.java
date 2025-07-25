package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.b8 */
/* loaded from: classes9.dex */
public final class C34421b8 extends MessageNano {

    /* renamed from: c */
    public static volatile C34421b8[] f94016c;

    /* renamed from: a */
    public byte[] f94017a;

    /* renamed from: b */
    public C34529f8 f94018b;

    public C34421b8() {
        m21946a();
    }

    /* renamed from: b */
    public static C34421b8[] m21943b() {
        if (f94016c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f94016c == null) {
                    f94016c = new C34421b8[0];
                }
            }
        }
        return f94016c;
    }

    /* renamed from: a */
    public final C34421b8 m21946a() {
        this.f94017a = WireFormatNano.EMPTY_BYTES;
        this.f94018b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!Arrays.equals(this.f94017a, WireFormatNano.EMPTY_BYTES)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f94017a);
        }
        C34529f8 c34529f8 = this.f94018b;
        if (c34529f8 != null) {
            return computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(2, c34529f8);
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!Arrays.equals(this.f94017a, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(1, this.f94017a);
        }
        C34529f8 c34529f8 = this.f94018b;
        if (c34529f8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c34529f8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C34421b8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f94017a = codedInputByteBufferNano.readBytes();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                if (this.f94018b == null) {
                    this.f94018b = new C34529f8();
                }
                codedInputByteBufferNano.readMessage(this.f94018b);
            }
        }
    }

    /* renamed from: b */
    public static C34421b8 m21942b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C34421b8().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C34421b8 m21944a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C34421b8) MessageNano.mergeFrom(new C34421b8(), bArr);
    }
}
