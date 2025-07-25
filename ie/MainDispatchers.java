package ie;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import kotlin.Metadata;
import kotlin.sequences.C37653n;
import kotlin.sequences.Sequence;
import kotlin.sequences._Sequences;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: ie.w */
/* loaded from: classes8.dex */
public final class MainDispatchers {
    @NotNull

    /* renamed from: a */
    public static final MainDispatchers f92148a;

    /* renamed from: b */
    private static final boolean f92149b;
    @NotNull

    /* renamed from: c */
    public static final MainCoroutineDispatcher f92150c;

    static {
        MainDispatchers mainDispatchers = new MainDispatchers();
        f92148a = mainDispatchers;
        f92149b = C33638i0.m22975f("kotlinx.coroutines.fast.service.loader", true);
        f92150c = mainDispatchers.m22878a();
    }

    private MainDispatchers() {
    }

    /* renamed from: a */
    private final MainCoroutineDispatcher m22878a() {
        Sequence m16841c;
        List<MainDispatcherFactory> m16822J;
        Object next;
        MainCoroutineDispatcher m22873e;
        try {
            if (!f92149b) {
                m16841c = C37653n.m16841c(ServiceLoader.load(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader()).iterator());
                m16822J = _Sequences.m16822J(m16841c);
            } else {
                m16822J = FastServiceLoader.f92105a.m22950c();
            }
            Iterator<T> it = m16822J.iterator();
            if (!it.hasNext()) {
                next = null;
            } else {
                next = it.next();
                if (it.hasNext()) {
                    int loadPriority = ((MainDispatcherFactory) next).getLoadPriority();
                    do {
                        Object next2 = it.next();
                        int loadPriority2 = ((MainDispatcherFactory) next2).getLoadPriority();
                        if (loadPriority < loadPriority2) {
                            next = next2;
                            loadPriority = loadPriority2;
                        }
                    } while (it.hasNext());
                }
            }
            MainDispatcherFactory mainDispatcherFactory = (MainDispatcherFactory) next;
            if (mainDispatcherFactory == null || (m22873e = C33659x.m22873e(mainDispatcherFactory, m16822J)) == null) {
                return C33659x.m22876b(null, null, 3, null);
            }
            return m22873e;
        } catch (Throwable th) {
            return C33659x.m22876b(th, null, 2, null);
        }
    }
}
