package sg.bigo.ads.common.p918h.p920b;

import com.mbridge.msdk.foundation.download.core.IDownloadTask;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.InputStream;
import java.io.RandomAccessFile;
import sg.bigo.ads.common.p918h.C43681a;
import sg.bigo.ads.common.p932t.C43782a;
import sg.bigo.ads.common.p933u.C43799c;
import sg.bigo.ads.common.p933u.C43807g;
import sg.bigo.ads.common.p933u.p934a.RunnableC43792e;
import sg.bigo.ads.common.p933u.p935b.C43795a;
import sg.bigo.ads.common.p933u.p935b.C43798d;
import sg.bigo.ads.common.p933u.p936c.C43800a;
import sg.bigo.ads.common.p933u.p936c.C43801b;
import sg.bigo.ads.common.p942y.C43911a;
import sg.bigo.ads.common.utils.C43823f;
import sg.bigo.ads.common.utils.C43824g;
import sg.bigo.ads.common.utils.C43836q;

/* renamed from: sg.bigo.ads.common.h.b.d */
/* loaded from: classes10.dex */
public final class RunnableC43693d implements Runnable {

    /* renamed from: a */
    private final C43690a f114383a;

    /* renamed from: b */
    private InputStream f114384b;

    /* renamed from: c */
    private final File f114385c;

    public RunnableC43693d(C43690a c43690a) {
        this.f114383a = c43690a;
        C43681a c43681a = c43690a.f114377b;
        this.f114385c = new File(c43681a.f114337c, C43823f.m4891c(c43681a.f114338d));
    }

