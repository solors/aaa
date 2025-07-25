package androidx.compose.foundation.text;

import androidx.compose.p015ui.node.ComposeUiNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: androidx.compose.foundation.text.BasicTextKt$BasicText-BpD7jsM$$inlined$Layout$1 */
/* loaded from: classes.dex */
public final class Composables extends Lambda implements Functions<ComposeUiNode> {
    final /* synthetic */ Functions $factory;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Composables(Functions functions) {
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
