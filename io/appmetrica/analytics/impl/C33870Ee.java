package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.Ee */
/* loaded from: classes9.dex */
public final class C33870Ee extends MessageNano {

    /* renamed from: d */
    public static volatile C33870Ee[] f92788d;

    /* renamed from: a */
    public String f92789a;

    /* renamed from: b */
    public String f92790b;

    /* renamed from: c */
    public int f92791c;

    public C33870Ee() {
        m22674a();
    }

    /* renamed from: b */
    public static C33870Ee[] m22671b() {
        if (f92788d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f92788d == null) {
                    f92788d = new C33870Ee[0];
                }
            }
        }
        return f92788d;
    }

    /* renamed from: a */
    public final C33870Ee m22674a() {
        this.f92789a = "";
        this.f92790b = "";
        this.f92791c = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f92789a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f92789a);
        }
        if (!this.f92790b.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f92790b);
        }
        return CodedOutputByteBufferNano.computeInt32Size(3, this.f92791c) + computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f92789a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f92789a);
        }
        if (!this.f92790b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f92790b);
        }
        codedOutputByteBufferNano.writeInt32(3, this.f92791c);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C33870Ee mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f92789a = codedInputByteBufferNano.readString();
            } else if (readTag == 18) {
                this.f92790b = codedInputByteBufferNano.readString();
            } else if (readTag != 24) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2 || readInt32 == 3) {
                    this.f92791c = readInt32;
                }
            }
        }
    }

    /* renamed from: b */
    public static C33870Ee m22670b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C33870Ee().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C33870Ee m22672a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C33870Ee) MessageNano.mergeFrom(new C33870Ee(), bArr);
    }
}
