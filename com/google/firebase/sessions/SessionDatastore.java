package com.google.firebase.sessions;

import com.google.firebase.Firebase;
import com.google.firebase.FirebaseKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SessionDatastore.kt */
@Metadata
/* loaded from: classes4.dex */
public interface SessionDatastore {
    @NotNull
    public static final Companion Companion = Companion.f43713a;

    /* compiled from: SessionDatastore.kt */
    @Metadata
    /* loaded from: classes4.dex */
    public static final class Companion {

        /* renamed from: a */
        static final /* synthetic */ Companion f43713a = new Companion();

        private Companion() {
        }

        @NotNull
        public final SessionDatastore getInstance() {
            Object obj = FirebaseKt.getApp(Firebase.INSTANCE).get(SessionDatastore.class);
            Intrinsics.checkNotNullExpressionValue(obj, "Firebase.app[SessionDatastore::class.java]");
            return (SessionDatastore) obj;
        }
    }

    @Nullable
    String getCurrentSessionId();

    void updateSessionId(@NotNull String str);
}
