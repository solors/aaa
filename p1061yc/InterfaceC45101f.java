package p1061yc;

import java.io.Closeable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: Pool.kt */
@Metadata
/* renamed from: yc.f */
/* loaded from: classes9.dex */
public interface InterfaceC45101f<T> extends Closeable {

    /* compiled from: Pool.kt */
    @Metadata
    /* renamed from: yc.f$a */
    /* loaded from: classes9.dex */
    public static final class C45102a {
        /* renamed from: a */
        public static <T> void m914a(@NotNull InterfaceC45101f<T> interfaceC45101f) {
            interfaceC45101f.dispose();
        }
    }

    @NotNull
    /* renamed from: L */
    T mo916L();

    void dispose();

    /* renamed from: p */
    void mo915p(@NotNull T t);
}
