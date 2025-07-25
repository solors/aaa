package re;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import p804nd.Result;

/* compiled from: Caching.kt */
@Metadata
/* renamed from: re.k1 */
/* loaded from: classes8.dex */
final class C39513k1<T> {
    @NotNull

    /* renamed from: a */
    private final ConcurrentHashMap<List<C39531p0>, Result<KSerializer<T>>> f103873a = new ConcurrentHashMap<>();
}
