package com.applovin.impl;

import com.smaato.sdk.core.gdpr.CmpApiConstants;
import java.util.HashSet;

/* renamed from: com.applovin.impl.uj */
/* loaded from: classes2.dex */
public class C5639uj {

    /* renamed from: a */
    private final String f11311a;

    /* renamed from: b */
    private final Class f11312b;

    /* renamed from: c */
    public static final C5639uj f11287c = new C5639uj("com.applovin.sdk.impl.isFirstRun", String.class);

    /* renamed from: d */
    public static final C5639uj f11288d = new C5639uj("com.applovin.sdk.launched_before", Boolean.class);

    /* renamed from: e */
    public static final C5639uj f11289e = new C5639uj("com.applovin.sdk.latest_installed_version", String.class);

    /* renamed from: f */
    public static final C5639uj f11290f = new C5639uj("com.applovin.sdk.install_date", Long.class);

    /* renamed from: g */
    public static final C5639uj f11291g = new C5639uj("com.applovin.sdk.user_id", String.class);

    /* renamed from: h */
    public static final C5639uj f11292h = new C5639uj("com.applovin.sdk.compass_id", String.class);

    /* renamed from: i */
    public static final C5639uj f11293i = new C5639uj("com.applovin.sdk.compass_random_token", String.class);

    /* renamed from: j */
    public static final C5639uj f11294j = new C5639uj("com.applovin.sdk.applovin_random_token", String.class);

    /* renamed from: k */
    public static final C5639uj f11295k = new C5639uj("com.applovin.sdk.device_test_group", String.class);

    /* renamed from: l */
    public static final C5639uj f11296l = new C5639uj("com.applovin.sdk.compliance.has_user_consent", Boolean.class);

    /* renamed from: m */
    public static final C5639uj f11297m = new C5639uj("com.applovin.sdk.compliance.is_age_restricted_user", Boolean.class);

    /* renamed from: n */
    public static final C5639uj f11298n = new C5639uj("com.applovin.sdk.compliance.is_do_not_sell", Boolean.class);

    /* renamed from: o */
    public static final C5639uj f11299o = new C5639uj("com.applovin.sdk.has_seen_but_not_accepted_privacy_policy", Boolean.class);

    /* renamed from: p */
    public static final C5639uj f11300p = new C5639uj(CmpApiConstants.IABTCF_CMP_SDK_ID, Object.class);

    /* renamed from: q */
    public static final C5639uj f11301q = new C5639uj(CmpApiConstants.IABTCF_CMP_SDK_VERSION, Object.class);

    /* renamed from: r */
    public static final C5639uj f11302r = new C5639uj("IABTCF_gdprApplies", Object.class);

    /* renamed from: s */
    public static final C5639uj f11303s = new C5639uj("IABTCF_TCString", String.class);

    /* renamed from: t */
    public static final C5639uj f11304t = new C5639uj("IABTCF_AddtlConsent", String.class);

    /* renamed from: u */
    public static final C5639uj f11305u = new C5639uj(CmpApiConstants.IABTCF_VENDOR_CONSENT, String.class);

    /* renamed from: v */
    public static final C5639uj f11306v = new C5639uj(CmpApiConstants.IABTCF_VENDOR_LEGITIMATE_INTERESTS, String.class);

    /* renamed from: w */
    public static final C5639uj f11307w = new C5639uj(CmpApiConstants.IABTCF_PURPOSE_CONSENTS, String.class);

    /* renamed from: x */
    public static final C5639uj f11308x = new C5639uj(CmpApiConstants.IABTCF_PURPOSE_LEGITIMATE_INTERESTS, String.class);

    /* renamed from: y */
    public static final C5639uj f11309y = new C5639uj(CmpApiConstants.IABTCF_SPECIAL_FEATURES_OPT_INS, String.class);

    /* renamed from: z */
    public static final C5639uj f11310z = new C5639uj("com.applovin.sdk.stats", String.class);

    /* renamed from: A */
    public static final C5639uj f11271A = new C5639uj("com.applovin.sdk.task.stats", HashSet.class);

    /* renamed from: B */
    public static final C5639uj f11272B = new C5639uj("com.applovin.sdk.network_response_code_mapping", String.class);

    /* renamed from: C */
    public static final C5639uj f11273C = new C5639uj("com.applovin.sdk.impl.ad.persistence.queue", String.class);

    /* renamed from: D */
    public static final C5639uj f11274D = new C5639uj("com.applovin.sdk.last_video_position", Integer.class);

    /* renamed from: E */
    public static final C5639uj f11275E = new C5639uj("com.applovin.sdk.should_resume_video", Boolean.class);

    /* renamed from: F */
    public static final C5639uj f11276F = new C5639uj("com.applovin.sdk.mediation.signal_providers", String.class);

    /* renamed from: G */
    public static final C5639uj f11277G = new C5639uj("com.applovin.sdk.mediation.auto_init_adapters", String.class);

    /* renamed from: H */
    public static final C5639uj f11278H = new C5639uj("com.applovin.sdk.persisted_data", String.class);

    /* renamed from: I */
    public static final C5639uj f11279I = new C5639uj("com.applovin.sdk.mediation_provider", String.class);

    /* renamed from: J */
    public static final C5639uj f11280J = new C5639uj("com.applovin.sdk.mediation.test_mode_enabled", Boolean.class);

    /* renamed from: K */
    public static final C5639uj f11281K = new C5639uj("com.applovin.sdk.user_agent", String.class);

    /* renamed from: L */
    public static final C5639uj f11282L = new C5639uj("com.applovin.sdk.last_os_version_user_agent_collected_for", String.class);

    /* renamed from: M */
    public static final C5639uj f11283M = new C5639uj("com.applovin.sdk.last_fullscreen_ad_timestamp_ms", Long.class);

    /* renamed from: N */
    public static final C5639uj f11284N = new C5639uj("com.applovin.sdk.last_fullscreen_ad_duration_ms", Long.class);

    /* renamed from: O */
    public static final C5639uj f11285O = new C5639uj("com.applovin.sdk.app_killed_urls_from_last_ad", String.class);

    /* renamed from: P */
    public static final C5639uj f11286P = new C5639uj("com.applovin.sdk.app_killed_last_ad_data", String.class);

    public C5639uj(String str, Class cls) {
        this.f11311a = str;
        this.f11312b = cls;
    }

    /* renamed from: a */
    public String m94076a() {
        return this.f11311a;
    }

    /* renamed from: b */
    public Class m94075b() {
        return this.f11312b;
    }

    public String toString() {
        return "Key{name='" + this.f11311a + "', type=" + this.f11312b + '}';
    }
}
