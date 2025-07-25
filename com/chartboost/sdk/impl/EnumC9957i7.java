package com.chartboost.sdk.impl;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.C37566w;
import kotlin.collections.MapsJVM;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges._Ranges;
import net.pubnative.lite.sdk.analytics.Reporting;
import td.C44401b;
import td.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.chartboost.sdk.impl.i7 */
/* loaded from: classes3.dex */
public final class EnumC9957i7 {

    /* renamed from: S */
    public static final /* synthetic */ EnumC9957i7[] f22324S;

    /* renamed from: T */
    public static final /* synthetic */ EnumEntries f22325T;

    /* renamed from: c */
    public static final C9958a f22326c;

    /* renamed from: d */
    public static final Map f22327d;

    /* renamed from: b */
    public final String f22350b;

    /* renamed from: e */
    public static final EnumC9957i7 f22328e = new EnumC9957i7("GET_PARAMETERS", 0, "getParameters");

    /* renamed from: f */
    public static final EnumC9957i7 f22329f = new EnumC9957i7("GET_MAX_SIZE", 1, "getMaxSize");

    /* renamed from: g */
    public static final EnumC9957i7 f22330g = new EnumC9957i7("GET_SCREEN_SIZE", 2, "getScreenSize");

    /* renamed from: h */
    public static final EnumC9957i7 f22331h = new EnumC9957i7("GET_CURRENT_POSITION", 3, "getCurrentPosition");

    /* renamed from: i */
    public static final EnumC9957i7 f22332i = new EnumC9957i7("GET_DEFAULT_POSITION", 4, "getDefaultPosition");

    /* renamed from: j */
    public static final EnumC9957i7 f22333j = new EnumC9957i7("GET_ORIENTATION_PROPERTIES", 5, "getOrientationProperties");

    /* renamed from: k */
    public static final EnumC9957i7 f22334k = new EnumC9957i7("CLICK", 6, "click");

    /* renamed from: l */
    public static final EnumC9957i7 f22335l = new EnumC9957i7("CLOSE", 7, "close");

    /* renamed from: m */
    public static final EnumC9957i7 f22336m = new EnumC9957i7("SKIPPED", 8, "skipped");

    /* renamed from: n */
    public static final EnumC9957i7 f22337n = new EnumC9957i7("VIDEO_COMPLETED", 9, "videoCompleted");

    /* renamed from: o */
    public static final EnumC9957i7 f22338o = new EnumC9957i7("VIDEO_RESUMED", 10, "videoResumed");

    /* renamed from: p */
    public static final EnumC9957i7 f22339p = new EnumC9957i7("VIDEO_PAUSED", 11, "videoPaused");

    /* renamed from: q */
    public static final EnumC9957i7 f22340q = new EnumC9957i7("VIDEO_REPLAY", 12, "videoReplay");

    /* renamed from: r */
    public static final EnumC9957i7 f22341r = new EnumC9957i7("CURRENT_VIDEO_DURATION", 13, "currentVideoDuration");

    /* renamed from: s */
    public static final EnumC9957i7 f22342s = new EnumC9957i7("TOTAL_VIDEO_DURATION", 14, "totalVideoDuration");

    /* renamed from: t */
    public static final EnumC9957i7 f22343t = new EnumC9957i7("SHOW", 15, "show");

    /* renamed from: u */
    public static final EnumC9957i7 f22344u = new EnumC9957i7("ERROR", 16, "error");

    /* renamed from: v */
    public static final EnumC9957i7 f22345v = new EnumC9957i7("WARNING", 17, "warning");

    /* renamed from: w */
    public static final EnumC9957i7 f22346w = new EnumC9957i7("DEBUG", 18, "debug");

    /* renamed from: x */
    public static final EnumC9957i7 f22347x = new EnumC9957i7("TRACKING", 19, "tracking");

    /* renamed from: y */
    public static final EnumC9957i7 f22348y = new EnumC9957i7("OPEN_URL", 20, "openUrl");

    /* renamed from: z */
    public static final EnumC9957i7 f22349z = new EnumC9957i7("SET_ORIENTATION_PROPERTIES", 21, "setOrientationProperties");

    /* renamed from: A */
    public static final EnumC9957i7 f22306A = new EnumC9957i7("REWARD", 22, Reporting.EventType.REWARD);

    /* renamed from: B */
    public static final EnumC9957i7 f22307B = new EnumC9957i7("REWARDED_VIDEO_COMPLETED", 23, "rewardedVideoCompleted");

    /* renamed from: C */
    public static final EnumC9957i7 f22308C = new EnumC9957i7("PLAY_VIDEO", 24, "playVideo");

