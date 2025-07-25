package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.e6 */
/* loaded from: classes9.dex */
public final class C34500e6 extends MessageNano {

    /* renamed from: g */
    public static volatile C34500e6[] f94236g;

    /* renamed from: a */
    public String f94237a;

    /* renamed from: b */
    public String f94238b;

    /* renamed from: c */
    public int f94239c;

    /* renamed from: d */
    public String f94240d;

    /* renamed from: e */
    public boolean f94241e;

    /* renamed from: f */
    public int f94242f;

    public C34500e6() {
        m21807a();
    }

    /* renamed from: b */
    public static C34500e6[] m21804b() {
        if (f94236g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f94236g == null) {
                    f94236g = new C34500e6[0];
                }
            }
        }
        return f94236g;
    }

    /* renamed from: a */
    public final C34500e6 m21807a() {
        this.f94237a = "";
        this.f94238b = "";
        this.f94239c = -1;
        this.f94240d = "";
        this.f94241e = false;
        this.f94242f = -1;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f94237a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f94237a);
        }
        if (!this.f94238b.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f94238b);
        }
        int i = this.f94239c;
        if (i != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeSInt32Size(3, i);
        }
        if (!this.f94240d.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(4, this.f94240d);
        }
        boolean z = this.f94241e;
        if (z) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(5, z);
        }
        int i2 = this.f94242f;
        if (i2 != -1) {
            return computeSerializedSize + CodedOutputByteBufferNano.computeSInt32Size(6, i2);
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f94237a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f94237a);
        }
        if (!this.f94238b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f94238b);
        }
        int i = this.f94239c;
        if (i != -1) {
            codedOutputByteBufferNano.writeSInt32(3, i);
        }
        if (!this.f94240d.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f94240d);
        }
        boolean z = this.f94241e;
        if (z) {
            codedOutputByteBufferNano.writeBool(5, z);
        }
        int i2 = this.f94242f;
        if (i2 != -1) {
            codedOutputByteBufferNano.writeSInt32(6, i2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    /* renamed from: b */
    public static C34500e6 m21803b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C34500e6().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C34500e6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f94237a = codedInputByteBufferNano.readString();
            } else if (readTag == 18) {
                this.f94238b = codedInputByteBufferNano.readString();
            } else if (readTag == 24) {
                this.f94239c = codedInputByteBufferNano.readSInt32();
            } else if (readTag == 34) {
                this.f94240d = codedInputByteBufferNano.readString();
            } else if (readTag == 40) {
                this.f94241e = codedInputByteBufferNano.readBool();
            } else if (readTag != 48) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f94242f = codedInputByteBufferNano.readSInt32();
            }
        }
    }

    /* renamed from: a */
    public static C34500e6 m21805a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C34500e6) MessageNano.mergeFrom(new C34500e6(), bArr);
    }
}
