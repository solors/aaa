package lb;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: lb.k */
/* loaded from: classes8.dex */
public abstract class StorageException extends Exception {
    @Nullable

    /* renamed from: b */
    private final String f100886b;

    public StorageException() {
        this(null, null, null, 7, null);
    }

    @Nullable
    /* renamed from: a */
    public final String m15564a() {
        return this.f100886b;
    }

    public /* synthetic */ StorageException(String str, Throwable th, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : th, (i & 4) != 0 ? null : str2);
    }

    public StorageException(@Nullable String str, @Nullable Throwable th, @Nullable String str2) {
        super(str, th);
        this.f100886b = str2;
    }
}
