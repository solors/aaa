package p797n4;

import android.content.Context;
import androidx.annotation.WorkerThread;
import com.learnings.learningsanalyze.repository.database.Database;
import java.util.concurrent.atomic.AtomicLong;
import p770l4.LearningsAnalytics;
import p828p4.AnalyzeDao;
import p858r4.SharedPreferencesManager;
import p993u4.C44433l;

/* renamed from: n4.d */
/* loaded from: classes6.dex */
public class PackageManager {

    /* renamed from: d */
    public static final Object f101769d = new Object();

    /* renamed from: a */
    private final AtomicLong f101770a;

    /* renamed from: b */
    private int f101771b;

    /* renamed from: c */
    private Context f101772c;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PackageManager.java */
    /* renamed from: n4.d$b */
    /* loaded from: classes6.dex */
    public static class C38427b {

        /* renamed from: a */
        private static final PackageManager f101773a = new PackageManager();
    }

    /* renamed from: c */
    public static PackageManager m14710c() {
        return C38427b.f101773a;
    }

    /* renamed from: d */
    private long m14709d() {
        try {
            AnalyzeDao mo53662c = Database.m53666d().mo53662c();
            return Math.max(Math.max(Math.max(Math.max(0L, mo53662c.mo13302o()), mo53662c.mo13300q()), mo53662c.mo13303n()), mo53662c.mo13301p());
        } catch (Throwable th) {
            th.printStackTrace();
            return 0L;
        }
    }

    /* renamed from: a */
    public void m14712a() {
        int i = this.f101771b + 1;
        this.f101771b = i;
        if (i >= 50) {
            m14707f();
        }
    }

    /* renamed from: b */
    public long m14711b() {
        return this.f101770a.get();
    }

    /* renamed from: e */
    public void m14708e(Context context) {
        this.f101772c = context;
        long m12680c = SharedPreferencesManager.m12681b().m12680c(context, "learnings_analyze", "event_bundle_sequence_id", 1L);
        long max = Math.max(m12680c, m14709d());
        try {
            if (Database.m53666d().mo53662c().mo13298s(LearningsAnalytics.m15694i().m15690m()) == max) {
                max++;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        long j = max;
        this.f101770a.set(j);
        if (m12680c < j) {
            SharedPreferencesManager.m12681b().m12676g(context, "learnings_analyze", "event_bundle_sequence_id", j);
        }
        try {
            this.f101771b = Database.m53666d().mo53662c().mo13305l(this.f101770a.get());
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        C44433l.m2997a("PackageManager", "init. currentCommitId = " + this.f101770a + " currentEventsNum = " + this.f101771b);
    }

    @WorkerThread
    /* renamed from: f */
    public void m14707f() {
        this.f101770a.incrementAndGet();
        C44433l.m2997a("PackageManager", "currentCommitId increase. currentCommitId = " + this.f101770a);
        this.f101771b = 0;
        SharedPreferencesManager.m12681b().m12676g(this.f101772c, "learnings_analyze", "event_bundle_sequence_id", this.f101770a.get());
    }

    private PackageManager() {
        this.f101770a = new AtomicLong(-1L);
        this.f101771b = 0;
    }
}
