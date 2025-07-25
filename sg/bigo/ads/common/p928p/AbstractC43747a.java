package sg.bigo.ads.common.p928p;

import android.graphics.Bitmap;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.URLUtil;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import sg.bigo.ads.common.C43597c;
import sg.bigo.ads.common.p918h.p919a.C43683a;
import sg.bigo.ads.common.p926n.C43727d;
import sg.bigo.ads.common.p932t.C43782a;
import sg.bigo.ads.common.p933u.AbstractC43793b;
import sg.bigo.ads.common.p933u.C43807g;
import sg.bigo.ads.common.p933u.C43808h;
import sg.bigo.ads.common.p933u.p934a.RunnableC43792e;
import sg.bigo.ads.common.p933u.p935b.C43795a;
import sg.bigo.ads.common.p933u.p935b.C43798d;
import sg.bigo.ads.common.p933u.p936c.C43800a;
import sg.bigo.ads.common.p942y.C43911a;
import sg.bigo.ads.common.utils.C43819d;
import sg.bigo.ads.common.utils.C43823f;
import sg.bigo.ads.common.utils.C43824g;
import sg.bigo.ads.common.utils.C43836q;

/* renamed from: sg.bigo.ads.common.p.a */
/* loaded from: classes10.dex */
public abstract class AbstractC43747a {
    @NonNull

    /* renamed from: b */
    protected C43683a f114480b;

    /* renamed from: a */
    final Map<String, C43755a> f114479a = new ConcurrentHashMap();

    /* renamed from: e */
    private final List<C43755a> f114483e = new CopyOnWriteArrayList();

    /* renamed from: f */
    private long f114484f = -1;

    /* renamed from: c */
    final Handler f114481c = new Handler(Looper.getMainLooper());

    /* renamed from: d */
    final byte[] f114482d = new byte[0];

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: sg.bigo.ads.common.p.a$a */
    /* loaded from: classes10.dex */
    public class C43755a {

        /* renamed from: a */
        final String f114507a;
        @Nullable

        /* renamed from: b */
        final String f114508b;

        /* renamed from: c */
        volatile boolean f114509c;

        /* renamed from: e */
        private final boolean f114511e;

        /* renamed from: f */
        private final List<InterfaceC43772g> f114512f;

        private C43755a(String str, @NonNull String str2, @Nullable boolean z, InterfaceC43772g interfaceC43772g) {
            ArrayList arrayList = new ArrayList();
            this.f114512f = arrayList;
            this.f114509c = false;
            this.f114507a = str;
            this.f114508b = str2;
            this.f114511e = z;
            arrayList.add(interfaceC43772g);
        }

        /* renamed from: a */
        final void m5050a(@Nullable Executor executor) {
            if (this.f114509c) {
                return;
            }
            this.f114509c = true;
            C43795a c43795a = new C43795a(C43911a.m4595a(), new C43798d(this.f114507a), this.f114511e);
            if (executor == null) {
                executor = RunnableC43792e.m4983h();
            }
            c43795a.f114617k = executor;
            C43807g.m4958a(c43795a, new AbstractC43793b<C43795a, C43800a>() { // from class: sg.bigo.ads.common.p.a.a.2
                @Override // sg.bigo.ads.common.p933u.AbstractC43793b
                /* renamed from: a */
                public final /* bridge */ /* synthetic */ C43800a mo3801a(@NonNull C43800a c43800a) {
                    return c43800a;
                }

                @Override // sg.bigo.ads.common.p933u.AbstractC43793b
                /* renamed from: a */
                public final /* synthetic */ void mo3803a(@NonNull C43795a c43795a2, @NonNull C43800a c43800a) {
                    C43800a c43800a2 = c43800a;
                    C43755a.this.f114509c = false;
                    String m4966a = c43800a2.m4966a("Content-Type");
                    C43782a.m5010a(0, 4, AbstractC43747a.this.mo5030c(), "Content-Type:".concat(String.valueOf(m4966a)));
                    if (Build.VERSION.SDK_INT == 28 && "image/webp".equalsIgnoreCase(m4966a)) {
                        C43755a.m5049a(C43755a.this, IronSourceConstants.RV_AD_UNIT_CAPPED, "Not support parsing webp images in Android P.", m4966a);
                        return;
                    }
                    C43755a c43755a = C43755a.this;
                    String m5062a = AbstractC43747a.m5062a(c43755a.f114507a, c43755a.f114508b);
                    AbstractC43747a abstractC43747a = AbstractC43747a.this;
                    InputStream inputStream = c43800a2.f114625b;
                    C43597c m5052f = inputStream == null ? null : abstractC43747a.m5052f(abstractC43747a.m5064a(inputStream, m5062a).getPath());
                    if (m5052f == null) {
                        C43755a.m5049a(C43755a.this, 1304, "Failed to parse image.", m4966a);
                        return;
                    }
                    String mo5030c = AbstractC43747a.this.mo5030c();
                    C43782a.m5010a(0, 4, mo5030c, "mimeType:" + m5052f.f114169b);
                    if (C43836q.m4837a((CharSequence) m5052f.f114169b)) {
                        m5052f.f114169b = m4966a;
                    }
                    AbstractC43747a.this.mo5033a(m5062a, m5052f);
                    C43755a.m5048a(C43755a.this, m5052f.f114168a, m5052f.f114169b, C43823f.m4897a(AbstractC43747a.this.mo5027d(m5062a), 2), m5052f.f114170c);
                    AbstractC43747a.this.m5053f();
                }

                @Override // sg.bigo.ads.common.p933u.AbstractC43793b
                /* renamed from: a */
                public final /* synthetic */ void mo3802a(@NonNull C43795a c43795a2, @NonNull C43808h c43808h) {
                    C43755a.this.f114509c = false;
                    C43755a.m5049a(C43755a.this, c43808h.f114641a, c43808h.getMessage(), "");
                }
            });
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && C43755a.class == obj.getClass()) {
                return this.f114507a.equals(((C43755a) obj).f114507a);
            }
            return false;
        }

