package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.Gf */
/* loaded from: classes9.dex */
public final class C33921Gf extends MessageNano {

    /* renamed from: e */
    public static final int f92911e = 0;

    /* renamed from: f */
    public static final int f92912f = 1;

    /* renamed from: g */
    public static final int f92913g = 2;

    /* renamed from: h */
    public static volatile C33921Gf[] f92914h;

    /* renamed from: a */
    public String f92915a;

    /* renamed from: b */
    public long f92916b;

    /* renamed from: c */
    public long f92917c;

    /* renamed from: d */
    public int f92918d;

    public C33921Gf() {
        m22584a();
    }

    /* renamed from: b */
    public static C33921Gf[] m22581b() {
        if (f92914h == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f92914h == null) {
                    f92914h = new C33921Gf[0];
                }
            }
        }
        return f92914h;
    }

    /* renamed from: a */
    public final C33921Gf m22584a() {
        this.f92915a = "";
        this.f92916b = 0L;
        this.f92917c = 0L;
        this.f92918d = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f92915a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f92915a);
        }
        long j = this.f92916b;
        if (j != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(2, j);
        }
        long j2 = this.f92917c;
        if (j2 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(3, j2);
        }
        int i = this.f92918d;
        if (i != 0) {
            return computeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(4, i);
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f92915a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f92915a);
        }
        long j = this.f92916b;
        if (j != 0) {
            codedOutputByteBufferNano.writeUInt64(2, j);
        }
        long j2 = this.f92917c;
        if (j2 != 0) {
            codedOutputByteBufferNano.writeUInt64(3, j2);
        }
        int i = this.f92918d;
        if (i != 0) {
            codedOutputByteBufferNano.writeInt32(4, i);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C33921Gf mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f92915a = codedInputByteBufferNano.readString();
            } else if (readTag == 16) {
                this.f92916b = codedInputByteBufferNano.readUInt64();
            } else if (readTag == 24) {
                this.f92917c = codedInputByteBufferNano.readUInt64();
            } else if (readTag != 32) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2) {
                    this.f92918d = readInt32;
                }
            }
        }
    }

    /* renamed from: b */
    public static C33921Gf m22580b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C33921Gf().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C33921Gf m22582a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C33921Gf) MessageNano.mergeFrom(new C33921Gf(), bArr);
    }
}
