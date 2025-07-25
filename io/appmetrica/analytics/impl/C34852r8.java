package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.r8 */
/* loaded from: classes9.dex */
public final class C34852r8 extends MessageNano {

    /* renamed from: c */
    public static volatile C34852r8[] f95268c;

    /* renamed from: a */
    public C34718m8 f95269a;

    /* renamed from: b */
    public C34772o8 f95270b;

    public C34852r8() {
        m21042a();
    }

    /* renamed from: b */
    public static C34852r8[] m21039b() {
        if (f95268c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f95268c == null) {
                    f95268c = new C34852r8[0];
                }
            }
        }
        return f95268c;
    }

    /* renamed from: a */
    public final C34852r8 m21042a() {
        this.f95269a = null;
        this.f95270b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C34718m8 c34718m8 = this.f95269a;
        if (c34718m8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c34718m8);
        }
        C34772o8 c34772o8 = this.f95270b;
        if (c34772o8 != null) {
            return computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(2, c34772o8);
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C34718m8 c34718m8 = this.f95269a;
        if (c34718m8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c34718m8);
        }
        C34772o8 c34772o8 = this.f95270b;
        if (c34772o8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c34772o8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C34852r8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                if (this.f95269a == null) {
                    this.f95269a = new C34718m8();
                }
                codedInputByteBufferNano.readMessage(this.f95269a);
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                if (this.f95270b == null) {
                    this.f95270b = new C34772o8();
                }
                codedInputByteBufferNano.readMessage(this.f95270b);
            }
        }
    }

    /* renamed from: b */
    public static C34852r8 m21038b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C34852r8().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C34852r8 m21040a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C34852r8) MessageNano.mergeFrom(new C34852r8(), bArr);
    }
}
