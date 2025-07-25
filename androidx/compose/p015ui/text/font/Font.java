package androidx.compose.p015ui.text.font;

import androidx.compose.p015ui.text.ExperimentalTextApi;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: Font.kt */
@Immutable
@Metadata
/* renamed from: androidx.compose.ui.text.font.Font */
/* loaded from: classes.dex */
public interface Font {
    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final long MaximumAsyncTimeout = 15000;

    /* compiled from: Font.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.text.font.Font$ResourceLoader */
    /* loaded from: classes.dex */
    public interface ResourceLoader {
        @NotNull
        Object load(@NotNull Font font);
    }

    @ExperimentalTextApi
    /* renamed from: getLoadingStrategy-PKNRLFQ */
    int mo109409getLoadingStrategyPKNRLFQ();

    /* renamed from: getStyle-_-LCdwA */
    int mo109408getStyle_LCdwA();

    @NotNull
    FontWeight getWeight();

    /* compiled from: Font.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.text.font.Font$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final long MaximumAsyncTimeout = 15000;

        private Companion() {
        }

        @ExperimentalTextApi
        public static /* synthetic */ void getMaximumAsyncTimeout$ui_text_release$annotations() {
        }
    }

    @ExperimentalTextApi
    /* renamed from: getLoadingStrategy-PKNRLFQ$annotations  reason: not valid java name */
    static /* synthetic */ void m109437getLoadingStrategyPKNRLFQ$annotations() {
    }
}
