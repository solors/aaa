package androidx.compose.p015ui.text.input;

import com.maticoo.sdk.MaticooAdsConstant;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: KeyboardCapitalization.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.input.KeyboardCapitalization */
/* loaded from: classes.dex */
public final class KeyboardCapitalization {
    private final int value;
    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final int None = m109528constructorimpl(0);
    private static final int Characters = m109528constructorimpl(1);
    private static final int Words = m109528constructorimpl(2);
    private static final int Sentences = m109528constructorimpl(3);

    /* compiled from: KeyboardCapitalization.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.text.input.KeyboardCapitalization$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getCharacters-IUNYP9k  reason: not valid java name */
        public final int m109534getCharactersIUNYP9k() {
            return KeyboardCapitalization.Characters;
        }

        /* renamed from: getNone-IUNYP9k  reason: not valid java name */
        public final int m109535getNoneIUNYP9k() {
            return KeyboardCapitalization.None;
        }

        /* renamed from: getSentences-IUNYP9k  reason: not valid java name */
        public final int m109536getSentencesIUNYP9k() {
            return KeyboardCapitalization.Sentences;
        }

        /* renamed from: getWords-IUNYP9k  reason: not valid java name */
        public final int m109537getWordsIUNYP9k() {
            return KeyboardCapitalization.Words;
        }
    }

    private /* synthetic */ KeyboardCapitalization(int i) {
        this.value = i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ KeyboardCapitalization m109527boximpl(int i) {
        return new KeyboardCapitalization(i);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m109529equalsimpl(int i, Object obj) {
        if (!(obj instanceof KeyboardCapitalization) || i != ((KeyboardCapitalization) obj).m109533unboximpl()) {
            return false;
        }
        return true;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m109530equalsimpl0(int i, int i2) {
        if (i == i2) {
            return true;
        }
        return false;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m109531hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m109532toStringimpl(int i) {
        if (m109530equalsimpl0(i, None)) {
            return MaticooAdsConstant.VALUE_AD_MEDIATION;
        }
        if (m109530equalsimpl0(i, Characters)) {
            return "Characters";
        }
        if (m109530equalsimpl0(i, Words)) {
            return "Words";
        }
        if (m109530equalsimpl0(i, Sentences)) {
            return "Sentences";
        }
        return "Invalid";
    }

    public boolean equals(Object obj) {
        return m109529equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m109531hashCodeimpl(this.value);
    }

    @NotNull
    public String toString() {
        return m109532toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m109533unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m109528constructorimpl(int i) {
        return i;
    }
}
