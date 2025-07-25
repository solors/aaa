package sg.bigo.ads.common.p933u.p934a;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import sg.bigo.ads.common.InterfaceC43712l;
import sg.bigo.ads.common.p926n.ExecutorC43735e;
import sg.bigo.ads.common.p933u.AbstractC43793b;
import sg.bigo.ads.common.p933u.p935b.AbstractC43797c;

/* renamed from: sg.bigo.ads.common.u.a.e */
/* loaded from: classes10.dex */
public class RunnableC43792e implements Runnable {

    /* renamed from: a */
    private static final Map<String, ExecutorC43735e> f114597a = new HashMap();
    @Nullable

    /* renamed from: b */
    private static InterfaceC43712l f114598b;
    @NonNull

    /* renamed from: c */
    private final Executor f114599c;

    /* renamed from: d */
    private final AbstractC43797c f114600d;

    /* renamed from: e */
    private final AbstractC43793b f114601e;

    public RunnableC43792e(@Nullable Executor executor, AbstractC43797c abstractC43797c, AbstractC43793b abstractC43793b) {
        this.f114599c = executor == null ? m4993a() : executor;
        this.f114600d = abstractC43797c;
        this.f114601e = abstractC43793b;
    }

    /* renamed from: a */
    public static ExecutorC43735e m4993a() {
        InterfaceC43712l interfaceC43712l = f114598b;
        return m4992a("DefaultNet", 5, interfaceC43712l != null ? interfaceC43712l.mo4552p() : false);
    }

    /* renamed from: b */
    public static ExecutorC43735e m4989b() {
        int i;
        boolean z;
        InterfaceC43712l interfaceC43712l = f114598b;
        if (interfaceC43712l != null) {
            i = interfaceC43712l.mo4568a();
            z = interfaceC43712l.mo4566b();
        } else {
            i = 3;
            z = false;
        }
        return m4992a("ConfigNet", i, z);
    }

    /* renamed from: c */
    public static ExecutorC43735e m4988c() {
        int i;
        boolean z;
        InterfaceC43712l interfaceC43712l = f114598b;
        if (interfaceC43712l != null) {
            i = interfaceC43712l.mo4565c();
            z = interfaceC43712l.mo4564d();
        } else {
            i = 2;
            z = false;
        }
        return m4992a("ReportNet", i, z);
    }

    /* renamed from: d */
    public static ExecutorC43735e m4987d() {
        int i;
        boolean z;
        InterfaceC43712l interfaceC43712l = f114598b;
        if (interfaceC43712l != null) {
            i = interfaceC43712l.mo4563e();
            z = interfaceC43712l.mo4562f();
        } else {
            i = 12;
            z = false;
        }
        return m4992a("AdNet", i, z);
    }

    /* renamed from: e */
    public static ExecutorC43735e m4986e() {
        int i;
        boolean z;
        InterfaceC43712l interfaceC43712l = f114598b;
        if (interfaceC43712l != null) {
            i = interfaceC43712l.mo4561g();
            z = interfaceC43712l.mo4560h();
        } else {
            i = 3;
            z = false;
        }
        return m4992a("CallbackNet", i, z);
    }

    /* renamed from: f */
    public static ExecutorC43735e m4985f() {
        int i;
        boolean z;
        InterfaceC43712l interfaceC43712l = f114598b;
        if (interfaceC43712l != null) {
            i = interfaceC43712l.mo4559i();
            z = interfaceC43712l.mo4558j();
        } else {
            i = 3;
            z = false;
        }
        return m4992a("VastNet", i, z);
    }

    /* renamed from: g */
    public static ExecutorC43735e m4984g() {
        int i;
        boolean z;
        InterfaceC43712l interfaceC43712l = f114598b;
        if (interfaceC43712l != null) {
            i = interfaceC43712l.mo4557k();
            z = interfaceC43712l.mo4556l();
        } else {
            i = 10;
            z = false;
        }
        return m4992a("TrackerNet", i, z);
    }

    /* renamed from: h */
    public static ExecutorC43735e m4983h() {
        int i;
        boolean z;
        InterfaceC43712l interfaceC43712l = f114598b;
        if (interfaceC43712l != null) {
            i = interfaceC43712l.mo4555m();
            z = interfaceC43712l.mo4554n();
        } else {
            i = 5;
            z = false;
        }
        return m4992a("CreativeNet", i, z);
    }

    /* renamed from: i */
    public static ExecutorC43735e m4982i() {
        int i;
        boolean z;
        InterfaceC43712l interfaceC43712l = f114598b;
        if (interfaceC43712l != null) {
            z = interfaceC43712l.mo4553o();
            i = 40;
        } else {
            i = 5;
            z = false;
        }
        return m4992a("IconCreativeNet", i, z);
    }

    /* renamed from: j */
    public static ExecutorC43735e m4981j() {
        int i;
        if (f114598b != null) {
            i = 40;
        } else {
            i = 5;
        }
        return m4992a("BannerIconCreativeNet", i, true);
    }

    /* renamed from: l */
    public final void m4979l() {
        this.f114599c.execute(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC43793b abstractC43793b = this.f114601e;
        if (abstractC43793b != null) {
            abstractC43793b.mo4090a((AbstractC43793b) this.f114600d);
        }
        mo4990a(this.f114600d, this.f114601e);
    }

    /* renamed from: a */
    private static synchronized ExecutorC43735e m4992a(String str, int i, boolean z) {
        ExecutorC43735e executorC43735e;
        synchronized (RunnableC43792e.class) {
            if (TextUtils.isEmpty(str)) {
                str = "DefaultNet";
            }
            Map<String, ExecutorC43735e> map = f114597a;
            executorC43735e = map.get(str);
            if (executorC43735e == null) {
                executorC43735e = new ExecutorC43735e(str, i, z);
                map.put(str, executorC43735e);
            }
        }
        return executorC43735e;
    }

    /* renamed from: a */
    public static void m4991a(@Nullable InterfaceC43712l interfaceC43712l) {
        f114598b = interfaceC43712l;
    }

    /* renamed from: a */
    protected void mo4990a(AbstractC43797c abstractC43797c, AbstractC43793b abstractC43793b) {
    }

    /* renamed from: k */
    public static void m4980k() {
    }
}
