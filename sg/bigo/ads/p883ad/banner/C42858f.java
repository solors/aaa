package sg.bigo.ads.p883ad.banner;

import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import sg.bigo.ads.p883ad.AbstractC42869c;

/* renamed from: sg.bigo.ads.ad.banner.f */
/* loaded from: classes10.dex */
public final class C42858f {

    /* renamed from: a */
    private final List<WeakReference<AbstractC42869c>> f112219a;

    /* renamed from: sg.bigo.ads.ad.banner.f$a */
    /* loaded from: classes10.dex */
    static class C42859a {

        /* renamed from: a */
        private static C42858f f112220a = new C42858f((byte) 0);
    }

    private C42858f() {
        this.f112219a = new LinkedList();
    }

    /* renamed from: a */
    public final boolean m6477a(@NonNull AbstractC42869c abstractC42869c) {
        if (abstractC42869c.isExpired() || abstractC42869c.mo5730n() || abstractC42869c.f112251h) {
            return false;
        }
        synchronized (this.f112219a) {
            Iterator<WeakReference<AbstractC42869c>> it = this.f112219a.iterator();
            boolean z = false;
            while (it.hasNext()) {
                AbstractC42869c abstractC42869c2 = it.next().get();
                if (abstractC42869c2 == abstractC42869c) {
                    z = true;
                } else if (abstractC42869c2 == null || abstractC42869c2.isExpired() || abstractC42869c2.mo5730n() || abstractC42869c2.f112251h) {
                    it.remove();
                }
            }
            if (z || this.f112219a.size() >= 3) {
                return false;
            }
            this.f112219a.add(new WeakReference<>(abstractC42869c));
            return true;
        }
    }

    /* renamed from: b */
    public final boolean m6476b(@NonNull AbstractC42869c abstractC42869c) {
        if (abstractC42869c == null) {
            return false;
        }
        synchronized (this.f112219a) {
            Iterator<WeakReference<AbstractC42869c>> it = this.f112219a.iterator();
            while (it.hasNext()) {
                if (it.next().get() == abstractC42869c) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }
    }

    /* synthetic */ C42858f(byte b) {
        this();
    }
}
