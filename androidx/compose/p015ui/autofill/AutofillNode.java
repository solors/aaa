package androidx.compose.p015ui.autofill;

import androidx.compose.p015ui.ExperimentalComposeUiApi;
import androidx.compose.p015ui.geometry.Rect;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C37563v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Autofill.kt */
@StabilityInferred(parameters = 0)
@ExperimentalComposeUiApi
@Metadata
/* renamed from: androidx.compose.ui.autofill.AutofillNode */
/* loaded from: classes.dex */
public final class AutofillNode {
    private static int previousId;
    @NotNull
    private final List<AutofillType> autofillTypes;
    @Nullable
    private Rect boundingBox;

    /* renamed from: id */
    private final int f400id;
    @Nullable
    private final Function1<String, Unit> onFill;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: Autofill.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.autofill.AutofillNode$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int generateId() {
            int i;
            synchronized (this) {
                AutofillNode.previousId++;
                i = AutofillNode.previousId;
            }
            return i;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AutofillNode(@NotNull List<? extends AutofillType> autofillTypes, @Nullable Rect rect, @Nullable Function1<? super String, Unit> function1) {
        Intrinsics.checkNotNullParameter(autofillTypes, "autofillTypes");
        this.autofillTypes = autofillTypes;
        this.boundingBox = rect;
        this.onFill = function1;
        this.f400id = Companion.generateId();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutofillNode)) {
            return false;
        }
        AutofillNode autofillNode = (AutofillNode) obj;
        if (Intrinsics.m17075f(this.autofillTypes, autofillNode.autofillTypes) && Intrinsics.m17075f(this.boundingBox, autofillNode.boundingBox) && Intrinsics.m17075f(this.onFill, autofillNode.onFill)) {
            return true;
        }
        return false;
    }

    @NotNull
    public final List<AutofillType> getAutofillTypes() {
        return this.autofillTypes;
    }

    @Nullable
    public final Rect getBoundingBox() {
        return this.boundingBox;
    }

    public final int getId() {
        return this.f400id;
    }

    @Nullable
    public final Function1<String, Unit> getOnFill() {
        return this.onFill;
    }

    public int hashCode() {
        int i;
        int hashCode = this.autofillTypes.hashCode() * 31;
        Rect rect = this.boundingBox;
        int i2 = 0;
        if (rect != null) {
            i = rect.hashCode();
        } else {
            i = 0;
        }
        int i3 = (hashCode + i) * 31;
        Function1<String, Unit> function1 = this.onFill;
        if (function1 != null) {
            i2 = function1.hashCode();
        }
        return i3 + i2;
    }

    public final void setBoundingBox(@Nullable Rect rect) {
        this.boundingBox = rect;
    }

    public /* synthetic */ AutofillNode(List list, Rect rect, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C37563v.m17166m() : list, (i & 2) != 0 ? null : rect, function1);
    }
}
