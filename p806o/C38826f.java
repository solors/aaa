package p806o;

import android.graphics.Bitmap;
import androidx.annotation.VisibleForTesting;
import coil.memory.MemoryCache;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections._Collections;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: WeakMemoryCache.kt */
@Metadata
/* renamed from: o.f */
/* loaded from: classes2.dex */
public final class C38826f implements InterfaceC38830h {
    @NotNull

    /* renamed from: c */
    public static final C38827a f102229c = new C38827a(null);
    @NotNull

    /* renamed from: a */
    private final LinkedHashMap<MemoryCache.Key, ArrayList<C38828b>> f102230a = new LinkedHashMap<>();

    /* renamed from: b */
    private int f102231b;

    /* compiled from: WeakMemoryCache.kt */
    @Metadata
    /* renamed from: o.f$a */
    /* loaded from: classes2.dex */
    public static final class C38827a {
        private C38827a() {
        }

        public /* synthetic */ C38827a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: WeakMemoryCache.kt */
    @Metadata
    @VisibleForTesting
    /* renamed from: o.f$b */
    /* loaded from: classes2.dex */
    public static final class C38828b {

        /* renamed from: a */
        private final int f102232a;
        @NotNull

        /* renamed from: b */
        private final WeakReference<Bitmap> f102233b;
        @NotNull

        /* renamed from: c */
        private final Map<String, Object> f102234c;

        /* renamed from: d */
        private final int f102235d;

        public C38828b(int i, @NotNull WeakReference<Bitmap> weakReference, @NotNull Map<String, ? extends Object> map, int i2) {
            this.f102232a = i;
            this.f102233b = weakReference;
            this.f102234c = map;
            this.f102235d = i2;
        }

        @NotNull
        /* renamed from: a */
        public final WeakReference<Bitmap> m14010a() {
            return this.f102233b;
        }

        @NotNull
        /* renamed from: b */
        public final Map<String, Object> m14009b() {
            return this.f102234c;
        }

        /* renamed from: c */
        public final int m14008c() {
            return this.f102232a;
        }

        /* renamed from: d */
        public final int m14007d() {
            return this.f102235d;
        }
    }

    /* renamed from: e */
    private final void m14011e() {
        int i = this.f102231b;
        this.f102231b = i + 1;
        if (i >= 10) {
            m14012d();
        }
    }

    @Override // p806o.InterfaceC38830h
    /* renamed from: a */
    public synchronized void mo14003a(int i) {
        if (i >= 10 && i != 20) {
            m14012d();
        }
    }

    @Override // p806o.InterfaceC38830h
    @Nullable
    /* renamed from: b */
    public synchronized MemoryCache.C3478b mo14002b(@NotNull MemoryCache.Key key) {
        MemoryCache.C3478b c3478b;
        ArrayList<C38828b> arrayList = this.f102230a.get(key);
        MemoryCache.C3478b c3478b2 = null;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            C38828b c38828b = arrayList.get(i);
            Bitmap bitmap = c38828b.m14010a().get();
            if (bitmap != null) {
                c3478b = new MemoryCache.C3478b(bitmap, c38828b.m14009b());
            } else {
                c3478b = null;
            }
            if (c3478b != null) {
                c3478b2 = c3478b;
                break;
            }
            i++;
        }
        m14011e();
        return c3478b2;
    }

    @Override // p806o.InterfaceC38830h
    /* renamed from: c */
    public synchronized void mo14001c(@NotNull MemoryCache.Key key, @NotNull Bitmap bitmap, @NotNull Map<String, ? extends Object> map, int i) {
        LinkedHashMap<MemoryCache.Key, ArrayList<C38828b>> linkedHashMap = this.f102230a;
        ArrayList<C38828b> arrayList = linkedHashMap.get(key);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            linkedHashMap.put(key, arrayList);
        }
        ArrayList<C38828b> arrayList2 = arrayList;
        int identityHashCode = System.identityHashCode(bitmap);
        C38828b c38828b = new C38828b(identityHashCode, new WeakReference(bitmap), map, i);
        int size = arrayList2.size();
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                C38828b c38828b2 = arrayList2.get(i2);
                if (i >= c38828b2.m14007d()) {
                    if (c38828b2.m14008c() == identityHashCode && c38828b2.m14010a().get() == bitmap) {
                        arrayList2.set(i2, c38828b);
                    } else {
                        arrayList2.add(i2, c38828b);
                    }
                } else {
                    i2++;
                }
            } else {
                arrayList2.add(c38828b);
                break;
            }
        }
        m14011e();
    }

    @VisibleForTesting
    /* renamed from: d */
    public final void m14012d() {
        Object m17529r0;
        Bitmap bitmap;
        WeakReference<Bitmap> m14010a;
        boolean z;
        this.f102231b = 0;
        Iterator<ArrayList<C38828b>> it = this.f102230a.values().iterator();
        while (it.hasNext()) {
            ArrayList<C38828b> next = it.next();
            if (next.size() <= 1) {
                m17529r0 = _Collections.m17529r0(next);
                C38828b c38828b = (C38828b) m17529r0;
                if (c38828b != null && (m14010a = c38828b.m14010a()) != null) {
                    bitmap = m14010a.get();
                } else {
                    bitmap = null;
                }
                if (bitmap == null) {
                    it.remove();
                }
            } else {
                int size = next.size();
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    int i3 = i2 - i;
                    if (next.get(i3).m14010a().get() == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        next.remove(i3);
                        i++;
                    }
                }
                if (next.isEmpty()) {
                    it.remove();
                }
            }
        }
    }
}
