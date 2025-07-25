package sg.bigo.ads.common.p928p;

import android.util.LruCache;
import androidx.annotation.NonNull;
import sg.bigo.ads.common.C43597c;
import sg.bigo.ads.common.p912f.C43617a;
import sg.bigo.ads.common.p932t.C43782a;
import sg.bigo.ads.common.utils.C43834p;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: sg.bigo.ads.common.p.c */
/* loaded from: classes10.dex */
public final class C43763c {

    /* renamed from: a */
    final int f114535a;
    @NonNull

    /* renamed from: b */
    final LruCache<String, C43597c> f114536b;
    @NonNull

    /* renamed from: c */
    final LruCache<String, C43597c> f114537c;

    /* renamed from: sg.bigo.ads.common.p.c$a */
    /* loaded from: classes10.dex */
    static class C43766a {

        /* renamed from: a */
        private static final C43763c f114540a = new C43763c((byte) 0);
    }

    private C43763c() {
        int m4843c = C43834p.m4843c(C43617a.f114190a);
        this.f114535a = m4843c;
        C43782a.m5010a(0, 3, "BitmapCacheManager", "Total cache size: " + m4843c);
        this.f114536b = new LruCache<String, C43597c>(m4843c) { // from class: sg.bigo.ads.common.p.c.1
            @Override // android.util.LruCache
            protected final /* synthetic */ int sizeOf(@NonNull String str, @NonNull C43597c c43597c) {
                return c43597c.f114168a.getByteCount();
            }
        };
        this.f114537c = new LruCache<String, C43597c>(m4843c) { // from class: sg.bigo.ads.common.p.c.2
            @Override // android.util.LruCache
            protected final /* synthetic */ int sizeOf(@NonNull String str, @NonNull C43597c c43597c) {
                return c43597c.f114168a.getByteCount();
            }
        };
    }

    /* synthetic */ C43763c(byte b) {
        this();
    }
}
