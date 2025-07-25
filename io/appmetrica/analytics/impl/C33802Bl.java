package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.Bl */
/* loaded from: classes9.dex */
public final class C33802Bl extends MessageNano {

    /* renamed from: E */
    public static final int f92626E = -1;

    /* renamed from: F */
    public static final int f92627F = 0;

    /* renamed from: G */
    public static final int f92628G = 1;

    /* renamed from: H */
    public static volatile C33802Bl[] f92629H;

    /* renamed from: A */
    public C34865rl f92630A;

    /* renamed from: B */
    public C35073zl f92631B;

    /* renamed from: C */
    public C35021xl[] f92632C;

    /* renamed from: D */
    public C34969vl f92633D;

    /* renamed from: a */
    public String f92634a;

    /* renamed from: b */
    public long f92635b;

    /* renamed from: c */
    public String[] f92636c;

    /* renamed from: d */
    public String f92637d;

    /* renamed from: e */
    public String f92638e;

    /* renamed from: f */
    public String[] f92639f;

    /* renamed from: g */
    public String[] f92640g;

    /* renamed from: h */
    public C34943ul[] f92641h;

    /* renamed from: i */
    public C34995wl f92642i;

    /* renamed from: j */
    public String f92643j;

    /* renamed from: k */
    public String f92644k;

    /* renamed from: l */
    public String f92645l;

    /* renamed from: m */
    public boolean f92646m;

    /* renamed from: n */
    public String f92647n;

    /* renamed from: o */
    public String[] f92648o;

    /* renamed from: p */
    public C33777Al f92649p;

    /* renamed from: q */
    public boolean f92650q;

    /* renamed from: r */
    public String f92651r;

    /* renamed from: s */
    public long f92652s;

    /* renamed from: t */
    public long f92653t;

    /* renamed from: u */
    public boolean f92654u;

    /* renamed from: v */
    public C35047yl f92655v;

    /* renamed from: w */
    public int f92656w;

    /* renamed from: x */
    public int f92657x;

    /* renamed from: y */
    public C34917tl f92658y;

    /* renamed from: z */
    public C34891sl f92659z;

    public C33802Bl() {
        m22752a();
    }

