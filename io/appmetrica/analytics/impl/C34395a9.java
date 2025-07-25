package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.a9 */
/* loaded from: classes9.dex */
public final class C34395a9 extends MessageNano {

    /* renamed from: n */
    public static volatile C34395a9[] f93949n;

    /* renamed from: a */
    public String f93950a;

    /* renamed from: b */
    public String f93951b;

    /* renamed from: c */
    public String f93952c;

    /* renamed from: d */
    public int f93953d;

    /* renamed from: e */
    public String f93954e;

    /* renamed from: f */
    public String f93955f;

    /* renamed from: g */
    public boolean f93956g;

    /* renamed from: h */
    public int f93957h;

    /* renamed from: i */
    public String f93958i;

    /* renamed from: j */
    public String f93959j;

    /* renamed from: k */
    public int f93960k;

    /* renamed from: l */
    public C34370Z8[] f93961l;

    /* renamed from: m */
    public String f93962m;

    public C34395a9() {
        m22002a();
    }

    /* renamed from: b */
    public static C34395a9[] m21999b() {
        if (f93949n == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f93949n == null) {
                    f93949n = new C34395a9[0];
                }
            }
        }
        return f93949n;
    }

    /* renamed from: a */
    public final C34395a9 m22002a() {
        this.f93950a = "";
        this.f93951b = "";
        this.f93952c = "";
        this.f93953d = 0;
        this.f93954e = "";
        this.f93955f = "";
        this.f93956g = false;
        this.f93957h = 0;
        this.f93958i = "";
        this.f93959j = "";
        this.f93960k = 0;
        this.f93961l = C34370Z8.m22044b();
        this.f93962m = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f93950a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f93950a);
        }
        if (!this.f93951b.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f93951b);
        }
        if (!this.f93952c.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(4, this.f93952c);
        }
        int i = this.f93953d;
        if (i != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(5, i);
        }
        if (!this.f93954e.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(10, this.f93954e);
        }
        if (!this.f93955f.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(15, this.f93955f);
        }
        boolean z = this.f93956g;
        if (z) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(17, z);
        }
        int i2 = this.f93957h;
        if (i2 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(18, i2);
        }
        if (!this.f93958i.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(19, this.f93958i);
        }
        if (!this.f93959j.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(21, this.f93959j);
        }
        int i3 = this.f93960k;
        if (i3 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(22, i3);
        }
        C34370Z8[] c34370z8Arr = this.f93961l;
        if (c34370z8Arr != null && c34370z8Arr.length > 0) {
            int i4 = 0;
            while (true) {
                C34370Z8[] c34370z8Arr2 = this.f93961l;
                if (i4 >= c34370z8Arr2.length) {
                    break;
                }
                C34370Z8 c34370z8 = c34370z8Arr2[i4];
                if (c34370z8 != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(23, c34370z8);
                }
                i4++;
            }
        }
        if (!this.f93962m.equals("")) {
            return computeSerializedSize + CodedOutputByteBufferNano.computeStringSize(24, this.f93962m);
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f93950a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f93950a);
        }
        if (!this.f93951b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f93951b);
        }
        if (!this.f93952c.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f93952c);
        }
        int i = this.f93953d;
        if (i != 0) {
            codedOutputByteBufferNano.writeUInt32(5, i);
        }
        if (!this.f93954e.equals("")) {
            codedOutputByteBufferNano.writeString(10, this.f93954e);
        }
        if (!this.f93955f.equals("")) {
            codedOutputByteBufferNano.writeString(15, this.f93955f);
        }
        boolean z = this.f93956g;
        if (z) {
            codedOutputByteBufferNano.writeBool(17, z);
        }
        int i2 = this.f93957h;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeUInt32(18, i2);
        }
        if (!this.f93958i.equals("")) {
            codedOutputByteBufferNano.writeString(19, this.f93958i);
        }
        if (!this.f93959j.equals("")) {
            codedOutputByteBufferNano.writeString(21, this.f93959j);
        }
        int i3 = this.f93960k;
        if (i3 != 0) {
            codedOutputByteBufferNano.writeUInt32(22, i3);
        }
        C34370Z8[] c34370z8Arr = this.f93961l;
        if (c34370z8Arr != null && c34370z8Arr.length > 0) {
            int i4 = 0;
            while (true) {
                C34370Z8[] c34370z8Arr2 = this.f93961l;
                if (i4 >= c34370z8Arr2.length) {
                    break;
                }
                C34370Z8 c34370z8 = c34370z8Arr2[i4];
                if (c34370z8 != null) {
                    codedOutputByteBufferNano.writeMessage(23, c34370z8);
                }
                i4++;
            }
        }
        if (!this.f93962m.equals("")) {
            codedOutputByteBufferNano.writeString(24, this.f93962m);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    /* renamed from: b */
    public static C34395a9 m21998b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C34395a9().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C34395a9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    return this;
                case 10:
                    this.f93950a = codedInputByteBufferNano.readString();
                    break;
                case 18:
                    this.f93951b = codedInputByteBufferNano.readString();
                    break;
                case 34:
                    this.f93952c = codedInputByteBufferNano.readString();
                    break;
                case 40:
                    this.f93953d = codedInputByteBufferNano.readUInt32();
                    break;
                case 82:
                    this.f93954e = codedInputByteBufferNano.readString();
                    break;
                case 122:
                    this.f93955f = codedInputByteBufferNano.readString();
                    break;
                case 136:
                    this.f93956g = codedInputByteBufferNano.readBool();
                    break;
                case 144:
                    this.f93957h = codedInputByteBufferNano.readUInt32();
                    break;
                case 154:
                    this.f93958i = codedInputByteBufferNano.readString();
                    break;
                case 170:
                    this.f93959j = codedInputByteBufferNano.readString();
                    break;
                case 176:
                    this.f93960k = codedInputByteBufferNano.readUInt32();
                    break;
                case 186:
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 186);
                    C34370Z8[] c34370z8Arr = this.f93961l;
                    int length = c34370z8Arr == null ? 0 : c34370z8Arr.length;
                    int i = repeatedFieldArrayLength + length;
                    C34370Z8[] c34370z8Arr2 = new C34370Z8[i];
                    if (length != 0) {
                        System.arraycopy(c34370z8Arr, 0, c34370z8Arr2, 0, length);
                    }
                    while (length < i - 1) {
                        C34370Z8 c34370z8 = new C34370Z8();
                        c34370z8Arr2[length] = c34370z8;
                        codedInputByteBufferNano.readMessage(c34370z8);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    C34370Z8 c34370z82 = new C34370Z8();
                    c34370z8Arr2[length] = c34370z82;
                    codedInputByteBufferNano.readMessage(c34370z82);
                    this.f93961l = c34370z8Arr2;
                    break;
                case 194:
                    this.f93962m = codedInputByteBufferNano.readString();
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
    public static C34395a9 m22000a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C34395a9) MessageNano.mergeFrom(new C34395a9(), bArr);
    }
}
