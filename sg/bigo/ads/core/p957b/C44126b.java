package sg.bigo.ads.core.p957b;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.bigosg.adsession.AdEvents;
import com.iab.omid.library.bigosg.adsession.AdSession;
import com.iab.omid.library.bigosg.adsession.media.InteractionType;
import com.iab.omid.library.bigosg.adsession.media.MediaEvents;
import com.iab.omid.library.bigosg.adsession.media.Position;
import com.iab.omid.library.bigosg.adsession.media.VastProperties;
import com.ironsource.C21114v8;
import com.pubmatic.sdk.omsdk.POBOMSDKUtil;
import sg.bigo.ads.common.p932t.C43782a;

/* renamed from: sg.bigo.ads.core.b.b */
/* loaded from: classes10.dex */
public final class C44126b {

    /* renamed from: a */
    public MediaEvents f115804a;

    /* renamed from: b */
    public boolean f115805b = false;
    @NonNull

    /* renamed from: c */
    private final AdSession f115806c;
    @NonNull

    /* renamed from: d */
    private final AdEvents f115807d;

    /* renamed from: sg.bigo.ads.core.b.b$1 */
    /* loaded from: classes10.dex */
    static /* synthetic */ class C441271 {

        /* renamed from: a */
        static final /* synthetic */ int[] f115808a;

        /* renamed from: b */
        static final /* synthetic */ int[] f115809b;

        static {
            int[] iArr = new int[EnumC44128a.m3924a().length];
            f115809b = iArr;
            try {
                iArr[EnumC44128a.f115810a - 1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f115809b[EnumC44128a.f115811b - 1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f115809b[EnumC44128a.f115812c - 1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f115809b[EnumC44128a.f115813d - 1] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f115809b[EnumC44128a.f115814e - 1] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[EnumC44129b.m3923a().length];
            f115808a = iArr2;
            try {
                iArr2[EnumC44129b.f115816a - 1] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f115808a[EnumC44129b.f115817b - 1] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f115808a[EnumC44129b.f115818c - 1] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f115808a[EnumC44129b.f115819d - 1] = 4;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* renamed from: sg.bigo.ads.core.b.b$a */
    /* loaded from: classes10.dex */
    public static final class EnumC44128a {

        /* renamed from: a */
        public static final int f115810a = 1;

        /* renamed from: b */
        public static final int f115811b = 2;

        /* renamed from: c */
        public static final int f115812c = 3;

        /* renamed from: d */
        public static final int f115813d = 4;

        /* renamed from: e */
        public static final int f115814e = 5;

        /* renamed from: f */
        private static final /* synthetic */ int[] f115815f = {1, 2, 3, 4, 5};

        /* renamed from: a */
        public static int[] m3924a() {
            return (int[]) f115815f.clone();
        }
    }

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* renamed from: sg.bigo.ads.core.b.b$b */
    /* loaded from: classes10.dex */
    public static final class EnumC44129b {

        /* renamed from: a */
        public static final int f115816a = 1;

        /* renamed from: b */
        public static final int f115817b = 2;

        /* renamed from: c */
        public static final int f115818c = 3;

        /* renamed from: d */
        public static final int f115819d = 4;

        /* renamed from: e */
        private static final /* synthetic */ int[] f115820e = {1, 2, 3, 4};

        /* renamed from: a */
        public static int[] m3923a() {
            return (int[]) f115820e.clone();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C44126b(@NonNull AdSession adSession, @Nullable MediaEvents mediaEvents) {
        this.f115806c = adSession;
        this.f115804a = mediaEvents;
        AdEvents createAdEvents = AdEvents.createAdEvents(adSession);
        this.f115807d = createAdEvents;
        if (this.f115804a != null) {
            try {
                createAdEvents.loaded(VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE));
                m3927a(C21114v8.C21122h.f54087r);
                return;
            } catch (Exception unused) {
                return;
            }
        }
        try {
            createAdEvents.loaded();
            m3927a(C21114v8.C21122h.f54087r);
        } catch (Exception unused2) {
        }
    }

    /* renamed from: a */
    public final void m3930a() {
        try {
            this.f115807d.impressionOccurred();
            m3927a("impression");
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    public final void m3926b() {
        this.f115806c.finish();
        this.f115804a = null;
    }

    /* renamed from: a */
    public final void m3929a(int i) {
        String str;
        MediaEvents mediaEvents = this.f115804a;
        if (mediaEvents == null) {
            return;
        }
        int i2 = C441271.f115808a[i - 1];
        if (i2 == 1) {
            mediaEvents.firstQuartile();
            str = "video first quartile";
        } else if (i2 == 2) {
            mediaEvents.midpoint();
            str = "video mid point";
        } else if (i2 != 3) {
            if (i2 != 4) {
                return;
            }
            mediaEvents.complete();
            m3927a("video complete");
            return;
        } else {
            mediaEvents.thirdQuartile();
            str = "video third quartile";
        }
        m3927a(str);
    }

    /* renamed from: b */
    public final void m3925b(int i) {
        String str;
        MediaEvents mediaEvents = this.f115804a;
        if (mediaEvents == null) {
            return;
        }
        int i2 = C441271.f115809b[i - 1];
        if (i2 == 1) {
            mediaEvents.pause();
            str = "video pause";
        } else if (i2 == 2) {
            mediaEvents.resume();
            str = "video resume";
        } else if (i2 == 3) {
            mediaEvents.bufferStart();
            str = "video buffer start";
        } else if (i2 != 4) {
            if (i2 != 5) {
                return;
            }
            mediaEvents.skipped();
            m3927a("video skipped");
            return;
        } else {
            mediaEvents.bufferFinish();
            str = "video buffer finish";
        }
        m3927a(str);
    }

    /* renamed from: a */
    public final void m3928a(InteractionType interactionType) {
        MediaEvents mediaEvents = this.f115804a;
        if (mediaEvents == null) {
            return;
        }
        mediaEvents.adUserInteraction(interactionType);
        m3927a("ad user interaction: " + interactionType.toString());
    }

    /* renamed from: a */
    public final void m3927a(String str) {
        C43782a.m5010a(0, 3, POBOMSDKUtil.TAG, "Event: " + str + " (" + this.f115806c.getAdSessionId() + ")");
    }
}
