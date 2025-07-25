package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.De */
/* loaded from: classes9.dex */
public final class C33845De extends MessageNano {

    /* renamed from: f */
    public static volatile C33845De[] f92707f;

    /* renamed from: a */
    public String f92708a;

    /* renamed from: b */
    public String f92709b;

    /* renamed from: c */
    public boolean f92710c;

    /* renamed from: d */
    public boolean f92711d;

    /* renamed from: e */
    public int f92712e;

    public C33845De() {
        m22715a();
    }

    /* renamed from: b */
    public static C33845De[] m22712b() {
        if (f92707f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f92707f == null) {
                    f92707f = new C33845De[0];
                }
            }
        }
        return f92707f;
    }

    /* renamed from: a */
    public final C33845De m22715a() {
        this.f92708a = "";
        this.f92709b = "";
        this.f92710c = false;
        this.f92711d = false;
        this.f92712e = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f92708a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f92708a);
        }
        if (!this.f92709b.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f92709b);
        }
        boolean z = this.f92710c;
        if (z) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(3, z);
        }
        boolean z2 = this.f92711d;
        if (z2) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(4, z2);
        }
        return CodedOutputByteBufferNano.computeInt32Size(5, this.f92712e) + computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f92708a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f92708a);
        }
        if (!this.f92709b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f92709b);
        }
        boolean z = this.f92710c;
        if (z) {
            codedOutputByteBufferNano.writeBool(3, z);
        }
        boolean z2 = this.f92711d;
        if (z2) {
            codedOutputByteBufferNano.writeBool(4, z2);
        }
        codedOutputByteBufferNano.writeInt32(5, this.f92712e);
        super.writeTo(codedOutputByteBufferNano);
    }

    /* renamed from: b */
    public static C33845De m22711b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C33845De().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C33845De mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f92708a = codedInputByteBufferNano.readString();
            } else if (readTag == 18) {
                this.f92709b = codedInputByteBufferNano.readString();
            } else if (readTag == 24) {
                this.f92710c = codedInputByteBufferNano.readBool();
            } else if (readTag == 32) {
                this.f92711d = codedInputByteBufferNano.readBool();
            } else if (readTag != 40) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2 || readInt32 == 3) {
                    this.f92712e = readInt32;
                }
            }
        }
    }

    /* renamed from: a */
    public static C33845De m22713a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C33845De) MessageNano.mergeFrom(new C33845De(), bArr);
    }
}
