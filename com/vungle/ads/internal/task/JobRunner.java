package com.vungle.ads.internal.task;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.vungle.ads.internal.task.f */
/* loaded from: classes7.dex */
public interface JobRunner {
    void cancelPendingJob(@NotNull String str);

    void execute(@NotNull JobInfo jobInfo);
}
