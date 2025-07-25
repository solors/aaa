package androidx.compose.p015ui.text;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C37609n0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1076zd.InterfaceC45268n;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: JvmAnnotatedString.jvm.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.JvmAnnotatedString_jvmKt$transform$1 */
/* loaded from: classes.dex */
public final class JvmAnnotatedString_jvmKt$transform$1 extends Lambda implements Function1<List<? extends Integer>, Integer> {
    final /* synthetic */ Map<Integer, Integer> $offsetMap;
    final /* synthetic */ C37609n0<String> $resultStr;
    final /* synthetic */ AnnotatedString $this_transform;
    final /* synthetic */ InterfaceC45268n<String, Integer, Integer, String> $transform;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public JvmAnnotatedString_jvmKt$transform$1(C37609n0<String> c37609n0, InterfaceC45268n<? super String, ? super Integer, ? super Integer, String> interfaceC45268n, AnnotatedString annotatedString, Map<Integer, Integer> map) {
        super(1);
        this.$resultStr = c37609n0;
        this.$transform = interfaceC45268n;
        this.$this_transform = annotatedString;
        this.$offsetMap = map;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [T, java.lang.String] */
    @Nullable
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Integer invoke2(@NotNull List<Integer> list) {
        Intrinsics.checkNotNullParameter(list, "<name for destructuring parameter 0>");
        int intValue = list.get(0).intValue();
        int intValue2 = list.get(1).intValue();
        C37609n0<String> c37609n0 = this.$resultStr;
        c37609n0.f99327b = this.$resultStr.f99327b + this.$transform.invoke(this.$this_transform.getText(), Integer.valueOf(intValue), Integer.valueOf(intValue2));
        return this.$offsetMap.put(Integer.valueOf(intValue2), Integer.valueOf(this.$resultStr.f99327b.length()));
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Integer invoke(List<? extends Integer> list) {
        return invoke2((List<Integer>) list);
    }
}
