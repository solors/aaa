package sg.bigo.ads.common;

import android.content.Context;
import android.os.Parcel;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import sg.bigo.ads.common.p926n.C43727d;
import sg.bigo.ads.common.p932t.C43782a;
import sg.bigo.ads.common.utils.C43824g;
import sg.bigo.ads.common.utils.C43833o;

/* renamed from: sg.bigo.ads.common.e */
/* loaded from: classes10.dex */
public abstract class AbstractC43610e implements InterfaceC43615f {
    @NonNull

    /* renamed from: b */
    public final Context f114184b;

    /* renamed from: a */
    private final Runnable f114183a = new Runnable() { // from class: sg.bigo.ads.common.e.1
        @Override // java.lang.Runnable
        public final void run() {
            AbstractC43610e.this.m5315w();
        }
    };

    /* renamed from: c */
    public boolean f114185c = false;

    /* renamed from: d */
    protected boolean f114186d = false;

    public AbstractC43610e(@NonNull Context context) {
        this.f114184b = context;
    }

    @CallSuper
    /* renamed from: x */
    private void m5314x() {
        this.f114185c = true;
        C43782a.m5010a(0, 3, mo4443b(), "onDataSaved, ".concat(String.valueOf(this)));
    }

    /* renamed from: a */
    protected abstract String mo4447a();

    /* renamed from: a */
    public final void m5317a(long j) {
        C43727d.m5106a(this.f114183a);
        if (j <= 0) {
            C43727d.m5108a(1, this.f114183a);
        } else {
            C43727d.m5107a(1, this.f114183a, j);
        }
    }

    /* renamed from: b */
    protected abstract String mo4443b();

    /* JADX INFO: Access modifiers changed from: protected */
    @CallSuper
    /* renamed from: u */
    public void mo4488u() {
        this.f114185c = true;
        C43782a.m5010a(0, 3, mo4443b(), "onDataLoaded, ".concat(String.valueOf(this)));
    }

