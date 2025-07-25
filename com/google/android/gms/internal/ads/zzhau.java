package com.google.android.gms.internal.ads;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum zzc uses external variables
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
public final class zzhau {
    public static final zzhau zza;
    public static final zzhau zzb;
    public static final zzhau zzc;
    public static final zzhau zzd;
    public static final zzhau zze;
    public static final zzhau zzf;
    public static final zzhau zzg;
    public static final zzhau zzh;
    public static final zzhau zzi;
    public static final zzhau zzj;
    public static final zzhau zzk;
    public static final zzhau zzl;
    public static final zzhau zzm;
    public static final zzhau zzn;
    public static final zzhau zzo;
    public static final zzhau zzp;
    public static final zzhau zzq;
    public static final zzhau zzr;
    private static final /* synthetic */ zzhau[] zzs;
    private final zzhav zzt;

    static {
        zzhau zzhauVar = new zzhau("DOUBLE", 0, zzhav.DOUBLE, 1);
        zza = zzhauVar;
        zzhau zzhauVar2 = new zzhau("FLOAT", 1, zzhav.FLOAT, 5);
        zzb = zzhauVar2;
        zzhav zzhavVar = zzhav.LONG;
        zzhau zzhauVar3 = new zzhau("INT64", 2, zzhavVar, 0);
        zzc = zzhauVar3;
        zzhau zzhauVar4 = new zzhau("UINT64", 3, zzhavVar, 0);
        zzd = zzhauVar4;
        zzhav zzhavVar2 = zzhav.INT;
        zzhau zzhauVar5 = new zzhau("INT32", 4, zzhavVar2, 0);
        zze = zzhauVar5;
        zzhau zzhauVar6 = new zzhau("FIXED64", 5, zzhavVar, 1);
        zzf = zzhauVar6;
        zzhau zzhauVar7 = new zzhau("FIXED32", 6, zzhavVar2, 5);
        zzg = zzhauVar7;
        zzhau zzhauVar8 = new zzhau("BOOL", 7, zzhav.BOOLEAN, 0);
        zzh = zzhauVar8;
        zzhau zzhauVar9 = new zzhau("STRING", 8, zzhav.STRING, 2);
        zzi = zzhauVar9;
        zzhav zzhavVar3 = zzhav.MESSAGE;
        zzhau zzhauVar10 = new zzhau("GROUP", 9, zzhavVar3, 3);
        zzj = zzhauVar10;
        zzhau zzhauVar11 = new zzhau("MESSAGE", 10, zzhavVar3, 2);
        zzk = zzhauVar11;
        zzhau zzhauVar12 = new zzhau("BYTES", 11, zzhav.BYTE_STRING, 2);
        zzl = zzhauVar12;
        zzhau zzhauVar13 = new zzhau("UINT32", 12, zzhavVar2, 0);
        zzm = zzhauVar13;
        zzhau zzhauVar14 = new zzhau("ENUM", 13, zzhav.ENUM, 0);
        zzn = zzhauVar14;
        zzhau zzhauVar15 = new zzhau("SFIXED32", 14, zzhavVar2, 5);
        zzo = zzhauVar15;
        zzhau zzhauVar16 = new zzhau("SFIXED64", 15, zzhavVar, 1);
        zzp = zzhauVar16;
        zzhau zzhauVar17 = new zzhau("SINT32", 16, zzhavVar2, 0);
        zzq = zzhauVar17;
        zzhau zzhauVar18 = new zzhau("SINT64", 17, zzhavVar, 0);
        zzr = zzhauVar18;
        zzs = new zzhau[]{zzhauVar, zzhauVar2, zzhauVar3, zzhauVar4, zzhauVar5, zzhauVar6, zzhauVar7, zzhauVar8, zzhauVar9, zzhauVar10, zzhauVar11, zzhauVar12, zzhauVar13, zzhauVar14, zzhauVar15, zzhauVar16, zzhauVar17, zzhauVar18};
    }

    private zzhau(String str, int i, zzhav zzhavVar, int i2) {
        this.zzt = zzhavVar;
    }

    public static zzhau[] values() {
        return (zzhau[]) zzs.clone();
    }

    public final zzhav zza() {
        return this.zzt;
    }
}
