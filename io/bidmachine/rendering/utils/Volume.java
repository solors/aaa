package io.bidmachine.rendering.utils;

import androidx.annotation.FloatRange;
import com.inmobi.commons.core.configs.CrashConfig;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@FloatRange(from = 0.0d, m105511to = CrashConfig.DEFAULT_CRASH_SAMPLING_PERCENT)
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes9.dex */
public @interface Volume {
}
