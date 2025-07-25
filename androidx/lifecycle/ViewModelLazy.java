package androidx.lifecycle;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1062yd.JvmClassMapping;
import p804nd.InterfaceC38501j;

/* compiled from: ViewModelLazy.kt */
@Metadata
/* loaded from: classes.dex */
public final class ViewModelLazy<VM extends ViewModel> implements InterfaceC38501j<VM> {
    @Nullable
    private VM cached;
    @NotNull
    private final Functions<CreationExtras> extrasProducer;
    @NotNull
    private final Functions<ViewModelProvider.Factory> factoryProducer;
    @NotNull
    private final Functions<ViewModelStore> storeProducer;
    @NotNull
    private final KClass<VM> viewModelClass;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewModelLazy.kt */
    @Metadata
    /* renamed from: androidx.lifecycle.ViewModelLazy$1 */
    /* loaded from: classes.dex */
    public static final class C19981 extends Lambda implements Functions<CreationExtras.Empty> {
        public static final C19981 INSTANCE = new C19981();

        C19981() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Functions
        @NotNull
        public final CreationExtras.Empty invoke() {
            return CreationExtras.Empty.INSTANCE;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewModelLazy(@NotNull KClass<VM> viewModelClass, @NotNull Functions<? extends ViewModelStore> storeProducer, @NotNull Functions<? extends ViewModelProvider.Factory> factoryProducer) {
        this(viewModelClass, storeProducer, factoryProducer, null, 8, null);
        Intrinsics.checkNotNullParameter(viewModelClass, "viewModelClass");
        Intrinsics.checkNotNullParameter(storeProducer, "storeProducer");
        Intrinsics.checkNotNullParameter(factoryProducer, "factoryProducer");
    }

    @Override // p804nd.InterfaceC38501j
    public boolean isInitialized() {
        if (this.cached != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ViewModelLazy(@NotNull KClass<VM> viewModelClass, @NotNull Functions<? extends ViewModelStore> storeProducer, @NotNull Functions<? extends ViewModelProvider.Factory> factoryProducer, @NotNull Functions<? extends CreationExtras> extrasProducer) {
        Intrinsics.checkNotNullParameter(viewModelClass, "viewModelClass");
        Intrinsics.checkNotNullParameter(storeProducer, "storeProducer");
        Intrinsics.checkNotNullParameter(factoryProducer, "factoryProducer");
        Intrinsics.checkNotNullParameter(extrasProducer, "extrasProducer");
        this.viewModelClass = viewModelClass;
        this.storeProducer = storeProducer;
        this.factoryProducer = factoryProducer;
        this.extrasProducer = extrasProducer;
    }

    @Override // p804nd.InterfaceC38501j
    @NotNull
    public VM getValue() {
        VM vm = this.cached;
        if (vm == null) {
            VM vm2 = (VM) new ViewModelProvider(this.storeProducer.invoke(), this.factoryProducer.invoke(), this.extrasProducer.invoke()).get(JvmClassMapping.m913a(this.viewModelClass));
            this.cached = vm2;
            return vm2;
        }
        return vm;
    }

    public /* synthetic */ ViewModelLazy(KClass kClass, Functions functions, Functions functions2, Functions functions3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(kClass, functions, functions2, (i & 8) != 0 ? C19981.INSTANCE : functions3);
    }
}
