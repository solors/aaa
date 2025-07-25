package ec;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p702hc.AbstractC33495c;

/* compiled from: DefaultResponseValidation.kt */
@Metadata
/* renamed from: ec.c0 */
/* loaded from: classes9.dex */
public class C32973c0 extends IllegalStateException {
    @NotNull

    /* renamed from: b */
    private final transient AbstractC33495c f89865b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32973c0(@NotNull AbstractC33495c response, @NotNull String cachedResponseText) {
        super("Bad response: " + response + ". Text: \"" + cachedResponseText + '\"');
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(cachedResponseText, "cachedResponseText");
        this.f89865b = response;
    }
}
