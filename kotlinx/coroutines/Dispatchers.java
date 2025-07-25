package kotlinx.coroutines;

import ie.MainDispatchers;
import ke.C37504c;
import ke.Dispatcher;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: kotlinx.coroutines.e1 */
/* loaded from: classes7.dex */
public final class Dispatchers {
    @NotNull

    /* renamed from: a */
    public static final Dispatchers f99539a = new Dispatchers();
    @NotNull

    /* renamed from: b */
    private static final CoroutineDispatcher f99540b = C37504c.f99152i;
    @NotNull

    /* renamed from: c */
    private static final CoroutineDispatcher f99541c = Unconfined.f99556b;
    @NotNull

    /* renamed from: d */
    private static final CoroutineDispatcher f99542d = Dispatcher.f99150c;

    private Dispatchers() {
    }

    @NotNull
    /* renamed from: a */
    public static final CoroutineDispatcher m16378a() {
        return f99540b;
    }

    @NotNull
    /* renamed from: b */
    public static final CoroutineDispatcher m16377b() {
        return f99542d;
    }

    @NotNull
    /* renamed from: c */
    public static final MainCoroutineDispatcher m16376c() {
        return MainDispatchers.f92150c;
    }

    @NotNull
    /* renamed from: d */
    public static final CoroutineDispatcher m16375d() {
        return f99541c;
    }
}
