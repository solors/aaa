package kotlinx.coroutines;

import java.io.Closeable;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.coroutines.AbstractC37577b;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Executors.kt */
@Metadata
/* renamed from: kotlinx.coroutines.q1 */
/* loaded from: classes7.dex */
public abstract class AbstractC37789q1 extends CoroutineDispatcher implements Closeable {
    @NotNull

    /* renamed from: b */
    public static final C37790a f99636b = new C37790a(null);

    /* compiled from: Executors.kt */
    @Metadata
    /* renamed from: kotlinx.coroutines.q1$a */
    /* loaded from: classes7.dex */
    public static final class C37790a extends AbstractC37577b<CoroutineDispatcher, AbstractC37789q1> {

        /* compiled from: Executors.kt */
        @Metadata
        /* renamed from: kotlinx.coroutines.q1$a$a */
        /* loaded from: classes7.dex */
        static final class C37791a extends Lambda implements Function1<CoroutineContext.Element, AbstractC37789q1> {

            /* renamed from: g */
            public static final C37791a f99637g = new C37791a();

            C37791a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @Nullable
            /* renamed from: a */
            public final AbstractC37789q1 invoke(@NotNull CoroutineContext.Element element) {
                if (element instanceof AbstractC37789q1) {
                    return (AbstractC37789q1) element;
                }
                return null;
            }
        }

        public /* synthetic */ C37790a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C37790a() {
            super(CoroutineDispatcher.Key, C37791a.f99637g);
        }
    }

    @NotNull
    /* renamed from: r */
    public abstract Executor mo16108r();
}
