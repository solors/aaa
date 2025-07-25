package androidx.compose.foundation;

import androidx.compose.p015ui.input.key.KeyEvent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Clickable.kt */
@Metadata
/* loaded from: classes.dex */
public final class ClickableKt$genericClickableWithoutGesture$detectClickFromKey$1 extends Lambda implements Function1<KeyEvent, Boolean> {
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ Functions<Unit> $onClick;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClickableKt$genericClickableWithoutGesture$detectClickFromKey$1(boolean z, Functions<Unit> functions) {
        super(1);
        this.$enabled = z;
        this.$onClick = functions;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
        return m106105invokeZmokQxo(keyEvent.m108750unboximpl());
    }

    @NotNull
    /* renamed from: invoke-ZmokQxo  reason: not valid java name */
    public final Boolean m106105invokeZmokQxo(@NotNull android.view.KeyEvent it) {
        boolean z;
        Intrinsics.checkNotNullParameter(it, "it");
        if (this.$enabled && Clickable_androidKt.m106106isClickZmokQxo(it)) {
            this.$onClick.invoke();
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
