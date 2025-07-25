package androidx.window.embedding;

import android.content.Intent;
import androidx.window.core.ExperimentalWindowApi;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections._Collections;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SplitPlaceholderRule.kt */
@ExperimentalWindowApi
@Metadata
/* loaded from: classes2.dex */
public final class SplitPlaceholderRule extends SplitRule {
    @NotNull
    private final Set<ActivityFilter> filters;
    @NotNull
    private final Intent placeholderIntent;

    public /* synthetic */ SplitPlaceholderRule(Set set, Intent intent, int i, int i2, float f, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(set, intent, (i4 & 4) != 0 ? 0 : i, (i4 & 8) != 0 ? 0 : i2, (i4 & 16) != 0 ? 0.5f : f, (i4 & 32) != 0 ? 3 : i3);
    }

    @Override // androidx.window.embedding.SplitRule
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SplitPlaceholderRule) || !super.equals(obj) || !super.equals(obj)) {
            return false;
        }
        SplitPlaceholderRule splitPlaceholderRule = (SplitPlaceholderRule) obj;
        if (Intrinsics.m17075f(this.filters, splitPlaceholderRule.filters) && Intrinsics.m17075f(this.placeholderIntent, splitPlaceholderRule.placeholderIntent)) {
            return true;
        }
        return false;
    }

    @NotNull
    public final Set<ActivityFilter> getFilters() {
        return this.filters;
    }

    @NotNull
    public final Intent getPlaceholderIntent() {
        return this.placeholderIntent;
    }

    @Override // androidx.window.embedding.SplitRule
    public int hashCode() {
        return (((super.hashCode() * 31) + this.filters.hashCode()) * 31) + this.placeholderIntent.hashCode();
    }

    @NotNull
    public final SplitPlaceholderRule plus$window_release(@NotNull ActivityFilter filter) {
        Set m17547e1;
        Intrinsics.checkNotNullParameter(filter, "filter");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(this.filters);
        linkedHashSet.add(filter);
        m17547e1 = _Collections.m17547e1(linkedHashSet);
        return new SplitPlaceholderRule(m17547e1, this.placeholderIntent, getMinWidth(), getMinSmallestWidth(), getSplitRatio(), getLayoutDirection());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SplitPlaceholderRule(@NotNull Set<ActivityFilter> filters, @NotNull Intent placeholderIntent, int i, int i2, float f, int i3) {
        super(i, i2, f, i3);
        Set<ActivityFilter> m17547e1;
        Intrinsics.checkNotNullParameter(filters, "filters");
        Intrinsics.checkNotNullParameter(placeholderIntent, "placeholderIntent");
        this.placeholderIntent = placeholderIntent;
        m17547e1 = _Collections.m17547e1(filters);
        this.filters = m17547e1;
    }
}
