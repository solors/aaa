package androidx.compose.p015ui.viewinterop;

import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import androidx.compose.p015ui.node.Ref;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: AndroidView.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$valueProvider$1 */
/* loaded from: classes.dex */
final class AndroidView_androidKt$AndroidView$3$valueProvider$1 extends Lambda implements Functions<SparseArray<Parcelable>> {
    final /* synthetic */ Ref<ViewFactoryHolder<T>> $viewFactoryHolderRef;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidView_androidKt$AndroidView$3$valueProvider$1(Ref<ViewFactoryHolder<T>> ref) {
        super(0);
        this.$viewFactoryHolderRef = ref;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Functions
    @NotNull
    public final SparseArray<Parcelable> invoke() {
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        Object value = this.$viewFactoryHolderRef.getValue();
        Intrinsics.m17074g(value);
        View typedView$ui_release = ((ViewFactoryHolder) value).getTypedView$ui_release();
        if (typedView$ui_release != null) {
            typedView$ui_release.saveHierarchyState(sparseArray);
        }
        return sparseArray;
    }
}
