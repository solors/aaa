package com.p551my.target;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.my.target.ea */
/* loaded from: classes7.dex */
public class C25735ea {

    /* renamed from: a */
    public static final C25735ea f66819a = new C25735ea();

    /* renamed from: c */
    public static void m43952c(List list, Map map, Context context) {
        f66819a.m43954b(list, map, context);
    }

    /* renamed from: a */
    public String m43961a(String str) {
        return m43959a(str, true);
    }

    /* renamed from: b */
    public void m43956b(final C25689ca c25689ca, final Map map, final Context context) {
        if (c25689ca == null) {
            return;
        }
        AbstractC25671c0.m44122d(new Runnable() { // from class: com.my.target.ub
            {
                C25735ea.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C25735ea.this.m43963a(c25689ca, map, context);
            }
        });
    }

    /* renamed from: c */
    public static void m43953c(String str, Context context) {
        f66819a.m43955b(str, context);
    }

    /* renamed from: a */
    public String m43959a(String str, boolean z) {
        if (z) {
            str = C25895la.m43505a(str);
        }
        if (URLUtil.isNetworkUrl(str)) {
            return str;
        }
        AbstractC25846ja.m43680a("StatResolver: Invalid stat url: " + str);
        return null;
    }

    /* renamed from: b */
    public void m43954b(final List list, final Map map, final Context context) {
        if (list == null || list.size() == 0) {
            AbstractC25846ja.m43680a("No stats here, nothing to send");
        } else {
            AbstractC25671c0.m44122d(new Runnable() { // from class: com.my.target.wb
                {
                    C25735ea.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C25735ea.this.m43957a(list, map, context);
                }
            });
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void m43963a(C25689ca c25689ca, Map map, Context context) {
        m43962a(c25689ca, map, null, context);
    }

    /* renamed from: b */
    public void m43955b(final String str, Context context) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        final Context applicationContext = context.getApplicationContext();
        AbstractC25671c0.m44122d(new Runnable() { // from class: com.my.target.vb
            {
                C25735ea.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C25735ea.this.m43960a(str, applicationContext);
            }
        });
    }

    /* renamed from: a */
    public final /* synthetic */ void m43957a(List list, Map map, Context context) {
        C25701d2 m44039a = C25701d2.m44039a();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m43962a((C25689ca) it.next(), map, m44039a, context);
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void m43960a(String str, Context context) {
        String m43961a = m43961a(str);
        if (m43961a != null) {
            C25701d2.m44039a().m44185a(m43961a, null, context);
        }
    }

    /* renamed from: a */
    public final void m43965a(C25689ca c25689ca) {
        String str;
        if (c25689ca instanceof C25659b8) {
            str = "StatResolver: Tracking progress stat value - " + ((C25659b8) c25689ca).m44156e() + ", url - " + c25689ca.m44064b();
        } else if (c25689ca instanceof C26142u7) {
            C26142u7 c26142u7 = (C26142u7) c25689ca;
            str = "StatResolver: Tracking ovv stat percent - " + c26142u7.f66610d + ", value - " + c26142u7.m42751f() + ", ovv - " + c26142u7.m42750g() + ", url - " + c25689ca.m44064b();
        } else if (c25689ca instanceof C25632a6) {
            C25632a6 c25632a6 = (C25632a6) c25689ca;
            str = "StatResolver: Tracking mrc stat percent - , percent - " + c25632a6.f66610d + ", duration - " + c25632a6.f66603f + ", url - " + c25689ca.m44064b();
        } else {
            str = "StatResolver: Tracking stat type - " + c25689ca.m44067a() + ", url - " + c25689ca.m44064b();
        }
        AbstractC25846ja.m43680a(str);
    }

    /* renamed from: a */
    public final void m43962a(C25689ca c25689ca, Map map, C25701d2 c25701d2, Context context) {
        m43965a(c25689ca);
        String m43959a = m43959a(c25689ca.m44064b(), c25689ca.m44063c());
        if (m43959a == null) {
            return;
        }
        if (map != null && !map.isEmpty()) {
            Uri.Builder builder = new Uri.Builder();
            for (Map.Entry entry : map.entrySet()) {
                builder.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
            }
            m43959a = m43959a + builder.build().toString();
        }
        Context applicationContext = context.getApplicationContext();
        if (c25701d2 == null) {
            c25701d2 = C25701d2.m44039a();
        }
        c25701d2.m44185a(m43959a, null, applicationContext);
    }

    /* renamed from: a */
    public static void m43964a(C25689ca c25689ca, Context context) {
        f66819a.m43956b(c25689ca, (Map) null, context);
    }

    /* renamed from: a */
    public static void m43958a(List list, Context context) {
        f66819a.m43954b(list, (Map) null, context);
    }
}
