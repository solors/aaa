package com.fyber.inneractive.sdk.protobuf;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum INT64 uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: com.fyber.inneractive.sdk.protobuf.K1 */
/* loaded from: classes4.dex */
public class EnumC15245K1 {
    private static final /* synthetic */ EnumC15245K1[] $VALUES;
    public static final EnumC15245K1 BOOL;
    public static final EnumC15245K1 BYTES;
    public static final EnumC15245K1 DOUBLE;
    public static final EnumC15245K1 ENUM;
    public static final EnumC15245K1 FIXED32;
    public static final EnumC15245K1 FIXED64;
    public static final EnumC15245K1 FLOAT;
    public static final EnumC15245K1 GROUP;
    public static final EnumC15245K1 INT32;
    public static final EnumC15245K1 INT64;
    public static final EnumC15245K1 MESSAGE;
    public static final EnumC15245K1 SFIXED32;
    public static final EnumC15245K1 SFIXED64;
    public static final EnumC15245K1 SINT32;
    public static final EnumC15245K1 SINT64;
    public static final EnumC15245K1 STRING;
    public static final EnumC15245K1 UINT32;
    public static final EnumC15245K1 UINT64;
    private final EnumC15248L1 javaType;
    private final int wireType;

    static {
        EnumC15245K1 enumC15245K1 = new EnumC15245K1("DOUBLE", 0, EnumC15248L1.DOUBLE, 1);
        DOUBLE = enumC15245K1;
        EnumC15245K1 enumC15245K12 = new EnumC15245K1("FLOAT", 1, EnumC15248L1.FLOAT, 5);
        FLOAT = enumC15245K12;
        EnumC15248L1 enumC15248L1 = EnumC15248L1.LONG;
        EnumC15245K1 enumC15245K13 = new EnumC15245K1("INT64", 2, enumC15248L1, 0);
        INT64 = enumC15245K13;
        EnumC15245K1 enumC15245K14 = new EnumC15245K1("UINT64", 3, enumC15248L1, 0);
        UINT64 = enumC15245K14;
        EnumC15248L1 enumC15248L12 = EnumC15248L1.INT;
        EnumC15245K1 enumC15245K15 = new EnumC15245K1("INT32", 4, enumC15248L12, 0);
        INT32 = enumC15245K15;
        EnumC15245K1 enumC15245K16 = new EnumC15245K1("FIXED64", 5, enumC15248L1, 1);
        FIXED64 = enumC15245K16;
        EnumC15245K1 enumC15245K17 = new EnumC15245K1("FIXED32", 6, enumC15248L12, 5);
        FIXED32 = enumC15245K17;
        EnumC15245K1 enumC15245K18 = new EnumC15245K1("BOOL", 7, EnumC15248L1.BOOLEAN, 0);
        BOOL = enumC15245K18;
        C15233G1 c15233g1 = new C15233G1(EnumC15248L1.STRING);
        STRING = c15233g1;
        EnumC15248L1 enumC15248L13 = EnumC15248L1.MESSAGE;
        EnumC15245K1 enumC15245K19 = new EnumC15245K1(enumC15248L13) { // from class: com.fyber.inneractive.sdk.protobuf.H1
            @Override // com.fyber.inneractive.sdk.protobuf.EnumC15245K1
            /* renamed from: c */
            public final boolean mo76966c() {
                return false;
            }
        };
        GROUP = enumC15245K19;
        EnumC15245K1 enumC15245K110 = new EnumC15245K1(enumC15248L13) { // from class: com.fyber.inneractive.sdk.protobuf.I1
            @Override // com.fyber.inneractive.sdk.protobuf.EnumC15245K1
            /* renamed from: c */
            public final boolean mo76966c() {
                return false;
            }
        };
        MESSAGE = enumC15245K110;
        EnumC15245K1 enumC15245K111 = new EnumC15245K1(EnumC15248L1.BYTE_STRING) { // from class: com.fyber.inneractive.sdk.protobuf.J1
            @Override // com.fyber.inneractive.sdk.protobuf.EnumC15245K1
            /* renamed from: c */
            public final boolean mo76966c() {
                return false;
            }
        };
        BYTES = enumC15245K111;
        EnumC15245K1 enumC15245K112 = new EnumC15245K1("UINT32", 12, enumC15248L12, 0);
        UINT32 = enumC15245K112;
        EnumC15245K1 enumC15245K113 = new EnumC15245K1("ENUM", 13, EnumC15248L1.ENUM, 0);
        ENUM = enumC15245K113;
        EnumC15245K1 enumC15245K114 = new EnumC15245K1("SFIXED32", 14, enumC15248L12, 5);
        SFIXED32 = enumC15245K114;
        EnumC15245K1 enumC15245K115 = new EnumC15245K1("SFIXED64", 15, enumC15248L1, 1);
        SFIXED64 = enumC15245K115;
        EnumC15245K1 enumC15245K116 = new EnumC15245K1("SINT32", 16, enumC15248L12, 0);
        SINT32 = enumC15245K116;
        EnumC15245K1 enumC15245K117 = new EnumC15245K1("SINT64", 17, enumC15248L1, 0);
        SINT64 = enumC15245K117;
        $VALUES = new EnumC15245K1[]{enumC15245K1, enumC15245K12, enumC15245K13, enumC15245K14, enumC15245K15, enumC15245K16, enumC15245K17, enumC15245K18, c15233g1, enumC15245K19, enumC15245K110, enumC15245K111, enumC15245K112, enumC15245K113, enumC15245K114, enumC15245K115, enumC15245K116, enumC15245K117};
    }

    public EnumC15245K1(String str, int i, EnumC15248L1 enumC15248L1, int i2) {
        this.javaType = enumC15248L1;
        this.wireType = i2;
    }

    public static EnumC15245K1 valueOf(String str) {
        return (EnumC15245K1) Enum.valueOf(EnumC15245K1.class, str);
    }

    public static EnumC15245K1[] values() {
        return (EnumC15245K1[]) $VALUES.clone();
    }

    /* renamed from: a */
    public final EnumC15248L1 m76968a() {
        return this.javaType;
    }

    /* renamed from: b */
    public final int m76967b() {
        return this.wireType;
    }

    /* renamed from: c */
    public boolean mo76966c() {
        return !(this instanceof C15233G1);
    }

    public EnumC15245K1(String str, int i, EnumC15248L1 enumC15248L1, int i2, int i3) {
        this.javaType = enumC15248L1;
        this.wireType = i2;
    }
}
