package com.moloco.sdk.acm.eventprocessing;

import android.util.Log;
import androidx.work.Data;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.Tuples;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.C38513v;

/* renamed from: com.moloco.sdk.acm.eventprocessing.d */
/* loaded from: classes7.dex */
public final class C23813d {
    @Nullable
    /* renamed from: a */
    public static final Data m47682a(@NotNull Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        try {
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                arrayList.add(C38513v.m14532a(entry.getKey(), entry.getValue()));
            }
            Tuples[] tuplesArr = (Tuples[]) arrayList.toArray(new Tuples[0]);
            Tuples[] tuplesArr2 = (Tuples[]) Arrays.copyOf(tuplesArr, tuplesArr.length);
            Data.Builder builder = new Data.Builder();
            for (Tuples tuples : tuplesArr2) {
                builder.put((String) tuples.m17630c(), tuples.m17629d());
            }
            Data build = builder.build();
            Intrinsics.checkNotNullExpressionValue(build, "dataBuilder.build()");
            return build;
        } catch (Exception e) {
            Log.e("DBPeriodicRequest", e.getMessage() + ". Data: " + map);
            return null;
        }
    }
}
