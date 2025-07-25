package androidx.compose.p015ui.text.input;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: OffsetMapping.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.input.OffsetMapping */
/* loaded from: classes.dex */
public interface OffsetMapping {
    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: OffsetMapping.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.text.input.OffsetMapping$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        @NotNull
        private static final OffsetMapping Identity = new OffsetMapping() { // from class: androidx.compose.ui.text.input.OffsetMapping$Companion$Identity$1
            @Override // androidx.compose.p015ui.text.input.OffsetMapping
            public int originalToTransformed(int i) {
                return i;
            }

            @Override // androidx.compose.p015ui.text.input.OffsetMapping
            public int transformedToOriginal(int i) {
                return i;
            }
        };

        private Companion() {
        }

        @NotNull
        public final OffsetMapping getIdentity() {
            return Identity;
        }
    }

    int originalToTransformed(int i);

    int transformedToOriginal(int i);
}
