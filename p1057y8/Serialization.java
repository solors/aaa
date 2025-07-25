package p1057y8;

import androidx.collection.ArrayMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C37559r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C37690r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sa.C39638b;

@Metadata
/* renamed from: y8.a */
/* loaded from: classes7.dex */
public final class Serialization {
    @NotNull
    /* renamed from: a */
    public static final Map<String, String> m1045a(@Nullable String str) {
        List m16612B0;
        List m16612B02;
        Map<String, String> m17284j;
        Map<String, String> m17284j2;
        if (str == null) {
            m17284j2 = C37559r0.m17284j();
            return m17284j2;
        }
        m16612B0 = C37690r.m16612B0(str, new char[]{0}, false, 0, 6, null);
        if (m16612B0.isEmpty()) {
            C39638b.m12001k("Incorrect serialization: empty map should be serialized into null value!");
            m17284j = C37559r0.m17284j();
            return m17284j;
        }
        ArrayMap arrayMap = new ArrayMap(m16612B0.size());
        int size = m16612B0.size();
        for (int i = 0; i < size; i++) {
            m16612B02 = C37690r.m16612B0((CharSequence) m16612B0.get(i), new char[]{'\t'}, false, 0, 6, null);
            if (m16612B02.size() == 1) {
                arrayMap.put(m16612B02.get(0), "");
            } else {
                arrayMap.put(m16612B02.get(0), m16612B02.get(1));
            }
        }
        return arrayMap;
    }

    @Nullable
    /* renamed from: b */
    public static final String m1044b(@NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        if (map.isEmpty()) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            sb2.append(entry.getKey());
            sb2.append('\t');
            sb2.append(entry.getValue());
            sb2.append((char) 0);
        }
        return sb2.toString();
    }
}
