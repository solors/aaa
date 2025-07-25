package com.vungle.ads.internal.task;

import android.os.Bundle;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.vungle.ads.internal.task.b */
/* loaded from: classes7.dex */
public interface Job {
    int onRunJob(@NotNull Bundle bundle, @NotNull JobRunner jobRunner);
}
