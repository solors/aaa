package p792n;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p1077ze.HttpUrl;
import p837q.C39310n;

@Metadata
/* renamed from: n.c */
/* loaded from: classes2.dex */
public final class HttpUrlMapper implements Mapper<HttpUrl, String> {
    @Override // p792n.Mapper
    @NotNull
    /* renamed from: b */
    public String mo15106a(@NotNull HttpUrl httpUrl, @NotNull C39310n c39310n) {
        return httpUrl.toString();
    }
}
