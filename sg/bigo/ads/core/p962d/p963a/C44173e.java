package sg.bigo.ads.core.p962d.p963a;

import android.annotation.SuppressLint;
import android.database.Cursor;
import androidx.annotation.NonNull;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import sg.bigo.ads.api.core.C43579q;
import sg.bigo.ads.common.p914g.p916b.AbstractC43676c;
import sg.bigo.ads.common.utils.C43836q;
import sg.bigo.ads.core.p962d.C44153a;

/* renamed from: sg.bigo.ads.core.d.a.e */
/* loaded from: classes10.dex */
public final class C44173e extends AbstractC43676c {

    /* renamed from: i */
    public int f115945i;

    /* renamed from: j */
    public long f115946j;

    /* renamed from: k */
    public int f115947k;

    /* renamed from: l */
    public long f115948l;

    /* renamed from: m */
    public int f115949m;

    /* renamed from: n */
    public long f115950n;

    /* renamed from: o */
    public int f115951o;

    /* renamed from: p */
    public long f115952p;
    @NonNull

    /* renamed from: q */
    final C43579q f115953q;

    /* renamed from: r */
    int f115954r;

    /* renamed from: s */
    public CopyOnWriteArrayList<C44172d> f115955s;

    /* renamed from: t */
    public CopyOnWriteArrayList<C44172d> f115956t;

    /* renamed from: u */
    public CopyOnWriteArrayList<C44172d> f115957u;

    /* renamed from: v */
    public CopyOnWriteArrayList<C44172d> f115958v;

    public C44173e(@NonNull C43579q c43579q, Cursor cursor) {
        super(cursor);
        this.f115945i = 0;
        this.f115946j = 0L;
        this.f115947k = 0;
        this.f115948l = 0L;
        this.f115949m = 0;
        this.f115950n = 0L;
        this.f115951o = 0;
        this.f115952p = 0L;
        this.f115953q = c43579q;
        this.f114329c = 1;
    }

