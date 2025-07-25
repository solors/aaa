package p806o;

import android.graphics.Bitmap;
import androidx.collection.LruCache;
import coil.memory.MemoryCache;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1003v.Bitmaps;

/* compiled from: StrongMemoryCache.kt */
@Metadata
/* renamed from: o.e */
/* loaded from: classes2.dex */
public final class C38823e implements InterfaceC38829g {
    @NotNull

    /* renamed from: a */
    private final InterfaceC38830h f102223a;
    @NotNull

    /* renamed from: b */
    private final C38825b f102224b;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: StrongMemoryCache.kt */
    @Metadata
    /* renamed from: o.e$a */
    /* loaded from: classes2.dex */
    public static final class C38824a {
        @NotNull

        /* renamed from: a */
        private final Bitmap f102225a;
        @NotNull

        /* renamed from: b */
        private final Map<String, Object> f102226b;

        /* renamed from: c */
        private final int f102227c;

        public C38824a(@NotNull Bitmap bitmap, @NotNull Map<String, ? extends Object> map, int i) {
            this.f102225a = bitmap;
            this.f102226b = map;
            this.f102227c = i;
        }

        @NotNull
        /* renamed from: a */
        public final Bitmap m14017a() {
            return this.f102225a;
        }

        @NotNull
        /* renamed from: b */
        public final Map<String, Object> m14016b() {
            return this.f102226b;
        }

        /* renamed from: c */
        public final int m14015c() {
            return this.f102227c;
        }
    }

    /* compiled from: StrongMemoryCache.kt */
    @Metadata
    /* renamed from: o.e$b */
    /* loaded from: classes2.dex */
    public static final class C38825b extends LruCache<MemoryCache.Key, C38824a> {

        /* renamed from: a */
        final /* synthetic */ C38823e f102228a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C38825b(int i, C38823e c38823e) {
            super(i);
            this.f102228a = c38823e;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.collection.LruCache
        /* renamed from: a */
        public void entryRemoved(boolean z, @NotNull MemoryCache.Key key, @NotNull C38824a c38824a, @Nullable C38824a c38824a2) {
            this.f102228a.f102223a.mo14001c(key, c38824a.m14017a(), c38824a.m14016b(), c38824a.m14015c());
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.collection.LruCache
        /* renamed from: b */
        public int sizeOf(@NotNull MemoryCache.Key key, @NotNull C38824a c38824a) {
            return c38824a.m14015c();
        }
    }

    public C38823e(int i, @NotNull InterfaceC38830h interfaceC38830h) {
        this.f102223a = interfaceC38830h;
        this.f102224b = new C38825b(i, this);
    }

    @Override // p806o.InterfaceC38829g
    /* renamed from: a */
    public void mo14006a(int i) {
        if (i >= 40) {
            m14020e();
            return;
        }
        boolean z = false;
        if (10 <= i && i < 20) {
            z = true;
        }
        if (z) {
            this.f102224b.trimToSize(m14018g() / 2);
        }
    }

    @Override // p806o.InterfaceC38829g
    @Nullable
    /* renamed from: b */
    public MemoryCache.C3478b mo14005b(@NotNull MemoryCache.Key key) {
        C38824a c38824a = this.f102224b.get(key);
        if (c38824a != null) {
            return new MemoryCache.C3478b(c38824a.m14017a(), c38824a.m14016b());
        }
        return null;
    }

    @Override // p806o.InterfaceC38829g
    /* renamed from: c */
    public void mo14004c(@NotNull MemoryCache.Key key, @NotNull Bitmap bitmap, @NotNull Map<String, ? extends Object> map) {
        int m2856a = Bitmaps.m2856a(bitmap);
        if (m2856a <= m14019f()) {
            this.f102224b.put(key, new C38824a(bitmap, map, m2856a));
            return;
        }
        this.f102224b.remove(key);
        this.f102223a.mo14001c(key, bitmap, map, m2856a);
    }

    /* renamed from: e */
    public void m14020e() {
        this.f102224b.evictAll();
    }

    /* renamed from: f */
    public int m14019f() {
        return this.f102224b.maxSize();
    }

    /* renamed from: g */
    public int m14018g() {
        return this.f102224b.size();
    }
}
