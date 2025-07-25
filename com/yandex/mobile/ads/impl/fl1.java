package com.yandex.mobile.ads.impl;

import com.amazon.p047a.p048a.p062j.KiwiRequestContext;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import java.util.Map;
import kotlin.collections.C37554o0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C37686h;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import td.C44401b;

/* loaded from: classes8.dex */
public final class fl1 {
    @NotNull

    /* renamed from: a */
    private final String f79109a;
    @NotNull

    /* renamed from: b */
    private final Map<String, Object> f79110b;
    @Nullable

    /* renamed from: c */
    private final C30280f f79111c;

    /* renamed from: com.yandex.mobile.ads.impl.fl1$a */
    /* loaded from: classes8.dex */
    public static final class C30323a {
        @NotNull

        /* renamed from: a */
        public static final String f79112a = C37686h.m16665q("yandex");
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.yandex.mobile.ads.impl.fl1$b */
    /* loaded from: classes8.dex */
    public static final class EnumC30324b {

        /* renamed from: A */
        public static final EnumC30324b f79113A;

        /* renamed from: B */
        public static final EnumC30324b f79114B;

        /* renamed from: C */
        public static final EnumC30324b f79115C;

        /* renamed from: D */
        public static final EnumC30324b f79116D;

        /* renamed from: E */
        public static final EnumC30324b f79117E;

        /* renamed from: F */
        public static final EnumC30324b f79118F;

        /* renamed from: G */
        public static final EnumC30324b f79119G;

        /* renamed from: H */
        public static final EnumC30324b f79120H;

        /* renamed from: I */
        public static final EnumC30324b f79121I;

        /* renamed from: J */
        public static final EnumC30324b f79122J;

        /* renamed from: K */
        public static final EnumC30324b f79123K;

        /* renamed from: L */
        public static final EnumC30324b f79124L;

        /* renamed from: M */
        public static final EnumC30324b f79125M;

        /* renamed from: N */
        public static final EnumC30324b f79126N;

        /* renamed from: O */
        public static final EnumC30324b f79127O;

        /* renamed from: P */
        public static final EnumC30324b f79128P;

        /* renamed from: Q */
        public static final EnumC30324b f79129Q;

        /* renamed from: R */
        public static final EnumC30324b f79130R;

        /* renamed from: S */
        public static final EnumC30324b f79131S;

        /* renamed from: T */
        public static final EnumC30324b f79132T;

        /* renamed from: U */
        public static final EnumC30324b f79133U;

        /* renamed from: V */
        public static final EnumC30324b f79134V;

        /* renamed from: W */
        public static final EnumC30324b f79135W;

        /* renamed from: X */
        public static final EnumC30324b f79136X;

        /* renamed from: Y */
        public static final EnumC30324b f79137Y;

        /* renamed from: Z */
        private static final /* synthetic */ EnumC30324b[] f79138Z;

        /* renamed from: c */
        public static final EnumC30324b f79139c;

        /* renamed from: d */
        public static final EnumC30324b f79140d;

        /* renamed from: e */
        public static final EnumC30324b f79141e;

        /* renamed from: f */
        public static final EnumC30324b f79142f;

        /* renamed from: g */
        public static final EnumC30324b f79143g;

        /* renamed from: h */
        public static final EnumC30324b f79144h;

        /* renamed from: i */
        public static final EnumC30324b f79145i;

        /* renamed from: j */
        public static final EnumC30324b f79146j;

        /* renamed from: k */
        public static final EnumC30324b f79147k;

        /* renamed from: l */
        public static final EnumC30324b f79148l;

        /* renamed from: m */
        public static final EnumC30324b f79149m;

        /* renamed from: n */
        public static final EnumC30324b f79150n;

        /* renamed from: o */
        public static final EnumC30324b f79151o;

        /* renamed from: p */
        public static final EnumC30324b f79152p;

        /* renamed from: q */
        public static final EnumC30324b f79153q;

        /* renamed from: r */
        public static final EnumC30324b f79154r;

        /* renamed from: s */
        public static final EnumC30324b f79155s;

        /* renamed from: t */
        public static final EnumC30324b f79156t;

        /* renamed from: u */
        public static final EnumC30324b f79157u;

        /* renamed from: v */
        public static final EnumC30324b f79158v;

        /* renamed from: w */
        public static final EnumC30324b f79159w;

        /* renamed from: x */
        public static final EnumC30324b f79160x;

        /* renamed from: y */
        public static final EnumC30324b f79161y;

        /* renamed from: z */
        public static final EnumC30324b f79162z;
        @NotNull

