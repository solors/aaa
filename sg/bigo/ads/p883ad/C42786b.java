package sg.bigo.ads.p883ad;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import sg.bigo.ads.api.InterfaceC43501Ad;
import sg.bigo.ads.api.core.InterfaceC43550c;
import sg.bigo.ads.api.p903a.C43525i;
import sg.bigo.ads.api.p903a.InterfaceC43524h;
import sg.bigo.ads.api.p903a.InterfaceC43528l;
import sg.bigo.ads.common.p926n.C43727d;
import sg.bigo.ads.common.p932t.C43782a;
import sg.bigo.ads.controller.loader.C44090a;

/* renamed from: sg.bigo.ads.ad.b */
/* loaded from: classes10.dex */
public final class C42786b {

    /* renamed from: a */
    private Map<String, List<InterfaceC43501Ad>> f112021a;

    /* renamed from: b */
    private final List<Map<String, List<InterfaceC43501Ad>>> f112022b;

    /* renamed from: sg.bigo.ads.ad.b$a */
    /* loaded from: classes10.dex */
    public static class C42789a {

        /* renamed from: a */
        public static C42786b f112026a = new C42786b((byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: sg.bigo.ads.ad.b$b */
    /* loaded from: classes10.dex */
    public interface InterfaceC42790b {
        /* renamed from: a */
        boolean mo6566a(InterfaceC43501Ad interfaceC43501Ad);
    }

    private C42786b() {
        this.f112021a = new ConcurrentHashMap();
        ArrayList arrayList = new ArrayList();
        this.f112022b = arrayList;
        arrayList.add(this.f112021a);
    }

    /* renamed from: a */
    private int m6599a(String str, @NonNull Map<String, List<InterfaceC43501Ad>> map) {
        return m6598a(str, map, new InterfaceC42790b() { // from class: sg.bigo.ads.ad.b.1
            @Override // sg.bigo.ads.p883ad.C42786b.InterfaceC42790b
            /* renamed from: a */
            public final boolean mo6566a(InterfaceC43501Ad interfaceC43501Ad) {
                if (interfaceC43501Ad != null && interfaceC43501Ad.isExpired()) {
                    return true;
                }
                return false;
            }
        });
    }

    /* renamed from: b */
    private static String m6594b(InterfaceC43501Ad interfaceC43501Ad) {
        return interfaceC43501Ad == null ? "null" : interfaceC43501Ad.toString();
    }

    /* synthetic */ C42786b(byte b) {
        this();
    }

    /* renamed from: a */
    private int m6598a(String str, @NonNull Map<String, List<InterfaceC43501Ad>> map, @NonNull InterfaceC42790b interfaceC42790b) {
        List<InterfaceC43501Ad> list = map.get(str);
        int i = 0;
        if (list != null && !list.isEmpty()) {
            for (InterfaceC43501Ad interfaceC43501Ad : list) {
                if (interfaceC42790b.mo6566a(interfaceC43501Ad)) {
                    m6597a(interfaceC43501Ad);
                    list.remove(interfaceC43501Ad);
                    i++;
                }
            }
        }
        return i;
    }

    /* renamed from: b */
    private static String m6593b(InterfaceC43528l interfaceC43528l) {
        if (interfaceC43528l == null) {
            return null;
        }
        String mo4427l = interfaceC43528l.mo4427l();
        if (TextUtils.isEmpty(mo4427l)) {
            return null;
        }
        int mo4417v = interfaceC43528l.mo4417v();
        int mo4438b = interfaceC43528l.mo4438b();
        return mo4427l + "_" + mo4417v + "_" + mo4438b;
    }

    /* renamed from: a */
    public final InterfaceC43501Ad m6596a(InterfaceC43528l interfaceC43528l) {
        String m6593b = m6593b(interfaceC43528l);
        C43782a.m5010a(0, 3, "AdCacheManager", "AdCacheManager:key = ".concat(String.valueOf(m6593b)));
        InterfaceC43501Ad interfaceC43501Ad = null;
        if (TextUtils.isEmpty(m6593b)) {
            return null;
        }
        C43782a.m5010a(0, 3, "AdCacheManager", "AdCacheManager:getAd expiredNum is ".concat(String.valueOf(m6599a(m6593b, this.f112021a))));
        List<InterfaceC43501Ad> list = this.f112021a.get(m6593b);
        if (list != null && !list.isEmpty()) {
            int i = 0;
            while (i < list.size()) {
                try {
                    i++;
                    interfaceC43501Ad = list.get(i);
                } catch (Exception e) {
                    C43782a.m5009a(0, "AdCacheManager", "AdCacheManager:getAd end error= " + e.getMessage());
                }
            }
            if (interfaceC43501Ad != null) {
                list.remove(interfaceC43501Ad);
            }
            C43782a.m5010a(0, 3, "AdCacheManager", "AdCacheManager:getAd end cacheNum= " + list.size() + "ad = " + m6594b(interfaceC43501Ad));
        }
        return interfaceC43501Ad;
    }

    /* renamed from: a */
    private void m6597a(final InterfaceC43501Ad interfaceC43501Ad) {
        if (interfaceC43501Ad == null) {
            return;
        }
        C43727d.m5108a(2, new Runnable() { // from class: sg.bigo.ads.ad.b.2
            @Override // java.lang.Runnable
            public final void run() {
                interfaceC43501Ad.destroy();
            }
        });
    }

    /* renamed from: a */
    public final void m6595a(InterfaceC43528l interfaceC43528l, InterfaceC43501Ad interfaceC43501Ad) {
        InterfaceC43524h interfaceC43524h;
        if (interfaceC43528l == null) {
            return;
        }
        String mo4427l = interfaceC43528l.mo4427l();
        String m6593b = m6593b(interfaceC43528l);
        if (TextUtils.isEmpty(m6593b) || (interfaceC43524h = C43525i.f114036a) == null) {
            return;
        }
        int mo4500h = interfaceC43524h.mo4458p().mo4500h(mo4427l);
        Map<String, List<InterfaceC43501Ad>> map = this.f112021a;
        int m6599a = m6599a(m6593b, map);
        List<InterfaceC43501Ad> list = map.get(m6593b);
        if (list == null) {
            list = new CopyOnWriteArrayList<>();
            list.add(interfaceC43501Ad);
            map.put(m6593b, list);
        } else {
            int indexOf = list.indexOf(interfaceC43501Ad);
            if (indexOf >= 0) {
                list.set(indexOf, interfaceC43501Ad);
            } else {
                list.add(interfaceC43501Ad);
            }
        }
        InterfaceC43550c[] m3984a = C44090a.m3984a(interfaceC43501Ad);
        for (int i = 0; m3984a != null && i < m3984a.length; i++) {
            InterfaceC43550c interfaceC43550c = m3984a[i];
            interfaceC43550c.mo4387T();
            interfaceC43550c.mo4388S();
        }
        Object[] array = list.toArray();
        if (array != null) {
            List asList = Arrays.asList(array);
            Collections.sort(asList, Collections.reverseOrder());
            list.clear();
            list.addAll(asList);
        }
        int size = list.size();
        if (mo4500h > 0 && size > mo4500h) {
            try {
                InterfaceC43501Ad remove = list.remove(mo4500h);
                C43782a.m5010a(0, 3, "AdCacheManager", "AdCacheManager:removeAd due to limit:" + m6594b(remove));
                m6597a(remove);
            } catch (Exception e) {
                C43782a.m5009a(0, "AdCacheManager", "AdCacheManager:doAdPut, error = " + e.getMessage());
            }
        }
        C43782a.m5010a(0, 3, "AdCacheManager", "AdCacheManager:putAdInCache:" + m6594b(interfaceC43501Ad));
        C43782a.m5010a(0, 3, "AdCacheManager", "AdCacheManager:doAdPut, size = " + list.size() + ", expired num = " + m6599a);
    }
}
