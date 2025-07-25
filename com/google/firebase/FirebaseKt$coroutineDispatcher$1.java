package com.google.firebase;

import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.Qualified;
import java.lang.annotation.Annotation;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C37798s1;
import kotlinx.coroutines.CoroutineDispatcher;

/* compiled from: Firebase.kt */
@Metadata
/* loaded from: classes4.dex */
public final class FirebaseKt$coroutineDispatcher$1<T> implements ComponentFactory {
    public static final FirebaseKt$coroutineDispatcher$1<T> INSTANCE = new FirebaseKt$coroutineDispatcher$1<>();

    @Override // com.google.firebase.components.ComponentFactory
    public final CoroutineDispatcher create(ComponentContainer componentContainer) {
        Intrinsics.m17067n(4, "T");
        Object obj = componentContainer.get(Qualified.qualified(Annotation.class, Executor.class));
        Intrinsics.checkNotNullExpressionValue(obj, "c.get(Qualified.qualifie…a, Executor::class.java))");
        return C37798s1.m16100b((Executor) obj);
    }
}
