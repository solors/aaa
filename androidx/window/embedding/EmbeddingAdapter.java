package androidx.window.embedding;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.util.Pair;
import android.view.WindowMetrics;
import androidx.window.core.ExperimentalWindowApi;
import androidx.window.extensions.embedding.ActivityRule;
import androidx.window.extensions.embedding.SplitPairRule;
import androidx.window.extensions.embedding.SplitPlaceholderRule;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import kotlin.Metadata;
import kotlin.collections.C37566w;
import kotlin.collections._Collections;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: EmbeddingAdapter.kt */
@ExperimentalWindowApi
@Metadata
/* loaded from: classes2.dex */
public final class EmbeddingAdapter {
    private final <F, S> F component1(Pair<F, S> pair) {
        Intrinsics.checkNotNullParameter(pair, "<this>");
        return (F) pair.first;
    }

    private final <F, S> S component2(Pair<F, S> pair) {
        Intrinsics.checkNotNullParameter(pair, "<this>");
        return (S) pair.second;
    }

    /* renamed from: translateActivityIntentPredicates$lambda-3 */
    public static final boolean m109995translateActivityIntentPredicates$lambda3(EmbeddingAdapter this$0, Set splitPairFilters, Pair pair) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(splitPairFilters, "$splitPairFilters");
        Intrinsics.checkNotNullExpressionValue(pair, "(first, second)");
        Activity activity = (Activity) this$0.component1(pair);
        Intent intent = (Intent) this$0.component2(pair);
        Set<SplitPairFilter> set = splitPairFilters;
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        for (SplitPairFilter splitPairFilter : set) {
            if (splitPairFilter.matchesActivityIntentPair(activity, intent)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: translateActivityPairPredicates$lambda-1 */
    public static final boolean m109996translateActivityPairPredicates$lambda1(EmbeddingAdapter this$0, Set splitPairFilters, Pair pair) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(splitPairFilters, "$splitPairFilters");
        Intrinsics.checkNotNullExpressionValue(pair, "(first, second)");
        Activity activity = (Activity) this$0.component1(pair);
        Activity activity2 = (Activity) this$0.component2(pair);
        Set<SplitPairFilter> set = splitPairFilters;
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        for (SplitPairFilter splitPairFilter : set) {
            if (splitPairFilter.matchesActivityPair(activity, activity2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: translateActivityPredicates$lambda-6 */
    public static final boolean m109997translateActivityPredicates$lambda6(Set activityFilters, Activity activity) {
        Intrinsics.checkNotNullParameter(activityFilters, "$activityFilters");
        Set<ActivityFilter> set = activityFilters;
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        for (ActivityFilter activityFilter : set) {
            Intrinsics.checkNotNullExpressionValue(activity, "activity");
            if (activityFilter.matchesActivity(activity)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: translateIntentPredicates$lambda-8 */
    public static final boolean m109998translateIntentPredicates$lambda8(Set activityFilters, Intent intent) {
        Intrinsics.checkNotNullParameter(activityFilters, "$activityFilters");
        Set<ActivityFilter> set = activityFilters;
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        for (ActivityFilter activityFilter : set) {
            Intrinsics.checkNotNullExpressionValue(intent, "intent");
            if (activityFilter.matchesIntent(intent)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: translateParentMetricsPredicate$lambda-4 */
    public static final boolean m109999translateParentMetricsPredicate$lambda4(SplitRule splitRule, WindowMetrics windowMetrics) {
        Intrinsics.checkNotNullParameter(splitRule, "$splitRule");
        Intrinsics.checkNotNullExpressionValue(windowMetrics, "windowMetrics");
        return splitRule.checkParentMetrics(windowMetrics);
    }

    @NotNull
    public final List<SplitInfo> translate(@NotNull List<? extends androidx.window.extensions.embedding.SplitInfo> splitInfoList) {
        int m17154x;
        Intrinsics.checkNotNullParameter(splitInfoList, "splitInfoList");
        List<? extends androidx.window.extensions.embedding.SplitInfo> list = splitInfoList;
        m17154x = C37566w.m17154x(list, 10);
        ArrayList arrayList = new ArrayList(m17154x);
        for (androidx.window.extensions.embedding.SplitInfo splitInfo : list) {
            arrayList.add(translate(splitInfo));
        }
        return arrayList;
    }

    @SuppressLint({"ClassVerificationFailure", "NewApi"})
    @NotNull
    public final Predicate<Pair<Activity, Intent>> translateActivityIntentPredicates(@NotNull final Set<SplitPairFilter> splitPairFilters) {
        Intrinsics.checkNotNullParameter(splitPairFilters, "splitPairFilters");
        return new Predicate() { // from class: androidx.window.embedding.a
            {
                EmbeddingAdapter.this = this;
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean m109995translateActivityIntentPredicates$lambda3;
                m109995translateActivityIntentPredicates$lambda3 = EmbeddingAdapter.m109995translateActivityIntentPredicates$lambda3(EmbeddingAdapter.this, splitPairFilters, (Pair) obj);
                return m109995translateActivityIntentPredicates$lambda3;
            }
        };
    }

    @SuppressLint({"ClassVerificationFailure", "NewApi"})
    @NotNull
    public final Predicate<Pair<Activity, Activity>> translateActivityPairPredicates(@NotNull final Set<SplitPairFilter> splitPairFilters) {
        Intrinsics.checkNotNullParameter(splitPairFilters, "splitPairFilters");
        return new Predicate() { // from class: androidx.window.embedding.e
            {
                EmbeddingAdapter.this = this;
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean m109996translateActivityPairPredicates$lambda1;
                m109996translateActivityPairPredicates$lambda1 = EmbeddingAdapter.m109996translateActivityPairPredicates$lambda1(EmbeddingAdapter.this, splitPairFilters, (Pair) obj);
                return m109996translateActivityPairPredicates$lambda1;
            }
        };
    }

    @SuppressLint({"ClassVerificationFailure", "NewApi"})
    @NotNull
    public final Predicate<Activity> translateActivityPredicates(@NotNull final Set<ActivityFilter> activityFilters) {
        Intrinsics.checkNotNullParameter(activityFilters, "activityFilters");
        return new Predicate() { // from class: androidx.window.embedding.b
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean m109997translateActivityPredicates$lambda6;
                m109997translateActivityPredicates$lambda6 = EmbeddingAdapter.m109997translateActivityPredicates$lambda6(activityFilters, (Activity) obj);
                return m109997translateActivityPredicates$lambda6;
            }
        };
    }

    @SuppressLint({"ClassVerificationFailure", "NewApi"})
    @NotNull
    public final Predicate<Intent> translateIntentPredicates(@NotNull final Set<ActivityFilter> activityFilters) {
        Intrinsics.checkNotNullParameter(activityFilters, "activityFilters");
        return new Predicate() { // from class: androidx.window.embedding.d
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean m109998translateIntentPredicates$lambda8;
                m109998translateIntentPredicates$lambda8 = EmbeddingAdapter.m109998translateIntentPredicates$lambda8(activityFilters, (Intent) obj);
                return m109998translateIntentPredicates$lambda8;
            }
        };
    }

    @SuppressLint({"ClassVerificationFailure", "NewApi"})
    @NotNull
    public final Predicate<WindowMetrics> translateParentMetricsPredicate(@NotNull final SplitRule splitRule) {
        Intrinsics.checkNotNullParameter(splitRule, "splitRule");
        return new Predicate() { // from class: androidx.window.embedding.c
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean m109999translateParentMetricsPredicate$lambda4;
                m109999translateParentMetricsPredicate$lambda4 = EmbeddingAdapter.m109999translateParentMetricsPredicate$lambda4(splitRule, (WindowMetrics) obj);
                return m109999translateParentMetricsPredicate$lambda4;
            }
        };
    }

    private final SplitInfo translate(androidx.window.extensions.embedding.SplitInfo splitInfo) {
        boolean z;
        androidx.window.extensions.embedding.ActivityStack primaryActivityStack = splitInfo.getPrimaryActivityStack();
        Intrinsics.checkNotNullExpressionValue(primaryActivityStack, "splitInfo.primaryActivityStack");
        boolean z2 = false;
        try {
            z = primaryActivityStack.isEmpty();
        } catch (NoSuchMethodError unused) {
            z = false;
        }
        List activities = primaryActivityStack.getActivities();
        Intrinsics.checkNotNullExpressionValue(activities, "primaryActivityStack.activities");
        ActivityStack activityStack = new ActivityStack(activities, z);
        androidx.window.extensions.embedding.ActivityStack secondaryActivityStack = splitInfo.getSecondaryActivityStack();
        Intrinsics.checkNotNullExpressionValue(secondaryActivityStack, "splitInfo.secondaryActivityStack");
        try {
            z2 = secondaryActivityStack.isEmpty();
        } catch (NoSuchMethodError unused2) {
        }
        List activities2 = secondaryActivityStack.getActivities();
        Intrinsics.checkNotNullExpressionValue(activities2, "secondaryActivityStack.activities");
        return new SplitInfo(activityStack, new ActivityStack(activities2, z2), splitInfo.getSplitRatio());
    }

    @NotNull
    public final Set<androidx.window.extensions.embedding.EmbeddingRule> translate(@NotNull Set<? extends EmbeddingRule> rules) {
        int m17154x;
        Set<androidx.window.extensions.embedding.EmbeddingRule> m17547e1;
        androidx.window.extensions.embedding.SplitPairRule build;
        Intrinsics.checkNotNullParameter(rules, "rules");
        Set<? extends EmbeddingRule> set = rules;
        m17154x = C37566w.m17154x(set, 10);
        ArrayList arrayList = new ArrayList(m17154x);
        for (EmbeddingRule embeddingRule : set) {
            if (embeddingRule instanceof SplitPairRule) {
                SplitPairRule splitPairRule = (SplitPairRule) embeddingRule;
                build = new SplitPairRule.Builder(translateActivityPairPredicates(splitPairRule.getFilters()), translateActivityIntentPredicates(splitPairRule.getFilters()), translateParentMetricsPredicate((SplitRule) embeddingRule)).setSplitRatio(splitPairRule.getSplitRatio()).setLayoutDirection(splitPairRule.getLayoutDirection()).setShouldFinishPrimaryWithSecondary(splitPairRule.getFinishPrimaryWithSecondary()).setShouldFinishSecondaryWithPrimary(splitPairRule.getFinishSecondaryWithPrimary()).setShouldClearTop(splitPairRule.getClearTop()).build();
                Intrinsics.checkNotNullExpressionValue(build, "SplitPairRuleBuilder(\n  …                 .build()");
            } else if (embeddingRule instanceof SplitPlaceholderRule) {
                SplitPlaceholderRule splitPlaceholderRule = (SplitPlaceholderRule) embeddingRule;
                build = new SplitPlaceholderRule.Builder(splitPlaceholderRule.getPlaceholderIntent(), translateActivityPredicates(splitPlaceholderRule.getFilters()), translateIntentPredicates(splitPlaceholderRule.getFilters()), translateParentMetricsPredicate((SplitRule) embeddingRule)).setSplitRatio(splitPlaceholderRule.getSplitRatio()).setLayoutDirection(splitPlaceholderRule.getLayoutDirection()).build();
                Intrinsics.checkNotNullExpressionValue(build, "SplitPlaceholderRuleBuil…                 .build()");
            } else if (embeddingRule instanceof ActivityRule) {
                ActivityRule activityRule = (ActivityRule) embeddingRule;
                build = new ActivityRule.Builder(translateActivityPredicates(activityRule.getFilters()), translateIntentPredicates(activityRule.getFilters())).setShouldAlwaysExpand(activityRule.getAlwaysExpand()).build();
                Intrinsics.checkNotNullExpressionValue(build, "ActivityRuleBuilder(\n   …                 .build()");
            } else {
                throw new IllegalArgumentException("Unsupported rule type");
            }
            arrayList.add((androidx.window.extensions.embedding.EmbeddingRule) build);
        }
        m17547e1 = _Collections.m17547e1(arrayList);
        return m17547e1;
    }
}
