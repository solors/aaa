package se;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

/* compiled from: Composers.kt */
@Metadata
/* renamed from: se.b0 */
/* loaded from: classes8.dex */
public final class C42690b0 {
    @NotNull
    /* renamed from: a */
    public static final C42725r m6919a(@NotNull InterfaceC42743z0 sb2, @NotNull Json json) {
        Intrinsics.checkNotNullParameter(sb2, "sb");
        Intrinsics.checkNotNullParameter(json, "json");
        if (json.m15948e().m15927i()) {
            return new Composers(sb2, json);
        }
        return new C42725r(sb2);
    }
}
