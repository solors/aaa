package ie;

import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import p804nd.ExceptionsH;

/* compiled from: MainDispatchers.kt */
@Metadata
/* renamed from: ie.x */
/* loaded from: classes8.dex */
public final class C33659x {

    /* renamed from: a */
    private static final boolean f92151a = true;

    /* renamed from: a */
    private static final C33660y m22877a(Throwable th, String str) {
        if (f92151a) {
            return new C33660y(th, str);
        }
        if (th != null) {
            throw th;
        }
        m22874d();
        throw new ExceptionsH();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static /* synthetic */ C33660y m22876b(Throwable th, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            th = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        return m22877a(th, str);
    }

    /* renamed from: c */
    public static final boolean m22875c(@NotNull MainCoroutineDispatcher mainCoroutineDispatcher) {
        return mainCoroutineDispatcher.getImmediate() instanceof C33660y;
    }

    @NotNull
    /* renamed from: d */
    public static final Void m22874d() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    @NotNull
    /* renamed from: e */
    public static final MainCoroutineDispatcher m22873e(@NotNull MainDispatcherFactory mainDispatcherFactory, @NotNull List<? extends MainDispatcherFactory> list) {
        try {
            return mainDispatcherFactory.createDispatcher(list);
        } catch (Throwable th) {
            return m22877a(th, mainDispatcherFactory.hintOnError());
        }
    }
}
