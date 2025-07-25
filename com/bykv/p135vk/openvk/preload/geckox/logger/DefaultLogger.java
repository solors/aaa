package com.bykv.p135vk.openvk.preload.geckox.logger;

import android.util.Log;
import com.bykv.p135vk.openvk.preload.geckox.p171c.GsonUtil;

/* renamed from: com.bykv.vk.openvk.preload.geckox.logger.DefaultLogger */
/* loaded from: classes3.dex */
class DefaultLogger implements Logger {
    @Override // com.bykv.p135vk.openvk.preload.geckox.logger.Logger
    /* renamed from: d */
    public void mo91259d(String str, Object... objArr) {
        if (objArr == null) {
            Log.d(str, "null");
            return;
        }
        try {
            Log.d(str, GsonUtil.m91325a().m91324b().m91558a(objArr));
        } catch (Throwable unused) {
        }
    }

    @Override // com.bykv.p135vk.openvk.preload.geckox.logger.Logger
    /* renamed from: e */
    public void mo91258e(String str, String str2, Throwable th) {
        Log.e(str, str2, th);
    }

    @Override // com.bykv.p135vk.openvk.preload.geckox.logger.Logger
    /* renamed from: w */
    public void mo91256w(String str, String str2, Throwable th) {
        Log.w(str, str2, th);
    }

    @Override // com.bykv.p135vk.openvk.preload.geckox.logger.Logger
    /* renamed from: w */
    public void mo91257w(String str, String str2) {
        if (str2 == null) {
            str2 = "";
        }
        Log.w(str, str2);
    }
}
