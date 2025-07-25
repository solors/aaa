package kotlin.reflect;

import kotlin.Metadata;
import p804nd.InterfaceC38498g;

/* compiled from: KFunction.kt */
@Metadata
/* loaded from: classes7.dex */
public interface KFunction<R> extends KCallable<R>, InterfaceC38498g<R> {
    boolean isExternal();

    boolean isInfix();

    boolean isInline();

    boolean isOperator();

    @Override // kotlin.reflect.KCallable
    boolean isSuspend();

    /* compiled from: KFunction.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ void isExternal$annotations() {
        }

        public static /* synthetic */ void isInfix$annotations() {
        }

        public static /* synthetic */ void isInline$annotations() {
        }

        public static /* synthetic */ void isOperator$annotations() {
        }

        public static /* synthetic */ void isSuspend$annotations() {
        }
    }
}
