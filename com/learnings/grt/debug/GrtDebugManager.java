package com.learnings.grt.debug;

import android.text.TextUtils;
import p633d4.GrtAdImpressionData;
import p694h4.C33471g;
import p737j4.C37279b;
import p737j4.C37287d;

/* renamed from: com.learnings.grt.debug.g */
/* loaded from: classes6.dex */
public class GrtDebugManager {

    /* renamed from: a */
    private String f54869a;

    /* renamed from: b */
    private final String f54870b;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: GrtDebugManager.java */
    /* renamed from: com.learnings.grt.debug.g$b */
    /* loaded from: classes6.dex */
    public static class C21369b {

        /* renamed from: a */
        private static final GrtDebugManager f54871a = new GrtDebugManager();
    }

    /* renamed from: a */
    public static GrtDebugManager m53675a() {
        return C21369b.f54871a;
    }

    /* renamed from: b */
    public long m53674b() {
        return C37287d.m18566a().m18565b(C37279b.m18579k().m18578l()).m18560b("sp_key_debug_install_time", 0L);
    }

    /* renamed from: c */
    public String m53673c() {
        return this.f54869a;
    }

    /* renamed from: d */
    public boolean m53672d() {
        return !TextUtils.isEmpty(m53673c());
    }

    /* renamed from: e */
    public void m53671e(String str, double d) {
        GrtAdImpressionData grtAdImpressionData = new GrtAdImpressionData();
        grtAdImpressionData.m25733m(d);
        grtAdImpressionData.m25734l("USD");
        grtAdImpressionData.m25737i("max");
        grtAdImpressionData.m25736j("admob");
        grtAdImpressionData.m25738h(str);
        grtAdImpressionData.m25735k("debug_placement");
        C33471g.m23720j().mo23727c(grtAdImpressionData);
    }

    /* renamed from: f */
    public void m53670f(long j) {
        C37287d.m18566a().m18565b(C37279b.m18579k().m18578l()).m18558d("sp_key_debug_install_time", j);
    }

    private GrtDebugManager() {
        this.f54870b = "sp_key_debug_install_time";
    }
}
