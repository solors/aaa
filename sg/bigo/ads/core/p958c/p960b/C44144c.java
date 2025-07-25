package sg.bigo.ads.core.p958c.p960b;

import android.content.ContentValues;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import sg.bigo.ads.common.p914g.p915a.C43666a;
import sg.bigo.ads.common.p914g.p916b.C43675b;
import sg.bigo.ads.common.p914g.p917c.C43678b;
import sg.bigo.ads.common.p932t.C43782a;
import sg.bigo.ads.common.utils.C43834p;
import sg.bigo.ads.core.p958c.p959a.C44134a;
import sg.bigo.ads.core.p958c.p961c.C44149a;

/* renamed from: sg.bigo.ads.core.c.b.c */
/* loaded from: classes10.dex */
public final class C44144c {

    /* renamed from: a */
    public Set<C43675b> f115850a;

    /* renamed from: b */
    public Set<C43675b> f115851b;

    /* renamed from: c */
    private final C44134a f115852c;

    public C44144c(@NonNull C44134a c44134a) {
        this.f115852c = c44134a;
        this.f115850a = C43834p.m4848a(c44134a.f115826a);
        this.f115851b = C43834p.m4848a(c44134a.f115826a);
        C44149a.m3816a(new Runnable() { // from class: sg.bigo.ads.core.c.b.c.1
            @Override // java.lang.Runnable
            public final void run() {
                C44144c c44144c = C44144c.this;
                long currentTimeMillis = System.currentTimeMillis();
                C43782a.m5010a(0, 3, "StatsDbHelper", "clearStatInfo");
                C43782a.m5010a(0, 3, "StatsDbHelper", "clearStatInfo count = ".concat(String.valueOf(C43666a.m5237b("tb_stat", "expired_ts < ".concat(String.valueOf(currentTimeMillis)), null))));
                c44144c.f115850a.addAll(c44144c.m3827e());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized List<C43675b> m3833a() {
        ArrayList arrayList;
        arrayList = new ArrayList(this.f115850a);
        for (C43675b c43675b : this.f115851b) {
            arrayList.remove(c43675b);
        }
        this.f115850a.clear();
        this.f115851b.addAll(arrayList);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized int m3830b() {
        return this.f115850a.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final synchronized boolean m3829c() {
        return this.f115850a.isEmpty();
    }

    /* renamed from: d */
    public final synchronized void m3828d() {
        if (this.f115850a.isEmpty()) {
            List<C43675b> m3827e = m3827e();
            for (C43675b c43675b : this.f115851b) {
                m3827e.remove(c43675b);
            }
            this.f115850a.addAll(m3827e);
        }
    }

    /* renamed from: e */
    final List<C43675b> m3827e() {
        return C43678b.m5231a(this.f115852c.m3916a());
    }

    /* renamed from: f */
    public final synchronized void m3826f() {
        this.f115851b.clear();
        this.f115850a.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void m3832a(List<C43675b> list, boolean z) {
        this.f115851b.removeAll(list);
        if (!z) {
            this.f115850a.addAll(list);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (C43675b c43675b : list) {
            arrayList.add(String.valueOf(c43675b.f114320a));
        }
        C43678b.m5230a(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void m3831a(C43675b c43675b) {
        this.f115850a.add(c43675b);
        C43782a.m5010a(0, 3, "StatsDbHelper", "insertStatInfo:" + c43675b.toString());
        ContentValues contentValues = new ContentValues();
        contentValues.put("event_id", c43675b.f114321b);
        contentValues.put("event_info", c43675b.f114322c);
        contentValues.put("expired_ts", Long.valueOf(c43675b.f114323d));
        contentValues.put("ext", c43675b.f114324e);
        long j = c43675b.f114325f;
        if (j == 0) {
            j = System.currentTimeMillis();
        }
        contentValues.put("ctime", Long.valueOf(j));
        long j2 = c43675b.f114326g;
        if (j2 == 0) {
            j2 = System.currentTimeMillis();
        }
        contentValues.put("mtime", Long.valueOf(j2));
        c43675b.f114320a = C43666a.m5243a("tb_stat", contentValues);
    }
}
