package com.five_corp.p372ad.internal.logger;

import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.five_corp.p372ad.internal.C13621G;
import com.five_corp.p372ad.internal.bgtask.C13723j;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* renamed from: com.five_corp.ad.internal.logger.a */
/* loaded from: classes4.dex */
public final class C13836a {

    /* renamed from: a */
    public C13621G f25831a = null;

    /* renamed from: a */
    public final void m78269a(Throwable th) {
        if (this.f25831a != null) {
            HashMap hashMap = new HashMap();
            hashMap.put(NotificationCompat.CATEGORY_ERROR, th.toString());
            hashMap.put("st", Log.getStackTraceString(th));
            C13621G c13621g = this.f25831a;
            if (c13621g.f25158h) {
                c13621g.f25155e.m78424a(new C13723j(hashMap, c13621g.f25151a, c13621g.f25153c));
            } else {
                Objects.toString(hashMap);
            }
        }
    }

    /* renamed from: a */
    public final void m78270a(String str) {
        C13621G c13621g = this.f25831a;
        if (c13621g != null) {
            Map singletonMap = Collections.singletonMap("wa", str);
            if (c13621g.f25158h) {
                c13621g.f25155e.m78424a(new C13723j(singletonMap, c13621g.f25151a, c13621g.f25153c));
            } else {
                Objects.toString(singletonMap);
            }
        }
    }

    /* renamed from: a */
    public final void m78271a(C13621G c13621g) {
        this.f25831a = c13621g;
    }
}
