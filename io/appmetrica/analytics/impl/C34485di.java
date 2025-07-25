package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.di */
/* loaded from: classes9.dex */
public final class C34485di extends MessageNano {

    /* renamed from: f */
    public static final int f94205f = 0;

    /* renamed from: g */
    public static final int f94206g = 1;

    /* renamed from: h */
    public static final int f94207h = 2;

    /* renamed from: i */
    public static volatile C34485di[] f94208i;

    /* renamed from: a */
    public byte[] f94209a;

    /* renamed from: b */
    public long f94210b;

    /* renamed from: c */
    public int f94211c;

    /* renamed from: d */
    public byte[] f94212d;

    /* renamed from: e */
    public long f94213e;

    public C34485di() {
        m21822a();
    }

    /* renamed from: b */
    public static C34485di[] m21819b() {
        if (f94208i == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f94208i == null) {
                    f94208i = new C34485di[0];
                }
            }
        }
        return f94208i;
    }

    /* renamed from: a */
    public final C34485di m21822a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f94209a = bArr;
        this.f94210b = 0L;
        this.f94211c = 0;
        this.f94212d = bArr;
        this.f94213e = 0L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f94209a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f94209a);
        }
        long j = this.f94210b;
        if (j != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(2, j);
        }
        int i = this.f94211c;
        if (i != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(3, i);
        }
        if (!Arrays.equals(this.f94212d, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(4, this.f94212d);
        }
        long j2 = this.f94213e;
        if (j2 != 0) {
            return computeSerializedSize + CodedOutputByteBufferNano.computeUInt64Size(5, j2);
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f94209a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f94209a);
        }
        long j = this.f94210b;
        if (j != 0) {
            codedOutputByteBufferNano.writeUInt64(2, j);
        }
        int i = this.f94211c;
        if (i != 0) {
            codedOutputByteBufferNano.writeInt32(3, i);
        }
        if (!Arrays.equals(this.f94212d, bArr2)) {
            codedOutputByteBufferNano.writeBytes(4, this.f94212d);
        }
        long j2 = this.f94213e;
        if (j2 != 0) {
            codedOutputByteBufferNano.writeUInt64(5, j2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    /* renamed from: b */
    public static C34485di m21818b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C34485di().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C34485di mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f94209a = codedInputByteBufferNano.readBytes();
            } else if (readTag == 16) {
                this.f94210b = codedInputByteBufferNano.readUInt64();
            } else if (readTag == 24) {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2) {
                    this.f94211c = readInt32;
                }
            } else if (readTag == 34) {
                this.f94212d = codedInputByteBufferNano.readBytes();
            } else if (readTag != 40) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f94213e = codedInputByteBufferNano.readUInt64();
            }
        }
    }

    /* renamed from: a */
    public static C34485di m21820a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C34485di) MessageNano.mergeFrom(new C34485di(), bArr);
    }
}