        /* renamed from: b */
        private final String f79163b;

        static {
            EnumC30324b enumC30324b = new EnumC30324b(0, "AD_LOADING_RESULT", "ad_loading_result");
            f79139c = enumC30324b;
            EnumC30324b enumC30324b2 = new EnumC30324b(1, "AD_RENDERING_RESULT", "ad_rendering_result");
            f79140d = enumC30324b2;
            EnumC30324b enumC30324b3 = new EnumC30324b(2, "ADAPTER_AUTO_REFRESH", "adapter_auto_refresh");
            f79141e = enumC30324b3;
            EnumC30324b enumC30324b4 = new EnumC30324b(3, "ADAPTER_INVALID", "adapter_invalid");
            f79142f = enumC30324b4;
            EnumC30324b enumC30324b5 = new EnumC30324b(4, "ADAPTER_REQUEST", "adapter_request");
            f79143g = enumC30324b5;
            EnumC30324b enumC30324b6 = new EnumC30324b(5, "ADAPTER_RESPONSE", "adapter_response");
            f79144h = enumC30324b6;
            EnumC30324b enumC30324b7 = new EnumC30324b(6, "ADAPTER_BIDDER_TOKEN_REQUEST", "adapter_bidder_token_request");
            f79145i = enumC30324b7;
            EnumC30324b enumC30324b8 = new EnumC30324b(7, "ADTUNE", "adtune");
            f79146j = enumC30324b8;
            EnumC30324b enumC30324b9 = new EnumC30324b(8, "REQUEST", Reporting.Key.AD_REQUEST);
            f79147k = enumC30324b9;
            EnumC30324b enumC30324b10 = new EnumC30324b(9, KiwiRequestContext.f2486a, Reporting.Key.AD_RESPONSE);
            f79148l = enumC30324b10;
            EnumC30324b enumC30324b11 = new EnumC30324b(10, "VAST_REQUEST", "vast_request");
            f79149m = enumC30324b11;
            EnumC30324b enumC30324b12 = new EnumC30324b(11, "VAST_RESPONSE", "vast_response");
            f79150n = enumC30324b12;
            EnumC30324b enumC30324b13 = new EnumC30324b(12, "VAST_WRAPPER_REQUEST", "vast_wrapper_request");
            f79151o = enumC30324b13;
            EnumC30324b enumC30324b14 = new EnumC30324b(13, "VAST_WRAPPER_RESPONSE", "vast_wrapper_response");
            f79152p = enumC30324b14;
            EnumC30324b enumC30324b15 = new EnumC30324b(14, "VIDEO_AD_START", "video_ad_start");
            f79153q = enumC30324b15;
            EnumC30324b enumC30324b16 = new EnumC30324b(15, "VIDEO_AD_COMPLETE", "video_ad_complete");
            f79154r = enumC30324b16;
            EnumC30324b enumC30324b17 = new EnumC30324b(16, "VIDEO_AD_PLAYER_ERROR", "video_ad_player_error");
            f79155s = enumC30324b17;
            EnumC30324b enumC30324b18 = new EnumC30324b(17, "VMAP_REQUEST", "vmap_request");
            f79156t = enumC30324b18;
            EnumC30324b enumC30324b19 = new EnumC30324b(18, "VMAP_RESPONSE", "vmap_response");
            f79157u = enumC30324b19;
            EnumC30324b enumC30324b20 = new EnumC30324b(19, "RENDERING_START", "rendering_start");
            f79158v = enumC30324b20;
            EnumC30324b enumC30324b21 = new EnumC30324b(20, "DSP_RENDERING_START", "dsp_rendering_start");
            f79159w = enumC30324b21;
            EnumC30324b enumC30324b22 = new EnumC30324b(21, "IMPRESSION_TRACKING_START", "impression_tracking_start");
            f79160x = enumC30324b22;
            EnumC30324b enumC30324b23 = new EnumC30324b(22, "IMPRESSION_TRACKING_SUCCESS", "impression_tracking_success");
            f79161y = enumC30324b23;
            EnumC30324b enumC30324b24 = new EnumC30324b(23, "IMPRESSION_TRACKING_FAILURE", "impression_tracking_failure");
            f79162z = enumC30324b24;
            EnumC30324b enumC30324b25 = new EnumC30324b(24, "FORCED_IMPRESSION_TRACKING_FAILURE", "forced_impression_tracking_failure");
            f79113A = enumC30324b25;
            EnumC30324b enumC30324b26 = new EnumC30324b(25, "ADAPTER_ACTION", "adapter_action");
            f79114B = enumC30324b26;
            EnumC30324b enumC30324b27 = new EnumC30324b(26, "CLICK", "click");
            f79115C = enumC30324b27;
            EnumC30324b enumC30324b28 = new EnumC30324b(27, "CLOSE", "close");
            f79116D = enumC30324b28;
            EnumC30324b enumC30324b29 = new EnumC30324b(28, "FEEDBACK", "feedback");
            f79117E = enumC30324b29;
            EnumC30324b enumC30324b30 = new EnumC30324b(29, "DEEPLINK", SDKConstants.PARAM_TOURNAMENTS_DEEPLINK);
            f79118F = enumC30324b30;
            EnumC30324b enumC30324b31 = new EnumC30324b(30, "SHOW_SOCIAL_ACTIONS", "show_social_actions");
            f79119G = enumC30324b31;
            EnumC30324b enumC30324b32 = new EnumC30324b(31, "BOUND_ASSETS", "bound_assets");
            f79120H = enumC30324b32;
            EnumC30324b enumC30324b33 = new EnumC30324b(32, "RENDERED_ASSETS", "rendered_assets");
            f79121I = enumC30324b33;
            EnumC30324b enumC30324b34 = new EnumC30324b(33, "REBIND", "rebind");
            f79122J = enumC30324b34;
            EnumC30324b enumC30324b35 = new EnumC30324b(34, "BINDING_FAILURE", "binding_failure");
            f79123K = enumC30324b35;
            EnumC30324b enumC30324b36 = new EnumC30324b(35, "EXPECTED_VIEW_MISSING", "expected_view_missing");
            f79124L = enumC30324b36;
            EnumC30324b enumC30324b37 = new EnumC30324b(36, "RETURNED_TO_APP", "returned_to_app");
            f79125M = enumC30324b37;
            EnumC30324b enumC30324b38 = new EnumC30324b(37, "REWARD", Reporting.EventType.REWARD);
            f79126N = enumC30324b38;
            EnumC30324b enumC30324b39 = new EnumC30324b(38, "VIDEO_AD_RENDERING_RESULT", "video_ad_rendering_result");
            f79127O = enumC30324b39;
            EnumC30324b enumC30324b40 = new EnumC30324b(39, "MULTIBANNER_EVENT", "multibanner_event");
            f79128P = enumC30324b40;
            EnumC30324b enumC30324b41 = new EnumC30324b(40, "AD_VIEW_SIZE_INFO", "ad_view_size_info");
            f79129Q = enumC30324b41;
            EnumC30324b enumC30324b42 = new EnumC30324b(41, "DSP_IMPRESSION_TRACKING_START", "dsp_impression_tracking_start");
            f79130R = enumC30324b42;
            EnumC30324b enumC30324b43 = new EnumC30324b(42, "DSP_IMPRESSION_TRACKING_SUCCESS", "dsp_impression_tracking_success");
            f79131S = enumC30324b43;
            EnumC30324b enumC30324b44 = new EnumC30324b(43, "DSP_IMPRESSION_TRACKING_FAILURE", "dsp_impression_tracking_failure");
            f79132T = enumC30324b44;
            EnumC30324b enumC30324b45 = new EnumC30324b(44, "DSP_FORCED_IMPRESSION_TRACKING_FAILURE", "dsp_forced_impression_tracking_failure");
            f79133U = enumC30324b45;
            EnumC30324b enumC30324b46 = new EnumC30324b(45, "LOG", "log");
            f79134V = enumC30324b46;
            EnumC30324b enumC30324b47 = new EnumC30324b(46, "OPEN_BIDDING_TOKEN_GENERATION_RESULT", "open_bidding_token_generation_result");
            f79135W = enumC30324b47;
            EnumC30324b enumC30324b48 = new EnumC30324b(47, "SDK_CONFIGURATION_SUCCESS", "sdk_configuration_success");
            f79136X = enumC30324b48;
            EnumC30324b enumC30324b49 = new EnumC30324b(48, "SDK_CONFIGURATION_FAILURE", "sdk_configuration_failure");
            f79137Y = enumC30324b49;
            EnumC30324b[] enumC30324bArr = {enumC30324b, enumC30324b2, enumC30324b3, enumC30324b4, enumC30324b5, enumC30324b6, enumC30324b7, enumC30324b8, enumC30324b9, enumC30324b10, enumC30324b11, enumC30324b12, enumC30324b13, enumC30324b14, enumC30324b15, enumC30324b16, enumC30324b17, enumC30324b18, enumC30324b19, enumC30324b20, enumC30324b21, enumC30324b22, enumC30324b23, enumC30324b24, enumC30324b25, enumC30324b26, enumC30324b27, enumC30324b28, enumC30324b29, enumC30324b30, enumC30324b31, enumC30324b32, enumC30324b33, enumC30324b34, enumC30324b35, enumC30324b36, enumC30324b37, enumC30324b38, enumC30324b39, enumC30324b40, enumC30324b41, enumC30324b42, enumC30324b43, enumC30324b44, enumC30324b45, enumC30324b46, enumC30324b47, enumC30324b48, enumC30324b49};
            f79138Z = enumC30324bArr;
            C44401b.m3113a(enumC30324bArr);
        }

