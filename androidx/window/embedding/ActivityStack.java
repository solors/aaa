package androidx.window.embedding;

import android.app.Activity;
import androidx.window.core.ExperimentalWindowApi;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ActivityStack.kt */
@ExperimentalWindowApi
@Metadata
/* loaded from: classes2.dex */
public final class ActivityStack {
    @NotNull
    private final List<Activity> activities;
    private final boolean isEmpty;

    /* JADX WARN: Multi-variable type inference failed */
    public ActivityStack(@NotNull List<? extends Activity> activities, boolean z) {
        Intrinsics.checkNotNullParameter(activities, "activities");
        this.activities = activities;
        this.isEmpty = z;
    }

    public final boolean contains(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        return this.activities.contains(activity);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityStack)) {
            return false;
        }
        ActivityStack activityStack = (ActivityStack) obj;
        if (!Intrinsics.m17075f(this.activities, activityStack.activities) && this.isEmpty != activityStack.isEmpty) {
            return true;
        }
        return false;
    }

    @NotNull
    public final List<Activity> getActivities$window_release() {
        return this.activities;
    }

    public int hashCode() {
        return ((this.isEmpty ? 1 : 0) * 31) + this.activities.hashCode();
    }

    public final boolean isEmpty() {
        return this.isEmpty;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ActivityStack{");
        sb2.append(Intrinsics.m17064q("activities=", getActivities$window_release()));
        sb2.append("isEmpty=" + this.isEmpty + '}');
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public /* synthetic */ ActivityStack(List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? false : z);
    }
}
