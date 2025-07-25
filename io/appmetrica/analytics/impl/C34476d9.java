package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.d9 */
/* loaded from: classes9.dex */
public final class C34476d9 extends MessageNano {

    /* renamed from: A */
    public static final int f94154A = 17;

    /* renamed from: B */
    public static final int f94155B = 18;

    /* renamed from: C */
    public static final int f94156C = 19;

    /* renamed from: D */
    public static final int f94157D = 20;

    /* renamed from: E */
    public static final int f94158E = 21;

    /* renamed from: F */
    public static final int f94159F = 25;

    /* renamed from: G */
    public static final int f94160G = 26;

    /* renamed from: H */
    public static final int f94161H = 27;

    /* renamed from: I */
    public static final int f94162I = 29;

    /* renamed from: J */
    public static final int f94163J = 35;

    /* renamed from: K */
    public static final int f94164K = 38;

    /* renamed from: L */
    public static final int f94165L = 40;

    /* renamed from: M */
    public static final int f94166M = 42;

    /* renamed from: N */
    public static final int f94167N = 0;

    /* renamed from: O */
    public static final int f94168O = 1;

    /* renamed from: P */
    public static final int f94169P = 2;

    /* renamed from: Q */
    public static final int f94170Q = 0;

    /* renamed from: R */
    public static final int f94171R = 1;

    /* renamed from: S */
    public static volatile C34476d9[] f94172S = null;

    /* renamed from: t */
    public static final int f94173t = 1;

    /* renamed from: u */
    public static final int f94174u = 2;

    /* renamed from: v */
    public static final int f94175v = 4;

    /* renamed from: w */
    public static final int f94176w = 5;

    /* renamed from: x */
    public static final int f94177x = 7;

    /* renamed from: y */
    public static final int f94178y = 13;

    /* renamed from: z */
    public static final int f94179z = 16;

    /* renamed from: a */
    public long f94180a;

    /* renamed from: b */
    public long f94181b;

    /* renamed from: c */
    public int f94182c;

    /* renamed from: d */
    public String f94183d;

    /* renamed from: e */
    public byte[] f94184e;

    /* renamed from: f */
    public C34346Y8 f94185f;

    /* renamed from: g */
    public C34449c9 f94186g;

    /* renamed from: h */
    public String f94187h;

    /* renamed from: i */
    public int f94188i;

    /* renamed from: j */
    public int f94189j;

    /* renamed from: k */
    public int f94190k;

    /* renamed from: l */
    public byte[] f94191l;

    /* renamed from: m */
    public int f94192m;

    /* renamed from: n */
    public long f94193n;

    /* renamed from: o */
    public long f94194o;

    /* renamed from: p */
    public int f94195p;

    /* renamed from: q */
    public boolean f94196q;

    /* renamed from: r */
    public long f94197r;

    /* renamed from: s */
    public C34422b9[] f94198s;

    public C34476d9() {
        m21832a();
    }