        private EnumC30324b(int i, String str, String str2) {
            this.f79163b = str2;
        }

        public static EnumC30324b valueOf(String str) {
            return (EnumC30324b) Enum.valueOf(EnumC30324b.class, str);
        }

        public static EnumC30324b[] values() {
            return (EnumC30324b[]) f79138Z.clone();
        }

        @NotNull
        /* renamed from: a */
        public final String m34119a() {
            return this.f79163b;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.yandex.mobile.ads.impl.fl1$c */
    /* loaded from: classes8.dex */
    public static final class EnumC30325c {

        /* renamed from: c */
        public static final EnumC30325c f79164c;

        /* renamed from: d */
        public static final EnumC30325c f79165d;

        /* renamed from: e */
        public static final EnumC30325c f79166e;

        /* renamed from: f */
        private static final /* synthetic */ EnumC30325c[] f79167f;
        @NotNull

        /* renamed from: b */
        private final String f79168b;

        static {
            EnumC30325c enumC30325c = new EnumC30325c(0, "SUCCESS", "success");
            f79164c = enumC30325c;
            EnumC30325c enumC30325c2 = new EnumC30325c(1, "ERROR", "error");
            f79165d = enumC30325c2;
            EnumC30325c enumC30325c3 = new EnumC30325c(2, "NO_ADS", "no_ads");
            f79166e = enumC30325c3;
            EnumC30325c[] enumC30325cArr = {enumC30325c, enumC30325c2, enumC30325c3, new EnumC30325c(3, "FILTERED", "filtered")};
            f79167f = enumC30325cArr;
            C44401b.m3113a(enumC30325cArr);
        }

        private EnumC30325c(int i, String str, String str2) {
            this.f79168b = str2;
        }

        public static EnumC30325c valueOf(String str) {
            return (EnumC30325c) Enum.valueOf(EnumC30325c.class, str);
        }

        public static EnumC30325c[] values() {
            return (EnumC30325c[]) f79167f.clone();
        }

        @NotNull
        /* renamed from: a */
        public final String m34118a() {
            return this.f79168b;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public fl1(@NotNull EnumC30324b reportType, @NotNull Map<String, ? extends Object> reportData, @Nullable C30280f c30280f) {
        this(reportType.m34119a(), C37554o0.m17377D(reportData), c30280f);
        Intrinsics.checkNotNullParameter(reportType, "reportType");
        Intrinsics.checkNotNullParameter(reportData, "reportData");
    }

    @Nullable
    /* renamed from: a */
    public final C30280f m34122a() {
        return this.f79111c;
    }

    @NotNull
    /* renamed from: b */
    public final Map<String, Object> m34121b() {
        return this.f79110b;
    }

    @NotNull
    /* renamed from: c */
    public final String m34120c() {
        return this.f79109a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fl1)) {
            return false;
        }
        fl1 fl1Var = (fl1) obj;
        if (Intrinsics.m17075f(this.f79109a, fl1Var.f79109a) && Intrinsics.m17075f(this.f79110b, fl1Var.f79110b) && Intrinsics.m17075f(this.f79111c, fl1Var.f79111c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f79110b.hashCode() + (this.f79109a.hashCode() * 31)) * 31;
        C30280f c30280f = this.f79111c;
        if (c30280f == null) {
            hashCode = 0;
        } else {
            hashCode = c30280f.hashCode();
        }
        return hashCode2 + hashCode;
    }

    @NotNull
    public final String toString() {
        String str = this.f79109a;
        Map<String, Object> map = this.f79110b;
        C30280f c30280f = this.f79111c;
        return "Report(eventName=" + str + ", data=" + map + ", abExperiments=" + c30280f + ")";
    }

    public fl1(@NotNull String eventName, @NotNull Map<String, Object> data, @Nullable C30280f c30280f) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(data, "data");
        this.f79109a = eventName;
        this.f79110b = data;
        this.f79111c = c30280f;
        data.put("sdk_version", "7.9.0");
    }
}
