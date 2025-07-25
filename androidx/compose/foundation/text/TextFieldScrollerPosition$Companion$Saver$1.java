package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.saveable.SaverScope;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C37563v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: TextFieldScroll.kt */
@Metadata
/* loaded from: classes.dex */
final class TextFieldScrollerPosition$Companion$Saver$1 extends Lambda implements Function2<SaverScope, TextFieldScrollerPosition, List<? extends Object>> {
    public static final TextFieldScrollerPosition$Companion$Saver$1 INSTANCE = new TextFieldScrollerPosition$Companion$Saver$1();

    TextFieldScrollerPosition$Companion$Saver$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final List<Object> mo105910invoke(@NotNull SaverScope listSaver, @NotNull TextFieldScrollerPosition it) {
        List<Object> m17163p;
        Intrinsics.checkNotNullParameter(listSaver, "$this$listSaver");
        Intrinsics.checkNotNullParameter(it, "it");
        Object[] objArr = new Object[2];
        objArr[0] = Float.valueOf(it.getOffset());
        objArr[1] = Boolean.valueOf(it.getOrientation() == Orientation.Vertical);
        m17163p = C37563v.m17163p(objArr);
        return m17163p;
    }
}
