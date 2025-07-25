package com.fyber.inneractive.sdk.protobuf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.fyber.inneractive.sdk.protobuf.P1 */
/* loaded from: classes4.dex */
public abstract class EnumC15260P1 {
    private static final /* synthetic */ EnumC15260P1[] $VALUES;
    public static final EnumC15260P1 LAZY;
    public static final EnumC15260P1 LOOSE;
    public static final EnumC15260P1 STRICT;

    static {
        EnumC15260P1 enumC15260P1 = new EnumC15260P1() { // from class: com.fyber.inneractive.sdk.protobuf.M1
            @Override // com.fyber.inneractive.sdk.protobuf.EnumC15260P1
            /* renamed from: a */
            public final Object mo76949a(AbstractC15348w abstractC15348w) {
                return abstractC15348w.mo76765r();
            }
        };
        LOOSE = enumC15260P1;
        EnumC15260P1 enumC15260P12 = new EnumC15260P1() { // from class: com.fyber.inneractive.sdk.protobuf.N1
            @Override // com.fyber.inneractive.sdk.protobuf.EnumC15260P1
            /* renamed from: a */
            public final Object mo76949a(AbstractC15348w abstractC15348w) {
                return abstractC15348w.mo76764s();
            }
        };
        STRICT = enumC15260P12;
        EnumC15260P1 enumC15260P13 = new EnumC15260P1() { // from class: com.fyber.inneractive.sdk.protobuf.O1
            @Override // com.fyber.inneractive.sdk.protobuf.EnumC15260P1
            /* renamed from: a */
            public final Object mo76949a(AbstractC15348w abstractC15348w) {
                return abstractC15348w.mo76779e();
            }
        };
        LAZY = enumC15260P13;
        $VALUES = new EnumC15260P1[]{enumC15260P1, enumC15260P12, enumC15260P13};
    }

    public EnumC15260P1(String str, int i) {
    }

    public static EnumC15260P1 valueOf(String str) {
        return (EnumC15260P1) Enum.valueOf(EnumC15260P1.class, str);
    }

    public static EnumC15260P1[] values() {
        return (EnumC15260P1[]) $VALUES.clone();
    }

    /* renamed from: a */
    public abstract Object mo76949a(AbstractC15348w abstractC15348w);
}
