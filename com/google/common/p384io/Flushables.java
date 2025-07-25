package com.google.common.p384io;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import java.io.Flushable;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

@ElementTypesAreNonnullByDefault
@Beta
@GwtIncompatible
/* renamed from: com.google.common.io.Flushables */
/* loaded from: classes4.dex */
public final class Flushables {

    /* renamed from: a */
    private static final Logger f41305a = Logger.getLogger(Flushables.class.getName());

    private Flushables() {
    }

    public static void flush(Flushable flushable, boolean z) throws IOException {
        try {
            flushable.flush();
        } catch (IOException e) {
            if (z) {
                f41305a.log(Level.WARNING, "IOException thrown while flushing Flushable.", (Throwable) e);
                return;
            }
            throw e;
        }
    }

    public static void flushQuietly(Flushable flushable) {
        try {
            flush(flushable, true);
        } catch (IOException e) {
            f41305a.log(Level.SEVERE, "IOException should not have been thrown.", (Throwable) e);
        }
    }
}
