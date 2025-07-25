package com.fyber.inneractive.sdk.protobuf;

/* renamed from: com.fyber.inneractive.sdk.protobuf.O */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC15255O {

    /* renamed from: a */
    public static final /* synthetic */ int[] f30196a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f30197b;

    static {
        int[] iArr = new int[JavaType.values().length];
        f30197b = iArr;
        try {
            iArr[JavaType.BYTE_STRING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f30197b[JavaType.MESSAGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f30197b[JavaType.STRING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[EnumC15258P.values().length];
        f30196a = iArr2;
        try {
            iArr2[EnumC15258P.MAP.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f30196a[EnumC15258P.VECTOR.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f30196a[EnumC15258P.SCALAR.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