    /* renamed from: a */
    private void m5185a() {
        int i;
        boolean z;
        String str = "the download task error and download state is not loading.";
        m5184a("startDownloadTask");
        if (this.f114384b == null) {
            m5183b("downloadStream is null");
            return;
        }
        this.f114383a.f114380e = C43698h.f114393d;
        C43695f.m5177a().m5176a(this.f114383a.f114376a);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(this.f114384b);
        int i2 = 1048576;
        byte[] bArr = new byte[1048576];
        boolean z2 = false;
        RandomAccessFile randomAccessFile = null;
        try {
            try {
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(this.f114385c, "rwd");
                try {
                    long j = this.f114383a.f114377b.f114340f;
                    randomAccessFile2.seek(j);
                    C43782a.m5010a(0, 3, IDownloadTask.TAG, this.f114383a.f114376a + " startDownloadTask.");
                    while (true) {
                        int i3 = this.f114383a.f114380e;
                        i = C43698h.f114393d;
                        if (i3 != i) {
                            z = false;
                            break;
                        }
                        int read = bufferedInputStream.read(bArr, 0, i2);
                        if (read == -1) {
                            z = true;
                            break;
                        }
                        randomAccessFile2.write(bArr, 0, read);
                        j += read;
                        this.f114383a.m5196b(j);
                        C43695f.m5177a().m5176a(this.f114383a.f114376a);
                        i2 = 1048576;
                    }
                    if (z && j > 0 && this.f114385c.length() == j && this.f114383a.f114380e == i) {
                        File file = this.f114385c;
                        C43681a c43681a = this.f114383a.f114377b;
                        file.renameTo(new File(c43681a.f114337c, c43681a.f114338d));
                        this.f114383a.f114380e = C43698h.f114395f;
                        try {
                            C43695f.m5177a().m5176a(this.f114383a.f114376a);
                            m5184a("download is over.");
                            z2 = true;
                        } catch (Exception e) {
                            e = e;
                            z2 = true;
                            randomAccessFile = randomAccessFile2;
                            String message = e.getMessage();
                            if (!z2) {
                                if (!C43836q.m4837a((CharSequence) message)) {
                                    str = message;
                                } else if (this.f114383a.f114377b.f114340f <= 0 || this.f114385c.length() <= 0) {
                                    str = "the download file has a invalid size.";
                                } else if (this.f114383a.f114380e == C43698h.f114393d) {
                                    str = "the download stream has not been read completely.";
                                }
                                m5183b("Failed to download due to: ".concat(String.valueOf(str)));
                            }
                            C43824g.m4888a(randomAccessFile);
                            C43824g.m4888a((Closeable) bufferedInputStream);
                            C43824g.m4888a((Closeable) this.f114384b);
                            return;
                        } catch (Throwable th) {
                            th = th;
                            z2 = true;
                            randomAccessFile = randomAccessFile2;
                            if (!z2) {
                                if (!C43836q.m4837a((CharSequence) "")) {
                                    str = "";
                                } else if (this.f114383a.f114377b.f114340f <= 0 || this.f114385c.length() <= 0) {
                                    str = "the download file has a invalid size.";
                                } else if (this.f114383a.f114380e == C43698h.f114393d) {
                                    str = "the download stream has not been read completely.";
                                }
                                m5183b("Failed to download due to: ".concat(str));
                            }
                            C43824g.m4888a(randomAccessFile);
                            C43824g.m4888a((Closeable) bufferedInputStream);
                            C43824g.m4888a((Closeable) this.f114384b);
                            throw th;
                        }
                    }
                    if (!z2) {
                        if (!C43836q.m4837a((CharSequence) "")) {
                            str = "";
                        } else if (this.f114383a.f114377b.f114340f <= 0 || this.f114385c.length() <= 0) {
                            str = "the download file has a invalid size.";
                        } else if (this.f114383a.f114380e == i) {
                            str = "the download stream has not been read completely.";
                        }
                        m5183b("Failed to download due to: ".concat(str));
                    }
                    C43824g.m4888a(randomAccessFile2);
                    C43824g.m4888a((Closeable) bufferedInputStream);
                    C43824g.m4888a((Closeable) this.f114384b);
                } catch (Exception e2) {
                    e = e2;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    /* renamed from: b */
    private void m5183b(String str) {
        C43782a.m5009a(0, IDownloadTask.TAG, str + " , " + this.f114383a.f114376a + " has a error ! " + this.f114383a.toString());
        C43690a c43690a = this.f114383a;
        c43690a.f114381f = str;
        c43690a.f114380e = C43698h.f114396g;
        C43695f.m5177a().m5176a(this.f114383a.f114376a);
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j;
        boolean z;
        long j2;
        while (true) {
            C43795a c43795a = new C43795a(C43911a.m4595a(), new C43798d(this.f114383a.f114377b.f114336b), this.f114383a.f114377b.f114350p);
            c43795a.f114617k = RunnableC43792e.m4983h();
            String str = "bytes=" + this.f114383a.f114377b.f114340f + "-";
            c43795a.m4975a("Range", str);
            m5184a("Range = ".concat(String.valueOf(str)));
            C43799c<C43800a> m4957a = C43807g.m4957a(c43795a);
            C43800a c43800a = m4957a.f114622a;
            if (c43800a == null) {
                String str2 = "Failed to request url.";
                if (m4957a.f114623b != null) {
                    str2 = "Failed to request url. Error code: " + m4957a.f114623b.f114641a + ", error msg: " + m4957a.f114623b.getMessage();
                }
                m5183b(str2);
                return;
            }
            C43801b m4965a = C43801b.m4965a(c43800a.m4966a("Content-Range"));
            if (m4965a != null) {
                j = m4965a.f114630b;
            } else {
                j = 0;
            }
            if (j <= 0) {
                j = m4957a.f114622a.m4967a();
            }
            this.f114383a.m5197a(j);
            C43800a c43800a2 = m4957a.f114622a;
            this.f114384b = c43800a2.f114625b;
            this.f114383a.f114377b.f114349o = c43800a2.m4966a("Content-Type");
            z = true;
            if (!this.f114385c.exists()) {
                break;
            }
            C43681a c43681a = this.f114383a.f114377b;
            long j3 = c43681a.f114340f;
            if (m4965a != null) {
                j2 = m4965a.f114629a;
            } else {
                j2 = 0;
            }
            if (j3 > 0 && j3 == j2) {
                c43681a.f114348n = true;
                z = false;
                break;
            }
            m5184a("Delete tmp file.");
            if (!C43823f.m4899a(this.f114385c)) {
                m5183b("Failed to delete temp file.");
                return;
            }
            this.f114383a.m5196b(0L);
            if (j2 <= 0) {
                break;
            }
            C43824g.m4888a((Closeable) this.f114384b);
            this.f114384b = null;
        }
        if (z && !C43823f.m4892c(this.f114385c)) {
            m5183b("Failed to create temp file.");
            return;
        }
        this.f114383a.f114380e = C43698h.f114392c;
        C43695f.m5177a().m5176a(this.f114383a.f114376a);
        m5185a();
    }

    /* renamed from: a */
    private void m5184a(String str) {
        C43782a.m5010a(0, 3, IDownloadTask.TAG, str + ",taskId=" + this.f114383a.f114376a + ", downloadinfo = " + this.f114383a.toString());
    }
}
