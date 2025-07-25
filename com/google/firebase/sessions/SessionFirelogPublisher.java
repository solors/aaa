package com.google.firebase.sessions;

import com.google.firebase.Firebase;
import com.google.firebase.FirebaseKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: SessionFirelogPublisher.kt */
@Metadata
/* loaded from: classes4.dex */
public interface SessionFirelogPublisher {
    @NotNull
    public static final Companion Companion = Companion.f43749a;

    /* compiled from: SessionFirelogPublisher.kt */
    @Metadata
    /* loaded from: classes4.dex */
    public static final class Companion {

        /* renamed from: a */
        static final /* synthetic */ Companion f43749a = new Companion();

        private Companion() {
        }

        @NotNull
        public final SessionFirelogPublisher getInstance() {
            Object obj = FirebaseKt.getApp(Firebase.INSTANCE).get(SessionFirelogPublisher.class);
            Intrinsics.checkNotNullExpressionValue(obj, "Firebase.app[SessionFirelogPublisher::class.java]");
            return (SessionFirelogPublisher) obj;
        }
    }

    void logSession(@NotNull SessionDetails sessionDetails);
}
