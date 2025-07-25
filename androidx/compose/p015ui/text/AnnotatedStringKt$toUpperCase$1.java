package androidx.compose.p015ui.text;

import androidx.compose.p015ui.text.intl.LocaleList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p1076zd.InterfaceC45268n;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AnnotatedString.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.AnnotatedStringKt$toUpperCase$1 */
/* loaded from: classes.dex */
public final class AnnotatedStringKt$toUpperCase$1 extends Lambda implements InterfaceC45268n<String, Integer, Integer, String> {
    final /* synthetic */ LocaleList $localeList;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnnotatedStringKt$toUpperCase$1(LocaleList localeList) {
        super(3);
        this.$localeList = localeList;
    }

    @Override // p1076zd.InterfaceC45268n
    public /* bridge */ /* synthetic */ String invoke(String str, Integer num, Integer num2) {
        return invoke(str, num.intValue(), num2.intValue());
    }

    @NotNull
    public final String invoke(@NotNull String str, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "str");
        String substring = str.substring(i, i2);
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return StringKt.toUpperCase(substring, this.$localeList);
    }
}
