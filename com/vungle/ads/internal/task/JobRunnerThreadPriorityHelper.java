package com.vungle.ads.internal.task;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.vungle.ads.internal.task.g */
/* loaded from: classes7.dex */
public final class JobRunnerThreadPriorityHelper implements ThreadPriorityHelper {
    @Override // com.vungle.ads.internal.task.ThreadPriorityHelper
    public int makeAndroidThreadPriority(@NotNull JobInfo jobInfo) {
        Intrinsics.checkNotNullParameter(jobInfo, "jobInfo");
        return Math.min(19, Math.abs(Math.min(0, jobInfo.getPriority() - 2)) + 10);
    }
}