    /* renamed from: D */
    public static final EnumC9957i7 f22309D = new EnumC9957i7("PAUSE_VIDEO", 25, "pauseVideo");

    /* renamed from: E */
    public static final EnumC9957i7 f22310E = new EnumC9957i7("CLOSE_VIDEO", 26, "closeVideo");

    /* renamed from: F */
    public static final EnumC9957i7 f22311F = new EnumC9957i7("MUTE_VIDEO", 27, "mute");

    /* renamed from: G */
    public static final EnumC9957i7 f22312G = new EnumC9957i7("UNMUTE_VIDEO", 28, "unmute");

    /* renamed from: H */
    public static final EnumC9957i7 f22313H = new EnumC9957i7("OM_MEASUREMENT_RESOURCES", 29, "OMMeasurementResources");

    /* renamed from: I */
    public static final EnumC9957i7 f22314I = new EnumC9957i7("START", 30, "start");

    /* renamed from: J */
    public static final EnumC9957i7 f22315J = new EnumC9957i7("BUFFER_START", 31, "bufferStart");

    /* renamed from: K */
    public static final EnumC9957i7 f22316K = new EnumC9957i7("BUFFER_END", 32, "bufferEnd");

    /* renamed from: L */
    public static final EnumC9957i7 f22317L = new EnumC9957i7("VIDEO_FINISHED", 33, "videoFinished");

    /* renamed from: M */
    public static final EnumC9957i7 f22318M = new EnumC9957i7("VIDEO_STARTED", 34, "videoStarted");

    /* renamed from: N */
    public static final EnumC9957i7 f22319N = new EnumC9957i7("VIDEO_ENDED", 35, "videoEnded");

    /* renamed from: O */
    public static final EnumC9957i7 f22320O = new EnumC9957i7("VIDEO_FAILED", 36, "videoFailed");

    /* renamed from: P */
    public static final EnumC9957i7 f22321P = new EnumC9957i7("PLAYBACK_TIME", 37, "playbackTime");

    /* renamed from: Q */
    public static final EnumC9957i7 f22322Q = new EnumC9957i7("ON_BACKGROUND", 38, "onBackground");

    /* renamed from: R */
    public static final EnumC9957i7 f22323R = new EnumC9957i7("ON_FOREGROUND", 39, "onForeground");

    /* renamed from: com.chartboost.sdk.impl.i7$a */
    /* loaded from: classes3.dex */
    public static final class C9958a {
        public C9958a() {
        }

        /* renamed from: a */
        public final EnumC9957i7 m81389a(String cmdName) {
            Intrinsics.checkNotNullParameter(cmdName, "cmdName");
            return (EnumC9957i7) EnumC9957i7.f22327d.get(cmdName);
        }

        public /* synthetic */ C9958a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        int m17154x;
        int m17292f;
        int m16917e;
        EnumC9957i7[] m81393a = m81393a();
        f22324S = m81393a;
        f22325T = C44401b.m3113a(m81393a);
        f22326c = new C9958a(null);
        EnumEntries m81390d = m81390d();
        m17154x = C37566w.m17154x(m81390d, 10);
        m17292f = MapsJVM.m17292f(m17154x);
        m16917e = _Ranges.m16917e(m17292f, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(m16917e);
        for (Object obj : m81390d) {
            linkedHashMap.put(((EnumC9957i7) obj).f22350b, obj);
        }
        f22327d = linkedHashMap;
    }

    public EnumC9957i7(String str, int i, String str2) {
        this.f22350b = str2;
    }

    /* renamed from: a */
    public static final /* synthetic */ EnumC9957i7[] m81393a() {
        return new EnumC9957i7[]{f22328e, f22329f, f22330g, f22331h, f22332i, f22333j, f22334k, f22335l, f22336m, f22337n, f22338o, f22339p, f22340q, f22341r, f22342s, f22343t, f22344u, f22345v, f22346w, f22347x, f22348y, f22349z, f22306A, f22307B, f22308C, f22309D, f22310E, f22311F, f22312G, f22313H, f22314I, f22315J, f22316K, f22317L, f22318M, f22319N, f22320O, f22321P, f22322Q, f22323R};
    }

    /* renamed from: d */
    public static EnumEntries m81390d() {
        return f22325T;
    }

    public static EnumC9957i7 valueOf(String str) {
        return (EnumC9957i7) Enum.valueOf(EnumC9957i7.class, str);
    }

    public static EnumC9957i7[] values() {
        return (EnumC9957i7[]) f22324S.clone();
    }

    /* renamed from: c */
    public final String m81391c() {
        return this.f22350b;
    }
}
