package io.appmetrica.analytics.impl;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* renamed from: io.appmetrica.analytics.impl.vk */
/* loaded from: classes9.dex */
public final class C34968vk {

    /* renamed from: a */
    public final C34776oc f95521a;

    /* renamed from: b */
    public final C34749nc f95522b;

    public C34968vk(PublicLogger publicLogger, String str) {
        this(new C34776oc(str, publicLogger), new C34749nc(str, publicLogger));
    }

    /* renamed from: a */
    public final synchronized boolean m20864a(C34856rc c34856rc, String str, String str2) {
        int size = c34856rc.size();
        int i = this.f95521a.f95108c.f92606a;
        if (size >= i && (i != c34856rc.size() || !c34856rc.containsKey(str))) {
            C34776oc c34776oc = this.f95521a;
            c34776oc.f95109d.warning("The %s has reached the limit of %d items. Item with key %s will be ignored", c34776oc.f95110e, Integer.valueOf(c34776oc.f95108c.f92606a), str);
            return false;
        }
        this.f95522b.getClass();
        int i2 = c34856rc.f95276a;
        if (str2 != null) {
            i2 += str2.length();
        }
        if (c34856rc.containsKey(str)) {
            String str3 = (String) c34856rc.get(str);
            if (str3 != null) {
                i2 -= str3.length();
            }
        } else {
            i2 += str.length();
        }
        if (i2 > 4500) {
            C34749nc c34749nc = this.f95522b;
            c34749nc.f95004b.warning("The %s has reached the total size limit that equals %d symbols. Item with key %s will be ignored", c34749nc.f95003a, Integer.valueOf((int) IronSourceConstants.NT_AUCTION_REQUEST), str);
            return false;
        }
        c34856rc.put(str, str2);
        return true;
    }

    /* renamed from: b */
    public final boolean m20863b(C34856rc c34856rc, String str, String str2) {
        if (c34856rc != null) {
            String mo21063a = this.f95521a.f95106a.mo21063a(str);
            String mo21063a2 = this.f95521a.f95107b.mo21063a(str2);
            if (c34856rc.containsKey(mo21063a)) {
                String str3 = (String) c34856rc.get(mo21063a);
                if (mo21063a2 == null || !mo21063a2.equals(str3)) {
                    return m20864a(c34856rc, mo21063a, mo21063a2);
                }
                return false;
            } else if (mo21063a2 != null) {
                return m20864a(c34856rc, mo21063a, mo21063a2);
            } else {
                return false;
            }
        }
        return false;
    }

    public C34968vk(C34776oc c34776oc, C34749nc c34749nc) {
        this.f95521a = c34776oc;
        this.f95522b = c34749nc;
    }
}
