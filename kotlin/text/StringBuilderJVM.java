package kotlin.text;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata
/* renamed from: kotlin.text.m */
/* loaded from: classes7.dex */
public class StringBuilderJVM extends RegexExtensions {
    @NotNull
    /* renamed from: i */
    public static StringBuilder m16644i(@NotNull StringBuilder sb2) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        sb2.setLength(0);
        return sb2;
    }
}
