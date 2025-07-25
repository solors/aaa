package sg.bigo.ads.core.p958c.p960b;

import androidx.annotation.NonNull;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import sg.bigo.ads.common.utils.C43836q;

/* renamed from: sg.bigo.ads.core.c.b.d */
/* loaded from: classes10.dex */
public final class C44146d {

    /* renamed from: a */
    public final Map<String, String> f115854a = new ConcurrentHashMap();

    /* renamed from: b */
    public final String f115855b;

    public C44146d(@NonNull String str) {
        this.f115855b = str;
    }

    /* renamed from: a */
    public final void m3825a(String str, int i) {
        this.f115854a.put(str, String.valueOf(i));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("eventId = ");
        sb2.append(this.f115855b);
        sb2.append(":");
        for (Map.Entry<String, String> entry : this.f115854a.entrySet()) {
            sb2.append(entry.getKey());
            sb2.append("=");
            sb2.append(entry.getValue());
            sb2.append(",");
        }
        return sb2.toString();
    }

    /* renamed from: a */
    public final void m3824a(String str, long j) {
        this.f115854a.put(str, String.valueOf(j));
    }

    /* renamed from: a */
    public final void m3823a(String str, String str2) {
        if (C43836q.m4837a((CharSequence) str) || C43836q.m4837a((CharSequence) str2)) {
            return;
        }
        this.f115854a.put(str, str2);
    }

    /* renamed from: a */
    public final void m3822a(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                this.f115854a.put(entry.getKey(), entry.getValue());
            }
        }
    }
}
