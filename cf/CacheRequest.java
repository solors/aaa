package cf;

import java.io.IOException;
import kotlin.Metadata;
import okio.Sink;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: cf.b */
/* loaded from: classes10.dex */
public interface CacheRequest {
    void abort();

    @NotNull
    Sink body() throws IOException;
}
