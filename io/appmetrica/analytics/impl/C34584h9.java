package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.h9 */
/* loaded from: classes9.dex */
public final class C34584h9 extends MessageNano {

    /* renamed from: e */
    public static volatile C34584h9[] f94524e;

    /* renamed from: a */
    public long f94525a;

    /* renamed from: b */
    public int f94526b;

    /* renamed from: c */
    public long f94527c;

    /* renamed from: d */
    public boolean f94528d;

    public C34584h9() {
        m21594a();
    }

    /* renamed from: b */
    public static C34584h9[] m21591b() {
        if (f94524e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f94524e == null) {
                    f94524e = new C34584h9[0];
                }
            }
        }
        return f94524e;
    }

    /* renamed from: a */
    public final C34584h9 m21594a() {
        this.f94525a = 0L;
        this.f94526b = 0;
        this.f94527c = 0L;
        this.f94528d = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSInt32Size = CodedOutputByteBufferNano.computeSInt32Size(2, this.f94526b) + CodedOutputByteBufferNano.computeUInt64Size(1, this.f94525a) + super.computeSerializedSize();
        long j = this.f94527c;
        if (j != 0) {
            computeSInt32Size += CodedOutputByteBufferNano.computeInt64Size(3, j);
        }
        boolean z = this.f94528d;
        if (z) {
            return computeSInt32Size + CodedOutputByteBufferNano.computeBoolSize(4, z);
        }
        return computeSInt32Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeUInt64(1, this.f94525a);
        codedOutputByteBufferNano.writeSInt32(2, this.f94526b);
        long j = this.f94527c;
        if (j != 0) {
            codedOutputByteBufferNano.writeInt64(3, j);
        }
        boolean z = this.f94528d;
        if (z) {
            codedOutputByteBufferNano.writeBool(4, z);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C34584h9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.f94525a = codedInputByteBufferNano.readUInt64();
            } else if (readTag == 16) {
                this.f94526b = codedInputByteBufferNano.readSInt32();
            } else if (readTag == 24) {
                this.f94527c = codedInputByteBufferNano.readInt64();
            } else if (readTag != 32) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f94528d = codedInputByteBufferNano.readBool();
            }
        }
    }

    /* renamed from: b */
    public static C34584h9 m21590b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C34584h9().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C34584h9 m21592a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C34584h9) MessageNano.mergeFrom(new C34584h9(), bArr);
    }
}
