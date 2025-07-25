package p834pb;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: pb.a */
/* loaded from: classes8.dex */
public interface CardErrorTransformer {

    /* compiled from: CardErrorTransformer.kt */
    @Metadata
    /* renamed from: pb.a$a */
    /* loaded from: classes8.dex */
    public static final class C39294a implements CardErrorTransformer {
        @NotNull

        /* renamed from: a */
        private final CardErrorTransformer[] f103181a;

        public C39294a(@NotNull CardErrorTransformer... transformers) {
            Intrinsics.checkNotNullParameter(transformers, "transformers");
            this.f103181a = transformers;
        }
    }
}
