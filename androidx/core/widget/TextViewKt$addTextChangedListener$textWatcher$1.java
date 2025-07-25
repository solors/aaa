package androidx.core.widget;

import android.text.Editable;
import android.text.TextWatcher;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.Nullable;
import p1076zd.InterfaceC45269o;

/* compiled from: TextView.kt */
@Metadata
/* loaded from: classes.dex */
public final class TextViewKt$addTextChangedListener$textWatcher$1 implements TextWatcher {
    final /* synthetic */ Function1<Editable, Unit> $afterTextChanged;
    final /* synthetic */ InterfaceC45269o<CharSequence, Integer, Integer, Integer, Unit> $beforeTextChanged;
    final /* synthetic */ InterfaceC45269o<CharSequence, Integer, Integer, Integer, Unit> $onTextChanged;

    /* JADX WARN: Multi-variable type inference failed */
    public TextViewKt$addTextChangedListener$textWatcher$1(Function1<? super Editable, Unit> function1, InterfaceC45269o<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, Unit> interfaceC45269o, InterfaceC45269o<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, Unit> interfaceC45269o2) {
        this.$afterTextChanged = function1;
        this.$beforeTextChanged = interfaceC45269o;
        this.$onTextChanged = interfaceC45269o2;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(@Nullable Editable editable) {
        this.$afterTextChanged.invoke(editable);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
        this.$beforeTextChanged.invoke(charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
        this.$onTextChanged.invoke(charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
    }
}
