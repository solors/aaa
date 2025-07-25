package com.google.android.gms.internal.ads;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum zzb uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzgyi {
    public static final zzgyi zza;
    public static final zzgyi zzb;
    public static final zzgyi zzc;
    public static final zzgyi zzd;
    public static final zzgyi zze;
    public static final zzgyi zzf;
    public static final zzgyi zzg;
    public static final zzgyi zzh;
    public static final zzgyi zzi;
    public static final zzgyi zzj;
    private static final /* synthetic */ zzgyi[] zzk;
    private final Class zzl;

    static {
        zzgyi zzgyiVar = new zzgyi("VOID", 0, Void.class, Void.class, null);
        zza = zzgyiVar;
        Class cls = Integer.TYPE;
        zzgyi zzgyiVar2 = new zzgyi("INT", 1, cls, Integer.class, 0);
        zzb = zzgyiVar2;
        zzgyi zzgyiVar3 = new zzgyi("LONG", 2, Long.TYPE, Long.class, 0L);
        zzc = zzgyiVar3;
        zzgyi zzgyiVar4 = new zzgyi("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        zzd = zzgyiVar4;
        zzgyi zzgyiVar5 = new zzgyi("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        zze = zzgyiVar5;
        zzgyi zzgyiVar6 = new zzgyi("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        zzf = zzgyiVar6;
        zzgyi zzgyiVar7 = new zzgyi("STRING", 6, String.class, String.class, "");
        zzg = zzgyiVar7;
        zzgyi zzgyiVar8 = new zzgyi("BYTE_STRING", 7, zzgwj.class, zzgwj.class, zzgwj.zzb);
        zzh = zzgyiVar8;
        zzgyi zzgyiVar9 = new zzgyi("ENUM", 8, cls, Integer.class, null);
        zzi = zzgyiVar9;
        zzgyi zzgyiVar10 = new zzgyi("MESSAGE", 9, Object.class, Object.class, null);
        zzj = zzgyiVar10;
        zzk = new zzgyi[]{zzgyiVar, zzgyiVar2, zzgyiVar3, zzgyiVar4, zzgyiVar5, zzgyiVar6, zzgyiVar7, zzgyiVar8, zzgyiVar9, zzgyiVar10};
    }

    private zzgyi(String str, int i, Class cls, Class cls2, Object obj) {
        this.zzl = cls2;
    }

    public static zzgyi[] values() {
        return (zzgyi[]) zzk.clone();
    }

    public final Class zza() {
        return this.zzl;
    }
}
