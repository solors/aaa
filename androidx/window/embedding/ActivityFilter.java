package androidx.window.embedding;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import androidx.window.core.ExperimentalWindowApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ActivityFilter.kt */
@ExperimentalWindowApi
@Metadata
/* loaded from: classes2.dex */
public final class ActivityFilter {
    @NotNull
    private final ComponentName componentName;
    @Nullable
    private final String intentAction;

    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ActivityFilter(@org.jetbrains.annotations.NotNull android.content.ComponentName r12, @org.jetbrains.annotations.Nullable java.lang.String r13) {
        /*
            r11 = this;
            java.lang.String r0 = "componentName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r11.<init>()
            r11.componentName = r12
            r11.intentAction = r13
            java.lang.String r13 = r12.getPackageName()
            java.lang.String r0 = "componentName.packageName"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r13, r0)
            java.lang.String r12 = r12.getClassName()
            java.lang.String r0 = "componentName.className"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r0)
            int r0 = r13.length()
            r7 = 1
            r8 = 0
            if (r0 <= 0) goto L28
            r0 = r7
            goto L29
        L28:
            r0 = r8
        L29:
            if (r0 == 0) goto L99
            int r0 = r12.length()
            if (r0 <= 0) goto L33
            r0 = r7
            goto L34
        L33:
            r0 = r8
        L34:
            if (r0 == 0) goto L8d
            java.lang.String r0 = "*"
            r9 = 2
            r10 = 0
            boolean r1 = kotlin.text.C37686h.m16706R(r13, r0, r8, r9, r10)
            if (r1 == 0) goto L55
            java.lang.String r2 = "*"
            r3 = 0
            r4 = 0
            r5 = 6
            r6 = 0
            r1 = r13
            int r1 = kotlin.text.C37686h.m16690e0(r1, r2, r3, r4, r5, r6)
            int r13 = r13.length()
            int r13 = r13 - r7
            if (r1 != r13) goto L53
            goto L55
        L53:
            r13 = r8
            goto L56
        L55:
            r13 = r7
        L56:
            if (r13 == 0) goto L81
            boolean r13 = kotlin.text.C37686h.m16706R(r12, r0, r8, r9, r10)
            if (r13 == 0) goto L72
            java.lang.String r2 = "*"
            r3 = 0
            r4 = 0
            r5 = 6
            r6 = 0
            r1 = r12
            int r13 = kotlin.text.C37686h.m16690e0(r1, r2, r3, r4, r5, r6)
            int r12 = r12.length()
            int r12 = r12 - r7
            if (r13 != r12) goto L71
            goto L72
        L71:
            r7 = r8
        L72:
            if (r7 == 0) goto L75
            return
        L75:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = "Wildcard in class name is only allowed at the end."
            java.lang.String r13 = r13.toString()
            r12.<init>(r13)
            throw r12
        L81:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = "Wildcard in package name is only allowed at the end."
            java.lang.String r13 = r13.toString()
            r12.<init>(r13)
            throw r12
        L8d:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = "Activity class name must not be empty."
            java.lang.String r13 = r13.toString()
            r12.<init>(r13)
            throw r12
        L99:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = "Package name must not be empty"
            java.lang.String r13 = r13.toString()
            r12.<init>(r13)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.window.embedding.ActivityFilter.<init>(android.content.ComponentName, java.lang.String):void");
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityFilter)) {
            return false;
        }
        ActivityFilter activityFilter = (ActivityFilter) obj;
        if (Intrinsics.m17075f(this.componentName, activityFilter.componentName) && Intrinsics.m17075f(this.intentAction, activityFilter.intentAction)) {
            return true;
        }
        return false;
    }

    @NotNull
    public final ComponentName getComponentName() {
        return this.componentName;
    }

    @Nullable
    public final String getIntentAction() {
        return this.intentAction;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.componentName.hashCode() * 31;
        String str = this.intentAction;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final boolean matchesActivity(@NotNull Activity activity) {
        String action;
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (MatcherUtils.INSTANCE.areActivityOrIntentComponentsMatching$window_release(activity, this.componentName)) {
            String str = this.intentAction;
            if (str != null) {
                Intent intent = activity.getIntent();
                if (intent == null) {
                    action = null;
                } else {
                    action = intent.getAction();
                }
                if (Intrinsics.m17075f(str, action)) {
                }
            }
            return true;
        }
        return false;
    }

    public final boolean matchesIntent(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (!MatcherUtils.INSTANCE.areComponentsMatching$window_release(intent.getComponent(), this.componentName)) {
            return false;
        }
        String str = this.intentAction;
        if (str != null && !Intrinsics.m17075f(str, intent.getAction())) {
            return false;
        }
        return true;
    }

    @NotNull
    public String toString() {
        return "ActivityFilter(componentName=" + this.componentName + ", intentAction=" + ((Object) this.intentAction) + ')';
    }
}
