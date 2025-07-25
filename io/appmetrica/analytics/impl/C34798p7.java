package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.p7 */
/* loaded from: classes9.dex */
public final class C34798p7 extends MessageNano {

    /* renamed from: k */
    public static volatile C34798p7[] f95153k;

    /* renamed from: a */
    public int f95154a;

    /* renamed from: b */
    public double f95155b;

    /* renamed from: c */
    public double f95156c;

    /* renamed from: d */
    public int f95157d;

    /* renamed from: e */
    public int f95158e;

    /* renamed from: f */
    public int f95159f;

    /* renamed from: g */
    public int f95160g;

    /* renamed from: h */
    public long f95161h;

    /* renamed from: i */
    public String f95162i;

    /* renamed from: j */
    public String f95163j;

    public C34798p7() {
        m21172a();
    }

    /* renamed from: b */
    public static C34798p7[] m21169b() {
        if (f95153k == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f95153k == null) {
                    f95153k = new C34798p7[0];
                }
            }
        }
        return f95153k;
    }

    /* renamed from: a */
    public final C34798p7 m21172a() {
        this.f95154a = -1;
        this.f95155b = -1.0d;
        this.f95156c = -1.0d;
        this.f95157d = -1;
        this.f95158e = -1;
        this.f95159f = -1;
        this.f95160g = -1;
        this.f95161h = -1L;
        this.f95162i = "";
        this.f95163j = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i = this.f95154a;
        if (i != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, i);
        }
        if (Double.doubleToLongBits(this.f95155b) != Double.doubleToLongBits(-1.0d)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeDoubleSize(2, this.f95155b);
        }
        if (Double.doubleToLongBits(this.f95156c) != Double.doubleToLongBits(-1.0d)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeDoubleSize(3, this.f95156c);
        }
        int i2 = this.f95157d;
        if (i2 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(4, i2);
        }
        int i3 = this.f95158e;
        if (i3 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(5, i3);
        }
        int i4 = this.f95159f;
        if (i4 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(6, i4);
        }
        int i5 = this.f95160g;
        if (i5 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(7, i5);
        }
        long j = this.f95161h;
        if (j != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(8, j);
        }
        if (!this.f95162i.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(9, this.f95162i);
        }
        if (!this.f95163j.equals("")) {
            return computeSerializedSize + CodedOutputByteBufferNano.computeStringSize(10, this.f95163j);
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i = this.f95154a;
        if (i != -1) {
            codedOutputByteBufferNano.writeInt32(1, i);
        }
        if (Double.doubleToLongBits(this.f95155b) != Double.doubleToLongBits(-1.0d)) {
            codedOutputByteBufferNano.writeDouble(2, this.f95155b);
        }
        if (Double.doubleToLongBits(this.f95156c) != Double.doubleToLongBits(-1.0d)) {
            codedOutputByteBufferNano.writeDouble(3, this.f95156c);
        }
        int i2 = this.f95157d;
        if (i2 != -1) {
            codedOutputByteBufferNano.writeInt32(4, i2);
        }
        int i3 = this.f95158e;
        if (i3 != -1) {
            codedOutputByteBufferNano.writeInt32(5, i3);
        }
        int i4 = this.f95159f;
        if (i4 != -1) {
            codedOutputByteBufferNano.writeInt32(6, i4);
        }
        int i5 = this.f95160g;
        if (i5 != -1) {
            codedOutputByteBufferNano.writeInt32(7, i5);
        }
        long j = this.f95161h;
        if (j != -1) {
            codedOutputByteBufferNano.writeInt64(8, j);
        }
        if (!this.f95162i.equals("")) {
            codedOutputByteBufferNano.writeString(9, this.f95162i);
        }
        if (!this.f95163j.equals("")) {
            codedOutputByteBufferNano.writeString(10, this.f95163j);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    /* renamed from: b */
    public static C34798p7 m21168b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C34798p7().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C34798p7 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    return this;
                case 8:
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    if (readInt32 != -1 && readInt32 != 0 && readInt32 != 1) {
                        break;
                    } else {
                        this.f95154a = readInt32;
                        break;
                    }
                case 17:
                    this.f95155b = codedInputByteBufferNano.readDouble();
                    break;
                case 25:
                    this.f95156c = codedInputByteBufferNano.readDouble();
                    break;
                case 32:
                    this.f95157d = codedInputByteBufferNano.readInt32();
                    break;
                case 40:
                    this.f95158e = codedInputByteBufferNano.readInt32();
                    break;
                case 48:
                    this.f95159f = codedInputByteBufferNano.readInt32();
                    break;
                case 56:
                    this.f95160g = codedInputByteBufferNano.readInt32();
                    break;
                case 64:
                    this.f95161h = codedInputByteBufferNano.readInt64();
                    break;
                case 74:
                    this.f95162i = codedInputByteBufferNano.readString();
                    break;
                case 82:
                    this.f95163j = codedInputByteBufferNano.readString();
                    break;
                default:
                    if (WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                        break;
                    } else {
                        return this;
                    }
            }
        }
    }

    /* renamed from: a */
    public static C34798p7 m21170a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C34798p7) MessageNano.mergeFrom(new C34798p7(), bArr);
    }
}
