package p744jb;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: jb.k */
/* loaded from: classes8.dex */
public final class InternalStorageComponent implements DivStorageComponent {
    @NotNull

    /* renamed from: b */
    private final DivDataRepository f98568b;
    @NotNull

    /* renamed from: c */
    private final RawJsonRepository f98569c;
    @NotNull

    /* renamed from: d */
    private final DivStorage f98570d;

    public InternalStorageComponent(@NotNull DivDataRepository repository, @NotNull RawJsonRepository rawJsonRepository, @NotNull DivStorage storage) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(rawJsonRepository, "rawJsonRepository");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f98568b = repository;
        this.f98569c = rawJsonRepository;
        this.f98570d = storage;
    }

    @Override // p744jb.DivStorageComponent
    @NotNull
    /* renamed from: a */
    public RawJsonRepository mo18389a() {
        return this.f98569c;
    }
}
