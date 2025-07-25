package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzdrf {
    public static final zzfxn zza;
    public static final zzfxn zzb;
    private final String zzc;
    private final zzdre zzd;
    private final zzdre zze;

    static {
        zzdre zzdreVar = zzdre.PUBLIC_API_CALL;
        zzdre zzdreVar2 = zzdre.PUBLIC_API_CALLBACK;
        zzdrf zzdrfVar = new zzdrf("tqgt", zzdreVar, zzdreVar2);
        zzdre zzdreVar3 = zzdre.DYNAMITE_ENTER;
        zzdrf zzdrfVar2 = new zzdrf("l.dl", zzdreVar, zzdreVar3);
        zzdre zzdreVar4 = zzdre.READ_FROM_DISK_START;
        zzdrf zzdrfVar3 = new zzdrf("l.rccde", zzdreVar3, zzdreVar4);
        zzdrf zzdrfVar4 = new zzdrf("l.rfd", zzdreVar4, zzdre.READ_FROM_DISK_END);
        zzdre zzdreVar5 = zzdre.CLIENT_SIGNALS_START;
        zzdrf zzdrfVar5 = new zzdrf("l.rcc", zzdreVar3, zzdreVar5);
        zzdre zzdreVar6 = zzdre.CLIENT_SIGNALS_END;
        zzdrf zzdrfVar6 = new zzdrf("l.cs", zzdreVar5, zzdreVar6);
        zzdre zzdreVar7 = zzdre.SERVICE_CONNECTED;
        zzdrf zzdrfVar7 = new zzdrf("l.cts", zzdreVar6, zzdreVar7);
        zzdre zzdreVar8 = zzdre.GMS_SIGNALS_START;
        zzdre zzdreVar9 = zzdre.GMS_SIGNALS_END;
        zzdrf zzdrfVar8 = new zzdrf("l.gs", zzdreVar8, zzdreVar9);
        zzdre zzdreVar10 = zzdre.GET_SIGNALS_SDKCORE_START;
        zzdrf zzdrfVar9 = new zzdrf("l.jse", zzdreVar9, zzdreVar10);
        zzdre zzdreVar11 = zzdre.GET_SIGNALS_SDKCORE_END;
        zzdrf zzdrfVar10 = new zzdrf("l.gs-sdkcore", zzdreVar10, zzdreVar11);
        zzdrf zzdrfVar11 = new zzdrf("l.gs-pp", zzdreVar11, zzdreVar2);
        zzdre zzdreVar12 = zzdre.RENDERING_START;
        zzdrf zzdrfVar12 = new zzdrf("l.render", zzdreVar12, zzdreVar2);
        zzdre zzdreVar13 = zzdre.RENDERING_WEBVIEW_CREATION_START;
        zzdre zzdreVar14 = zzdre.RENDERING_WEBVIEW_CREATION_END;
        zzdre zzdreVar15 = zzdre.RENDERING_AD_COMPONENT_CREATION_END;
        zzdre zzdreVar16 = zzdre.RENDERING_CONFIGURE_WEBVIEW_START;
        zzdre zzdreVar17 = zzdre.RENDERING_CONFIGURE_WEBVIEW_END;
        zzdre zzdreVar18 = zzdre.RENDERING_WEBVIEW_LOAD_HTML_START;
        zzdre zzdreVar19 = zzdre.RENDERING_WEBVIEW_LOAD_HTML_END;
        zza = zzfxn.zzt(zzdrfVar, zzdrfVar2, zzdrfVar3, zzdrfVar4, zzdrfVar5, zzdrfVar6, zzdrfVar7, zzdrfVar8, zzdrfVar9, zzdrfVar10, zzdrfVar11, zzdrfVar12, new zzdrf("l.render.pre", zzdreVar12, zzdreVar13), new zzdrf("l.render.wvc", zzdreVar13, zzdreVar14), new zzdrf("l.render.acc", zzdreVar14, zzdreVar15), new zzdrf("l.render.cfg-wv", zzdreVar16, zzdreVar17), new zzdrf("l.render.wvlh", zzdreVar18, zzdreVar19), new zzdrf("l.render.post", zzdreVar19, zzdreVar2), new zzdrf("l.sodv", zzdre.SIGNAL_ON_DISK_VALIDATION_START, zzdre.SIGNAL_ON_DISK_VALIDATION_END), new zzdrf("l.sodck", zzdre.SIGNAL_ON_DISK_CACHE_KEY_START, zzdre.SIGNAL_ON_DISK_CACHE_KEY_END), new zzdrf("l.sodrar", zzdre.SIGNAL_ON_DISK_READ_AND_REMOVE_START, zzdre.SIGNAL_ON_DISK_READ_AND_REMOVE_END), new zzdrf("l.soddc", zzdre.SIGNAL_ON_DISK_DECODE_START, zzdre.SIGNAL_ON_DISK_DECODE_END));
        zzdrf zzdrfVar13 = new zzdrf("l.al", zzdreVar, zzdreVar2);
        zzdrf zzdrfVar14 = new zzdrf("l.al2", zzdreVar3, zzdreVar2);
        zzdrf zzdrfVar15 = new zzdrf("l.dl", zzdreVar, zzdreVar3);
        zzdrf zzdrfVar16 = new zzdrf("l.rcc", zzdreVar3, zzdreVar5);
        zzdrf zzdrfVar17 = new zzdrf("l.cs", zzdreVar5, zzdreVar6);
        zzdrf zzdrfVar18 = new zzdrf("l.cts", zzdreVar6, zzdreVar7);
        zzdrf zzdrfVar19 = new zzdrf("l.gs", zzdreVar8, zzdreVar9);
        zzdre zzdreVar20 = zzdre.GET_AD_DICTIONARY_SDKCORE_START;
        zzdrf zzdrfVar20 = new zzdrf("l.jse", zzdreVar9, zzdreVar20);
        zzdre zzdreVar21 = zzdre.GET_AD_DICTIONARY_SDKCORE_END;
        zzdrf zzdrfVar21 = new zzdrf("l.gad-js", zzdreVar20, zzdreVar21);
        zzdre zzdreVar22 = zzdre.HTTP_RESPONSE_READY;
        zzdrf zzdrfVar22 = new zzdrf("l.http", zzdreVar21, zzdreVar22);
        zzdre zzdreVar23 = zzdre.NORMALIZATION_AD_RESPONSE_START;
        zzdrf zzdrfVar23 = new zzdrf("l.jse-nml", zzdreVar22, zzdreVar23);
        zzdre zzdreVar24 = zzdre.NORMALIZATION_AD_RESPONSE_END;
        zzdrf zzdrfVar24 = new zzdrf("l.nml-js", zzdreVar23, zzdreVar24);
        zzdre zzdreVar25 = zzdre.BINDER_CALL_START;
        zzdre zzdreVar26 = zzdre.SERVER_RESPONSE_PARSE_START;
        zzb = zzfxn.zzt(zzdrfVar13, zzdrfVar14, zzdrfVar15, zzdrfVar16, zzdrfVar17, zzdrfVar18, zzdrfVar19, zzdrfVar20, zzdrfVar21, zzdrfVar22, zzdrfVar23, zzdrfVar24, new zzdrf("l.nml-gmsg", zzdreVar24, zzdreVar25), new zzdrf("l.binder", zzdreVar25, zzdreVar26), new zzdrf("l.sr", zzdreVar26, zzdreVar12), new zzdrf("l.render", zzdreVar12, zzdreVar2), new zzdrf("l.t2", zzdre.RENDERING_ADSTRING_TYPE2_FETCH_START, zzdre.RENDERING_ADSTRING_TYPE2_FETCH_END), new zzdrf("l.render.wvc", zzdreVar13, zzdreVar14), new zzdrf("l.render.acc", zzdreVar14, zzdreVar15), new zzdrf("l.render.cfg-wv", zzdreVar16, zzdreVar17), new zzdrf("l.render.pre", zzdreVar12, zzdreVar13), new zzdrf("l.render.post", zzdreVar19, zzdreVar2), new zzdrf("l.render.wvlh", zzdreVar18, zzdreVar19));
    }

    public zzdrf(String str, zzdre zzdreVar, zzdre zzdreVar2) {
        this.zzc = str;
        this.zzd = zzdreVar;
        this.zze = zzdreVar2;
    }

    public final zzdre zza() {
        return this.zzd;
    }

    public final zzdre zzb() {
        return this.zze;
    }

    public final String zzc() {
        return this.zzc;
    }
}
