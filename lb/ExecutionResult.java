package lb;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: lb.f */
/* loaded from: classes8.dex */
public class ExecutionResult {
    @NotNull

    /* renamed from: a */
    private final List<StorageException> f100878a;

    /* JADX WARN: Multi-variable type inference failed */
    public ExecutionResult(@NotNull List<? extends StorageException> errors) {
        Intrinsics.checkNotNullParameter(errors, "errors");
        this.f100878a = errors;
    }

    @NotNull
    /* renamed from: a */
    public List<StorageException> m15572a() {
        return this.f100878a;
    }
}
