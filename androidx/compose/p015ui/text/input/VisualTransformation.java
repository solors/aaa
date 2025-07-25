package androidx.compose.p015ui.text.input;

import androidx.compose.p015ui.text.AnnotatedString;
import androidx.compose.p015ui.text.input.VisualTransformation;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: VisualTransformation.kt */
@Immutable
@Metadata
/* renamed from: androidx.compose.ui.text.input.VisualTransformation */
/* loaded from: classes.dex */
public interface VisualTransformation {
    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    @NotNull
    TransformedText filter(@NotNull AnnotatedString annotatedString);

    /* compiled from: VisualTransformation.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.text.input.VisualTransformation$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        @NotNull
        private static final VisualTransformation None = new VisualTransformation() { // from class: androidx.compose.ui.text.input.a
            @Override // androidx.compose.p015ui.text.input.VisualTransformation
            public final TransformedText filter(AnnotatedString annotatedString) {
                return VisualTransformation.Companion.m105286a(annotatedString);
            }
        };

        private Companion() {
        }

        /* renamed from: None$lambda-0 */
        public static final TransformedText m109562None$lambda0(AnnotatedString text) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new TransformedText(text, OffsetMapping.Companion.getIdentity());
        }

        /* renamed from: a */
        public static /* synthetic */ TransformedText m105286a(AnnotatedString annotatedString) {
            return m109562None$lambda0(annotatedString);
        }

        @NotNull
        public final VisualTransformation getNone() {
            return None;
        }

        @Stable
        public static /* synthetic */ void getNone$annotations() {
        }
    }
}
