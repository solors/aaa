package androidx.compose.p015ui.layout;

import androidx.compose.p015ui.node.ComposeUiNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: Composables.kt */
@Metadata
/* renamed from: androidx.compose.ui.layout.LayoutKt$Layout$$inlined$ReusableComposeNode$1 */
/* loaded from: classes.dex */
public final class LayoutKt$Layout$$inlined$ReusableComposeNode$1 extends Lambda implements Functions<ComposeUiNode> {
    final /* synthetic */ Functions $factory;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayoutKt$Layout$$inlined$ReusableComposeNode$1(Functions functions) {
        super(0);
        this.$factory = functions;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
    @Override // kotlin.jvm.functions.Functions
    @NotNull
    public final ComposeUiNode invoke() {
        return this.$factory.invoke();
    }
}