    @Override // sg.bigo.ads.common.p914g.p916b.AbstractC43676c
    @NonNull
    /* renamed from: b */
    public final String mo3762b() {
        if (this.f115955s != null) {
            JSONArray jSONArray = new JSONArray();
            Iterator<C44172d> it = this.f115955s.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().f115935d);
            }
            return jSONArray.toString();
        }
        return "";
    }

    @Override // sg.bigo.ads.common.p914g.p916b.AbstractC43676c
    @NonNull
    /* renamed from: c */
    public final String mo3760c() {
        if (this.f115956t != null) {
            JSONArray jSONArray = new JSONArray();
            Iterator<C44172d> it = this.f115956t.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().f115935d);
            }
            return jSONArray.toString();
        }
        return "";
    }

    @Override // sg.bigo.ads.common.p914g.p916b.AbstractC43676c
    @NonNull
    /* renamed from: d */
    public final String mo3758d() {
        if (this.f115957u != null) {
            JSONArray jSONArray = new JSONArray();
            Iterator<C44172d> it = this.f115957u.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().f115935d);
            }
            return jSONArray.toString();
        }
        return "";
    }

    @Override // sg.bigo.ads.common.p914g.p916b.AbstractC43676c
    @NonNull
    /* renamed from: e */
    public final String mo3756e() {
        if (this.f115958v != null) {
            JSONArray jSONArray = new JSONArray();
            Iterator<C44172d> it = this.f115958v.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().f115935d);
            }
            return jSONArray.toString();
        }
        return "";
    }

    @Override // sg.bigo.ads.common.p914g.p916b.AbstractC43676c
    /* renamed from: f */
    public final long mo3755f() {
        return Math.max(Math.max(this.f115946j, this.f115948l), this.f114330d);
    }

    /* renamed from: g */
    public final boolean m3754g() {
        if (m3765a(this.f115955s) && m3765a(this.f115956t) && m3765a(this.f115957u) && m3765a(this.f115958v)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SuppressLint({"ConcurrentModification"})
    /* renamed from: h */
    public final void m3753h() {
        Iterator<C44172d> it = this.f115955s.iterator();
        while (it.hasNext()) {
            m3766a("impl_track", it.next());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SuppressLint({"ConcurrentModification"})
    /* renamed from: i */
    public final int m3752i() {
        Iterator<C44172d> it = this.f115956t.iterator();
        int i = 0;
        while (it.hasNext()) {
            i++;
            m3766a("click_track", it.next());
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SuppressLint({"ConcurrentModification"})
    /* renamed from: j */
    public final int m3751j() {
        Iterator<C44172d> it = this.f115957u.iterator();
        int i = 0;
        while (it.hasNext()) {
            i++;
            m3766a("nurl_track", it.next());
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SuppressLint({"ConcurrentModification"})
    /* renamed from: k */
    public final int m3750k() {
        Iterator<C44172d> it = this.f115958v.iterator();
        int i = 0;
        while (it.hasNext()) {
            i++;
            m3766a("lurl_track", it.next());
        }
        return i;
    }

    public C44173e(@NonNull C43579q c43579q, @NonNull Map<String, String> map) {
        super(map);
        this.f115945i = 0;
        this.f115946j = 0L;
        this.f115947k = 0;
        this.f115948l = 0L;
        this.f115949m = 0;
        this.f115950n = 0L;
        this.f115951o = 0;
        this.f115952p = 0L;
        this.f115953q = c43579q;
        this.f114329c = 1;
    }

    @Override // sg.bigo.ads.common.p914g.p916b.AbstractC43676c
    /* renamed from: a */
    public final void mo3767a(String str) {
        if (C43836q.m4837a((CharSequence) str)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            this.f115955s = new CopyOnWriteArrayList<>();
            for (int i = 0; i < jSONArray.length(); i++) {
                this.f115955s.add(new C44172d(jSONArray.getJSONObject(i)));
            }
        } catch (JSONException unused) {
        }
    }

    @Override // sg.bigo.ads.common.p914g.p916b.AbstractC43676c
    /* renamed from: b */
    public final void mo3761b(String str) {
        if (C43836q.m4837a((CharSequence) str)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            this.f115956t = new CopyOnWriteArrayList<>();
            for (int i = 0; i < jSONArray.length(); i++) {
                this.f115956t.add(new C44172d(jSONArray.getJSONObject(i)));
            }
        } catch (JSONException unused) {
        }
    }

    @Override // sg.bigo.ads.common.p914g.p916b.AbstractC43676c
    /* renamed from: c */
    public final void mo3759c(String str) {
        if (C43836q.m4837a((CharSequence) str)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            this.f115957u = new CopyOnWriteArrayList<>();
            for (int i = 0; i < jSONArray.length(); i++) {
                this.f115957u.add(new C44172d(jSONArray.getJSONObject(i)));
            }
        } catch (JSONException unused) {
        }
    }

    @Override // sg.bigo.ads.common.p914g.p916b.AbstractC43676c
    /* renamed from: d */
    public final void mo3757d(String str) {
        if (C43836q.m4837a((CharSequence) str)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            this.f115958v = new CopyOnWriteArrayList<>();
            for (int i = 0; i < jSONArray.length(); i++) {
                this.f115958v.add(new C44172d(jSONArray.getJSONObject(i)));
            }
        } catch (JSONException unused) {
        }
    }

    /* renamed from: a */
    private void m3766a(final String str, final C44172d c44172d) {
        String str2 = c44172d.f115933b;
        if (!c44172d.m3774b()) {
            int i = this.f115945i;
            if ("click_track".equals(str)) {
                i = this.f115947k;
            } else if ("nurl_track".equals(str)) {
                i = this.f115949m;
            } else if ("lurl_track".equals(str)) {
                i = this.f115951o;
            }
            int i2 = i;
            String m3772d = c44172d.m3772d();
            c44172d.m3777a();
            C44153a.m3810a(str, m3772d, str2, this.f115954r, this.f114328b, i2, this.f114334h, new C44153a.InterfaceC44155a() { // from class: sg.bigo.ads.core.d.a.e.1
                @Override // sg.bigo.ads.core.p962d.C44153a.InterfaceC44155a
                /* renamed from: a */
                public final void mo3734a() {
                    C44168c.m3787a().m3782b(C44173e.this);
                }

                @Override // sg.bigo.ads.core.p962d.C44153a.InterfaceC44155a
                /* renamed from: b */
                public final void mo3732b() {
                    CopyOnWriteArrayList<C44172d> copyOnWriteArrayList;
                    if ("impl_track".equals(str)) {
                        copyOnWriteArrayList = C44173e.this.f115955s;
                    } else if ("click_track".equals(str)) {
                        copyOnWriteArrayList = C44173e.this.f115956t;
                    } else if ("nurl_track".equals(str)) {
                        copyOnWriteArrayList = C44173e.this.f115957u;
                    } else {
                        if ("lurl_track".equals(str)) {
                            copyOnWriteArrayList = C44173e.this.f115958v;
                        }
                        C44168c.m3787a().m3782b(C44173e.this);
                    }
                    copyOnWriteArrayList.remove(c44172d);
                    C44168c.m3787a().m3782b(C44173e.this);
                }

                @Override // sg.bigo.ads.core.p962d.C44153a.InterfaceC44155a
                /* renamed from: a */
                public final boolean mo3733a(int i3) {
                    return C44173e.this.f115953q.m5373a(i3);
                }
            });
        } else if ("impl_track".equals(str)) {
            this.f115955s.remove(c44172d);
        } else if ("click_track".equals(str)) {
            this.f115956t.remove(c44172d);
        } else if ("nurl_track".equals(str)) {
            this.f115957u.remove(c44172d);
        } else if ("lurl_track".equals(str)) {
            this.f115958v.remove(c44172d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean m3768a(int i) {
        return this.f115953q.m5370b(i);
    }

    /* renamed from: a */
    private static boolean m3765a(List<C44172d> list) {
        return list != null && list.size() == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean m3764a(List<C44172d> list, int i) {
        return list == null || list.size() == 0 || !m3768a(i);
    }
}
