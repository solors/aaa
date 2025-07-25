package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.t */
/* loaded from: classes9.dex */
public final class C34895t extends MessageNano {

    /* renamed from: l */
    public static final int f95343l = 0;

    /* renamed from: m */
    public static final int f95344m = 1;

    /* renamed from: n */
    public static final int f95345n = 2;

    /* renamed from: o */
    public static final int f95346o = 3;

    /* renamed from: p */
    public static final int f95347p = 4;

    /* renamed from: q */
    public static final int f95348q = 5;

    /* renamed from: r */
    public static final int f95349r = 6;

    /* renamed from: s */
    public static volatile C34895t[] f95350s;

    /* renamed from: t */
    public static byte[] f95351t;

    /* renamed from: u */
    public static volatile boolean f95352u;

    /* renamed from: a */
    public byte[] f95353a;

    /* renamed from: b */
    public C34869s f95354b;

    /* renamed from: c */
    public byte[] f95355c;

    /* renamed from: d */
    public int f95356d;

    /* renamed from: e */
    public byte[] f95357e;

    /* renamed from: f */
    public byte[] f95358f;

    /* renamed from: g */
    public byte[] f95359g;

    /* renamed from: h */
    public byte[] f95360h;

    /* renamed from: i */
    public byte[] f95361i;

    /* renamed from: j */
    public byte[] f95362j;

    /* renamed from: k */
    public byte[] f95363k;

    public C34895t() {
        if (!f95352u) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (!f95352u) {
                    f95351t = InternalNano.bytesDefaultValue("manual");
                    f95352u = true;
                }
            }
        }
        m20963a();
    }

    /* renamed from: b */
    public static C34895t[] m20960b() {
        if (f95350s == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f95350s == null) {
                    f95350s = new C34895t[0];
                }
            }
        }
        return f95350s;
    }

    /* renamed from: a */
    public final C34895t m20963a() {
        this.f95353a = (byte[]) f95351t.clone();
        this.f95354b = null;
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f95355c = bArr;
        this.f95356d = 0;
        this.f95357e = bArr;
        this.f95358f = bArr;
        this.f95359g = bArr;
        this.f95360h = bArr;
        this.f95361i = bArr;
        this.f95362j = bArr;
        this.f95363k = bArr;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!Arrays.equals(this.f95353a, f95351t)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f95353a);
        }
        C34869s c34869s = this.f95354b;
        if (c34869s != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, c34869s);
        }
        byte[] bArr = this.f95355c;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(3, this.f95355c);
        }
        int i = this.f95356d;
        if (i != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(4, i);
        }
        if (!Arrays.equals(this.f95357e, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(5, this.f95357e);
        }
        if (!Arrays.equals(this.f95358f, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(6, this.f95358f);
        }
        if (!Arrays.equals(this.f95359g, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(7, this.f95359g);
        }
        if (!Arrays.equals(this.f95360h, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(8, this.f95360h);
        }
        if (!Arrays.equals(this.f95361i, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(9, this.f95361i);
        }
        if (!Arrays.equals(this.f95362j, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(10, this.f95362j);
        }
        if (!Arrays.equals(this.f95363k, bArr2)) {
            return computeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(11, this.f95363k);
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!Arrays.equals(this.f95353a, f95351t)) {
            codedOutputByteBufferNano.writeBytes(1, this.f95353a);
        }
        C34869s c34869s = this.f95354b;
        if (c34869s != null) {
            codedOutputByteBufferNano.writeMessage(2, c34869s);
        }
        byte[] bArr = this.f95355c;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(3, this.f95355c);
        }
        int i = this.f95356d;
        if (i != 0) {
            codedOutputByteBufferNano.writeInt32(4, i);
        }
        if (!Arrays.equals(this.f95357e, bArr2)) {
            codedOutputByteBufferNano.writeBytes(5, this.f95357e);
        }
        if (!Arrays.equals(this.f95358f, bArr2)) {
            codedOutputByteBufferNano.writeBytes(6, this.f95358f);
        }
        if (!Arrays.equals(this.f95359g, bArr2)) {
            codedOutputByteBufferNano.writeBytes(7, this.f95359g);
        }
        if (!Arrays.equals(this.f95360h, bArr2)) {
            codedOutputByteBufferNano.writeBytes(8, this.f95360h);
        }
        if (!Arrays.equals(this.f95361i, bArr2)) {
            codedOutputByteBufferNano.writeBytes(9, this.f95361i);
        }
        if (!Arrays.equals(this.f95362j, bArr2)) {
            codedOutputByteBufferNano.writeBytes(10, this.f95362j);
        }
        if (!Arrays.equals(this.f95363k, bArr2)) {
            codedOutputByteBufferNano.writeBytes(11, this.f95363k);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    /* renamed from: b */
    public static C34895t m20959b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C34895t().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C34895t mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    return this;
                case 10:
                    this.f95353a = codedInputByteBufferNano.readBytes();
                    break;
                case 18:
                    if (this.f95354b == null) {
                        this.f95354b = new C34869s();
                    }
                    codedInputByteBufferNano.readMessage(this.f95354b);
                    break;
                case 26:
                    this.f95355c = codedInputByteBufferNano.readBytes();
                    break;
                case 32:
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    switch (readInt32) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            this.f95356d = readInt32;
                            continue;
                    }
                case 42:
                    this.f95357e = codedInputByteBufferNano.readBytes();
                    break;
                case 50:
                    this.f95358f = codedInputByteBufferNano.readBytes();
                    break;
                case 58:
                    this.f95359g = codedInputByteBufferNano.readBytes();
                    break;
                case 66:
                    this.f95360h = codedInputByteBufferNano.readBytes();
                    break;
                case 74:
                    this.f95361i = codedInputByteBufferNano.readBytes();
                    break;
                case 82:
                    this.f95362j = codedInputByteBufferNano.readBytes();
                    break;
                case 90:
                    this.f95363k = codedInputByteBufferNano.readBytes();
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
    public static C34895t m20961a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C34895t) MessageNano.mergeFrom(new C34895t(), bArr);
    }
}
