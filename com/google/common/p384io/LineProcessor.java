package com.google.common.p384io;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;

@ElementTypesAreNonnullByDefault
@Beta
@GwtIncompatible
/* renamed from: com.google.common.io.LineProcessor */
/* loaded from: classes4.dex */
public interface LineProcessor<T> {
    @ParametricNullness
    T getResult();

    @CanIgnoreReturnValue
    boolean processLine(String str) throws IOException;
}