    /* renamed from: b */
    public static C34476d9[] m21829b() {
        if (f94172S == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f94172S == null) {
                    f94172S = new C34476d9[0];
                }
            }
        }
        return f94172S;
    }

    /* renamed from: a */
    public final C34476d9 m21832a() {
        this.f94180a = 0L;
        this.f94181b = 0L;
        this.f94182c = 0;
        this.f94183d = "";
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f94184e = bArr;
        this.f94185f = null;
        this.f94186g = null;
        this.f94187h = "";
        this.f94188i = 0;
        this.f94189j = 0;
        this.f94190k = -1;
        this.f94191l = bArr;
        this.f94192m = -1;
        this.f94193n = 0L;
        this.f94194o = 0L;
        this.f94195p = 0;
        this.f94196q = false;
        this.f94197r = 1L;
        this.f94198s = C34422b9.m21938b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeUInt32Size = CodedOutputByteBufferNano.computeUInt32Size(3, this.f94182c) + CodedOutputByteBufferNano.computeUInt64Size(2, this.f94181b) + CodedOutputByteBufferNano.computeUInt64Size(1, this.f94180a) + super.computeSerializedSize();
        if (!this.f94183d.equals("")) {
            computeUInt32Size += CodedOutputByteBufferNano.computeStringSize(4, this.f94183d);
        }
        byte[] bArr = this.f94184e;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeUInt32Size += CodedOutputByteBufferNano.computeBytesSize(5, this.f94184e);
        }
        C34346Y8 c34346y8 = this.f94185f;
        if (c34346y8 != null) {
            computeUInt32Size += CodedOutputByteBufferNano.computeMessageSize(6, c34346y8);
        }
        C34449c9 c34449c9 = this.f94186g;
        if (c34449c9 != null) {
            computeUInt32Size += CodedOutputByteBufferNano.computeMessageSize(7, c34449c9);
        }
        if (!this.f94187h.equals("")) {
            computeUInt32Size += CodedOutputByteBufferNano.computeStringSize(8, this.f94187h);
        }
        int i = this.f94188i;
        if (i != 0) {
            computeUInt32Size += CodedOutputByteBufferNano.computeUInt32Size(10, i);
        }
        int i2 = this.f94189j;
        if (i2 != 0) {
            computeUInt32Size += CodedOutputByteBufferNano.computeInt32Size(12, i2);
        }
        int i3 = this.f94190k;
        if (i3 != -1) {
            computeUInt32Size += CodedOutputByteBufferNano.computeInt32Size(13, i3);
        }
        if (!Arrays.equals(this.f94191l, bArr2)) {
            computeUInt32Size += CodedOutputByteBufferNano.computeBytesSize(14, this.f94191l);
        }
        int i4 = this.f94192m;
        if (i4 != -1) {
            computeUInt32Size += CodedOutputByteBufferNano.computeInt32Size(15, i4);
        }
        long j = this.f94193n;
        if (j != 0) {
            computeUInt32Size += CodedOutputByteBufferNano.computeUInt64Size(16, j);
        }
        long j2 = this.f94194o;
        if (j2 != 0) {
            computeUInt32Size += CodedOutputByteBufferNano.computeUInt64Size(17, j2);
        }
        int i5 = this.f94195p;
        if (i5 != 0) {
            computeUInt32Size += CodedOutputByteBufferNano.computeInt32Size(22, i5);
        }
        boolean z = this.f94196q;
        if (z) {
            computeUInt32Size += CodedOutputByteBufferNano.computeBoolSize(23, z);
        }
        long j3 = this.f94197r;
        if (j3 != 1) {
            computeUInt32Size += CodedOutputByteBufferNano.computeUInt64Size(24, j3);
        }
        C34422b9[] c34422b9Arr = this.f94198s;
        if (c34422b9Arr != null && c34422b9Arr.length > 0) {
            int i6 = 0;
            while (true) {
                C34422b9[] c34422b9Arr2 = this.f94198s;
                if (i6 >= c34422b9Arr2.length) {
                    break;
                }
                C34422b9 c34422b9 = c34422b9Arr2[i6];
                if (c34422b9 != null) {
                    computeUInt32Size += CodedOutputByteBufferNano.computeMessageSize(25, c34422b9);
                }
                i6++;
            }
        }
        return computeUInt32Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeUInt64(1, this.f94180a);
        codedOutputByteBufferNano.writeUInt64(2, this.f94181b);
        codedOutputByteBufferNano.writeUInt32(3, this.f94182c);
        if (!this.f94183d.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f94183d);
        }
        byte[] bArr = this.f94184e;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(5, this.f94184e);
        }
        C34346Y8 c34346y8 = this.f94185f;
        if (c34346y8 != null) {
            codedOutputByteBufferNano.writeMessage(6, c34346y8);
        }
        C34449c9 c34449c9 = this.f94186g;
        if (c34449c9 != null) {
            codedOutputByteBufferNano.writeMessage(7, c34449c9);
        }
        if (!this.f94187h.equals("")) {
            codedOutputByteBufferNano.writeString(8, this.f94187h);
        }
        int i = this.f94188i;
        if (i != 0) {
            codedOutputByteBufferNano.writeUInt32(10, i);
        }
        int i2 = this.f94189j;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeInt32(12, i2);
        }
        int i3 = this.f94190k;
        if (i3 != -1) {
            codedOutputByteBufferNano.writeInt32(13, i3);
        }
        if (!Arrays.equals(this.f94191l, bArr2)) {
            codedOutputByteBufferNano.writeBytes(14, this.f94191l);
        }
        int i4 = this.f94192m;
        if (i4 != -1) {
            codedOutputByteBufferNano.writeInt32(15, i4);
        }
        long j = this.f94193n;
        if (j != 0) {
            codedOutputByteBufferNano.writeUInt64(16, j);
        }
        long j2 = this.f94194o;
        if (j2 != 0) {
            codedOutputByteBufferNano.writeUInt64(17, j2);
        }
        int i5 = this.f94195p;
        if (i5 != 0) {
            codedOutputByteBufferNano.writeInt32(22, i5);
        }
        boolean z = this.f94196q;
        if (z) {
            codedOutputByteBufferNano.writeBool(23, z);
        }
        long j3 = this.f94197r;
        if (j3 != 1) {
            codedOutputByteBufferNano.writeUInt64(24, j3);
        }
        C34422b9[] c34422b9Arr = this.f94198s;
        if (c34422b9Arr != null && c34422b9Arr.length > 0) {
            int i6 = 0;
            while (true) {
                C34422b9[] c34422b9Arr2 = this.f94198s;
                if (i6 >= c34422b9Arr2.length) {
                    break;
                }
                C34422b9 c34422b9 = c34422b9Arr2[i6];
                if (c34422b9 != null) {
                    codedOutputByteBufferNano.writeMessage(25, c34422b9);
                }
                i6++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    /* renamed from: b */
    public static C34476d9 m21828b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C34476d9().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C34476d9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    return this;
                case 8:
                    this.f94180a = codedInputByteBufferNano.readUInt64();
                    break;
                case 16:
                    this.f94181b = codedInputByteBufferNano.readUInt64();
                    break;
                case 24:
                    this.f94182c = codedInputByteBufferNano.readUInt32();
                    break;
                case 34:
                    this.f94183d = codedInputByteBufferNano.readString();
                    break;
                case 42:
                    this.f94184e = codedInputByteBufferNano.readBytes();
                    break;
                case 50:
                    if (this.f94185f == null) {
                        this.f94185f = new C34346Y8();
                    }
                    codedInputByteBufferNano.readMessage(this.f94185f);
                    break;
                case 58:
                    if (this.f94186g == null) {
                        this.f94186g = new C34449c9();
                    }
                    codedInputByteBufferNano.readMessage(this.f94186g);
                    break;
                case 66:
                    this.f94187h = codedInputByteBufferNano.readString();
                    break;
                case 80:
                    this.f94188i = codedInputByteBufferNano.readUInt32();
                    break;
                case 96:
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    if (readInt32 != 0 && readInt32 != 1 && readInt32 != 2) {
                        break;
                    } else {
                        this.f94189j = readInt32;
                        break;
                    }
                case 104:
                    int readInt322 = codedInputByteBufferNano.readInt32();
                    if (readInt322 != -1 && readInt322 != 0 && readInt322 != 1) {
                        break;
                    } else {
                        this.f94190k = readInt322;
                        break;
                    }
                case 114:
                    this.f94191l = codedInputByteBufferNano.readBytes();
                    break;
                case 120:
                    int readInt323 = codedInputByteBufferNano.readInt32();
                    if (readInt323 != -1 && readInt323 != 0 && readInt323 != 1) {
                        break;
                    } else {
                        this.f94192m = readInt323;
                        break;
                    }
                case 128:
                    this.f94193n = codedInputByteBufferNano.readUInt64();
                    break;
                case 136:
                    this.f94194o = codedInputByteBufferNano.readUInt64();
                    break;
                case 176:
                    int readInt324 = codedInputByteBufferNano.readInt32();
                    if (readInt324 != 0 && readInt324 != 1) {
                        break;
                    } else {
                        this.f94195p = readInt324;
                        break;
                    }
                case 184:
                    this.f94196q = codedInputByteBufferNano.readBool();
                    break;
                case 192:
                    this.f94197r = codedInputByteBufferNano.readUInt64();
                    break;
                case 202:
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 202);
                    C34422b9[] c34422b9Arr = this.f94198s;
                    int length = c34422b9Arr == null ? 0 : c34422b9Arr.length;
                    int i = repeatedFieldArrayLength + length;
                    C34422b9[] c34422b9Arr2 = new C34422b9[i];
                    if (length != 0) {
                        System.arraycopy(c34422b9Arr, 0, c34422b9Arr2, 0, length);
                    }
                    while (length < i - 1) {
                        C34422b9 c34422b9 = new C34422b9();
                        c34422b9Arr2[length] = c34422b9;
                        codedInputByteBufferNano.readMessage(c34422b9);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    C34422b9 c34422b92 = new C34422b9();
                    c34422b9Arr2[length] = c34422b92;
                    codedInputByteBufferNano.readMessage(c34422b92);
                    this.f94198s = c34422b9Arr2;
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
    public static C34476d9 m21830a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C34476d9) MessageNano.mergeFrom(new C34476d9(), bArr);
    }
}
