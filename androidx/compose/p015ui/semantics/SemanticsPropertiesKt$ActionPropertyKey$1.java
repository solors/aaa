package androidx.compose.p015ui.semantics;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: SemanticsProperties.kt */
@Metadata
/* renamed from: androidx.compose.ui.semantics.SemanticsPropertiesKt$ActionPropertyKey$1 */
/* loaded from: classes.dex */
public final class SemanticsPropertiesKt$ActionPropertyKey$1<T> extends Lambda implements Function2<AccessibilityAction<T>, AccessibilityAction<T>, AccessibilityAction<T>> {
    public static final SemanticsPropertiesKt$ActionPropertyKey$1 INSTANCE = new SemanticsPropertiesKt$ActionPropertyKey$1();

    public SemanticsPropertiesKt$ActionPropertyKey$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ Object mo105910invoke(Object obj, Object obj2) {
        return invoke((AccessibilityAction) ((AccessibilityAction) obj), (AccessibilityAction) ((AccessibilityAction) obj2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
        if (r3 == null) goto L11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [nd.g] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.compose.p015ui.semantics.AccessibilityAction<T> invoke(@org.jetbrains.annotations.Nullable androidx.compose.p015ui.semantics.AccessibilityAction<T> r3, @org.jetbrains.annotations.NotNull androidx.compose.p015ui.semantics.AccessibilityAction<T> r4) {
        /*
            r2 = this;
            java.lang.String r0 = "childValue"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            androidx.compose.ui.semantics.AccessibilityAction r0 = new androidx.compose.ui.semantics.AccessibilityAction
            if (r3 == 0) goto Lf
            java.lang.String r1 = r3.getLabel()
            if (r1 != 0) goto L13
        Lf:
            java.lang.String r1 = r4.getLabel()
        L13:
            if (r3 == 0) goto L1b
            nd.g r3 = r3.getAction()
            if (r3 != 0) goto L1f
        L1b:
            nd.g r3 = r4.getAction()
        L1f:
            r0.<init>(r1, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.semantics.SemanticsPropertiesKt$ActionPropertyKey$1.invoke(androidx.compose.ui.semantics.AccessibilityAction, androidx.compose.ui.semantics.AccessibilityAction):androidx.compose.ui.semantics.AccessibilityAction");
    }
}
