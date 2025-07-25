package kotlin.reflect;

import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: KClass.kt */
@Metadata
/* loaded from: classes7.dex */
public interface KClass<T> extends KDeclarationContainer, KAnnotatedElement, KClassifier {
    boolean equals(@Nullable Object obj);

    @NotNull
    Collection<KFunction<T>> getConstructors();

    @Override // kotlin.reflect.KDeclarationContainer
    @NotNull
    Collection<KCallable<?>> getMembers();

    @NotNull
    Collection<KClass<?>> getNestedClasses();

    @Nullable
    T getObjectInstance();

    @Nullable
    String getQualifiedName();

    @NotNull
    List<KClass<? extends T>> getSealedSubclasses();

    @Nullable
    String getSimpleName();

    @NotNull
    List<KType> getSupertypes();

    @NotNull
    List<KTypeParameter> getTypeParameters();

    @Nullable
    KVisibility getVisibility();

    int hashCode();

    boolean isAbstract();

    boolean isCompanion();

    boolean isData();

    boolean isFinal();

    boolean isFun();

    boolean isInner();

    boolean isInstance(@Nullable Object obj);

    boolean isOpen();

    boolean isSealed();

    boolean isValue();

    /* compiled from: KClass.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ void getConstructors$annotations() {
        }

        public static /* synthetic */ void getMembers$annotations() {
        }

        public static /* synthetic */ void getNestedClasses$annotations() {
        }

        public static /* synthetic */ void getObjectInstance$annotations() {
        }

        public static /* synthetic */ void getSealedSubclasses$annotations() {
        }

        public static /* synthetic */ void getSupertypes$annotations() {
        }

        public static /* synthetic */ void getTypeParameters$annotations() {
        }

        public static /* synthetic */ void getVisibility$annotations() {
        }

        public static /* synthetic */ void isAbstract$annotations() {
        }

        public static /* synthetic */ void isCompanion$annotations() {
        }

        public static /* synthetic */ void isData$annotations() {
        }

        public static /* synthetic */ void isFinal$annotations() {
        }

        public static /* synthetic */ void isFun$annotations() {
        }

        public static /* synthetic */ void isInner$annotations() {
        }

        public static /* synthetic */ void isOpen$annotations() {
        }

        public static /* synthetic */ void isSealed$annotations() {
        }

        public static /* synthetic */ void isValue$annotations() {
        }
    }
}
