package p744jb;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lb.StorageException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: jb.m */
/* loaded from: classes8.dex */
public final class RawJsonRepositoryException extends Exception {
    @Nullable

    /* renamed from: b */
    private final String f98573b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RawJsonRepositoryException(@NotNull StorageException storageException) {
        super(storageException.getMessage(), storageException);
        Intrinsics.checkNotNullParameter(storageException, "storageException");
        this.f98573b = storageException.m15564a();
    }
}
