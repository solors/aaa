package com.chartboost.sdk.impl;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.Arrays;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p804nd.InterfaceC38501j;
import p804nd.LazyJVM;
import td.C44401b;
import td.EnumEntries;

/* renamed from: com.chartboost.sdk.impl.na */
/* loaded from: classes3.dex */
public interface InterfaceC10068na {

    /* renamed from: a */
    public static final C10071c f22668a = C10071c.f22687a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.chartboost.sdk.impl.na$a */
    /* loaded from: classes3.dex */
    public static final class EnumC10069a implements InterfaceC10068na {

        /* renamed from: c */
        public static final EnumC10069a f22669c = new EnumC10069a("IGNORED", 0, "cache_ignored");

        /* renamed from: d */
        public static final EnumC10069a f22670d = new EnumC10069a("START", 1, "cache_start");

        /* renamed from: e */
        public static final EnumC10069a f22671e = new EnumC10069a("FINISH_SUCCESS", 2, "cache_finish_success");

        /* renamed from: f */
        public static final EnumC10069a f22672f = new EnumC10069a("FINISH_FAILURE", 3, "cache_finish_failure");

        /* renamed from: g */
        public static final EnumC10069a f22673g = new EnumC10069a("GET_RESPONSE_PARSING_ERROR", 4, "cache_get_response_parsing_error");

        /* renamed from: h */
        public static final EnumC10069a f22674h = new EnumC10069a("BID_RESPONSE_PARSING_ERROR", 5, "cache_bid_response_parsing_error");

        /* renamed from: i */
        public static final EnumC10069a f22675i = new EnumC10069a("ASSET_DOWNLOAD_ERROR", 6, "cache_asset_download_error");

        /* renamed from: j */
        public static final EnumC10069a f22676j = new EnumC10069a("REQUEST_ERROR", 7, "cache_request_error");

        /* renamed from: k */
        public static final EnumC10069a f22677k = new EnumC10069a("SERVER_ERROR", 8, "cache_server_error");

        /* renamed from: l */
        public static final /* synthetic */ EnumC10069a[] f22678l;

        /* renamed from: m */
        public static final /* synthetic */ EnumEntries f22679m;

        /* renamed from: b */
        public final String f22680b;

        static {
            EnumC10069a[] m81022a = m81022a();
            f22678l = m81022a;
            f22679m = C44401b.m3113a(m81022a);
        }

        public EnumC10069a(String str, int i, String str2) {
            this.f22680b = str2;
        }

        /* renamed from: a */
        public static final /* synthetic */ EnumC10069a[] m81022a() {
            return new EnumC10069a[]{f22669c, f22670d, f22671e, f22672f, f22673g, f22674h, f22675i, f22676j, f22677k};
        }

        /* renamed from: b */
        public static EnumEntries m81021b() {
            return f22679m;
        }

        public static EnumC10069a valueOf(String str) {
            return (EnumC10069a) Enum.valueOf(EnumC10069a.class, str);
        }

        public static EnumC10069a[] values() {
            return (EnumC10069a[]) f22678l.clone();
        }