    /* renamed from: b */
    public static C33802Bl[] m22749b() {
        if (f92629H == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f92629H == null) {
                    f92629H = new C33802Bl[0];
                }
            }
        }
        return f92629H;
    }

    /* renamed from: a */
    public final C33802Bl m22752a() {
        this.f92634a = "";
        this.f92635b = 0L;
        String[] strArr = WireFormatNano.EMPTY_STRING_ARRAY;
        this.f92636c = strArr;
        this.f92637d = "";
        this.f92638e = "";
        this.f92639f = strArr;
        this.f92640g = strArr;
        this.f92641h = C34943ul.m20903b();
        this.f92642i = null;
        this.f92643j = "";
        this.f92644k = "";
        this.f92645l = "";
        this.f92646m = false;
        this.f92647n = "";
        this.f92648o = strArr;
        this.f92649p = null;
        this.f92650q = false;
        this.f92651r = "";
        this.f92652s = 0L;
        this.f92653t = 0L;
        this.f92654u = false;
        this.f92655v = null;
        this.f92656w = 600;
        this.f92657x = 1;
        this.f92658y = null;
        this.f92659z = null;
        this.f92630A = null;
        this.f92631B = null;
        this.f92632C = C35021xl.m20763b();
        this.f92633D = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f92634a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f92634a);
        }
        int computeInt64Size = CodedOutputByteBufferNano.computeInt64Size(2, this.f92635b) + computeSerializedSize;
        String[] strArr = this.f92636c;
        int i = 0;
        if (strArr != null && strArr.length > 0) {
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            while (true) {
                String[] strArr2 = this.f92636c;
                if (i2 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i2];
                if (str != null) {
                    i4++;
                    i3 += CodedOutputByteBufferNano.computeStringSizeNoTag(str);
                }
                i2++;
            }
            computeInt64Size = computeInt64Size + i3 + i4;
        }
        if (!this.f92637d.equals("")) {
            computeInt64Size += CodedOutputByteBufferNano.computeStringSize(4, this.f92637d);
        }
        if (!this.f92638e.equals("")) {
            computeInt64Size += CodedOutputByteBufferNano.computeStringSize(5, this.f92638e);
        }
        String[] strArr3 = this.f92639f;
        if (strArr3 != null && strArr3.length > 0) {
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            while (true) {
                String[] strArr4 = this.f92639f;
                if (i5 >= strArr4.length) {
                    break;
                }
                String str2 = strArr4[i5];
                if (str2 != null) {
                    i7++;
                    i6 += CodedOutputByteBufferNano.computeStringSizeNoTag(str2);
                }
                i5++;
            }
            computeInt64Size = computeInt64Size + i6 + i7;
        }
        String[] strArr5 = this.f92640g;
        if (strArr5 != null && strArr5.length > 0) {
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            while (true) {
                String[] strArr6 = this.f92640g;
                if (i8 >= strArr6.length) {
                    break;
                }
                String str3 = strArr6[i8];
                if (str3 != null) {
                    i10++;
                    i9 += CodedOutputByteBufferNano.computeStringSizeNoTag(str3);
                }
                i8++;
            }
            computeInt64Size = computeInt64Size + i9 + i10;
        }
        C34943ul[] c34943ulArr = this.f92641h;
        if (c34943ulArr != null && c34943ulArr.length > 0) {
            int i11 = 0;
            while (true) {
                C34943ul[] c34943ulArr2 = this.f92641h;
                if (i11 >= c34943ulArr2.length) {
                    break;
                }
                C34943ul c34943ul = c34943ulArr2[i11];
                if (c34943ul != null) {
                    computeInt64Size += CodedOutputByteBufferNano.computeMessageSize(8, c34943ul);
                }
                i11++;
            }
        }
        C34995wl c34995wl = this.f92642i;
        if (c34995wl != null) {
            computeInt64Size += CodedOutputByteBufferNano.computeMessageSize(9, c34995wl);
        }
        if (!this.f92643j.equals("")) {
            computeInt64Size += CodedOutputByteBufferNano.computeStringSize(10, this.f92643j);
        }
        if (!this.f92644k.equals("")) {
            computeInt64Size += CodedOutputByteBufferNano.computeStringSize(11, this.f92644k);
        }
        if (!this.f92645l.equals("")) {
            computeInt64Size += CodedOutputByteBufferNano.computeStringSize(12, this.f92645l);
        }
        int computeBoolSize = CodedOutputByteBufferNano.computeBoolSize(13, this.f92646m) + computeInt64Size;
        if (!this.f92647n.equals("")) {
            computeBoolSize += CodedOutputByteBufferNano.computeStringSize(14, this.f92647n);
        }
        String[] strArr7 = this.f92648o;
        if (strArr7 != null && strArr7.length > 0) {
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            while (true) {
                String[] strArr8 = this.f92648o;
                if (i12 >= strArr8.length) {
                    break;
                }
                String str4 = strArr8[i12];
                if (str4 != null) {
                    i14++;
                    i13 += CodedOutputByteBufferNano.computeStringSizeNoTag(str4);
                }
                i12++;
            }
            computeBoolSize = computeBoolSize + i13 + i14;
        }
        C33777Al c33777Al = this.f92649p;
        if (c33777Al != null) {
            computeBoolSize += CodedOutputByteBufferNano.computeMessageSize(16, c33777Al);
        }
        boolean z = this.f92650q;
        if (z) {
            computeBoolSize += CodedOutputByteBufferNano.computeBoolSize(17, z);
        }
        if (!this.f92651r.equals("")) {
            computeBoolSize += CodedOutputByteBufferNano.computeStringSize(20, this.f92651r);
        }
        int computeInt64Size2 = CodedOutputByteBufferNano.computeInt64Size(22, this.f92653t) + CodedOutputByteBufferNano.computeInt64Size(21, this.f92652s) + computeBoolSize;
        boolean z2 = this.f92654u;
        if (z2) {
            computeInt64Size2 += CodedOutputByteBufferNano.computeBoolSize(23, z2);
        }
        C35047yl c35047yl = this.f92655v;
        if (c35047yl != null) {
            computeInt64Size2 += CodedOutputByteBufferNano.computeMessageSize(24, c35047yl);
        }
        int computeInt32Size = CodedOutputByteBufferNano.computeInt32Size(26, this.f92657x) + CodedOutputByteBufferNano.computeInt32Size(25, this.f92656w) + computeInt64Size2;
        C34917tl c34917tl = this.f92658y;
        if (c34917tl != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(27, c34917tl);
        }
        C34891sl c34891sl = this.f92659z;
        if (c34891sl != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(28, c34891sl);
        }
        C34865rl c34865rl = this.f92630A;
        if (c34865rl != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(29, c34865rl);
        }
        C35073zl c35073zl = this.f92631B;
        if (c35073zl != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(30, c35073zl);
        }
        C35021xl[] c35021xlArr = this.f92632C;
        if (c35021xlArr != null && c35021xlArr.length > 0) {
            while (true) {
                C35021xl[] c35021xlArr2 = this.f92632C;
                if (i >= c35021xlArr2.length) {
                    break;
                }
                C35021xl c35021xl = c35021xlArr2[i];
                if (c35021xl != null) {
                    computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(31, c35021xl);
                }
                i++;
            }
        }
        C34969vl c34969vl = this.f92633D;
        if (c34969vl != null) {
            return computeInt32Size + CodedOutputByteBufferNano.computeMessageSize(32, c34969vl);
        }
        return computeInt32Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f92634a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f92634a);
        }
        codedOutputByteBufferNano.writeInt64(2, this.f92635b);
        String[] strArr = this.f92636c;
        int i = 0;
        if (strArr != null && strArr.length > 0) {
            int i2 = 0;
            while (true) {
                String[] strArr2 = this.f92636c;
                if (i2 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i2];
                if (str != null) {
                    codedOutputByteBufferNano.writeString(3, str);
                }
                i2++;
            }
        }
        if (!this.f92637d.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f92637d);
        }
        if (!this.f92638e.equals("")) {
            codedOutputByteBufferNano.writeString(5, this.f92638e);
        }
        String[] strArr3 = this.f92639f;
        if (strArr3 != null && strArr3.length > 0) {
            int i3 = 0;
            while (true) {
                String[] strArr4 = this.f92639f;
                if (i3 >= strArr4.length) {
                    break;
                }
                String str2 = strArr4[i3];
                if (str2 != null) {
                    codedOutputByteBufferNano.writeString(6, str2);
                }
                i3++;
            }
        }
        String[] strArr5 = this.f92640g;
        if (strArr5 != null && strArr5.length > 0) {
            int i4 = 0;
            while (true) {
                String[] strArr6 = this.f92640g;
                if (i4 >= strArr6.length) {
                    break;
                }
                String str3 = strArr6[i4];
                if (str3 != null) {
                    codedOutputByteBufferNano.writeString(7, str3);
                }
                i4++;
            }
        }
        C34943ul[] c34943ulArr = this.f92641h;
        if (c34943ulArr != null && c34943ulArr.length > 0) {
            int i5 = 0;
            while (true) {
                C34943ul[] c34943ulArr2 = this.f92641h;
                if (i5 >= c34943ulArr2.length) {
                    break;
                }
                C34943ul c34943ul = c34943ulArr2[i5];
                if (c34943ul != null) {
                    codedOutputByteBufferNano.writeMessage(8, c34943ul);
                }
                i5++;
            }
        }
        C34995wl c34995wl = this.f92642i;
        if (c34995wl != null) {
            codedOutputByteBufferNano.writeMessage(9, c34995wl);
        }
        if (!this.f92643j.equals("")) {
            codedOutputByteBufferNano.writeString(10, this.f92643j);
        }
        if (!this.f92644k.equals("")) {
            codedOutputByteBufferNano.writeString(11, this.f92644k);
        }
        if (!this.f92645l.equals("")) {
            codedOutputByteBufferNano.writeString(12, this.f92645l);
        }
        codedOutputByteBufferNano.writeBool(13, this.f92646m);
        if (!this.f92647n.equals("")) {
            codedOutputByteBufferNano.writeString(14, this.f92647n);
        }
        String[] strArr7 = this.f92648o;
        if (strArr7 != null && strArr7.length > 0) {
            int i6 = 0;
            while (true) {
                String[] strArr8 = this.f92648o;
                if (i6 >= strArr8.length) {
                    break;
                }
                String str4 = strArr8[i6];
                if (str4 != null) {
                    codedOutputByteBufferNano.writeString(15, str4);
                }
                i6++;
            }
        }
        C33777Al c33777Al = this.f92649p;
        if (c33777Al != null) {
            codedOutputByteBufferNano.writeMessage(16, c33777Al);
        }
        boolean z = this.f92650q;
        if (z) {
            codedOutputByteBufferNano.writeBool(17, z);
        }
        if (!this.f92651r.equals("")) {
            codedOutputByteBufferNano.writeString(20, this.f92651r);
        }
        codedOutputByteBufferNano.writeInt64(21, this.f92652s);
        codedOutputByteBufferNano.writeInt64(22, this.f92653t);
        boolean z2 = this.f92654u;
        if (z2) {
            codedOutputByteBufferNano.writeBool(23, z2);
        }
        C35047yl c35047yl = this.f92655v;
        if (c35047yl != null) {
            codedOutputByteBufferNano.writeMessage(24, c35047yl);
        }
        codedOutputByteBufferNano.writeInt32(25, this.f92656w);
        codedOutputByteBufferNano.writeInt32(26, this.f92657x);
        C34917tl c34917tl = this.f92658y;
        if (c34917tl != null) {
            codedOutputByteBufferNano.writeMessage(27, c34917tl);
        }
        C34891sl c34891sl = this.f92659z;
        if (c34891sl != null) {
            codedOutputByteBufferNano.writeMessage(28, c34891sl);
        }
        C34865rl c34865rl = this.f92630A;
        if (c34865rl != null) {
            codedOutputByteBufferNano.writeMessage(29, c34865rl);
        }
        C35073zl c35073zl = this.f92631B;
        if (c35073zl != null) {
            codedOutputByteBufferNano.writeMessage(30, c35073zl);
        }
        C35021xl[] c35021xlArr = this.f92632C;
        if (c35021xlArr != null && c35021xlArr.length > 0) {
            while (true) {
                C35021xl[] c35021xlArr2 = this.f92632C;
                if (i >= c35021xlArr2.length) {
                    break;
                }
                C35021xl c35021xl = c35021xlArr2[i];
                if (c35021xl != null) {
                    codedOutputByteBufferNano.writeMessage(31, c35021xl);
                }
                i++;
            }
        }
        C34969vl c34969vl = this.f92633D;
        if (c34969vl != null) {
            codedOutputByteBufferNano.writeMessage(32, c34969vl);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    /* renamed from: b */
    public static C33802Bl m22748b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C33802Bl().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C33802Bl mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    return this;
                case 10:
                    this.f92634a = codedInputByteBufferNano.readString();
                    break;
                case 16:
                    this.f92635b = codedInputByteBufferNano.readInt64();
                    break;
                case 26:
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                    String[] strArr = this.f92636c;
                    int length = strArr == null ? 0 : strArr.length;
                    int i = repeatedFieldArrayLength + length;
                    String[] strArr2 = new String[i];
                    if (length != 0) {
                        System.arraycopy(strArr, 0, strArr2, 0, length);
                    }
                    while (length < i - 1) {
                        strArr2[length] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    strArr2[length] = codedInputByteBufferNano.readString();
                    this.f92636c = strArr2;
                    break;
                case 34:
                    this.f92637d = codedInputByteBufferNano.readString();
                    break;
                case 42:
                    this.f92638e = codedInputByteBufferNano.readString();
                    break;
                case 50:
                    int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 50);
                    String[] strArr3 = this.f92639f;
                    int length2 = strArr3 == null ? 0 : strArr3.length;
                    int i2 = repeatedFieldArrayLength2 + length2;
                    String[] strArr4 = new String[i2];
                    if (length2 != 0) {
                        System.arraycopy(strArr3, 0, strArr4, 0, length2);
                    }
                    while (length2 < i2 - 1) {
                        strArr4[length2] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        length2++;
                    }
                    strArr4[length2] = codedInputByteBufferNano.readString();
                    this.f92639f = strArr4;
                    break;
                case 58:
                    int repeatedFieldArrayLength3 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 58);
                    String[] strArr5 = this.f92640g;
                    int length3 = strArr5 == null ? 0 : strArr5.length;
                    int i3 = repeatedFieldArrayLength3 + length3;
                    String[] strArr6 = new String[i3];
                    if (length3 != 0) {
                        System.arraycopy(strArr5, 0, strArr6, 0, length3);
                    }
                    while (length3 < i3 - 1) {
                        strArr6[length3] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        length3++;
                    }
                    strArr6[length3] = codedInputByteBufferNano.readString();
                    this.f92640g = strArr6;
                    break;
                case 66:
                    int repeatedFieldArrayLength4 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 66);
                    C34943ul[] c34943ulArr = this.f92641h;
                    int length4 = c34943ulArr == null ? 0 : c34943ulArr.length;
                    int i4 = repeatedFieldArrayLength4 + length4;
                    C34943ul[] c34943ulArr2 = new C34943ul[i4];
                    if (length4 != 0) {
                        System.arraycopy(c34943ulArr, 0, c34943ulArr2, 0, length4);
                    }
                    while (length4 < i4 - 1) {
                        C34943ul c34943ul = new C34943ul();
                        c34943ulArr2[length4] = c34943ul;
                        codedInputByteBufferNano.readMessage(c34943ul);
                        codedInputByteBufferNano.readTag();
                        length4++;
                    }
                    C34943ul c34943ul2 = new C34943ul();
                    c34943ulArr2[length4] = c34943ul2;
                    codedInputByteBufferNano.readMessage(c34943ul2);
                    this.f92641h = c34943ulArr2;
                    break;
                case 74:
                    if (this.f92642i == null) {
                        this.f92642i = new C34995wl();
                    }
                    codedInputByteBufferNano.readMessage(this.f92642i);
                    break;
                case 82:
                    this.f92643j = codedInputByteBufferNano.readString();
                    break;
                case 90:
                    this.f92644k = codedInputByteBufferNano.readString();
                    break;
                case 98:
                    this.f92645l = codedInputByteBufferNano.readString();
                    break;
                case 104:
                    this.f92646m = codedInputByteBufferNano.readBool();
                    break;
                case 114:
                    this.f92647n = codedInputByteBufferNano.readString();
                    break;
                case 122:
                    int repeatedFieldArrayLength5 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 122);
                    String[] strArr7 = this.f92648o;
                    int length5 = strArr7 == null ? 0 : strArr7.length;
                    int i5 = repeatedFieldArrayLength5 + length5;
                    String[] strArr8 = new String[i5];
                    if (length5 != 0) {
                        System.arraycopy(strArr7, 0, strArr8, 0, length5);
                    }
                    while (length5 < i5 - 1) {
                        strArr8[length5] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        length5++;
                    }
                    strArr8[length5] = codedInputByteBufferNano.readString();
                    this.f92648o = strArr8;
                    break;
                case 130:
                    if (this.f92649p == null) {
                        this.f92649p = new C33777Al();
                    }
                    codedInputByteBufferNano.readMessage(this.f92649p);
                    break;
                case 136:
                    this.f92650q = codedInputByteBufferNano.readBool();
                    break;
                case 162:
                    this.f92651r = codedInputByteBufferNano.readString();
                    break;
                case 168:
                    this.f92652s = codedInputByteBufferNano.readInt64();
                    break;
                case 176:
                    this.f92653t = codedInputByteBufferNano.readInt64();
                    break;
                case 184:
                    this.f92654u = codedInputByteBufferNano.readBool();
                    break;
                case 194:
                    if (this.f92655v == null) {
                        this.f92655v = new C35047yl();
                    }
                    codedInputByteBufferNano.readMessage(this.f92655v);
                    break;
                case 200:
                    this.f92656w = codedInputByteBufferNano.readInt32();
                    break;
                case 208:
                    this.f92657x = codedInputByteBufferNano.readInt32();
                    break;
                case 218:
                    if (this.f92658y == null) {
                        this.f92658y = new C34917tl();
                    }
                    codedInputByteBufferNano.readMessage(this.f92658y);
                    break;
                case 226:
                    if (this.f92659z == null) {
                        this.f92659z = new C34891sl();
                    }
                    codedInputByteBufferNano.readMessage(this.f92659z);
                    break;
                case 234:
                    if (this.f92630A == null) {
                        this.f92630A = new C34865rl();
                    }
                    codedInputByteBufferNano.readMessage(this.f92630A);
                    break;
                case 242:
                    if (this.f92631B == null) {
                        this.f92631B = new C35073zl();
                    }
                    codedInputByteBufferNano.readMessage(this.f92631B);
                    break;
                case 250:
                    int repeatedFieldArrayLength6 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 250);
                    C35021xl[] c35021xlArr = this.f92632C;
                    int length6 = c35021xlArr == null ? 0 : c35021xlArr.length;
                    int i6 = repeatedFieldArrayLength6 + length6;
                    C35021xl[] c35021xlArr2 = new C35021xl[i6];
                    if (length6 != 0) {
                        System.arraycopy(c35021xlArr, 0, c35021xlArr2, 0, length6);
                    }
                    while (length6 < i6 - 1) {
                        C35021xl c35021xl = new C35021xl();
                        c35021xlArr2[length6] = c35021xl;
                        codedInputByteBufferNano.readMessage(c35021xl);
                        codedInputByteBufferNano.readTag();
                        length6++;
                    }
                    C35021xl c35021xl2 = new C35021xl();
                    c35021xlArr2[length6] = c35021xl2;
                    codedInputByteBufferNano.readMessage(c35021xl2);
                    this.f92632C = c35021xlArr2;
                    break;
                case 258:
                    if (this.f92633D == null) {
                        this.f92633D = new C34969vl();
                    }
                    codedInputByteBufferNano.readMessage(this.f92633D);
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
    public static C33802Bl m22750a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C33802Bl) MessageNano.mergeFrom(new C33802Bl(), bArr);
    }
}
