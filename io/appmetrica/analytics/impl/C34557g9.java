package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.g9 */
/* loaded from: classes9.dex */
public final class C34557g9 extends MessageNano {

    /* renamed from: e */
    public static volatile C34557g9[] f94445e;

    /* renamed from: a */
    public int f94446a;

    /* renamed from: b */
    public int f94447b;

    /* renamed from: c */
    public String f94448c;

    /* renamed from: d */
    public boolean f94449d;

    public C34557g9() {
        m21667a();
    }

    /* renamed from: b */
    public static C34557g9[] m21664b() {
        if (f94445e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f94445e == null) {
                    f94445e = new C34557g9[0];
                }
            }
        }
        return f94445e;
    }

    /* renamed from: a */
    public final C34557g9 m21667a() {
        this.f94446a = 0;
        this.f94447b = 0;
        this.f94448c = "";
        this.f94449d = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i = this.f94446a;
        if (i != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(1, i);
        }
        int i2 = this.f94447b;
        if (i2 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(2, i2);
        }
        if (!this.f94448c.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(3, this.f94448c);
        }
        boolean z = this.f94449d;
        if (z) {
            return computeSerializedSize + CodedOutputByteBufferNano.computeBoolSize(4, z);
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i = this.f94446a;
        if (i != 0) {
            codedOutputByteBufferNano.writeUInt32(1, i);
        }
        int i2 = this.f94447b;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeUInt32(2, i2);
        }
        if (!this.f94448c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.f94448c);
        }
        boolean z = this.f94449d;
        if (z) {
            codedOutputByteBufferNano.writeBool(4, z);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C34557g9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.f94446a = codedInputByteBufferNano.readUInt32();
            } else if (readTag == 16) {
                this.f94447b = codedInputByteBufferNano.readUInt32();
            } else if (readTag == 26) {
                this.f94448c = codedInputByteBufferNano.readString();
            } else if (readTag != 32) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f94449d = codedInputByteBufferNano.readBool();
            }
        }
    }

    /* renamed from: b */
    public static C34557g9 m21663b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C34557g9().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C34557g9 m21665a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C34557g9) MessageNano.mergeFrom(new C34557g9(), bArr);
    }
}
