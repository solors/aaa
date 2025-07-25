package com.unity3d.services.core.properties;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: Session.kt */
@Metadata
/* loaded from: classes7.dex */
public interface Session {
    @NotNull
    public static final Default Default = Default.$$INSTANCE;

    /* compiled from: Session.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public static final class Default implements Session {
        static final /* synthetic */ Default $$INSTANCE = new Default();
        @NotNull

        /* renamed from: id */
        private static final String f74989id = SessionIdReader.INSTANCE.getSessionId();

        private Default() {
        }

        @Override // com.unity3d.services.core.properties.Session
        @NotNull
        public String getId() {
            return f74989id;
        }
    }

    @NotNull
    String getId();
}