        /* synthetic */ C43755a(AbstractC43747a abstractC43747a, String str, String str2, boolean z, InterfaceC43772g interfaceC43772g, byte b) {
            this(str, str2, z, interfaceC43772g);
        }

        /* renamed from: a */
        static /* synthetic */ void m5049a(C43755a c43755a, int i, String str, String str2) {
            synchronized (AbstractC43747a.this.f114482d) {
                String mo5030c = AbstractC43747a.this.mo5030c();
                C43782a.m5010a(0, 5, mo5030c, "Failed to download image: " + c43755a.f114507a);
                for (InterfaceC43772g interfaceC43772g : c43755a.f114512f) {
                    interfaceC43772g.mo5036a(i, str, str2);
                }
                AbstractC43747a.this.f114479a.remove(c43755a.f114507a);
                AbstractC43747a.this.m5055e();
            }
        }

        /* renamed from: a */
        static /* synthetic */ void m5048a(C43755a c43755a, final Bitmap bitmap, final String str, final long j, final String str2) {
            synchronized (AbstractC43747a.this.f114482d) {
                String mo5030c = AbstractC43747a.this.mo5030c();
                C43782a.m5010a(0, 4, mo5030c, "Succeed to download image: " + c43755a.f114507a);
                for (final InterfaceC43772g interfaceC43772g : c43755a.f114512f) {
                    AbstractC43747a.this.f114481c.post(new Runnable() { // from class: sg.bigo.ads.common.p.a.a.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            interfaceC43772g.mo5035a(bitmap, new C43771f(1, str, j, str2, C43755a.this.f114507a));
                        }
                    });
                }
                AbstractC43747a.this.f114479a.remove(c43755a.f114507a);
                AbstractC43747a.this.m5055e();
            }
        }

        /* renamed from: a */
        final void m5047a(InterfaceC43772g interfaceC43772g) {
            synchronized (AbstractC43747a.this.f114482d) {
                this.f114512f.add(interfaceC43772g);
            }
        }
    }

    @NonNull
    /* renamed from: a */
    final File m5064a(@NonNull InputStream inputStream, String str) {
        FileOutputStream fileOutputStream;
        Throwable th;
        String mo5032b = mo5032b();
        C43823f.m4896a(mo5032b, str);
        File file = new File(mo5032b, str);
        FileOutputStream fileOutputStream2 = null;
        try {
            fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[4096];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    fileOutputStream.write(bArr, 0, read);
                }
                fileOutputStream.flush();
                C43824g.m4888a((Closeable) inputStream);
                C43824g.m4888a(fileOutputStream);
            } catch (IOException unused) {
                fileOutputStream2 = fileOutputStream;
                C43824g.m4888a((Closeable) inputStream);
                C43824g.m4888a(fileOutputStream2);
                return file;
            } catch (Throwable th2) {
                th = th2;
                C43824g.m4888a((Closeable) inputStream);
                C43824g.m4888a(fileOutputStream);
                throw th;
            }
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            fileOutputStream = null;
            th = th3;
        }
        return file;
    }

    /* renamed from: a */
    protected abstract void mo5034a();

    /* renamed from: a */
    protected abstract void mo5033a(String str, C43597c c43597c);

    /* renamed from: b */
    protected abstract String mo5032b();

    /* renamed from: b */
    protected abstract C43597c mo5031b(String str);

    /* renamed from: c */
    protected abstract String mo5030c();

    /* renamed from: c */
    protected abstract void mo5029c(String str);

    /* renamed from: d */
    protected abstract int mo5028d();

    /* renamed from: d */
    protected abstract String mo5027d(String str);

    /* renamed from: e */
    final synchronized void m5055e() {
        if (this.f114483e.isEmpty()) {
            return;
        }
        C43782a.m5010a(0, 3, mo5030c(), "scheduleDownload");
        while (true) {
            if (!(this.f114479a.size() < this.f114480b.f114355a)) {
                String mo5030c = mo5030c();
                C43782a.m5010a(0, 3, mo5030c, "Current size of waiting list: " + this.f114483e.size());
                return;
            } else if (this.f114483e.isEmpty()) {
                return;
            } else {
                final C43755a remove = this.f114483e.remove(0);
                this.f114479a.put(remove.f114507a, remove);
                C43727d.m5108a(1, new Runnable() { // from class: sg.bigo.ads.common.p.a.4
                    @Override // java.lang.Runnable
                    public final void run() {
                        remove.m5050a((Executor) null);
                    }
                });
            }
        }
    }

    /* renamed from: f */
    final C43597c m5052f(String str) {
        return this instanceof C43767d ? C43819d.m4908d(str) : C43819d.m4909c(str);
    }

    /* renamed from: g */
    public final void m5051g() {
        synchronized (this.f114482d) {
            this.f114483e.clear();
            this.f114479a.clear();
            mo5034a();
        }
    }

    /* renamed from: a */
    static String m5062a(String str, String str2) {
        return !TextUtils.isEmpty(str2) ? str2 : String.valueOf(str.hashCode());
    }

    /* renamed from: e */
    public final boolean m5054e(String str) {
        String m5062a = m5062a(str, (String) null);
        return mo5031b(m5062a) != null || C43823f.m4894b(mo5027d(m5062a));
    }

    /* renamed from: f */
    public final synchronized void m5053f() {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f114484f > 3600000) {
            this.f114484f = currentTimeMillis;
            C43727d.m5108a(0, new Runnable() { // from class: sg.bigo.ads.common.p.a.5
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC43747a.m5057a(AbstractC43747a.this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m5061a(@Nullable Executor executor, @NonNull String str, @Nullable String str2, boolean z, InterfaceC43772g interfaceC43772g) {
        String str3;
        String str4;
        int i;
        if (!URLUtil.isNetworkUrl(str)) {
            str3 = "Unknown scheme.";
            str4 = "";
            i = 1301;
        } else if (!this.f114480b.m5209b()) {
            C43782a.m5010a(0, 3, mo5030c(), "Obtain the bitmap through network.");
            synchronized (this.f114482d) {
                if (this.f114479a.containsKey(str)) {
                    C43782a.m5010a(0, 3, mo5030c(), "The target url is already in the requesting list: ".concat(String.valueOf(str)));
                    C43755a c43755a = this.f114479a.get(str);
                    if (c43755a != null) {
                        c43755a.m5047a(interfaceC43772g);
                    }
                } else {
                    C43755a c43755a2 = new C43755a(this, str, str2, z, interfaceC43772g, (byte) 0);
                    int indexOf = this.f114483e.indexOf(c43755a2);
                    if (indexOf >= 0) {
                        C43782a.m5010a(0, 3, mo5030c(), "The target url is already in the waiting list: ".concat(String.valueOf(str)));
                        C43755a c43755a3 = this.f114483e.get(indexOf);
                        c43755a3.m5047a(interfaceC43772g);
                        if (executor != null) {
                            this.f114483e.remove(c43755a3);
                            m5059a(executor, c43755a3);
                        }
                    } else if (executor != null) {
                        m5059a(executor, c43755a2);
                    } else {
                        this.f114483e.add(c43755a2);
                        m5055e();
                    }
                }
            }
            return;
        } else {
            str3 = "Unable to download image.";
            str4 = "";
            i = IronSourceConstants.RV_AUCTION_SUCCESS;
        }
        interfaceC43772g.mo5036a(i, str3, str4);
    }

    /* renamed from: a */
    public final void m5060a(@Nullable final Executor executor, @NonNull final String str, final boolean z, final InterfaceC43772g interfaceC43772g) {
        String m5062a = m5062a(str, (String) null);
        final C43597c mo5031b = mo5031b(m5062a);
        if (mo5031b != null) {
            if (!mo5031b.f114168a.isRecycled()) {
                String mo5030c = mo5030c();
                C43782a.m5010a(0, 3, mo5030c, "Get bitmap from cache, mimeType=" + mo5031b.f114169b);
                this.f114481c.post(new Runnable() { // from class: sg.bigo.ads.common.p.a.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC43772g interfaceC43772g2 = interfaceC43772g;
                        C43597c c43597c = mo5031b;
                        interfaceC43772g2.mo5035a(c43597c.f114168a, new C43771f(2, c43597c.f114169b, 0L, c43597c.f114170c, str));
                    }
                });
                return;
            }
            mo5029c(m5062a);
        }
        if (!C43823f.m4894b(mo5027d(m5062a))) {
            m5061a(executor, str, null, z, interfaceC43772g);
            return;
        }
        final String m5062a2 = m5062a(str, (String) null);
        final String mo5027d = mo5027d(m5062a2);
        C43727d.m5108a(1, new Runnable() { // from class: sg.bigo.ads.common.p.a.2

            /* renamed from: f */
            final /* synthetic */ String f114494f = null;

            @Override // java.lang.Runnable
            public final void run() {
                final C43597c m5052f = AbstractC43747a.this.m5052f(mo5027d);
                AbstractC43747a abstractC43747a = AbstractC43747a.this;
                if (m5052f == null) {
                    abstractC43747a.m5061a(executor, str, this.f114494f, z, interfaceC43772g);
                    return;
                }
                abstractC43747a.mo5033a(m5062a2, m5052f);
                final long m4897a = C43823f.m4897a(mo5027d, 2);
                String mo5030c2 = AbstractC43747a.this.mo5030c();
                C43782a.m5010a(0, 3, mo5030c2, "Obtain the bitmap from local file, mimeType=" + m5052f.f114169b);
                AbstractC43747a.this.f114481c.post(new Runnable() { // from class: sg.bigo.ads.common.p.a.2.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        RunnableC437492 runnableC437492 = RunnableC437492.this;
                        InterfaceC43772g interfaceC43772g2 = interfaceC43772g;
                        C43597c c43597c = m5052f;
                        interfaceC43772g2.mo5035a(c43597c.f114168a, new C43771f(0, c43597c.f114169b, m4897a, c43597c.f114170c, str));
                    }
                });
                new File(mo5027d).setLastModified(System.currentTimeMillis());
                AbstractC43747a.this.m5053f();
            }
        });
    }

    /* renamed from: a */
    private synchronized void m5059a(@NonNull final Executor executor, final C43755a c43755a) {
        if (executor == null || c43755a == null) {
            return;
        }
        this.f114479a.put(c43755a.f114507a, c43755a);
        C43727d.m5108a(1, new Runnable() { // from class: sg.bigo.ads.common.p.a.3
            @Override // java.lang.Runnable
            public final void run() {
                c43755a.m5050a(executor);
            }
        });
    }

    /* renamed from: a */
    public final void m5058a(C43683a c43683a) {
        this.f114480b = c43683a;
    }

    /* renamed from: a */
    static /* synthetic */ void m5057a(AbstractC43747a abstractC43747a) {
        File[] listFiles;
        if (C43727d.m5104b()) {
            return;
        }
        C43782a.m5010a(0, 3, abstractC43747a.mo5030c(), "Start check and delete expired images.");
        File file = new File(abstractC43747a.mo5032b());
        if (!file.exists() || (listFiles = file.listFiles()) == null) {
            return;
        }
        Arrays.sort(listFiles, new Comparator<File>() { // from class: sg.bigo.ads.common.p.a.6
            @Override // java.util.Comparator
            public final /* synthetic */ int compare(File file2, File file3) {
                int i = ((file2.lastModified() - file3.lastModified()) > 0L ? 1 : ((file2.lastModified() - file3.lastModified()) == 0L ? 0 : -1));
                if (i > 0) {
                    return -1;
                }
                if (i == 0) {
                    return 0;
                }
                return 1;
            }
        });
        long currentTimeMillis = System.currentTimeMillis() - abstractC43747a.f114480b.f114358d;
        for (int i = 0; i < listFiles.length; i++) {
            File file2 = listFiles[i];
            if (i >= abstractC43747a.mo5028d() || file2.lastModified() <= currentTimeMillis) {
                file2.delete();
            }
        }
    }

    /* renamed from: a */
    public final boolean m5063a(String str) {
        boolean containsKey;
        synchronized (this.f114482d) {
            containsKey = this.f114479a.containsKey(str);
            if (!containsKey) {
                Iterator<C43755a> it = this.f114483e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (TextUtils.equals(it.next().f114507a, str)) {
                        containsKey = true;
                        break;
                    }
                }
            }
        }
        return containsKey;
    }
}
