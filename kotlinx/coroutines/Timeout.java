package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: kotlinx.coroutines.d3 */
/* loaded from: classes7.dex */
public final class Timeout extends CancellationException implements InterfaceC37735i0<Timeout> {
    @Nullable

    /* renamed from: b */
    public final transient InterfaceC37708b2 f99530b;

    public Timeout(@NotNull String str, @Nullable InterfaceC37708b2 interfaceC37708b2) {
        super(str);
        this.f99530b = interfaceC37708b2;
    }

    @Override // kotlinx.coroutines.InterfaceC37735i0
    @NotNull
    /* renamed from: b */
    public Timeout mo16316a() {
        String message = getMessage();
        if (message == null) {
            message = "";
        }
        Timeout timeout = new Timeout(message, this.f99530b);
        timeout.initCause(this);
        return timeout;
    }

    public Timeout(@NotNull String str) {
        this(str, null);
    }
}
