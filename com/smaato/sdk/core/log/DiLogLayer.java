package com.smaato.sdk.core.log;

import androidx.annotation.NonNull;
import com.smaato.sdk.core.log.DiLogLayer;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.p569di.ClassFactory;
import com.smaato.sdk.core.p569di.DiConstructor;
import com.smaato.sdk.core.p569di.DiRegistry;
import com.smaato.sdk.core.util.p574fi.Consumer;

/* loaded from: classes7.dex */
public final class DiLogLayer {
    private static final Logger EMPTY = new EmptyLogger();

    private DiLogLayer() {
    }

    @NonNull
    public static DiRegistry createRegistry(final boolean z, @NonNull final LogLevel logLevel) {
        return DiRegistry.m39638of(new Consumer() { // from class: o7.a
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                DiLogLayer.lambda$createRegistry$1(z, logLevel, (DiRegistry) obj);
            }
        });
    }

    @NonNull
    public static Logger getLoggerFrom(@NonNull DiConstructor diConstructor) {
        return (Logger) diConstructor.get(Logger.class);
    }

    public static /* synthetic */ Logger lambda$createRegistry$0(boolean z, LogLevel logLevel, DiConstructor diConstructor) {
        if (z) {
            LoggerFactory.m39493b(logLevel);
            return LoggerFactory.m39494a();
        }
        return EMPTY;
    }

    public static /* synthetic */ void lambda$createRegistry$1(final boolean z, final LogLevel logLevel, DiRegistry diRegistry) {
        diRegistry.registerSingletonFactory(Logger.class, new ClassFactory() { // from class: o7.b
            @Override // com.smaato.sdk.core.p569di.ClassFactory
            public final Object get(DiConstructor diConstructor) {
                Logger lambda$createRegistry$0;
                lambda$createRegistry$0 = DiLogLayer.lambda$createRegistry$0(z, logLevel, diConstructor);
                return lambda$createRegistry$0;
            }
        });
    }
}
