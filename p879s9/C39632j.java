package p879s9;

import android.view.View;
import androidx.collection.SparseArrayCompat;
import com.yandex.div.core.view2.Releasable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1072z8.C45190f;
import p985ta.ExpressionSubscriber;

/* compiled from: Releasables.kt */
@Metadata
/* renamed from: s9.j */
/* loaded from: classes8.dex */
public final class C39632j {
    @NotNull
    /* renamed from: a */
    public static final ExpressionSubscriber m12028a(@NotNull View view) {
        SparseArrayCompat sparseArrayCompat;
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (view instanceof ExpressionSubscriber) {
            return (ExpressionSubscriber) view;
        }
        int i = C45190f.div_releasable_list;
        Object tag = view.getTag(i);
        ExpressionSubscriber expressionSubscriber = null;
        if (tag instanceof SparseArrayCompat) {
            sparseArrayCompat = (SparseArrayCompat) tag;
        } else {
            sparseArrayCompat = null;
        }
        if (sparseArrayCompat == null) {
            sparseArrayCompat = new SparseArrayCompat();
            view.setTag(i, sparseArrayCompat);
        }
        Object obj = sparseArrayCompat.get(0);
        if (obj instanceof ExpressionSubscriber) {
            expressionSubscriber = (ExpressionSubscriber) obj;
        }
        if (expressionSubscriber == null) {
            Releasables releasables = new Releasables();
            sparseArrayCompat.put(0, releasables);
            return releasables;
        }
        return expressionSubscriber;
    }

    @Nullable
    /* renamed from: b */
    public static final Iterable<Releasable> m12027b(@NotNull View view) {
        SparseArrayCompat sparseArrayCompat;
        Intrinsics.checkNotNullParameter(view, "<this>");
        Object tag = view.getTag(C45190f.div_releasable_list);
        if (tag instanceof SparseArrayCompat) {
            sparseArrayCompat = (SparseArrayCompat) tag;
        } else {
            sparseArrayCompat = null;
        }
        if (sparseArrayCompat == null) {
            return null;
        }
        return C39635o.m12024a(sparseArrayCompat);
    }
}