        @Override // com.chartboost.sdk.impl.InterfaceC10068na
        public String getValue() {
            return this.f22680b;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.chartboost.sdk.impl.na$b */
    /* loaded from: classes3.dex */
    public static final class EnumC10070b implements InterfaceC10068na {

        /* renamed from: c */
        public static final EnumC10070b f22681c = new EnumC10070b("SUCCESS", 0, "click_success");

        /* renamed from: d */
        public static final EnumC10070b f22682d = new EnumC10070b("FAILURE", 1, "click_failure");

        /* renamed from: e */
        public static final EnumC10070b f22683e = new EnumC10070b("INVALID_URL_ERROR", 2, "click_invalid_url_error");

        /* renamed from: f */
        public static final /* synthetic */ EnumC10070b[] f22684f;

        /* renamed from: g */
        public static final /* synthetic */ EnumEntries f22685g;

        /* renamed from: b */
        public final String f22686b;

        static {
            EnumC10070b[] m81020a = m81020a();
            f22684f = m81020a;
            f22685g = C44401b.m3113a(m81020a);
        }

        public EnumC10070b(String str, int i, String str2) {
            this.f22686b = str2;
        }

        /* renamed from: a */
        public static final /* synthetic */ EnumC10070b[] m81020a() {
            return new EnumC10070b[]{f22681c, f22682d, f22683e};
        }

        /* renamed from: b */
        public static EnumEntries m81019b() {
            return f22685g;
        }

        public static EnumC10070b valueOf(String str) {
            return (EnumC10070b) Enum.valueOf(EnumC10070b.class, str);
        }

        public static EnumC10070b[] values() {
            return (EnumC10070b[]) f22684f.clone();
        }

        @Override // com.chartboost.sdk.impl.InterfaceC10068na
        public String getValue() {
            return this.f22686b;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.chartboost.sdk.impl.na$d */
    /* loaded from: classes3.dex */
    public static final class EnumC10073d implements InterfaceC10068na {

        /* renamed from: c */
        public static final EnumC10073d f22690c = new EnumC10073d("SUBCLASSING_ERROR", 0, "consent_subclassing_error");

        /* renamed from: d */
        public static final EnumC10073d f22691d = new EnumC10073d("DECODING_ERROR", 1, "consent_decoding_error");

        /* renamed from: e */
        public static final EnumC10073d f22692e = new EnumC10073d("CREATION_ERROR", 2, "consent_creation_error");

        /* renamed from: f */
        public static final EnumC10073d f22693f = new EnumC10073d("PERSISTED_DATA_READING_ERROR", 3, "consent_persisted_data_reading_error");

        /* renamed from: g */
        public static final EnumC10073d f22694g = new EnumC10073d("PERSISTENCE_ERROR", 4, "consent_persistence_error");

        /* renamed from: h */
        public static final /* synthetic */ EnumC10073d[] f22695h;

        /* renamed from: i */
        public static final /* synthetic */ EnumEntries f22696i;

        /* renamed from: b */
        public final String f22697b;

        static {
            EnumC10073d[] m81015a = m81015a();
            f22695h = m81015a;
            f22696i = C44401b.m3113a(m81015a);
        }

        public EnumC10073d(String str, int i, String str2) {
            this.f22697b = str2;
        }

        /* renamed from: a */
        public static final /* synthetic */ EnumC10073d[] m81015a() {
            return new EnumC10073d[]{f22690c, f22691d, f22692e, f22693f, f22694g};
        }

        /* renamed from: b */
        public static EnumEntries m81014b() {
            return f22696i;
        }

        public static EnumC10073d valueOf(String str) {
            return (EnumC10073d) Enum.valueOf(EnumC10073d.class, str);
        }

        public static EnumC10073d[] values() {
            return (EnumC10073d[]) f22695h.clone();
        }

        @Override // com.chartboost.sdk.impl.InterfaceC10068na
        public String getValue() {
            return this.f22697b;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.chartboost.sdk.impl.na$e */
    /* loaded from: classes3.dex */
    public static final class EnumC10074e implements InterfaceC10068na {

        /* renamed from: c */
        public static final EnumC10074e f22698c = new EnumC10074e("IMPRESSION_TRACKER_FAILURE", 0, "imptracker_failure");

        /* renamed from: d */
        public static final /* synthetic */ EnumC10074e[] f22699d;

        /* renamed from: e */
        public static final /* synthetic */ EnumEntries f22700e;

        /* renamed from: b */
        public final String f22701b;

        static {
            EnumC10074e[] m81013a = m81013a();
            f22699d = m81013a;
            f22700e = C44401b.m3113a(m81013a);
        }

        public EnumC10074e(String str, int i, String str2) {
            this.f22701b = str2;
        }

        /* renamed from: a */
        public static final /* synthetic */ EnumC10074e[] m81013a() {
            return new EnumC10074e[]{f22698c};
        }

        public static EnumC10074e valueOf(String str) {
            return (EnumC10074e) Enum.valueOf(EnumC10074e.class, str);
        }

        public static EnumC10074e[] values() {
            return (EnumC10074e[]) f22699d.clone();
        }

        @Override // com.chartboost.sdk.impl.InterfaceC10068na
        public String getValue() {
            return this.f22701b;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.chartboost.sdk.impl.na$f */
    /* loaded from: classes3.dex */
    public static final class EnumC10075f implements InterfaceC10068na {

        /* renamed from: c */
        public static final EnumC10075f f22702c = new EnumC10075f("USER_AGENT_UPDATE_ERROR", 0, "user_agent_update_error");

        /* renamed from: d */
        public static final EnumC10075f f22703d = new EnumC10075f("PREFETCH_REQUEST_ERROR", 1, "prefetch_request_error");

        /* renamed from: e */
        public static final EnumC10075f f22704e = new EnumC10075f("CONFIG_REQUEST_ERROR", 2, "config_request_error");

        /* renamed from: f */
        public static final EnumC10075f f22705f = new EnumC10075f("INSTALL_REQUEST_ERROR", 3, "install_request_error");

        /* renamed from: g */
        public static final EnumC10075f f22706g = new EnumC10075f("IMPRESSION_RECORDED", 4, "impression_recorded");

        /* renamed from: h */
        public static final EnumC10075f f22707h = new EnumC10075f("UNSUPPORTED_OS_VERSION", 5, "unsupported_os_version");

        /* renamed from: i */
        public static final EnumC10075f f22708i = new EnumC10075f("TOO_MANY_EVENTS", 6, "too_many_events");

        /* renamed from: j */
        public static final /* synthetic */ EnumC10075f[] f22709j;

        /* renamed from: k */
        public static final /* synthetic */ EnumEntries f22710k;

        /* renamed from: b */
        public final String f22711b;

        static {
            EnumC10075f[] m81012a = m81012a();
            f22709j = m81012a;
            f22710k = C44401b.m3113a(m81012a);
        }

        public EnumC10075f(String str, int i, String str2) {
            this.f22711b = str2;
        }

        /* renamed from: a */
        public static final /* synthetic */ EnumC10075f[] m81012a() {
            return new EnumC10075f[]{f22702c, f22703d, f22704e, f22705f, f22706g, f22707h, f22708i};
        }

        /* renamed from: b */
        public static EnumEntries m81011b() {
            return f22710k;
        }

        public static EnumC10075f valueOf(String str) {
            return (EnumC10075f) Enum.valueOf(EnumC10075f.class, str);
        }

        public static EnumC10075f[] values() {
            return (EnumC10075f[]) f22709j.clone();
        }

        @Override // com.chartboost.sdk.impl.InterfaceC10068na
        public String getValue() {
            return this.f22711b;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.chartboost.sdk.impl.na$g */
    /* loaded from: classes3.dex */
    public static final class EnumC10076g implements InterfaceC10068na {

        /* renamed from: c */
        public static final EnumC10076g f22712c = new EnumC10076g("SUCCESS", 0, "navigation_success");

        /* renamed from: d */
        public static final EnumC10076g f22713d = new EnumC10076g("FAILURE", 1, "navigation_failure");

        /* renamed from: e */
        public static final /* synthetic */ EnumC10076g[] f22714e;

        /* renamed from: f */
        public static final /* synthetic */ EnumEntries f22715f;

        /* renamed from: b */
        public final String f22716b;

        static {
            EnumC10076g[] m81010a = m81010a();
            f22714e = m81010a;
            f22715f = C44401b.m3113a(m81010a);
        }

        public EnumC10076g(String str, int i, String str2) {
            this.f22716b = str2;
        }

        /* renamed from: a */
        public static final /* synthetic */ EnumC10076g[] m81010a() {
            return new EnumC10076g[]{f22712c, f22713d};
        }

        /* renamed from: b */
        public static EnumEntries m81009b() {
            return f22715f;
        }

        public static EnumC10076g valueOf(String str) {
            return (EnumC10076g) Enum.valueOf(EnumC10076g.class, str);
        }

        public static EnumC10076g[] values() {
            return (EnumC10076g[]) f22714e.clone();
        }

        @Override // com.chartboost.sdk.impl.InterfaceC10068na
        public String getValue() {
            return this.f22716b;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.chartboost.sdk.impl.na$h */
    /* loaded from: classes3.dex */
    public static final class EnumC10077h implements InterfaceC10068na {

        /* renamed from: c */
        public static final EnumC10077h f22717c = new EnumC10077h("REQUEST_JSON_SERIALIZATION_ERROR", 0, "request_json_serialization_error");

        /* renamed from: d */
        public static final EnumC10077h f22718d = new EnumC10077h("RESPONSE_JSON_SERIALIZATION_ERROR", 1, "response_json_serialization_error");

        /* renamed from: e */
        public static final EnumC10077h f22719e = new EnumC10077h("RESPONSE_DATA_WRITE_ERROR", 2, "response_data_write_error");

        /* renamed from: f */
        public static final EnumC10077h f22720f = new EnumC10077h("DISPATCHER_EXCEPTION", 3, "network_failure_dispatcher_exception");

        /* renamed from: g */
        public static final /* synthetic */ EnumC10077h[] f22721g;

        /* renamed from: h */
        public static final /* synthetic */ EnumEntries f22722h;

        /* renamed from: b */
        public final String f22723b;

        static {
            EnumC10077h[] m81008a = m81008a();
            f22721g = m81008a;
            f22722h = C44401b.m3113a(m81008a);
        }

        public EnumC10077h(String str, int i, String str2) {
            this.f22723b = str2;
        }

        /* renamed from: a */
        public static final /* synthetic */ EnumC10077h[] m81008a() {
            return new EnumC10077h[]{f22717c, f22718d, f22719e, f22720f};
        }

        /* renamed from: b */
        public static EnumEntries m81007b() {
            return f22722h;
        }

        public static EnumC10077h valueOf(String str) {
            return (EnumC10077h) Enum.valueOf(EnumC10077h.class, str);
        }

        public static EnumC10077h[] values() {
            return (EnumC10077h[]) f22721g.clone();
        }

        @Override // com.chartboost.sdk.impl.InterfaceC10068na
        public String getValue() {
            return this.f22723b;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.chartboost.sdk.impl.na$i */
    /* loaded from: classes3.dex */
    public static final class EnumC10078i implements InterfaceC10068na {

        /* renamed from: c */
        public static final EnumC10078i f22724c = new EnumC10078i("START", 0, "show_start");

        /* renamed from: d */
        public static final EnumC10078i f22725d = new EnumC10078i("FINISH_SUCCESS", 1, "show_finish_success");

        /* renamed from: e */
        public static final EnumC10078i f22726e = new EnumC10078i("FINISH_FAILURE", 2, "show_finish_failure");

        /* renamed from: f */
        public static final EnumC10078i f22727f = new EnumC10078i("UNAVAILABLE_ASSET_ERROR", 3, "show_unavailable_asset_error");

        /* renamed from: g */
        public static final EnumC10078i f22728g = new EnumC10078i("TIMEOUT_EVENT", 4, "show_timeout_error");

        /* renamed from: h */
        public static final EnumC10078i f22729h = new EnumC10078i("HTML_MISSING_MUSTACHE_ERROR", 5, "show_html_missing_mustache_error");

        /* renamed from: i */
        public static final EnumC10078i f22730i = new EnumC10078i("WEBVIEW_SSL_ERROR", 6, "show_webview_ssl_error");

        /* renamed from: j */
        public static final EnumC10078i f22731j = new EnumC10078i("WEBVIEW_ERROR", 7, "show_webview_error");

        /* renamed from: k */
        public static final EnumC10078i f22732k = new EnumC10078i("WEBVIEW_CRASH", 8, "show_webview_crash");

        /* renamed from: l */
        public static final EnumC10078i f22733l = new EnumC10078i("UNEXPECTED_DISMISS_ERROR", 9, "show_unexpected_dismiss_error");

        /* renamed from: m */
        public static final EnumC10078i f22734m = new EnumC10078i("REQUEST_ERROR", 10, "show_request_error");

        /* renamed from: n */
        public static final EnumC10078i f22735n = new EnumC10078i("CLOSE_BEFORE_TEMPLATE_SHOW_ERROR", 11, "show_close_before_template_show_error");

        /* renamed from: o */
        public static final EnumC10078i f22736o = new EnumC10078i("DISMISS_MISSING", 12, "dismiss_missing");

        /* renamed from: p */
        public static final /* synthetic */ EnumC10078i[] f22737p;

        /* renamed from: q */
        public static final /* synthetic */ EnumEntries f22738q;

        /* renamed from: b */
        public final String f22739b;

        static {
            EnumC10078i[] m81006a = m81006a();
            f22737p = m81006a;
            f22738q = C44401b.m3113a(m81006a);
        }

        public EnumC10078i(String str, int i, String str2) {
            this.f22739b = str2;
        }

        /* renamed from: a */
        public static final /* synthetic */ EnumC10078i[] m81006a() {
            return new EnumC10078i[]{f22724c, f22725d, f22726e, f22727f, f22728g, f22729h, f22730i, f22731j, f22732k, f22733l, f22734m, f22735n, f22736o};
        }

        /* renamed from: b */
        public static EnumEntries m81005b() {
            return f22738q;
        }

        public static EnumC10078i valueOf(String str) {
            return (EnumC10078i) Enum.valueOf(EnumC10078i.class, str);
        }

        public static EnumC10078i[] values() {
            return (EnumC10078i[]) f22737p.clone();
        }

        @Override // com.chartboost.sdk.impl.InterfaceC10068na
        public String getValue() {
            return this.f22739b;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.chartboost.sdk.impl.na$j */
    /* loaded from: classes3.dex */
    public static final class EnumC10079j implements InterfaceC10068na {

        /* renamed from: c */
        public static final EnumC10079j f22740c = new EnumC10079j("FINISH_SUCCESS", 0, "video_finish_success");

        /* renamed from: d */
        public static final EnumC10079j f22741d = new EnumC10079j("FINISH_FAILURE", 1, "video_finish_failure");

        /* renamed from: e */
        public static final /* synthetic */ EnumC10079j[] f22742e;

        /* renamed from: f */
        public static final /* synthetic */ EnumEntries f22743f;

        /* renamed from: b */
        public final String f22744b;

        static {
            EnumC10079j[] m81004a = m81004a();
            f22742e = m81004a;
            f22743f = C44401b.m3113a(m81004a);
        }

        public EnumC10079j(String str, int i, String str2) {
            this.f22744b = str2;
        }

        /* renamed from: a */
        public static final /* synthetic */ EnumC10079j[] m81004a() {
            return new EnumC10079j[]{f22740c, f22741d};
        }

        /* renamed from: b */
        public static EnumEntries m81003b() {
            return f22743f;
        }

        public static EnumC10079j valueOf(String str) {
            return (EnumC10079j) Enum.valueOf(EnumC10079j.class, str);
        }

        public static EnumC10079j[] values() {
            return (EnumC10079j[]) f22742e.clone();
        }

        @Override // com.chartboost.sdk.impl.InterfaceC10068na
        public String getValue() {
            return this.f22744b;
        }
    }

    String getValue();

    /* renamed from: com.chartboost.sdk.impl.na$c */
    /* loaded from: classes3.dex */
    public static final class C10071c {

        /* renamed from: a */
        public static final /* synthetic */ C10071c f22687a = new C10071c();

        /* renamed from: b */
        public static final InterfaceC38501j f22688b;

        /* renamed from: com.chartboost.sdk.impl.na$c$a */
        /* loaded from: classes3.dex */
        public static final class C10072a extends Lambda implements Functions {

            /* renamed from: b */
            public static final C10072a f22689b = new C10072a();

            public C10072a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Functions
            /* renamed from: a */
            public final List invoke() {
                List m17414e;
                m17414e = Arrays.m17414e(new Object[][]{EnumC10069a.m81021b().toArray(new EnumC10069a[0]), EnumC10078i.m81005b().toArray(new EnumC10078i[0]), EnumC10070b.m81019b().toArray(new EnumC10070b[0]), EnumC10073d.m81014b().toArray(new EnumC10073d[0]), EnumC10076g.m81009b().toArray(new EnumC10076g[0]), EnumC10077h.m81007b().toArray(new EnumC10077h[0]), EnumC10079j.m81003b().toArray(new EnumC10079j[0]), EnumC10075f.m81011b().toArray(new EnumC10075f[0])});
                return m17414e;
            }
        }

        static {
            InterfaceC38501j m14554a;
            m14554a = LazyJVM.m14554a(C10072a.f22689b);
            f22688b = m14554a;
        }

        /* renamed from: a */
        public final List m81017a(List values) {
            Intrinsics.checkNotNullParameter(values, "values");
            List m81018a = m81018a();
            ArrayList arrayList = new ArrayList();
            for (Object obj : m81018a) {
                if (values.contains(((InterfaceC10068na) obj).getValue())) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }

        /* renamed from: a */
        public final List m81018a() {
            return (List) f22688b.getValue();
        }
    }
}
