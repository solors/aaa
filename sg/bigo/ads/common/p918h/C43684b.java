package sg.bigo.ads.common.p918h;

import android.annotation.SuppressLint;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import sg.bigo.ads.common.p918h.p919a.C43683a;
import sg.bigo.ads.common.p918h.p920b.C43691b;
import sg.bigo.ads.common.p918h.p920b.InterfaceC43694e;
import sg.bigo.ads.common.p926n.C43727d;
import sg.bigo.ads.common.p932t.C43782a;
import sg.bigo.ads.common.p941x.C43906a;
import sg.bigo.ads.common.utils.C43823f;
import sg.bigo.ads.common.utils.C43828k;
import sg.bigo.ads.common.utils.C43834p;
import sg.bigo.ads.common.utils.C43836q;

/* renamed from: sg.bigo.ads.common.h.b */
/* loaded from: classes10.dex */
public final class C43684b implements InterfaceC43694e {

    /* renamed from: a */
    public final CopyOnWriteArrayList<C43681a> f114359a;

    /* renamed from: b */
    public final CopyOnWriteArrayList<C43681a> f114360b;

    /* renamed from: c */
    public final CopyOnWriteArrayList<C43681a> f114361c;

    /* renamed from: d */
    public final CopyOnWriteArrayList<C43681a> f114362d;

    /* renamed from: e */
    final InterfaceC43689a f114363e;

    /* renamed from: f */
    private final C43683a f114364f;

    /* renamed from: sg.bigo.ads.common.h.b$a */
    /* loaded from: classes10.dex */
    public interface InterfaceC43689a {
        /* renamed from: a */
        void mo3393a(C43681a c43681a);

        /* renamed from: a */
        void mo3392a(C43681a c43681a, int i, long j);

        /* renamed from: a */
        void mo3391a(C43681a c43681a, String str, long j, long j2);
    }

    public C43684b(C43683a c43683a, boolean z, @NonNull InterfaceC43689a interfaceC43689a) {
        this.f114363e = interfaceC43689a;
        C43691b.m5190a(z);
        this.f114364f = c43683a;
        this.f114359a = new CopyOnWriteArrayList<>();
        this.f114360b = new CopyOnWriteArrayList<>();
        this.f114361c = new CopyOnWriteArrayList<>();
        this.f114362d = new CopyOnWriteArrayList<>();
    }

