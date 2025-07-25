package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.h8 */
/* loaded from: classes9.dex */
public final class C34583h8 extends MessageNano {

    /* renamed from: c */
    public static volatile C34583h8[] f94521c;

    /* renamed from: a */
    public int f94522a;

    /* renamed from: b */
    public C34475d8 f94523b;

    public C34583h8() {
        m21599a();
    }

    /* renamed from: b */
    public static C34583h8[] m21596b() {
        if (f94521c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f94521c == null) {
                    f94521c = new C34583h8[0];
                }
            }
        }
        return f94521c;
    }

    /* renamed from: a */
    public final C34583h8 m21599a() {
        this.f94522a = 0;
        this.f94523b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i = this.f94522a;
        if (i != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(1, i);
        }
        C34475d8 c34475d8 = this.f94523b;
        if (c34475d8 != null) {
            return computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(2, c34475d8);
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i = this.f94522a;
        if (i != 0) {
            codedOutputByteBufferNano.writeUInt32(1, i);
        }
        C34475d8 c34475d8 = this.f94523b;
        if (c34475d8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c34475d8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C34583h8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.f94522a = codedInputByteBufferNano.readUInt32();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                if (this.f94523b == null) {
                    this.f94523b = new C34475d8();
                }
                codedInputByteBufferNano.readMessage(this.f94523b);
            }
        }
    }

    /* renamed from: b */
    public static C34583h8 m21595b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C34583h8().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C34583h8 m21597a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C34583h8) MessageNano.mergeFrom(new C34583h8(), bArr);
    }
}
