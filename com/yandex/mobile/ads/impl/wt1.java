package com.yandex.mobile.ads.impl;

import android.os.ConditionVariable;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.InterfaceC31296rl;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

/* loaded from: classes8.dex */
public final class wt1 implements InterfaceC31296rl {

    /* renamed from: j */
    private static final HashSet<File> f87407j = new HashSet<>();

    /* renamed from: a */
    private final File f87408a;

    /* renamed from: b */
    private final InterfaceC31905yl f87409b;

    /* renamed from: c */
    private final C30634jm f87410c;
    @Nullable

    /* renamed from: d */
    private final C29947am f87411d;

    /* renamed from: e */
    private final HashMap<String, ArrayList<InterfaceC31296rl.InterfaceC31298b>> f87412e;

    /* renamed from: f */
    private final Random f87413f;

    /* renamed from: g */
    private final boolean f87414g;

    /* renamed from: h */
    private long f87415h;

    /* renamed from: i */
    private InterfaceC31296rl.C31297a f87416i;

    wt1(File file, qo0 qo0Var, C30634jm c30634jm, @Nullable C29947am c29947am) {
        if (m27749c(file)) {
            this.f87408a = file;
            this.f87409b = qo0Var;
            this.f87410c = c30634jm;
            this.f87411d = c29947am;
            this.f87412e = new HashMap<>();
            this.f87413f = new Random();
            this.f87414g = true;
            this.f87415h = -1L;
            ConditionVariable conditionVariable = new ConditionVariable();
            new vt1(this, conditionVariable).start();
            conditionVariable.block();
            return;
        }
        throw new IllegalStateException("Another SimpleCache instance uses the folder: " + file);
    }

