package p856r2;

import com.helpshift.log.HSLogger;
import com.p552ot.pubsub.util.C26601v;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import p026b3.HSDownloaderNetwork;
import p026b3.HSDownloaderResponse;
import p693h3.ISharedPreferencesStore;
import p752k3.C37382g;
import p752k3.C37383m;
import p752k3.FileUtil;

/* renamed from: r2.d */
/* loaded from: classes5.dex */
public class HelpshiftResourceCacheManager {

    /* renamed from: a */
    private final String f103664a;

    /* renamed from: b */
    private final HSDownloaderNetwork f103665b;

    /* renamed from: c */
    private String f103666c;

    /* renamed from: d */
    private String f103667d;

    /* renamed from: e */
    private String f103668e;

    /* renamed from: f */
    private final ISharedPreferencesStore f103669f;

    /* renamed from: g */
    private final ResourceCacheEvictStrategy f103670g;

    /* renamed from: h */
    private Map<String, Long> f103671h = new HashMap();

    public HelpshiftResourceCacheManager(ISharedPreferencesStore iSharedPreferencesStore, HSDownloaderNetwork hSDownloaderNetwork, ResourceCacheEvictStrategy resourceCacheEvictStrategy, String str, String str2, String str3, String str4) {
        this.f103665b = hSDownloaderNetwork;
        this.f103669f = iSharedPreferencesStore;
        this.f103670g = resourceCacheEvictStrategy;
        this.f103664a = str;
        this.f103666c = str2;
        this.f103667d = str3;
        this.f103668e = str4;
    }

    /* renamed from: b */
    private void m12700b(String str, String str2, String str3) {
        File[] listFiles = new File(str).listFiles();
        if (listFiles != null && listFiles.length != 0) {
            String m12696f = m12696f(str2, null);
            for (File file : listFiles) {
                String name = file.getName();
                if (!name.equals(str3) && this.f103670g.mo12683a(name, m12696f) && !file.delete()) {
                    HSLogger.m65441d("resCacheMngr", "Failed to delete file : " + file.getPath());
                }
            }
        }
    }

    /* renamed from: d */
    private void m12698d(String str, File file) {
        HashMap hashMap = new HashMap();
        if (C37383m.m18233g(str)) {
            hashMap.put("If-None-Match", str);
        }
        HSDownloaderResponse m103969a = this.f103665b.m103969a(this.f103666c, hashMap, file);
        if (!m103969a.f1563f) {
            HSLogger.m65439e("resCacheMngr", "Failed to download the URLs mapping file");
            return;
        }
        m12685q("url_mapping_etag", m103969a.f1560c);
        m12686p("url_mapping_last_success_time", System.currentTimeMillis());
    }

    /* renamed from: f */
    private String m12696f(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("_");
        if (str2 == null) {
            str2 = "";
        }
        sb2.append(str2);
        return sb2.toString().replaceAll("[^a-zA-Z0-9]", "_");
    }

