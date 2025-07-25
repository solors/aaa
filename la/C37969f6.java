package la;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.PrimitiveIterators;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.PrimitiveRanges;
import kotlin.ranges._Ranges;
import p759ka.Evaluable;
import p759ka.EvaluationContext;

/* compiled from: StringFunctions.kt */
@Metadata
/* renamed from: la.f6 */
/* loaded from: classes8.dex */
public final class C37969f6 {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final String m15624b(EvaluationContext evaluationContext, Evaluable evaluable, int i, String str) {
        boolean z;
        PrimitiveRanges m16900v;
        boolean z2 = true;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z && i > 0) {
            StringBuilder sb2 = new StringBuilder(i);
            m16900v = _Ranges.m16900v(0, i);
            Iterator<Integer> it = m16900v.iterator();
            while (it.hasNext()) {
                sb2.append(str.charAt(((PrimitiveIterators) it).nextInt() % str.length()));
            }
            String sb3 = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(sb3, "stringBuilder.toString()");
            return sb3;
        }
        if (str.length() != 0) {
            z2 = false;
        }
        if (z2) {
            evaluationContext.m18089d().mo18051a(evaluable, "String for padding is empty.");
            return "";
        }
        return "";
    }
}
