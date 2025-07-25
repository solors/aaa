package androidx.window.embedding;

import androidx.window.core.ExperimentalWindowApi;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections._Collections;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ActivityRule.kt */
@ExperimentalWindowApi
@Metadata
/* loaded from: classes2.dex */
public final class ActivityRule extends EmbeddingRule {
    private final boolean alwaysExpand;
    @NotNull
    private final Set<ActivityFilter> filters;

    public /* synthetic */ ActivityRule(Set set, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(set, (i & 2) != 0 ? false : z);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityRule)) {
            return false;
        }
        ActivityRule activityRule = (ActivityRule) obj;
        if (Intrinsics.m17075f(this.filters, activityRule.filters) && this.alwaysExpand == activityRule.alwaysExpand) {
            return true;
        }
        return false;
    }

    public final boolean getAlwaysExpand() {
        return this.alwaysExpand;
    }

    @NotNull
    public final Set<ActivityFilter> getFilters() {
        return this.filters;
    }

    public int hashCode() {
        return (this.filters.hashCode() * 31) + Boolean.hashCode(this.alwaysExpand);
    }

    @NotNull
    public final ActivityRule plus$window_release(@NotNull ActivityFilter filter) {
        Set m17547e1;
        Intrinsics.checkNotNullParameter(filter, "filter");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(this.filters);
        linkedHashSet.add(filter);
        m17547e1 = _Collections.m17547e1(linkedHashSet);
        return new ActivityRule(m17547e1, this.alwaysExpand);
    }

    public ActivityRule(@NotNull Set<ActivityFilter> filters, boolean z) {
        Set<ActivityFilter> m17547e1;
        Intrinsics.checkNotNullParameter(filters, "filters");
        this.alwaysExpand = z;
        m17547e1 = _Collections.m17547e1(filters);
        this.filters = m17547e1;
    }
}
