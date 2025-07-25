package androidx.compose.p015ui.semantics;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SemanticsModifier.kt */
@Metadata
/* renamed from: androidx.compose.ui.semantics.SemanticsModifierCore */
/* loaded from: classes.dex */
public final class SemanticsModifierCore implements SemanticsModifier {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static AtomicInteger lastIdentifier = new AtomicInteger(0);

    /* renamed from: id */
    private final int f506id;
    @NotNull
    private final SemanticsConfiguration semanticsConfiguration;

    /* compiled from: SemanticsModifier.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.semantics.SemanticsModifierCore$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int generateSemanticsId() {
            return SemanticsModifierCore.lastIdentifier.addAndGet(1);
        }
    }

    public SemanticsModifierCore(int i, boolean z, boolean z2, @NotNull Function1<? super SemanticsPropertyReceiver, Unit> properties) {
        Intrinsics.checkNotNullParameter(properties, "properties");
        this.f506id = i;
        SemanticsConfiguration semanticsConfiguration = new SemanticsConfiguration();
        semanticsConfiguration.setMergingSemanticsOfDescendants(z);
        semanticsConfiguration.setClearingSemantics(z2);
        properties.invoke(semanticsConfiguration);
        this.semanticsConfiguration = semanticsConfiguration;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SemanticsModifierCore)) {
            return false;
        }
        SemanticsModifierCore semanticsModifierCore = (SemanticsModifierCore) obj;
        if (getId() == semanticsModifierCore.getId() && Intrinsics.m17075f(getSemanticsConfiguration(), semanticsModifierCore.getSemanticsConfiguration())) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.p015ui.semantics.SemanticsModifier
    public int getId() {
        return this.f506id;
    }

    @Override // androidx.compose.p015ui.semantics.SemanticsModifier
    @NotNull
    public SemanticsConfiguration getSemanticsConfiguration() {
        return this.semanticsConfiguration;
    }

    public int hashCode() {
        return (getSemanticsConfiguration().hashCode() * 31) + Integer.hashCode(getId());
    }
}
