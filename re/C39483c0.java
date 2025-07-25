package re;

import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.collections._Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Enums.kt */
@Metadata
/* renamed from: re.c0 */
/* loaded from: classes8.dex */
public final class C39483c0 {
    @NotNull
    /* renamed from: a */
    public static final <T extends Enum<T>> KSerializer<T> m12494a(@NotNull String serialName, @NotNull T[] values, @NotNull String[] names, @NotNull Annotation[][] entryAnnotations, @Nullable Annotation[] annotationArr) {
        Object m17324b0;
        Object m17324b02;
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(names, "names");
        Intrinsics.checkNotNullParameter(entryAnnotations, "entryAnnotations");
        Enums enums = new Enums(serialName, values.length);
        if (annotationArr != null) {
            for (Annotation annotation : annotationArr) {
                enums.m16029r(annotation);
            }
        }
        int length = values.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            T t = values[i];
            int i3 = i2 + 1;
            m17324b0 = _Arrays.m17324b0(names, i2);
            String str = (String) m17324b0;
            if (str == null) {
                str = t.name();
            }
            PluginGeneratedSerialDescriptor.m16035l(enums, str, false, 2, null);
            m17324b02 = _Arrays.m17324b0(entryAnnotations, i2);
            Annotation[] annotationArr2 = (Annotation[]) m17324b02;
            if (annotationArr2 != null) {
                for (Annotation annotation2 : annotationArr2) {
                    enums.m16030q(annotation2);
                }
            }
            i++;
            i2 = i3;
        }
        return new C39480b0(serialName, values, enums);
    }
}
