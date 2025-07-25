package androidx.core.widget;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import p1076zd.InterfaceC45269o;

/* compiled from: TextView.kt */
@Metadata
/* loaded from: classes.dex */
public final class TextViewKt$addTextChangedListener$1 extends Lambda implements InterfaceC45269o<CharSequence, Integer, Integer, Integer, Unit> {
    public static final TextViewKt$addTextChangedListener$1 INSTANCE = new TextViewKt$addTextChangedListener$1();

    public TextViewKt$addTextChangedListener$1() {
        super(4);
    }

    public final void invoke(@Nullable CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // p1076zd.InterfaceC45269o
    public /* bridge */ /* synthetic */ Unit invoke(CharSequence charSequence, Integer num, Integer num2, Integer num3) {
        invoke(charSequence, num.intValue(), num2.intValue(), num3.intValue());
        return Unit.f99208a;
    }
}
