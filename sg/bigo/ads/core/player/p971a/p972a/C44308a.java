package sg.bigo.ads.core.player.p971a.p972a;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import sg.bigo.ads.common.p918h.C43681a;
import sg.bigo.ads.common.p932t.C43782a;
import sg.bigo.ads.common.utils.C43823f;
import sg.bigo.ads.core.p958c.C44136b;
import sg.bigo.ads.core.player.p971a.InterfaceC44307a;

/* renamed from: sg.bigo.ads.core.player.a.a.a */
/* loaded from: classes10.dex */
public final class C44308a implements InterfaceC44307a {

    /* renamed from: a */
    public File f116309a;

    /* renamed from: b */
    public C43681a f116310b;

    /* renamed from: c */
    private RandomAccessFile f116311c;

    public C44308a(C43681a c43681a) {
        File file;
        try {
            this.f116310b = c43681a;
            File file2 = new File(c43681a.m5220a());
            this.f116309a = file2;
            if (file2.exists()) {
                file = this.f116309a;
            } else {
                file = new File(this.f116309a.getParentFile(), C43823f.m4891c(this.f116309a.getName()));
            }
            this.f116309a = file;
            this.f116311c = new RandomAccessFile(this.f116309a, "r");
        } catch (IOException e) {
            C43782a.m5009a(0, "ProxyCache", "Error using file " + this.f116309a + " as disc cache, error message is : " + e.toString());
        }
    }

    @Override // sg.bigo.ads.core.player.p971a.InterfaceC44307a
    /* renamed from: a */
    public final synchronized int mo3421a(byte[] bArr, long j) {
        int i;
        i = 0;
        try {
            this.f116311c.seek(j);
            i = this.f116311c.read(bArr, 0, 8192);
        } catch (IOException e) {
            C43782a.m5009a(0, "ProxyCache", "Error reading 8192 bytes with offset " + j + " from file[" + mo3422a() + " bytes] to buffer[" + bArr.length + " bytes], error message is : " + e.toString());
        }
        return i;
    }

    @Override // sg.bigo.ads.core.player.p971a.InterfaceC44307a
    /* renamed from: b */
    public final synchronized void mo3420b() {
        try {
            this.f116311c.close();
        } catch (IOException e) {
            C43782a.m5009a(0, "ProxyCache", "Error closing file " + this.f116309a + ", error message is : " + e.toString());
        }
    }

    @Override // sg.bigo.ads.core.player.p971a.InterfaceC44307a
    /* renamed from: c */
    public final synchronized boolean mo3419c() {
        return this.f116310b.m5219b();
    }

    @Override // sg.bigo.ads.core.player.p971a.InterfaceC44307a
    /* renamed from: a */
    public final synchronized long mo3422a() {
        long j;
        try {
            j = this.f116311c.length();
        } catch (IOException e) {
            C44136b.m3908a(3005, 10112, e.toString());
            C43782a.m5009a(0, "ProxyCache", "Error reading length of file " + this.f116309a + ", error message is : " + e.toString());
            j = 0;
        }
        return j;
    }
}
