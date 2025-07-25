package com.applovin.impl;

import android.text.TextUtils;
import com.unity3d.services.core.p621di.ServiceProvider;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.applovin.impl.ba */
/* loaded from: classes2.dex */
public class C4112ba {

    /* renamed from: b */
    private static final Set f4960b = new HashSet(32);

    /* renamed from: c */
    private static final Set f4961c = new HashSet(16);

    /* renamed from: d */
    public static final C4112ba f4962d = m100484a(ServiceProvider.NAMED_AD_REQ);

    /* renamed from: e */
    public static final C4112ba f4963e = m100484a("ad_imp");

    /* renamed from: f */
    public static final C4112ba f4964f = m100484a("max_ad_imp");

    /* renamed from: g */
    public static final C4112ba f4965g = m100484a("ad_session_start");

    /* renamed from: h */
    public static final C4112ba f4966h = m100484a("ad_imp_session");

    /* renamed from: i */
    public static final C4112ba f4967i = m100484a("max_ad_imp_session");

    /* renamed from: j */
    public static final C4112ba f4968j = m100484a("cached_files_expired");

    /* renamed from: k */
    public static final C4112ba f4969k = m100484a("cache_drop_count");

    /* renamed from: l */
    public static final C4112ba f4970l = m100483a("sdk_reset_state_count", true);

    /* renamed from: m */
    public static final C4112ba f4971m = m100483a("ad_response_process_failures", true);

    /* renamed from: n */
    public static final C4112ba f4972n = m100483a("response_process_failures", true);

    /* renamed from: o */
    public static final C4112ba f4973o = m100483a("incent_failed_to_display_count", true);

    /* renamed from: p */
    public static final C4112ba f4974p = m100484a("app_paused_and_resumed");

    /* renamed from: q */
    public static final C4112ba f4975q = m100483a("ad_rendered_with_mismatched_sdk_key", true);

    /* renamed from: r */
    public static final C4112ba f4976r = m100484a("ad_shown_outside_app_count");

    /* renamed from: s */
    public static final C4112ba f4977s = m100484a("med_ad_req");

    /* renamed from: t */
    public static final C4112ba f4978t = m100483a("med_ad_response_process_failures", true);

    /* renamed from: u */
    public static final C4112ba f4979u = m100483a("med_waterfall_ad_no_fill", true);

    /* renamed from: v */
    public static final C4112ba f4980v = m100483a("med_waterfall_ad_adapter_load_failed", true);

    /* renamed from: w */
    public static final C4112ba f4981w = m100483a("med_waterfall_ad_invalid_response", true);

    /* renamed from: a */
    private final String f4982a;

    static {
        m100484a("fullscreen_ad_nil_vc_count");
        m100484a("applovin_bundle_missing");
    }

    private C4112ba(String str) {
        this.f4982a = str;
    }

    /* renamed from: a */
    private static C4112ba m100484a(String str) {
        return m100483a(str, false);
    }

    /* renamed from: b */
    public String m100482b() {
        return this.f4982a;
    }

    /* renamed from: a */
    private static C4112ba m100483a(String str, boolean z) {
        if (!TextUtils.isEmpty(str)) {
            Set set = f4960b;
            if (!set.contains(str)) {
                set.add(str);
                C4112ba c4112ba = new C4112ba(str);
                if (z) {
                    f4961c.add(c4112ba);
                }
                return c4112ba;
            }
            throw new IllegalArgumentException("Key has already been used: " + str);
        }
        throw new IllegalArgumentException("No key name specified");
    }

    /* renamed from: a */
    public static Set m100485a() {
        return f4961c;
    }
}
