package com.google.common.p384io;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotMock;
import java.io.IOException;

@Beta
@GwtIncompatible
@ElementTypesAreNonnullByDefault
@DoNotMock("Implement it normally")
/* renamed from: com.google.common.io.ByteProcessor */
/* loaded from: classes4.dex */
public interface ByteProcessor<T> {
    @ParametricNullness
    T getResult();

    @CanIgnoreReturnValue
    boolean processBytes(byte[] bArr, int i, int i2) throws IOException;
}
