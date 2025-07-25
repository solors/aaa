package sg.bigo.ads.common.p928p;

import java.io.File;
import sg.bigo.ads.common.C43597c;
import sg.bigo.ads.common.C43736o;
import sg.bigo.ads.common.p918h.p919a.C43683a;
import sg.bigo.ads.common.p928p.C43763c;
import sg.bigo.ads.common.p932t.C43782a;

/* renamed from: sg.bigo.ads.common.p.h */
/* loaded from: classes10.dex */
public final class C43773h extends AbstractC43747a {

    /* renamed from: sg.bigo.ads.common.p.h$a */
    /* loaded from: classes10.dex */
    public static class C43774a {

        /* renamed from: a */
        private static final C43773h f114550a = new C43773h((byte) 0);

        /* renamed from: a */
        public static /* synthetic */ C43773h m5026a() {
            return f114550a;
        }
    }

    private C43773h() {
        this.f114480b = new C43683a();
    }

    @Override // sg.bigo.ads.common.p928p.AbstractC43747a
    /* renamed from: a */
    protected final void mo5034a() {
        C43763c c43763c;
        c43763c = C43763c.C43766a.f114540a;
        c43763c.f114536b.evictAll();
    }

    @Override // sg.bigo.ads.common.p928p.AbstractC43747a
    /* renamed from: b */
    protected final String mo5032b() {
        return C43736o.m5087d();
    }

    @Override // sg.bigo.ads.common.p928p.AbstractC43747a
    /* renamed from: c */
    protected final String mo5030c() {
        return "ImageLoader";
    }

    @Override // sg.bigo.ads.common.p928p.AbstractC43747a
    /* renamed from: d */
    protected final int mo5028d() {
        return this.f114480b.m5212a();
    }

    /* synthetic */ C43773h(byte b) {
        this();
    }

    @Override // sg.bigo.ads.common.p928p.AbstractC43747a
    /* renamed from: a */
    protected final void mo5033a(String str, C43597c c43597c) {
        C43763c c43763c;
        c43763c = C43763c.C43766a.f114540a;
        if (c43597c.f114168a.isRecycled()) {
            return;
        }
        c43763c.f114536b.put(str, c43597c);
        C43782a.m5010a(0, 3, "BitmapCacheManager", "The left cache size: " + (c43763c.f114535a - c43763c.f114536b.size()));
    }

    @Override // sg.bigo.ads.common.p928p.AbstractC43747a
    /* renamed from: b */
    protected final C43597c mo5031b(String str) {
        C43763c c43763c;
        c43763c = C43763c.C43766a.f114540a;
        return c43763c.f114536b.get(str);
    }

    @Override // sg.bigo.ads.common.p928p.AbstractC43747a
    /* renamed from: c */
    protected final void mo5029c(String str) {
        C43763c c43763c;
        c43763c = C43763c.C43766a.f114540a;
        c43763c.f114536b.remove(str);
    }

    @Override // sg.bigo.ads.common.p928p.AbstractC43747a
    /* renamed from: d */
    protected final String mo5027d(String str) {
        return C43736o.m5087d() + File.separator + str;
    }
}
