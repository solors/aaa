package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.o7 */
/* loaded from: classes9.dex */
public final class C34771o7 extends MessageNano {

    /* renamed from: s */
    public static volatile C34771o7[] f95081s;

    /* renamed from: a */
    public int f95082a;

    /* renamed from: b */
    public String f95083b;

    /* renamed from: c */
    public String f95084c;

    /* renamed from: d */
    public long f95085d;

    /* renamed from: e */
    public C34798p7 f95086e;

    /* renamed from: f */
    public String f95087f;

    /* renamed from: g */
    public String f95088g;

    /* renamed from: h */
    public long f95089h;

    /* renamed from: i */
    public int f95090i;

    /* renamed from: j */
    public int f95091j;

    /* renamed from: k */
    public String f95092k;

    /* renamed from: l */
    public int f95093l;

    /* renamed from: m */
    public String f95094m;

    /* renamed from: n */
    public int f95095n;

    /* renamed from: o */
    public int f95096o;

    /* renamed from: p */
    public int f95097p;

    /* renamed from: q */
    public int f95098q;

    /* renamed from: r */
    public byte[] f95099r;

    public C34771o7() {
        m21228a();
    }

    /* renamed from: b */
    public static C34771o7[] m21225b() {
        if (f95081s == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f95081s == null) {
                    f95081s = new C34771o7[0];
                }
            }
        }
        return f95081s;
    }

    /* renamed from: a */
    public final C34771o7 m21228a() {
        this.f95082a = -1;
        this.f95083b = "";
        this.f95084c = "";
        this.f95085d = -1L;
        this.f95086e = null;
        this.f95087f = "";
        this.f95088g = "";
        this.f95089h = -1L;
        this.f95090i = -1;
        this.f95091j = -1;
        this.f95092k = "";
        this.f95093l = -1;
        this.f95094m = "";
        this.f95095n = -1;
        this.f95096o = -1;
        this.f95097p = -1;
        this.f95098q = -1;
        this.f95099r = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i = this.f95082a;
        if (i != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, i);
        }
        if (!this.f95083b.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f95083b);
        }
        if (!this.f95084c.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(3, this.f95084c);
        }
        long j = this.f95085d;
        if (j != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(4, j);
        }
        C34798p7 c34798p7 = this.f95086e;
        if (c34798p7 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(5, c34798p7);
        }
        if (!this.f95087f.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(6, this.f95087f);
        }
        if (!this.f95088g.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(7, this.f95088g);
        }
        long j2 = this.f95089h;
        if (j2 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(8, j2);
        }
        int i2 = this.f95090i;
        if (i2 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(9, i2);
        }
        int i3 = this.f95091j;
        if (i3 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(10, i3);
        }
        if (!this.f95092k.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(11, this.f95092k);
        }
        int i4 = this.f95093l;
        if (i4 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(12, i4);
        }
        if (!this.f95094m.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(13, this.f95094m);
        }
        int i5 = this.f95095n;
        if (i5 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(14, i5);
        }
        int i6 = this.f95096o;
        if (i6 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(15, i6);
        }
        int i7 = this.f95097p;
        if (i7 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(16, i7);
        }
        int i8 = this.f95098q;
        if (i8 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(17, i8);
        }
        if (!Arrays.equals(this.f95099r, WireFormatNano.EMPTY_BYTES)) {
            return computeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(18, this.f95099r);
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i = this.f95082a;
        if (i != -1) {
            codedOutputByteBufferNano.writeInt32(1, i);
        }
        if (!this.f95083b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f95083b);
        }
        if (!this.f95084c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.f95084c);
        }
        long j = this.f95085d;
        if (j != -1) {
            codedOutputByteBufferNano.writeInt64(4, j);
        }
        C34798p7 c34798p7 = this.f95086e;
        if (c34798p7 != null) {
            codedOutputByteBufferNano.writeMessage(5, c34798p7);
        }
        if (!this.f95087f.equals("")) {
            codedOutputByteBufferNano.writeString(6, this.f95087f);
        }
        if (!this.f95088g.equals("")) {
            codedOutputByteBufferNano.writeString(7, this.f95088g);
        }
        long j2 = this.f95089h;
        if (j2 != -1) {
            codedOutputByteBufferNano.writeInt64(8, j2);
        }
        int i2 = this.f95090i;
        if (i2 != -1) {
            codedOutputByteBufferNano.writeInt32(9, i2);
        }
        int i3 = this.f95091j;
        if (i3 != -1) {
            codedOutputByteBufferNano.writeInt32(10, i3);
        }
        if (!this.f95092k.equals("")) {
            codedOutputByteBufferNano.writeString(11, this.f95092k);
        }
        int i4 = this.f95093l;
        if (i4 != -1) {
            codedOutputByteBufferNano.writeInt32(12, i4);
        }
        if (!this.f95094m.equals("")) {
            codedOutputByteBufferNano.writeString(13, this.f95094m);
        }
        int i5 = this.f95095n;
        if (i5 != -1) {
            codedOutputByteBufferNano.writeInt32(14, i5);
        }
        int i6 = this.f95096o;
        if (i6 != -1) {
            codedOutputByteBufferNano.writeInt32(15, i6);
        }
        int i7 = this.f95097p;
        if (i7 != -1) {
            codedOutputByteBufferNano.writeInt32(16, i7);
        }
        int i8 = this.f95098q;
        if (i8 != -1) {
            codedOutputByteBufferNano.writeInt32(17, i8);
        }
        if (!Arrays.equals(this.f95099r, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(18, this.f95099r);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    /* renamed from: b */
    public static C34771o7 m21224b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C34771o7().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C34771o7 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    return this;
                case 8:
                    this.f95082a = codedInputByteBufferNano.readInt32();
                    break;
                case 18:
                    this.f95083b = codedInputByteBufferNano.readString();
                    break;
                case 26:
                    this.f95084c = codedInputByteBufferNano.readString();
                    break;
                case 32:
                    this.f95085d = codedInputByteBufferNano.readInt64();
                    break;
                case 42:
                    if (this.f95086e == null) {
                        this.f95086e = new C34798p7();
                    }
                    codedInputByteBufferNano.readMessage(this.f95086e);
                    break;
                case 50:
                    this.f95087f = codedInputByteBufferNano.readString();
                    break;
                case 58:
                    this.f95088g = codedInputByteBufferNano.readString();
                    break;
                case 64:
                    this.f95089h = codedInputByteBufferNano.readInt64();
                    break;
                case 72:
                    this.f95090i = codedInputByteBufferNano.readInt32();
                    break;
                case 80:
                    this.f95091j = codedInputByteBufferNano.readInt32();
                    break;
                case 90:
                    this.f95092k = codedInputByteBufferNano.readString();
                    break;
                case 96:
                    this.f95093l = codedInputByteBufferNano.readInt32();
                    break;
                case 106:
                    this.f95094m = codedInputByteBufferNano.readString();
                    break;
                case 112:
                    this.f95095n = codedInputByteBufferNano.readInt32();
                    break;
                case 120:
                    this.f95096o = codedInputByteBufferNano.readInt32();
                    break;
                case 128:
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    if (readInt32 != -1 && readInt32 != 0 && readInt32 != 1) {
                        break;
                    } else {
                        this.f95097p = readInt32;
                        break;
                    }
                case 136:
                    this.f95098q = codedInputByteBufferNano.readInt32();
                    break;
                case 146:
                    this.f95099r = codedInputByteBufferNano.readBytes();
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
    public static C34771o7 m21226a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C34771o7) MessageNano.mergeFrom(new C34771o7(), bArr);
    }
}
