package io.appmetrica.analytics.impl;

import android.util.SparseArray;
import java.util.Calendar;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.ff */
/* loaded from: classes9.dex */
public abstract class AbstractC34536ff {

    /* renamed from: a */
    public static final Map f94380a;

    /* renamed from: b */
    public static final SparseArray f94381b;

    /* renamed from: c */
    public static final Map f94382c;

    /* renamed from: d */
    public static final Map f94383d;

    static {
        HashMap hashMap = new HashMap();
        EnumC34433bk enumC34433bk = EnumC34433bk.FOREGROUND;
        hashMap.put(enumC34433bk, 0);
        EnumC34433bk enumC34433bk2 = EnumC34433bk.BACKGROUND;
        hashMap.put(enumC34433bk2, 1);
        f94380a = Collections.unmodifiableMap(hashMap);
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, enumC34433bk);
        sparseArray.put(1, enumC34433bk2);
        f94381b = sparseArray;
        HashMap hashMap2 = new HashMap();
        EnumC34324Xa enumC34324Xa = EnumC34324Xa.EVENT_TYPE_INIT;
        hashMap2.put(enumC34324Xa, 1);
        EnumC34324Xa enumC34324Xa2 = EnumC34324Xa.EVENT_TYPE_REGULAR;
        hashMap2.put(enumC34324Xa2, 4);
        EnumC34324Xa enumC34324Xa3 = EnumC34324Xa.EVENT_TYPE_SEND_REFERRER;
        hashMap2.put(enumC34324Xa3, 5);
        EnumC34324Xa enumC34324Xa4 = EnumC34324Xa.EVENT_TYPE_ALIVE;
        hashMap2.put(enumC34324Xa4, 7);
        EnumC34324Xa enumC34324Xa5 = EnumC34324Xa.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF;
        hashMap2.put(enumC34324Xa5, 26);
        EnumC34324Xa enumC34324Xa6 = EnumC34324Xa.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_INTENT;
        hashMap2.put(enumC34324Xa6, 26);
        EnumC34324Xa enumC34324Xa7 = EnumC34324Xa.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE;
        hashMap2.put(enumC34324Xa7, 26);
        EnumC34324Xa enumC34324Xa8 = EnumC34324Xa.EVENT_TYPE_ANR;
        hashMap2.put(enumC34324Xa8, 25);
        EnumC34324Xa enumC34324Xa9 = EnumC34324Xa.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF;
        hashMap2.put(enumC34324Xa9, 26);
        EnumC34324Xa enumC34324Xa10 = EnumC34324Xa.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF;
        hashMap2.put(enumC34324Xa10, 26);
        EnumC34324Xa enumC34324Xa11 = EnumC34324Xa.EVENT_TYPE_EXCEPTION_USER_PROTOBUF;
        hashMap2.put(enumC34324Xa11, 27);
        EnumC34324Xa enumC34324Xa12 = EnumC34324Xa.EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF;
        hashMap2.put(enumC34324Xa12, 27);
        EnumC34324Xa enumC34324Xa13 = EnumC34324Xa.EVENT_TYPE_FIRST_ACTIVATION;
        hashMap2.put(enumC34324Xa13, 13);
        EnumC34324Xa enumC34324Xa14 = EnumC34324Xa.EVENT_TYPE_START;
        hashMap2.put(enumC34324Xa14, 2);
        EnumC34324Xa enumC34324Xa15 = EnumC34324Xa.EVENT_TYPE_APP_OPEN;
        hashMap2.put(enumC34324Xa15, 16);
        EnumC34324Xa enumC34324Xa16 = EnumC34324Xa.EVENT_TYPE_APP_UPDATE;
        hashMap2.put(enumC34324Xa16, 17);
        EnumC34324Xa enumC34324Xa17 = EnumC34324Xa.EVENT_TYPE_PERMISSIONS;
        hashMap2.put(enumC34324Xa17, 18);
        EnumC34324Xa enumC34324Xa18 = EnumC34324Xa.EVENT_TYPE_APP_FEATURES;
        hashMap2.put(enumC34324Xa18, 19);
        EnumC34324Xa enumC34324Xa19 = EnumC34324Xa.EVENT_TYPE_SEND_USER_PROFILE;
        hashMap2.put(enumC34324Xa19, 20);
        EnumC34324Xa enumC34324Xa20 = EnumC34324Xa.EVENT_TYPE_SEND_REVENUE_EVENT;
        hashMap2.put(enumC34324Xa20, 21);
        EnumC34324Xa enumC34324Xa21 = EnumC34324Xa.EVENT_TYPE_SEND_AD_REVENUE_EVENT;
        hashMap2.put(enumC34324Xa21, 40);
        EnumC34324Xa enumC34324Xa22 = EnumC34324Xa.EVENT_TYPE_SEND_ECOMMERCE_EVENT;
        hashMap2.put(enumC34324Xa22, 35);
        hashMap2.put(EnumC34324Xa.EVENT_TYPE_CLEANUP, 29);
        EnumC34324Xa enumC34324Xa23 = EnumC34324Xa.EVENT_TYPE_WEBVIEW_SYNC;
        hashMap2.put(enumC34324Xa23, 38);
        EnumC34324Xa enumC34324Xa24 = EnumC34324Xa.EVENT_CLIENT_EXTERNAL_ATTRIBUTION;
        hashMap2.put(enumC34324Xa24, 42);
        f94382c = Collections.unmodifiableMap(hashMap2);
        HashMap hashMap3 = new HashMap();
        C34930u8 c34930u8 = new C34930u8();
        C33764A8 c33764a8 = new C33764A8(new C33864E8());
        C34956v8 c34956v8 = new C34956v8();
        C34925u3 c34925u3 = new C34925u3(new C33864E8());
        C34121Om c34121Om = new C34121Om(new C33864E8());
        C34428bf c34428bf = new C34428bf();
        C34202S8 m22241a = C34226T8.m22241a();
        m22241a.f93479b = c34428bf;
        m22241a.f93480c = c34428bf;
        C34226T8 c34226t8 = new C34226T8(m22241a);
        C34202S8 m22241a2 = C34226T8.m22241a();
        m22241a2.f93479b = c33764a8;
        C34226T8 c34226t82 = new C34226T8(m22241a2);
        C34202S8 m22241a3 = C34226T8.m22241a();
        m22241a3.f93479b = c34925u3;
        C34226T8 c34226t83 = new C34226T8(m22241a3);
        C34202S8 m22241a4 = C34226T8.m22241a();
        m22241a4.f93479b = c34121Om;
        C34226T8 c34226t84 = new C34226T8(m22241a4);
        C34202S8 m22241a5 = C34226T8.m22241a();
        m22241a5.f93478a = c34930u8;
        C34226T8 c34226t85 = new C34226T8(m22241a5);
        C34202S8 m22241a6 = C34226T8.m22241a();
        m22241a6.f93479b = new C34919tn(new C33764A8());
        C34226T8 c34226t86 = new C34226T8(m22241a6);
        hashMap3.put(enumC34324Xa2, c34226t82);
        C34202S8 m22241a7 = C34226T8.m22241a();
        m22241a7.f93479b = new C34482df();
        hashMap3.put(enumC34324Xa3, new C34226T8(m22241a7));
        C34202S8 m22241a8 = C34226T8.m22241a();
        m22241a8.f93478a = c34930u8;
        m22241a8.f93479b = c34956v8;
        m22241a8.f93482e = new C34273V7();
        m22241a8.f93483f = new C34297W7();
        hashMap3.put(enumC34324Xa4, new C34226T8(m22241a8));
        hashMap3.put(enumC34324Xa9, c34226t8);
        hashMap3.put(enumC34324Xa10, c34226t8);
        hashMap3.put(enumC34324Xa11, c34226t83);
        hashMap3.put(enumC34324Xa12, c34226t83);
        hashMap3.put(enumC34324Xa5, c34226t83);
        hashMap3.put(enumC34324Xa6, c34226t83);
        hashMap3.put(enumC34324Xa7, c34226t83);
        hashMap3.put(enumC34324Xa8, c34226t83);
        C34202S8 m22241a9 = C34226T8.m22241a();
        m22241a9.f93478a = new C34930u8();
        m22241a9.f93479b = c34925u3;
        hashMap3.put(enumC34324Xa14, new C34226T8(m22241a9));
        EnumC34324Xa enumC34324Xa25 = EnumC34324Xa.EVENT_TYPE_CUSTOM_EVENT;
        C34202S8 m22241a10 = C34226T8.m22241a();
        m22241a10.f93481d = new C34509ef();
        hashMap3.put(enumC34324Xa25, new C34226T8(m22241a10));
        hashMap3.put(enumC34324Xa15, c34226t82);
        hashMap3.put(enumC34324Xa17, c34226t85);
        hashMap3.put(enumC34324Xa18, c34226t85);
        hashMap3.put(enumC34324Xa19, c34226t83);
        hashMap3.put(enumC34324Xa20, c34226t83);
        hashMap3.put(enumC34324Xa21, c34226t83);
        hashMap3.put(enumC34324Xa22, c34226t84);
        hashMap3.put(enumC34324Xa, c34226t86);
        hashMap3.put(enumC34324Xa16, c34226t86);
        hashMap3.put(enumC34324Xa13, c34226t82);
        hashMap3.put(enumC34324Xa23, c34226t82);
        hashMap3.put(enumC34324Xa24, c34226t83);
        f94383d = Collections.unmodifiableMap(hashMap3);
    }

    /* renamed from: a */
    public static C34584h9 m21712a(Long l, Long l2, Boolean bool) {
        C34584h9 c34584h9 = new C34584h9();
        if (l != null) {
            c34584h9.f94525a = l.longValue();
            c34584h9.f94526b = ((GregorianCalendar) Calendar.getInstance()).getTimeZone().getOffset(l.longValue() * 1000) / 1000;
        }
        if (l2 != null) {
            c34584h9.f94527c = l2.longValue();
        }
        if (bool != null) {
            c34584h9.f94528d = bool.booleanValue();
        }
        return c34584h9;
    }

    /* renamed from: a */
    public static void m21713a(C34530f9 c34530f9) {
        C34476d9[] c34476d9Arr = c34530f9.f94356c;
        if (c34476d9Arr != null) {
            for (C34476d9 c34476d9 : c34476d9Arr) {
            }
        }
    }
}
