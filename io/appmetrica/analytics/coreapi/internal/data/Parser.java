package io.appmetrica.analytics.coreapi.internal.data;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.C38508r;
import p804nd.Result;

@Metadata
/* loaded from: classes9.dex */
public interface Parser<IN, OUT> {

    @Metadata
    /* loaded from: classes9.dex */
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        @Nullable
        public static <IN, OUT> OUT parseOrNull(@NotNull Parser<? super IN, ? extends OUT> parser, IN in) {
            OUT out;
            try {
                Result.C38506a c38506a = Result.f101870c;
                out = (OUT) Result.m14549b(parser.parse(in));
            } catch (Throwable th) {
                Result.C38506a c38506a2 = Result.f101870c;
                out = (OUT) Result.m14549b(C38508r.m14540a(th));
            }
            if (Result.m14544g(out)) {
                return null;
            }
            return out;
        }
    }

    @NotNull
    OUT parse(IN in);

    @Nullable
    OUT parseOrNull(IN in);
}