    /* renamed from: c */
    public final synchronized TreeSet m27748c(String str) {
        TreeSet treeSet;
        C30567im m32869a = this.f87410c.m32869a(str);
        if (m32869a != null && !m32869a.m33190c()) {
            treeSet = new TreeSet((Collection) m32869a.m33192b());
        }
        treeSet = new TreeSet();
        return treeSet;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31296rl
    /* renamed from: d */
    public final synchronized long mo27746d(String str, long j, long j2) {
        long j3;
        if (j2 == -1) {
            j2 = Long.MAX_VALUE;
        }
        C30567im m32869a = this.f87410c.m32869a(str);
        if (m32869a != null) {
            j3 = m32869a.m33197a(j, j2);
        } else {
            j3 = -j2;
        }
        return j3;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31296rl
    /* renamed from: e */
    public final synchronized C30255em mo27745e(String str, long j, long j2) throws InterruptedException, InterfaceC31296rl.C31297a {
        C30255em mo27747c;
        m27767a();
        while (true) {
            mo27747c = mo27747c(str, j, j2);
            if (mo27747c == null) {
                wait();
            }
        }
        return mo27747c;
    }

    /* renamed from: a */
    private void m27764a(yt1 yt1Var) {
        this.f87410c.m32863c(yt1Var.f78702b).m33194a(yt1Var);
        ArrayList<InterfaceC31296rl.InterfaceC31298b> arrayList = this.f87412e.get(yt1Var.f78702b);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).mo29986a(this, yt1Var);
            }
        }
        this.f87409b.mo29986a(this, yt1Var);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31296rl
    /* renamed from: b */
    public final synchronized long mo27752b(String str, long j, long j2) {
        long j3;
        long j4 = j2 == -1 ? Long.MAX_VALUE : j + j2;
        long j5 = j4 < 0 ? Long.MAX_VALUE : j4;
        long j6 = j;
        j3 = 0;
        while (j6 < j5) {
            long mo27746d = mo27746d(str, j6, j5 - j6);
            if (mo27746d > 0) {
                j3 += mo27746d;
            } else {
                mo27746d = -mo27746d;
            }
            j6 += mo27746d;
        }
        return j3;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31296rl
    /* renamed from: b */
    public final synchronized C30130cy mo27753b(String str) {
        return this.f87410c.m32865b(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m27757b() {
        long j;
        if (!this.f87408a.exists()) {
            try {
                m27763a(this.f87408a);
            } catch (InterfaceC31296rl.C31297a e) {
                this.f87416i = e;
                return;
            }
        }
        File[] listFiles = this.f87408a.listFiles();
        if (listFiles == null) {
            String str = "Failed to list cache directory files: " + this.f87408a;
            gq0.m33795b("SimpleCache", str);
            this.f87416i = new InterfaceC31296rl.C31297a(str);
            return;
        }
        int length = listFiles.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                j = -1;
                break;
            }
            File file = listFiles[i];
            String name = file.getName();
            if (name.endsWith(".uid")) {
                try {
                    j = Long.parseLong(name.substring(0, name.indexOf(46)), 16);
                    break;
                } catch (NumberFormatException unused) {
                    gq0.m33795b("SimpleCache", "Malformed UID file: " + file);
                    file.delete();
                }
            }
            i++;
        }
        this.f87415h = j;
        if (j == -1) {
            try {
                this.f87415h = m27754b(this.f87408a);
            } catch (IOException e2) {
                String str2 = "Failed to create cache UID: " + this.f87408a;
                gq0.m33797a("SimpleCache", str2, e2);
                this.f87416i = new InterfaceC31296rl.C31297a(str2, e2);
                return;
            }
        }
        try {
            this.f87410c.m32871a(this.f87415h);
            C29947am c29947am = this.f87411d;
            if (c29947am != null) {
                c29947am.m35833a(this.f87415h);
                HashMap m35834a = this.f87411d.m35834a();
                m27761a(this.f87408a, true, listFiles, m35834a);
                this.f87411d.m35830a(m35834a.keySet());
            } else {
                m27761a(this.f87408a, true, listFiles, null);
            }
            this.f87410c.m32867b();
            try {
                this.f87410c.m32864c();
            } catch (Throwable th) {
                gq0.m33797a("SimpleCache", "Storing index file failed", th);
            }
        } catch (Throwable th2) {
            String str3 = "Failed to initialize cache indices: " + this.f87408a;
            gq0.m33797a("SimpleCache", str3, th2);
            this.f87416i = new InterfaceC31296rl.C31297a(str3, th2);
        }
    }

    /* renamed from: c */
    private void m27750c(C30255em c30255em) {
        C30567im m32869a = this.f87410c.m32869a(c30255em.f78702b);
        if (m32869a == null || !m32869a.m33196a(c30255em)) {
            return;
        }
        if (this.f87411d != null) {
            String name = c30255em.f78706f.getName();
            try {
                this.f87411d.m35832a(name);
            } catch (IOException unused) {
                ss0.m29541a("Failed to remove file index entry for: ", name, "SimpleCache");
            }
        }
        this.f87410c.m32862d(m32869a.f80530b);
        ArrayList<InterfaceC31296rl.InterfaceC31298b> arrayList = this.f87412e.get(c30255em.f78702b);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).mo29987a(c30255em);
            }
        }
        this.f87409b.mo29987a(c30255em);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31296rl
    /* renamed from: a */
    public final synchronized void mo27758a(String str, C31762wq c31762wq) throws InterfaceC31296rl.C31297a {
        m27767a();
        this.f87410c.m32868a(str, c31762wq);
        this.f87410c.m32864c();
    }

    /* renamed from: a */
    public final synchronized void m27767a() throws InterfaceC31296rl.C31297a {
        InterfaceC31296rl.C31297a c31297a = this.f87416i;
        if (c31297a != null) {
            throw c31297a;
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31296rl
    /* renamed from: a */
    public final synchronized void mo27762a(File file, long j) throws InterfaceC31296rl.C31297a {
        if (file.exists()) {
            if (j == 0) {
                file.delete();
                return;
            }
            yt1 m26581a = yt1.m26581a(file, j, -9223372036854775807L, this.f87410c);
            m26581a.getClass();
            C30567im m32869a = this.f87410c.m32869a(m26581a.f78702b);
            m32869a.getClass();
            if (m32869a.m33189c(m26581a.f78703c, m26581a.f78704d)) {
                long m35136b = m32869a.m33199a().m35136b();
                if (m35136b != -1 && m26581a.f78703c + m26581a.f78704d > m35136b) {
                    throw new IllegalStateException();
                }
                if (this.f87411d != null) {
                    try {
                        this.f87411d.m35831a(file.getName(), m26581a.f78704d, m26581a.f78707g);
                    } catch (IOException e) {
                        throw new InterfaceC31296rl.C31297a(e);
                    }
                }
                m27764a(m26581a);
                this.f87410c.m32864c();
                notifyAll();
                return;
            }
            throw new IllegalStateException();
        }
    }

    public wt1(File file, qo0 qo0Var, @Nullable z30 z30Var) {
        this(file, qo0Var, new C30634jm(z30Var, file), new C29947am(z30Var));
    }

    /* renamed from: c */
    private void m27751c() {
        ArrayList arrayList = new ArrayList();
        for (C30567im c30567im : this.f87410c.m32873a()) {
            Iterator<yt1> it = c30567im.m33192b().iterator();
            while (it.hasNext()) {
                yt1 next = it.next();
                if (next.f78706f.length() != next.f78704d) {
                    arrayList.add(next);
                }
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            m27750c((C30255em) arrayList.get(i));
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31296rl
    @Nullable
    /* renamed from: c */
    public final synchronized C30255em mo27747c(String str, long j, long j2) throws InterfaceC31296rl.C31297a {
        yt1 m33191b;
        yt1 yt1Var;
        boolean z;
        m27767a();
        C30567im m32869a = this.f87410c.m32869a(str);
        if (m32869a == null) {
            yt1Var = yt1.m26579a(str, j, j2);
        } else {
            while (true) {
                m33191b = m32869a.m33191b(j, j2);
                if (!m33191b.f78705e || m33191b.f78706f.length() == m33191b.f78704d) {
                    break;
                }
                m27751c();
            }
            yt1Var = m33191b;
        }
        if (yt1Var.f78705e) {
            if (this.f87414g) {
                File file = yt1Var.f78706f;
                file.getClass();
                String name = file.getName();
                long j3 = yt1Var.f78704d;
                long currentTimeMillis = System.currentTimeMillis();
                C29947am c29947am = this.f87411d;
                if (c29947am != null) {
                    try {
                        c29947am.m35831a(name, j3, currentTimeMillis);
                    } catch (IOException unused) {
                        gq0.m33792d("SimpleCache", "Failed to update index with new touch timestamp.");
                    }
                    z = false;
                } else {
                    z = true;
                }
                yt1 m33193a = this.f87410c.m32869a(str).m33193a(yt1Var, currentTimeMillis, z);
                ArrayList<InterfaceC31296rl.InterfaceC31298b> arrayList = this.f87412e.get(yt1Var.f78702b);
                if (arrayList != null) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        arrayList.get(size).mo29985a(this, yt1Var, m33193a);
                    }
                }
                this.f87409b.mo29985a(this, yt1Var, m33193a);
                yt1Var = m33193a;
            }
            return yt1Var;
        }
        if (this.f87410c.m32863c(str).m33187d(j, yt1Var.f78704d)) {
            return yt1Var;
        }
        return null;
    }

    /* renamed from: a */
    private static void m27763a(File file) throws InterfaceC31296rl.C31297a {
        if (file.mkdirs() || file.isDirectory()) {
            return;
        }
        String str = "Failed to create cache directory: " + file;
        gq0.m33795b("SimpleCache", str);
        throw new InterfaceC31296rl.C31297a(str);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31296rl
    /* renamed from: b */
    public final synchronized void mo27756b(C30255em c30255em) {
        C30567im m32869a = this.f87410c.m32869a(c30255em.f78702b);
        m32869a.getClass();
        m32869a.m33198a(c30255em.f78703c);
        this.f87410c.m32862d(m32869a.f80530b);
        notifyAll();
    }

    /* renamed from: a */
    private void m27761a(File file, boolean z, @Nullable File[] fileArr, @Nullable HashMap hashMap) {
        long j;
        long j2;
        if (fileArr == null || fileArr.length == 0) {
            if (z) {
                return;
            }
            file.delete();
            return;
        }
        for (File file2 : fileArr) {
            String name = file2.getName();
            if (z && name.indexOf(46) == -1) {
                m27761a(file2, false, file2.listFiles(), hashMap);
            } else if (!z || (!name.startsWith("monetization_cached_content_index.exi") && !name.endsWith(".uid"))) {
                C31997zl c31997zl = hashMap != null ? (C31997zl) hashMap.remove(name) : null;
                if (c31997zl != null) {
                    j2 = c31997zl.f88942a;
                    j = c31997zl.f88943b;
                } else {
                    j = -9223372036854775807L;
                    j2 = -1;
                }
                yt1 m26581a = yt1.m26581a(file2, j2, j, this.f87410c);
                if (m26581a != null) {
                    m27764a(m26581a);
                } else {
                    file2.delete();
                }
            }
        }
    }

    /* renamed from: b */
    private static long m27754b(File file) throws IOException {
        long nextLong = new SecureRandom().nextLong();
        long abs = nextLong == Long.MIN_VALUE ? 0L : Math.abs(nextLong);
        String l = Long.toString(abs, 16);
        File file2 = new File(file, l + ".uid");
        if (file2.createNewFile()) {
            return abs;
        }
        throw new IOException("Failed to create UID file: " + file2);
    }

    /* renamed from: c */
    private static synchronized boolean m27749c(File file) {
        boolean add;
        synchronized (wt1.class) {
            add = f87407j.add(file.getAbsoluteFile());
        }
        return add;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31296rl
    /* renamed from: a */
    public final synchronized void mo27760a(String str) {
        for (C30255em c30255em : m27748c(str)) {
            m27750c(c30255em);
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31296rl
    /* renamed from: a */
    public final synchronized void mo27766a(C30255em c30255em) {
        m27750c(c30255em);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31296rl
    /* renamed from: a */
    public final synchronized File mo27759a(String str, long j, long j2) throws InterfaceC31296rl.C31297a {
        File file;
        long currentTimeMillis;
        int i;
        m27767a();
        C30567im m32869a = this.f87410c.m32869a(str);
        m32869a.getClass();
        if (m32869a.m33189c(j, j2)) {
            if (!this.f87408a.exists()) {
                m27763a(this.f87408a);
                m27751c();
            }
            this.f87409b.mo26864a(this, j2);
            file = new File(this.f87408a, Integer.toString(this.f87413f.nextInt(10)));
            if (!file.exists()) {
                m27763a(file);
            }
            currentTimeMillis = System.currentTimeMillis();
            i = m32869a.f80529a;
            int i2 = yt1.f88542k;
        } else {
            throw new IllegalStateException();
        }
        return new File(file, i + "." + j + "." + currentTimeMillis + ".v3.exo");
    }
}
