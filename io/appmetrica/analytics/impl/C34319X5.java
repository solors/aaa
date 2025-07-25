package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.X5 */
/* loaded from: classes9.dex */
public final class C34319X5 extends MessageNano {

    /* renamed from: d */
    public static volatile C34319X5[] f93708d;

    /* renamed from: a */
    public C34295W5 f93709a;

    /* renamed from: b */
    public String f93710b;

    /* renamed from: c */
    public int f93711c;

    public C34319X5() {
        m22115a();
    }

    /* renamed from: b */
    public static C34319X5[] m22112b() {
        if (f93708d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f93708d == null) {
                    f93708d = new C34319X5[0];
                }
            }
        }
        return f93708d;
    }

    /* renamed from: a */
    public final C34319X5 m22115a() {
        this.f93709a = null;
        this.f93710b = "";
        this.f93711c = -1;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C34295W5 c34295w5 = this.f93709a;
        if (c34295w5 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c34295w5);
        }
        if (!this.f93710b.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f93710b);
        }
        int i = this.f93711c;
        if (i != -1) {
            return computeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(3, i);
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C34295W5 c34295w5 = this.f93709a;
        if (c34295w5 != null) {
            codedOutputByteBufferNano.writeMessage(1, c34295w5);
        }
        if (!this.f93710b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f93710b);
        }
        int i = this.f93711c;
        if (i != -1) {
            codedOutputByteBufferNano.writeInt32(3, i);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C34319X5 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                if (this.f93709a == null) {
                    this.f93709a = new C34295W5();
                }
                codedInputByteBufferNano.readMessage(this.f93709a);
            } else if (readTag == 18) {
                this.f93710b = codedInputByteBufferNano.readString();
            } else if (readTag != 24) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == -1 || readInt32 == 0 || readInt32 == 1) {
                    this.f93711c = readInt32;
                }
            }
        }
    }

    /* renamed from: b */
    public static C34319X5 m22111b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C34319X5().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C34319X5 m22113a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C34319X5) MessageNano.mergeFrom(new C34319X5(), bArr);
    }
}
