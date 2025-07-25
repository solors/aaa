package androidx.compose.p015ui.graphics;

import androidx.compose.p015ui.geometry.Offset;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: Vertices.kt */
@Metadata
/* renamed from: androidx.compose.ui.graphics.Vertices$outOfBounds$1 */
/* loaded from: classes.dex */
final class Vertices$outOfBounds$1 extends Lambda implements Function1<Integer, Boolean> {
    final /* synthetic */ List<Offset> $positions;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Vertices$outOfBounds$1(List<Offset> list) {
        super(1);
        this.$positions = list;
    }

    @NotNull
    public final Boolean invoke(int i) {
        return Boolean.valueOf(i < 0 || i >= this.$positions.size());
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Boolean invoke(Integer num) {
        return invoke(num.intValue());
    }
}
