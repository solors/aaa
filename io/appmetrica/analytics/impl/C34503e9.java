package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.e9 */
/* loaded from: classes9.dex */
public final class C34503e9 extends MessageNano {

    /* renamed from: d */
    public static final int f94246d = 0;

    /* renamed from: e */
    public static final int f94247e = 1;

    /* renamed from: f */
    public static final int f94248f = 2;

    /* renamed from: g */
    public static volatile C34503e9[] f94249g;

    /* renamed from: a */
    public C34584h9 f94250a;

    /* renamed from: b */
    public String f94251b;

    /* renamed from: c */
    public int f94252c;

    public C34503e9() {
        m21795a();
    }

    /* renamed from: b */
    public static C34503e9[] m21792b() {
        if (f94249g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f94249g == null) {
                    f94249g = new C34503e9[0];
                }
            }
        }
        return f94249g;
    }

    /* renamed from: a */
    public final C34503e9 m21795a() {
        this.f94250a = null;
        this.f94251b = "";
        this.f94252c = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C34584h9 c34584h9 = this.f94250a;
        if (c34584h9 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c34584h9);
        }
        int computeStringSize = CodedOutputByteBufferNano.computeStringSize(2, this.f94251b) + computeSerializedSize;
        int i = this.f94252c;
        if (i != 0) {
            return computeStringSize + CodedOutputByteBufferNano.computeInt32Size(5, i);
        }
        return computeStringSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C34584h9 c34584h9 = this.f94250a;
        if (c34584h9 != null) {
            codedOutputByteBufferNano.writeMessage(1, c34584h9);
        }
        codedOutputByteBufferNano.writeString(2, this.f94251b);
        int i = this.f94252c;
        if (i != 0) {
            codedOutputByteBufferNano.writeInt32(5, i);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C34503e9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                if (this.f94250a == null) {
                    this.f94250a = new C34584h9();
                }
                codedInputByteBufferNano.readMessage(this.f94250a);
            } else if (readTag == 18) {
                this.f94251b = codedInputByteBufferNano.readString();
            } else if (readTag != 40) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2) {
                    this.f94252c = readInt32;
                }
            }
        }
    }

    /* renamed from: b */
    public static C34503e9 m21791b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C34503e9().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C34503e9 m21793a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C34503e9) MessageNano.mergeFrom(new C34503e9(), bArr);
    }
}
