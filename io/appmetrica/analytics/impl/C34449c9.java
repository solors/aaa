package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.c9 */
/* loaded from: classes9.dex */
public final class C34449c9 extends MessageNano {

    /* renamed from: c */
    public static volatile C34449c9[] f94083c;

    /* renamed from: a */
    public int f94084a;

    /* renamed from: b */
    public String f94085b;

    public C34449c9() {
        m21891a();
    }

    /* renamed from: b */
    public static C34449c9[] m21888b() {
        if (f94083c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f94083c == null) {
                    f94083c = new C34449c9[0];
                }
            }
        }
        return f94083c;
    }

    /* renamed from: a */
    public final C34449c9 m21891a() {
        this.f94084a = 2;
        this.f94085b = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i = this.f94084a;
        if (i != 2) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(3, i);
        }
        if (!this.f94085b.equals("")) {
            return computeSerializedSize + CodedOutputByteBufferNano.computeStringSize(4, this.f94085b);
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i = this.f94084a;
        if (i != 2) {
            codedOutputByteBufferNano.writeInt32(3, i);
        }
        if (!this.f94085b.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f94085b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C34449c9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 24) {
                int readInt32 = codedInputByteBufferNano.readInt32();
                switch (readInt32) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                        this.f94084a = readInt32;
                        continue;
                }
            } else if (readTag != 34) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f94085b = codedInputByteBufferNano.readString();
            }
        }
    }

    /* renamed from: b */
    public static C34449c9 m21887b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C34449c9().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C34449c9 m21889a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C34449c9) MessageNano.mergeFrom(new C34449c9(), bArr);
    }
}
