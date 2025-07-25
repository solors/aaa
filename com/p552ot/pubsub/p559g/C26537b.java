package com.p552ot.pubsub.p559g;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.p552ot.pubsub.p555c.C26521a;
import com.p552ot.pubsub.util.C26577b;
import com.p552ot.pubsub.util.C26586j;
import com.p552ot.pubsub.util.C26599t;
import java.util.UUID;

/* renamed from: com.ot.pubsub.g.b */
/* loaded from: classes7.dex */
public class C26537b {

    /* renamed from: a */
    private static final String f69452a = "b";

    /* renamed from: b */
    private static final String f69453b = "content://com.miui.analytics.OneTrackProvider/insId";

    /* renamed from: c */
    private static final String f69454c = "insId";

    /* renamed from: d */
    private static final String f69455d = "pkg";

    /* renamed from: e */
    private static final String f69456e = "sign";

    /* renamed from: f */
    private static volatile C26537b f69457f;

    /* renamed from: g */
    private static String f69458g;

    /* renamed from: j */
    private static String f69459j;

    /* renamed from: k */
    private boolean f69462k = false;

    /* renamed from: h */
    private final Context f69460h = C26577b.m41121a();

    /* renamed from: i */
    private final Context f69461i = C26577b.m41116b();

    private C26537b() {
        f69459j = C26577b.m41111e();
    }

    /* renamed from: a */
    public static C26537b m41287a() {
        if (f69457f == null) {
            synchronized (C26537b.class) {
                if (f69457f == null) {
                    f69457f = new C26537b();
                }
            }
        }
        return f69457f;
    }

    /* renamed from: c */
    private String m41282c() {
        String str = null;
        try {
            Uri.Builder buildUpon = Uri.parse(f69453b).buildUpon();
            buildUpon.appendQueryParameter(f69455d, f69459j);
            buildUpon.appendQueryParameter(f69456e, C26521a.m41373a(f69454c + f69459j));
            Cursor query = this.f69461i.getContentResolver().query(buildUpon.build(), null, null, null, null);
            if (query != null) {
                while (query.moveToNext()) {
                    str = query.getString(0);
                }
                query.close();
            }
        } catch (Throwable th) {
            C26586j.m41077a(f69452a, "getRemoteCacheInstanceId e", th.getMessage());
        }
        return str;
    }

    /* renamed from: d */
    private String m41281d() {
        String m40998a = C26599t.m40998a(this.f69460h);
        if (TextUtils.isEmpty(m40998a)) {
            return C26599t.m40975f();
        }
        C26599t.m40976e(m40998a);
        return m40998a;
    }

    /* renamed from: b */
    public String m41284b() {
        String m41281d;
        if (!TextUtils.isEmpty(f69458g)) {
            return f69458g;
        }
        if (this.f69462k) {
            m41281d = m41282c();
            String m41281d2 = m41281d();
            if (TextUtils.isEmpty(m41281d) && !TextUtils.isEmpty(m41281d2)) {
                m41283b(m41281d2);
                m41281d = m41281d2;
            } else if (!TextUtils.isEmpty(m41281d) && TextUtils.isEmpty(m41281d2)) {
                C26599t.m40976e(m41281d);
            }
        } else {
            m41281d = m41281d();
        }
        if (TextUtils.isEmpty(m41281d)) {
            String uuid = UUID.randomUUID().toString();
            f69458g = uuid;
            if (this.f69462k) {
                m41283b(uuid);
            }
            C26599t.m40976e(f69458g);
        } else {
            f69458g = m41281d;
        }
        return f69458g;
    }

    /* renamed from: a */
    public void m41286a(Boolean bool) {
        this.f69462k = bool.booleanValue();
    }

    /* renamed from: a */
    public void m41285a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        f69458g = str;
        if (this.f69462k) {
            m41283b(str);
        }
        C26599t.m40976e(f69458g);
    }

    /* renamed from: b */
    private void m41283b(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            Uri parse = Uri.parse(f69453b);
            ContentValues contentValues = new ContentValues();
            contentValues.put(f69459j, str);
            this.f69461i.getContentResolver().insert(parse, contentValues);
        } catch (Exception e) {
            C26599t.m40976e(str);
            C26586j.m41078a(f69452a, "setRemoteCacheInstanceId e", e);
        }
    }
}
