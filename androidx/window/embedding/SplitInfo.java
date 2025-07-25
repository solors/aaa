package androidx.window.embedding;

import android.app.Activity;
import androidx.window.core.ExperimentalWindowApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SplitInfo.kt */
@ExperimentalWindowApi
@Metadata
/* loaded from: classes2.dex */
public final class SplitInfo {
    @NotNull
    private final ActivityStack primaryActivityStack;
    @NotNull
    private final ActivityStack secondaryActivityStack;
    private final float splitRatio;

    public SplitInfo(@NotNull ActivityStack primaryActivityStack, @NotNull ActivityStack secondaryActivityStack, float f) {
        Intrinsics.checkNotNullParameter(primaryActivityStack, "primaryActivityStack");
        Intrinsics.checkNotNullParameter(secondaryActivityStack, "secondaryActivityStack");
        this.primaryActivityStack = primaryActivityStack;
        this.secondaryActivityStack = secondaryActivityStack;
        this.splitRatio = f;
    }

    public final boolean contains(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (!this.primaryActivityStack.contains(activity) && !this.secondaryActivityStack.contains(activity)) {
            return false;
        }
        return true;
    }

    public boolean equals(@Nullable Object obj) {
        boolean z;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SplitInfo)) {
            return false;
        }
        SplitInfo splitInfo = (SplitInfo) obj;
        if (!Intrinsics.m17075f(this.primaryActivityStack, splitInfo.primaryActivityStack) || !Intrinsics.m17075f(this.secondaryActivityStack, splitInfo.secondaryActivityStack)) {
            return false;
        }
        if (this.splitRatio == splitInfo.splitRatio) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        return false;
    }

    @NotNull
    public final ActivityStack getPrimaryActivityStack() {
        return this.primaryActivityStack;
    }

    @NotNull
    public final ActivityStack getSecondaryActivityStack() {
        return this.secondaryActivityStack;
    }

    public final float getSplitRatio() {
        return this.splitRatio;
    }

    public int hashCode() {
        return (((this.primaryActivityStack.hashCode() * 31) + this.secondaryActivityStack.hashCode()) * 31) + Float.hashCode(this.splitRatio);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("SplitInfo:{");
        sb2.append("primaryActivityStack=" + getPrimaryActivityStack() + ',');
        sb2.append("secondaryActivityStack=" + getSecondaryActivityStack() + ',');
        sb2.append("splitRatio=" + getSplitRatio() + '}');
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}
