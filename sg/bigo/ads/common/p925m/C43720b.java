package sg.bigo.ads.common.p925m;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import com.smaato.sdk.core.gdpr.CmpApiConstants;
import sg.bigo.ads.common.p941x.C43906a;
import sg.bigo.ads.common.utils.C43836q;

/* renamed from: sg.bigo.ads.common.m.b */
/* loaded from: classes10.dex */
public final class C43720b {

    /* renamed from: a */
    private static String f114422a = "";

    /* renamed from: b */
    private static int f114423b = 0;

    /* renamed from: c */
    private static String f114424c = "";

    /* renamed from: d */
    private static String f114425d = "";

    /* renamed from: e */
    private static boolean f114426e = true;

    /* renamed from: f */
    private static SharedPreferences.OnSharedPreferenceChangeListener f114427f = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: sg.bigo.ads.common.m.b.1
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x004c, code lost:
            if (r6.equals(com.smaato.sdk.core.gdpr.CmpApiConstants.IABTCF_PURPOSE_CONSENTS) == false) goto L7;
         */
        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void onSharedPreferenceChanged(android.content.SharedPreferences r5, java.lang.String r6) {
            /*
                r4 = this;
                boolean r0 = sg.bigo.ads.common.utils.C43836q.m4837a(r6)
                if (r0 == 0) goto L7
                return
            L7:
                java.lang.String r0 = java.lang.String.valueOf(r6)
                java.lang.String r1 = "Listener SharedPreferenceChanged, key: "
                java.lang.String r0 = r1.concat(r0)
                r1 = 0
                r2 = 3
                java.lang.String r3 = "GdprManager"
                sg.bigo.ads.common.p932t.C43782a.m5010a(r1, r2, r3, r0)
                r6.hashCode()
                int r0 = r6.hashCode()
                r3 = -1
                switch(r0) {
                    case -2004976699: goto L46;
                    case -464306296: goto L3b;
                    case 83641339: goto L30;
                    case 1218895378: goto L25;
                    default: goto L23;
                }
            L23:
                r1 = r3
                goto L4f
            L25:
                java.lang.String r0 = "IABTCF_TCString"
                boolean r6 = r6.equals(r0)
                if (r6 != 0) goto L2e
                goto L23
            L2e:
                r1 = r2
                goto L4f
            L30:
                java.lang.String r0 = "IABTCF_gdprApplies"
                boolean r6 = r6.equals(r0)
                if (r6 != 0) goto L39
                goto L23
            L39:
                r1 = 2
                goto L4f
            L3b:
                java.lang.String r0 = "IABTCF_PurposeLegitimateInterests"
                boolean r6 = r6.equals(r0)
                if (r6 != 0) goto L44
                goto L23
            L44:
                r1 = 1
                goto L4f
            L46:
                java.lang.String r0 = "IABTCF_PurposeConsents"
                boolean r6 = r6.equals(r0)
                if (r6 != 0) goto L4f
                goto L23
            L4f:
                switch(r1) {
                    case 0: goto L65;
                    case 1: goto L61;
                    case 2: goto L5a;
                    case 3: goto L53;
                    default: goto L52;
                }
            L52:
                goto L59
            L53:
                sg.bigo.ads.common.p925m.C43720b.m5131d(r5)
                sg.bigo.ads.common.p925m.C43720b.m5127h()
            L59:
                return
            L5a:
                sg.bigo.ads.common.p925m.C43720b.m5135b(r5)
            L5d:
                sg.bigo.ads.common.p925m.C43720b.m5127h()
                return
            L61:
                sg.bigo.ads.common.p925m.C43720b.m5133c(r5)
                goto L5d
            L65:
                sg.bigo.ads.common.p925m.C43720b.m5137a(r5)
                goto L5d
            */
            throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.common.p925m.C43720b.SharedPreferences$OnSharedPreferenceChangeListenerC437211.onSharedPreferenceChanged(android.content.SharedPreferences, java.lang.String):void");
        }
    };

    /* renamed from: g */
    private static Context f114428g;

    /* renamed from: a */
    public static void m5138a(@NonNull Context context) {
        f114428g = context;
        C43906a.m4647a(context.getPackageName(), f114427f);
    }

    /* renamed from: b */
    public static String m5136b() {
        if (C43836q.m4837a((CharSequence) f114422a) && m5139a()) {
            f114422a = C43906a.m4632e(f114428g.getPackageName());
        }
        return f114422a;
    }

    /* renamed from: c */
    public static int m5134c() {
        if (f114423b == 0 && m5139a()) {
            f114423b = C43906a.m4628g(f114428g.getPackageName());
        }
        return f114423b;
    }

    /* renamed from: d */
    public static String m5132d() {
        if (C43836q.m4837a((CharSequence) f114424c) && m5139a()) {
            f114424c = C43906a.m4626h(f114428g.getPackageName());
        }
        return f114424c;
    }

    /* renamed from: e */
    public static String m5130e() {
        if (C43836q.m4837a((CharSequence) f114425d) && m5139a()) {
            f114425d = C43906a.m4630f(f114428g.getPackageName());
        }
        return f114425d;
    }

    /* renamed from: f */
    public static boolean m5129f() {
        return f114426e;
    }

    /* renamed from: g */
    public static void m5128g() {
        f114426e = false;
    }

    /* renamed from: h */
    static /* synthetic */ boolean m5127h() {
        f114426e = true;
        return true;
    }

    /* renamed from: a */
    public static void m5137a(SharedPreferences sharedPreferences) {
        if (sharedPreferences == null) {
            return;
        }
        try {
            f114422a = sharedPreferences.getString(CmpApiConstants.IABTCF_PURPOSE_CONSENTS, "");
        } catch (Exception unused) {
            f114422a = "";
        }
    }

    /* renamed from: b */
    public static void m5135b(SharedPreferences sharedPreferences) {
        if (sharedPreferences == null || sharedPreferences.getAll() == null) {
            return;
        }
        Object obj = sharedPreferences.getAll().get("IABTCF_gdprApplies");
        if (obj instanceof Integer) {
            f114423b = ((Integer) obj).intValue();
        } else if (obj instanceof String) {
            try {
                f114423b = Integer.parseInt((String) obj);
            } catch (Exception unused) {
                f114423b = 0;
            }
        }
    }

    /* renamed from: c */
    public static void m5133c(SharedPreferences sharedPreferences) {
        if (sharedPreferences == null) {
            return;
        }
        try {
            f114424c = sharedPreferences.getString(CmpApiConstants.IABTCF_PURPOSE_LEGITIMATE_INTERESTS, "");
        } catch (Exception unused) {
            f114424c = "";
        }
    }

    /* renamed from: d */
    public static void m5131d(SharedPreferences sharedPreferences) {
        if (sharedPreferences == null) {
            return;
        }
        try {
            f114425d = sharedPreferences.getString("IABTCF_TCString", "");
        } catch (Exception unused) {
            f114425d = "";
        }
    }

    /* renamed from: a */
    public static boolean m5139a() {
        return f114428g != null;
    }
}