    /* renamed from: g */
    private Map<String, Long> m12695g() {
        HashMap hashMap = new HashMap();
        try {
            JSONArray jSONArray = new JSONObject(FileUtil.m18260b(m12694h())).getJSONArray("url_paths");
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                hashMap.put(jSONObject.getString("path"), Long.valueOf(jSONObject.optLong("ttl", 86400000L)));
            }
        } catch (Exception e) {
            HSLogger.m65438e("resCacheMngr", "Error getting URLs mapping", e);
        }
        return hashMap;
    }

    /* renamed from: h */
    private String m12694h() {
        return m12690l() + File.separator + this.f103667d;
    }

    /* renamed from: i */
    private long m12693i() {
        try {
            return new JSONObject(FileUtil.m18260b(m12694h())).optLong("ttl", 86400000L);
        } catch (Exception e) {
            HSLogger.m65438e("resCacheMngr", "Error getting cache mapping ttl", e);
            return 86400000L;
        }
    }

    /* renamed from: k */
    private long m12691k(String str) {
        return this.f103669f.mo23731b(str);
    }

    /* renamed from: l */
    private String m12690l() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f103664a);
        String str = File.separator;
        sb2.append(str);
        sb2.append("helpshift");
        sb2.append(str);
        sb2.append("resource_cache");
        sb2.append(str);
        sb2.append(this.f103668e);
        return sb2.toString();
    }

    /* renamed from: n */
    private String m12688n(String str) {
        return this.f103669f.mo23730c(str);
    }

    /* renamed from: o */
    private long m12687o(String str) {
        if (C37383m.m18236d(str)) {
            return 0L;
        }
        Long l = 0L;
        Iterator<String> it = this.f103671h.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            if (str.startsWith(next)) {
                l = this.f103671h.get(next);
                break;
            }
        }
        if (l == null) {
            return 0L;
        }
        return l.longValue();
    }

    /* renamed from: p */
    private void m12686p(String str, long j) {
        this.f103669f.putLong(str, j);
    }

    /* renamed from: q */
    private void m12685q(String str, String str2) {
        this.f103669f.putString(str, str2);
    }

    /* renamed from: a */
    public void m12701a() {
        FileUtil.m18261a(m12690l());
        this.f103669f.clear();
        this.f103671h.clear();
    }

    /* renamed from: c */
    public void m12699c() {
        String m12688n = m12688n("url_mapping_etag");
        long m12691k = m12691k("url_mapping_last_success_time");
        File file = new File(m12694h());
        boolean exists = file.exists();
        if (!exists) {
            file.getParentFile().mkdirs();
            m12688n = "";
        }
        if (!exists || C37383m.m18236d(m12688n) || m12691k < System.currentTimeMillis() - m12693i() || m12691k < System.currentTimeMillis() - C26601v.f69834a) {
            m12698d(m12688n, file);
        }
        this.f103671h = m12695g();
    }

    /* renamed from: e */
    public InputStream m12697e(String str, String str2, String str3, Map<String, String> map) {
        String str4 = "text/html";
        String m12696f = m12696f(str2, str3);
        String str5 = m12696f + "_last_success_time";
        long mo23731b = this.f103669f.mo23731b(str5);
        String str6 = m12696f + "_etag";
        String mo23730c = this.f103669f.mo23730c(str6);
        long m12687o = m12687o(str2);
        String m12690l = m12690l();
        String str7 = m12690l + File.separator + m12696f;
        File file = new File(str7);
        boolean exists = file.exists();
        if (exists) {
            try {
                if (!C37383m.m18236d(mo23730c)) {
                    if (mo23731b >= System.currentTimeMillis() - m12687o) {
                        if (mo23731b < System.currentTimeMillis() - C26601v.f69834a) {
                        }
                        return new BufferedInputStream(new FileInputStream(file));
                    }
                }
            } catch (Exception e) {
                HSLogger.m65438e("resCacheMngr", "Error while fetching resource file: " + str, e);
                return null;
            }
        }
        if (!exists) {
            file.getParentFile().mkdirs();
            mo23730c = "";
        }
        File file2 = new File(str7 + "_temp");
        if (C37383m.m18233g(mo23730c)) {
            map.put("If-None-Match", mo23730c);
        }
        HSDownloaderResponse m103969a = this.f103665b.m103969a(str, map, file2);
        if (!m103969a.f1563f) {
            return null;
        }
        m12685q(str6, m103969a.f1560c);
        m12686p(str5, System.currentTimeMillis());
        int i = m103969a.f1558a;
        if (i >= 200 && i <= 300) {
            if (!file.delete()) {
                HSLogger.m65441d("resCacheMngr", "Failed to delete file : " + str7);
            }
            if (!file2.renameTo(file)) {
                return null;
            }
            String str8 = m12696f + "_mimetype";
            String str9 = m103969a.f1561d;
            if (!str9.contains("text/html")) {
                str4 = str9;
            }
            if (C37383m.m18233g(str4)) {
                m12685q(str8, str4);
            }
            m12685q(m12696f + "_headers", m103969a.f1559b.toString());
        }
        m12700b(m12690l, str2, file.getName());
        return new BufferedInputStream(new FileInputStream(file));
    }

    /* renamed from: j */
    public Map<String, String> m12692j(String str, String str2) {
        return C37382g.m18252f(m12688n(m12696f(str, str2) + "_headers"));
    }

    /* renamed from: m */
    public String m12689m(String str, String str2) {
        return this.f103669f.mo23730c(m12696f(str, str2) + "_mimetype");
    }

    /* renamed from: r */
    public boolean m12684r(String str) {
        boolean z = false;
        if (C37383m.m18236d(str)) {
            return false;
        }
        Iterator<String> it = this.f103671h.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (str.startsWith(it.next())) {
                z = true;
                break;
            }
        }
        HSLogger.m65441d("resCacheMngr", "Should cache url? " + z + "   with path - " + str);
        return z;
    }
}