    /* renamed from: v */
    public final synchronized void m5316v() {
        ByteArrayInputStream byteArrayInputStream = null;
        try {
            try {
                File file = new File(C43736o.m5092a(), mo4447a());
                this.f114186d = file.exists();
                byte[] m4885b = C43824g.m4885b(file);
                if (m4885b == null) {
                    C43782a.m5010a(0, 4, mo4443b(), "data file not exist");
                    mo4488u();
                    return;
                }
                byte[] m4850b = C43833o.m4850b(m4885b);
                if (m4850b == null) {
                    String mo4443b = mo4443b();
                    C43782a.m5009a(0, mo4443b, "data decrypt failed length=" + m4885b.length);
                    file.delete();
                    mo4488u();
                    return;
                }
                ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(m4850b);
                try {
                    int available = byteArrayInputStream2.available();
                    byte[] bArr = new byte[available];
                    byteArrayInputStream2.read(bArr);
                    Parcel obtain = Parcel.obtain();
                    obtain.unmarshall(bArr, 0, available);
                    obtain.setDataPosition(0);
                    mo4437b(obtain);
                    try {
                        byteArrayInputStream2.close();
                    } catch (IOException unused) {
                        C43782a.m5010a(0, 5, mo4443b(), "close data input stream failed");
                    }
                    mo4488u();
                } catch (Exception unused2) {
                    byteArrayInputStream = byteArrayInputStream2;
                    C43782a.m5010a(0, 5, mo4443b(), "DataFile load failed");
                    if (byteArrayInputStream != null) {
                        try {
                            byteArrayInputStream.close();
                        } catch (IOException unused3) {
                            C43782a.m5010a(0, 5, mo4443b(), "close data input stream failed");
                        }
                    }
                    mo4488u();
                } catch (Throwable th) {
                    th = th;
                    byteArrayInputStream = byteArrayInputStream2;
                    if (byteArrayInputStream != null) {
                        try {
                            byteArrayInputStream.close();
                        } catch (IOException unused4) {
                            C43782a.m5010a(0, 5, mo4443b(), "close data input stream failed");
                        }
                    }
                    mo4488u();
                    throw th;
                }
            } catch (Exception unused5) {
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: w */
    public final synchronized void m5315w() {
        ByteArrayOutputStream byteArrayOutputStream;
        Throwable th;
        FileOutputStream fileOutputStream;
        Throwable th2;
        String str;
        String str2;
        C43727d.m5106a(this.f114183a);
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        r0 = null;
        FileOutputStream fileOutputStream2 = null;
        byteArrayOutputStream2 = null;
        try {
            try {
                Parcel obtain = Parcel.obtain();
                mo4441a(obtain);
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    byteArrayOutputStream.write(obtain.marshall());
                    byteArrayOutputStream.flush();
                    byte[] m4855a = C43833o.m4855a(byteArrayOutputStream.toByteArray());
                    if (m4855a == null) {
                        C43782a.m5009a(0, mo4443b(), "## data encrypt failed.");
                        try {
                            byteArrayOutputStream.close();
                        } catch (IOException unused) {
                            C43782a.m5010a(0, 5, mo4443b(), "close output stream failed");
                        }
                        this.f114186d = true;
                        m5314x();
                        return;
                    }
                    File file = new File(C43736o.m5092a(), mo4447a());
                    File m4887a = C43824g.m4887a(file);
                    if (file.exists()) {
                        if (!m4887a.exists()) {
                            if (!file.renameTo(m4887a)) {
                                str = "IOUtils";
                                str2 = "rename locked file failed: " + file.getName();
                                C43782a.m5009a(0, str, str2);
                            }
                        } else if (!file.delete()) {
                            str = "IOUtils";
                            str2 = "delete locked file failed: " + file.getName();
                            C43782a.m5009a(0, str, str2);
                        }
                    }
                    try {
                        try {
                            try {
                                fileOutputStream = new FileOutputStream(file);
                                try {
                                    fileOutputStream.write(m4855a);
                                    fileOutputStream.getFD().sync();
                                    if (m4887a.exists() && !m4887a.delete()) {
                                        C43782a.m5009a(0, "IOUtils", "delete backup file failed: " + m4887a.getName());
                                    }
                                    fileOutputStream.close();
                                } catch (Exception unused2) {
                                    fileOutputStream2 = fileOutputStream;
                                    C43782a.m5009a(0, "IOUtils", "write file " + file.getPath() + " failed");
                                    if (file.exists() && !file.delete()) {
                                        C43782a.m5009a(0, "IOUtils", "delete locked file with exception failed: " + file.getName());
                                    }
                                    if (fileOutputStream2 != null) {
                                        fileOutputStream2.close();
                                    }
                                    C43782a.m5010a(0, 4, mo4443b(), "data saved:".concat(String.valueOf(this)));
                                    try {
                                        byteArrayOutputStream.close();
                                    } catch (IOException unused3) {
                                        C43782a.m5010a(0, 5, mo4443b(), "close output stream failed");
                                    }
                                    this.f114186d = true;
                                    m5314x();
                                    return;
                                } catch (Throwable th3) {
                                    th2 = th3;
                                    if (fileOutputStream != null) {
                                        try {
                                            fileOutputStream.close();
                                        } catch (IOException unused4) {
                                        }
                                    }
                                    throw th2;
                                }
                            } catch (IOException unused5) {
                                C43782a.m5010a(0, 4, mo4443b(), "data saved:".concat(String.valueOf(this)));
                                byteArrayOutputStream.close();
                                this.f114186d = true;
                                m5314x();
                                return;
                            }
                        } catch (Throwable th4) {
                            fileOutputStream = fileOutputStream2;
                            th2 = th4;
                        }
                    } catch (Exception unused6) {
                    }
                } catch (Exception unused7) {
                    byteArrayOutputStream2 = byteArrayOutputStream;
                    C43782a.m5010a(0, 5, mo4443b(), "data save failed");
                    if (byteArrayOutputStream2 != null) {
                        try {
                            byteArrayOutputStream2.close();
                        } catch (IOException unused8) {
                            C43782a.m5010a(0, 5, mo4443b(), "close output stream failed");
                        }
                    }
                    this.f114186d = true;
                    m5314x();
                    return;
                } catch (Throwable th5) {
                    th = th5;
                    if (byteArrayOutputStream != null) {
                        try {
                            byteArrayOutputStream.close();
                        } catch (IOException unused9) {
                            C43782a.m5010a(0, 5, mo4443b(), "close output stream failed");
                        }
                    }
                    this.f114186d = true;
                    m5314x();
                    throw th;
                }
            } catch (Throwable th6) {
                byteArrayOutputStream = byteArrayOutputStream2;
                th = th6;
            }
        } catch (Exception unused10) {
        }
    }
}
