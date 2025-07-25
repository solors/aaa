package com.unity3d.scar.adapter.common;

import p715i8.ScarAdMetadata;

/* renamed from: com.unity3d.scar.adapter.common.b */
/* loaded from: classes7.dex */
public class GMAAdsError extends WebViewAdsError {
    public GMAAdsError(GMAEvent gMAEvent, Object... objArr) {
        super(gMAEvent, null, objArr);
    }

    /* renamed from: a */
    public static GMAAdsError m37580a(ScarAdMetadata scarAdMetadata) {
        String format = String.format("Cannot show ad that is not loaded for placement %s", scarAdMetadata.m23099c());
        return new GMAAdsError(GMAEvent.AD_NOT_LOADED_ERROR, format, scarAdMetadata.m23099c(), scarAdMetadata.m23098d(), format);
    }

    /* renamed from: b */
    public static GMAAdsError m37579b(String str) {
        return new GMAAdsError(GMAEvent.SCAR_UNSUPPORTED, str, new Object[0]);
    }

    /* renamed from: c */
    public static GMAAdsError m37578c(ScarAdMetadata scarAdMetadata, String str) {
        return new GMAAdsError(GMAEvent.INTERNAL_LOAD_ERROR, str, scarAdMetadata.m23099c(), scarAdMetadata.m23098d(), str);
    }

    /* renamed from: d */
    public static GMAAdsError m37577d(ScarAdMetadata scarAdMetadata, String str) {
        return new GMAAdsError(GMAEvent.INTERNAL_SHOW_ERROR, str, scarAdMetadata.m23099c(), scarAdMetadata.m23098d(), str);
    }

    /* renamed from: e */
    public static GMAAdsError m37576e(String str) {
        return new GMAAdsError(GMAEvent.INTERNAL_SIGNALS_ERROR, str, str);
    }

    /* renamed from: f */
    public static GMAAdsError m37575f(String str, String str2, String str3) {
        return new GMAAdsError(GMAEvent.NO_AD_ERROR, str3, str, str2, str3);
    }

    @Override // com.unity3d.scar.adapter.common.WebViewAdsError
    public String getDomain() {
        return "GMA";
    }

    public GMAAdsError(GMAEvent gMAEvent, String str, Object... objArr) {
        super(gMAEvent, str, objArr);
    }
}