    /* renamed from: a */
    public final C43681a m5206a(String str, String str2) {
        if (C43836q.m4837a((CharSequence) str) || C43836q.m4837a((CharSequence) str2)) {
            return null;
        }
        C43681a m5203a = m5203a(this.f114359a, str, str2);
        if (m5203a == null) {
            m5203a = m5203a(this.f114360b, str, str2);
        }
        if (m5203a == null) {
            m5203a = m5203a(this.f114361c, str, str2);
        }
        return m5203a == null ? m5203a(this.f114362d, str, str2) : m5203a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x005b, code lost:
        if ((r0 == 5) != false) goto L35;
     */
    @Override // sg.bigo.ads.common.p918h.p920b.InterfaceC43694e
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo5180b(java.lang.String r12) {
        /*
            r11 = this;
            sg.bigo.ads.common.h.a r12 = sg.bigo.ads.common.p918h.p920b.C43691b.m5193a(r12)
            if (r12 != 0) goto Ld
            java.lang.String r12 = "onLoading info is null."
            r0 = 0
            m5205a(r12, r0)
            return
        Ld:
            int r0 = r12.f114343i
            r1 = 1
            if (r0 == r1) goto L19
            java.lang.String r0 = "onLoading"
            m5205a(r0, r12)
            r12.f114343i = r1
        L19:
            long r2 = r12.f114342h
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r4 = 0
            if (r0 <= 0) goto L36
            long r5 = r12.f114340f
            long r7 = r12.f114341g
            long r7 = r5 - r7
            r9 = 100
            long r7 = r7 * r9
            r9 = 10
            long r2 = r2 * r9
            int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r0 <= 0) goto L36
            r12.f114341g = r5
            r0 = r1
            goto L37
        L36:
            r0 = r4
        L37:
            if (r0 == 0) goto L74
            boolean r0 = r12.m5213h()
            if (r0 == 0) goto L74
            android.content.Context r0 = sg.bigo.ads.common.p912f.C43617a.f114190a
            int r0 = sg.bigo.ads.common.p906aa.C43592c.m5334a(r0)
            r2 = 3
            if (r0 != r2) goto L4a
            r2 = r1
            goto L4b
        L4a:
            r2 = r4
        L4b:
            if (r2 != 0) goto L5d
            r2 = 4
            if (r0 != r2) goto L52
            r2 = r1
            goto L53
        L52:
            r2 = r4
        L53:
            if (r2 != 0) goto L5d
            r2 = 5
            if (r0 != r2) goto L5a
            r0 = r1
            goto L5b
        L5a:
            r0 = r4
        L5b:
            if (r0 == 0) goto L5e
        L5d:
            r4 = r1
        L5e:
            if (r4 == 0) goto L74
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r4 = r12.f114346l
            long r2 = r2 - r4
            java.lang.String r0 = "partial download callback"
            m5205a(r0, r12)
            sg.bigo.ads.common.h.b$2 r0 = new sg.bigo.ads.common.h.b$2
            r0.<init>()
            sg.bigo.ads.common.p926n.C43727d.m5108a(r1, r0)
        L74:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.common.p918h.C43684b.mo5180b(java.lang.String):void");
    }

    @Override // sg.bigo.ads.common.p918h.p920b.InterfaceC43694e
    /* renamed from: c */
    public final void mo5179c(String str) {
        C43681a m5193a = C43691b.m5193a(str);
        if (m5193a != null) {
            m5193a.f114343i = 2;
        }
    }

    @Override // sg.bigo.ads.common.p918h.p920b.InterfaceC43694e
    /* renamed from: d */
    public final void mo5178d(final String str) {
        C43727d.m5108a(1, new Runnable() { // from class: sg.bigo.ads.common.h.b.3
            @Override // java.lang.Runnable
            public final void run() {
                C43681a m5193a = C43691b.m5193a(str);
                if (m5193a == null) {
                    return;
                }
                long elapsedRealtime = SystemClock.elapsedRealtime();
                C43684b.m5205a("download succeed", m5193a);
                m5193a.f114343i = 3;
                C43684b.this.f114359a.remove(m5193a);
                C43684b.this.f114360b.add(m5193a);
                C43684b.this.f114363e.mo3392a(m5193a, 1, elapsedRealtime - m5193a.f114346l);
                C43684b.m5205a("downloading to downloaded", m5193a);
                C43691b.m5189b(m5193a.f114335a);
                C43684b.this.m5207a();
            }
        });
    }

    /* renamed from: a */
    private static C43681a m5203a(List<C43681a> list, String str, String str2) {
        if (C43836q.m4837a((CharSequence) str) || C43836q.m4837a((CharSequence) str2)) {
            return null;
        }
        for (C43681a c43681a : list) {
            if (TextUtils.equals(str, c43681a.f114337c) && TextUtils.equals(str2, c43681a.f114338d)) {
                return c43681a;
            }
        }
        return null;
    }

    /* renamed from: b */
    private boolean m5198b() {
        return this.f114359a.size() < this.f114364f.f114355a;
    }

    /* renamed from: a */
    private static C43681a m5202a(List<C43681a> list, C43681a c43681a) {
        int indexOf = list.indexOf(c43681a);
        if (indexOf >= 0) {
            try {
                return list.get(indexOf);
            } catch (Exception e) {
                m5205a("getExistDownloadInfo e=" + e.getMessage(), (C43681a) null);
                return null;
            }
        }
        return null;
    }

    /* renamed from: a */
    private static C43681a m5201a(List<C43681a> list, boolean z) {
        for (C43681a c43681a : list) {
            boolean z2 = true;
            if (z) {
                int i = c43681a.f114344j >= 3 ? 1800000 : 300000;
                if (c43681a.f114345k <= 0 || System.currentTimeMillis() - c43681a.f114345k <= i) {
                    z2 = false;
                }
            }
            if (z2) {
                return c43681a;
            }
            m5205a("no download info execute.", c43681a);
        }
        return null;
    }

    /* renamed from: a */
    final void m5207a() {
        if (C43906a.m4616p()) {
            return;
        }
        m5205a("continue to execute download task", (C43681a) null);
        if (!m5198b()) {
            m5205a("no idle download thread", (C43681a) null);
            return;
        }
        C43681a m5201a = m5201a((List<C43681a>) this.f114361c, false);
        if (m5201a != null) {
            m5205a("waiting to downloading", m5201a);
            this.f114361c.remove(m5201a);
        }
        if (m5201a == null && (m5201a = m5201a((List<C43681a>) this.f114362d, true)) != null) {
            m5205a("failed to downloading", m5201a);
            this.f114362d.remove(m5201a);
        }
        if (m5201a == null) {
            m5205a("no download info execute.", (C43681a) null);
            return;
        }
        this.f114359a.add(m5201a);
        m5200a(m5201a);
    }

    @Override // sg.bigo.ads.common.p918h.p920b.InterfaceC43694e
    /* renamed from: a */
    public final void mo5182a(String str) {
        final C43681a m5193a = C43691b.m5193a(str);
        if (m5193a == null) {
            m5205a("onStart info is null.", (C43681a) null);
        } else {
            C43727d.m5108a(1, new Runnable() { // from class: sg.bigo.ads.common.h.b.1
                @Override // java.lang.Runnable
                public final void run() {
                    C43684b.this.f114363e.mo3393a(m5193a);
                }
            });
        }
    }

    @Override // sg.bigo.ads.common.p918h.p920b.InterfaceC43694e
    /* renamed from: a */
    public final void mo5181a(final String str, final String str2, final long j) {
        C43727d.m5108a(1, new Runnable() { // from class: sg.bigo.ads.common.h.b.4
            @Override // java.lang.Runnable
            public final void run() {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                C43681a m5193a = C43691b.m5193a(str);
                if (m5193a == null) {
                    return;
                }
                C43684b.m5205a("download failed", m5193a);
                m5193a.f114343i = 4;
                if (!m5193a.f114347m) {
                    m5193a.f114344j++;
                }
                m5193a.f114345k = System.currentTimeMillis();
                C43684b.this.f114363e.mo3391a(m5193a, str2, elapsedRealtime - m5193a.f114346l, j);
                C43684b.m5205a("download failed update fail count", m5193a);
                C43684b.this.f114359a.remove(m5193a);
                C43684b.this.f114362d.add(m5193a);
                C43684b.m5205a("downloading to failed", m5193a);
                C43684b.this.m5207a();
            }
        });
    }

    /* renamed from: a */
    public static void m5205a(String str, C43681a c43681a) {
        String c43681a2 = c43681a != null ? c43681a.toString() : null;
        C43782a.m5010a(0, 3, "DownloadManager", str + ", download info = " + c43681a2);
    }

    /* renamed from: a */
    private void m5200a(C43681a c43681a) {
        c43681a.f114346l = SystemClock.elapsedRealtime();
        m5205a("execute download start", c43681a);
        if (C43823f.m4893b(c43681a.f114337c, c43681a.f114338d)) {
            m5205a("executeDownload use local file", c43681a);
            C43823f.m4890c(c43681a.f114337c, c43681a.f114338d);
            c43681a.f114343i = 3;
            c43681a.f114342h = C43823f.m4897a(c43681a.m5220a(), 1);
            this.f114359a.remove(c43681a);
            this.f114360b.add(c43681a);
            this.f114363e.mo3392a(c43681a, 0, 0L);
            m5207a();
        } else if (!C43834p.m4846b()) {
            this.f114359a.remove(c43681a);
            this.f114363e.mo3391a(c43681a, "internal storage is not enough", SystemClock.elapsedRealtime() - c43681a.f114346l, 0L);
            m5207a();
        } else {
            C43691b.m5194a(c43681a);
            C43691b.m5192a(c43681a.f114335a, this);
            m5205a("execute downloader", c43681a);
            C43691b.m5188c(c43681a.f114335a);
        }
    }

    @SuppressLint({"ConcurrentModification"})
    /* renamed from: a */
    public final void m5199a(C43681a c43681a, boolean z) {
        m5205a("start the download, force=".concat(String.valueOf(z)), c43681a);
        if (C43823f.m4894b(c43681a.m5220a())) {
            m5205a("downloaded and exist local file", c43681a);
            C43823f.m4890c(c43681a.f114337c, c43681a.f114338d);
            this.f114363e.mo3392a(c43681a, 0, 0L);
        } else if (m5202a(this.f114359a, c43681a) != null) {
            m5205a("downloading", c43681a);
        } else if (this.f114364f.m5209b()) {
            this.f114363e.mo3391a(c43681a, "Unable to download media file.", 0L, 0L);
        } else {
            C43681a m5202a = m5202a(this.f114361c, c43681a);
            if (m5202a != null) {
                m5205a("waiting", c43681a);
                m5202a.f114336b = c43681a.f114336b;
                if (!z && !m5198b()) {
                    m5205a("waiting not executing", c43681a);
                    return;
                }
            }
            C43681a m5202a2 = m5202a(this.f114362d, c43681a);
            if (m5202a2 != null) {
                m5205a("failed", c43681a);
                this.f114362d.remove(m5202a2);
                m5202a2.f114336b = c43681a.f114336b;
                m5202a2.f114343i = 0;
                c43681a = m5202a2;
            }
            if (!m5198b() && !z) {
                m5205a("join download waiting queue", c43681a);
                this.f114361c.add(c43681a);
                return;
            }
            m5205a("execute download", c43681a);
            c43681a.f114347m = z;
            this.f114359a.add(c43681a);
            m5200a(c43681a);
        }
    }

    /* renamed from: a */
    public static boolean m5204a(List<C43681a> list, String str) {
        if (!C43836q.m4837a((CharSequence) str) && !C43828k.m4877a((Collection) list)) {
            for (C43681a c43681a : list) {
                if (TextUtils.equals(str, c43681a.f114336b)) {
                    return true;
                }
            }
        }
        return false;
    }
}
