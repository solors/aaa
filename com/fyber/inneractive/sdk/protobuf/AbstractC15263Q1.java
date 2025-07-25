package com.fyber.inneractive.sdk.protobuf;

/* renamed from: com.fyber.inneractive.sdk.protobuf.Q1 */
/* loaded from: classes4.dex */
public abstract class AbstractC15263Q1 {
    /* renamed from: a */
    public static Object m76945a(AbstractC15348w abstractC15348w, EnumC15245K1 enumC15245K1, EnumC15260P1 enumC15260P1) {
        switch (AbstractC15230F1.f30156a[enumC15245K1.ordinal()]) {
            case 1:
                return Double.valueOf(abstractC15348w.mo76777f());
            case 2:
                return Float.valueOf(abstractC15348w.mo76773j());
            case 3:
                return Long.valueOf(abstractC15348w.mo76771l());
            case 4:
                return Long.valueOf(abstractC15348w.mo76761v());
            case 5:
                return Integer.valueOf(abstractC15348w.mo76772k());
            case 6:
                return Long.valueOf(abstractC15348w.mo76774i());
            case 7:
                return Integer.valueOf(abstractC15348w.mo76775h());
            case 8:
                return Boolean.valueOf(abstractC15348w.mo76781d());
            case 9:
                return abstractC15348w.mo76779e();
            case 10:
                return Integer.valueOf(abstractC15348w.mo76762u());
            case 11:
                return Integer.valueOf(abstractC15348w.mo76769n());
            case 12:
                return Long.valueOf(abstractC15348w.mo76768o());
            case 13:
                return Integer.valueOf(abstractC15348w.mo76767p());
            case 14:
                return Long.valueOf(abstractC15348w.mo76766q());
            case 15:
                return enumC15260P1.mo76949a(abstractC15348w);
            case 16:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 17:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 18:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }
}
