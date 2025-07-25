package androidx.compose.p015ui.text.input;

import androidx.webkit.Profile;
import com.maticoo.sdk.MaticooAdsConstant;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: ImeAction.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.input.ImeAction */
/* loaded from: classes.dex */
public final class ImeAction {
    private final int value;
    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final int Default = m109506constructorimpl(1);
    private static final int None = m109506constructorimpl(0);

    /* renamed from: Go */
    private static final int f509Go = m109506constructorimpl(2);
    private static final int Search = m109506constructorimpl(3);
    private static final int Send = m109506constructorimpl(4);
    private static final int Previous = m109506constructorimpl(5);
    private static final int Next = m109506constructorimpl(6);
    private static final int Done = m109506constructorimpl(7);

    /* compiled from: ImeAction.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.text.input.ImeAction$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getDefault-eUduSuo  reason: not valid java name */
        public final int m109512getDefaulteUduSuo() {
            return ImeAction.Default;
        }

        /* renamed from: getDone-eUduSuo  reason: not valid java name */
        public final int m109513getDoneeUduSuo() {
            return ImeAction.Done;
        }

        /* renamed from: getGo-eUduSuo  reason: not valid java name */
        public final int m109514getGoeUduSuo() {
            return ImeAction.f509Go;
        }

        /* renamed from: getNext-eUduSuo  reason: not valid java name */
        public final int m109515getNexteUduSuo() {
            return ImeAction.Next;
        }

        /* renamed from: getNone-eUduSuo  reason: not valid java name */
        public final int m109516getNoneeUduSuo() {
            return ImeAction.None;
        }

        /* renamed from: getPrevious-eUduSuo  reason: not valid java name */
        public final int m109517getPreviouseUduSuo() {
            return ImeAction.Previous;
        }

        /* renamed from: getSearch-eUduSuo  reason: not valid java name */
        public final int m109518getSearcheUduSuo() {
            return ImeAction.Search;
        }

        /* renamed from: getSend-eUduSuo  reason: not valid java name */
        public final int m109519getSendeUduSuo() {
            return ImeAction.Send;
        }
    }

    private /* synthetic */ ImeAction(int i) {
        this.value = i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ ImeAction m109505boximpl(int i) {
        return new ImeAction(i);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m109507equalsimpl(int i, Object obj) {
        if (!(obj instanceof ImeAction) || i != ((ImeAction) obj).m109511unboximpl()) {
            return false;
        }
        return true;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m109508equalsimpl0(int i, int i2) {
        if (i == i2) {
            return true;
        }
        return false;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m109509hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m109510toStringimpl(int i) {
        if (m109508equalsimpl0(i, None)) {
            return MaticooAdsConstant.VALUE_AD_MEDIATION;
        }
        if (m109508equalsimpl0(i, Default)) {
            return Profile.DEFAULT_PROFILE_NAME;
        }
        if (m109508equalsimpl0(i, f509Go)) {
            return "Go";
        }
        if (m109508equalsimpl0(i, Search)) {
            return "Search";
        }
        if (m109508equalsimpl0(i, Send)) {
            return "Send";
        }
        if (m109508equalsimpl0(i, Previous)) {
            return "Previous";
        }
        if (m109508equalsimpl0(i, Next)) {
            return "Next";
        }
        if (m109508equalsimpl0(i, Done)) {
            return "Done";
        }
        return "Invalid";
    }

    public boolean equals(Object obj) {
        return m109507equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m109509hashCodeimpl(this.value);
    }

    @NotNull
    public String toString() {
        return m109510toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m109511unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m109506constructorimpl(int i) {
        return i;
    }
}
