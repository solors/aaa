package androidx.compose.material;

import androidx.compose.p015ui.graphics.Color;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: Colors.kt */
@Stable
@Metadata
/* loaded from: classes.dex */
public final class Colors {
    @NotNull
    private final SnapshotState background$delegate;
    @NotNull
    private final SnapshotState error$delegate;
    @NotNull
    private final SnapshotState isLight$delegate;
    @NotNull
    private final SnapshotState onBackground$delegate;
    @NotNull
    private final SnapshotState onError$delegate;
    @NotNull
    private final SnapshotState onPrimary$delegate;
    @NotNull
    private final SnapshotState onSecondary$delegate;
    @NotNull
    private final SnapshotState onSurface$delegate;
    @NotNull
    private final SnapshotState primary$delegate;
    @NotNull
    private final SnapshotState primaryVariant$delegate;
    @NotNull
    private final SnapshotState secondary$delegate;
    @NotNull
    private final SnapshotState secondaryVariant$delegate;
    @NotNull
    private final SnapshotState surface$delegate;

    public /* synthetic */ Colors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, z);
    }

    /* renamed from: copy-pvPzIIM$default */
    public static /* synthetic */ Colors m106866copypvPzIIM$default(Colors colors, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, boolean z, int i, Object obj) {
        long j13;
        long j14;
        long j15;
        long j16;
        long j17;
        long j18;
        long j19;
        long j20;
        long j21;
        long j22;
        long j23;
        long j24;
        boolean z2;
        if ((i & 1) != 0) {
            j13 = colors.m106875getPrimary0d7_KjU();
        } else {
            j13 = j;
        }
        if ((i & 2) != 0) {
            j14 = colors.m106876getPrimaryVariant0d7_KjU();
        } else {
            j14 = j2;
        }
        if ((i & 4) != 0) {
            j15 = colors.m106877getSecondary0d7_KjU();
        } else {
            j15 = j3;
        }
        if ((i & 8) != 0) {
            j16 = colors.m106878getSecondaryVariant0d7_KjU();
        } else {
            j16 = j4;
        }
        if ((i & 16) != 0) {
            j17 = colors.m106868getBackground0d7_KjU();
        } else {
            j17 = j5;
        }
        if ((i & 32) != 0) {
            j18 = colors.m106879getSurface0d7_KjU();
        } else {
            j18 = j6;
        }
        if ((i & 64) != 0) {
            j19 = colors.m106869getError0d7_KjU();
        } else {
            j19 = j7;
        }
        if ((i & 128) != 0) {
            j20 = colors.m106872getOnPrimary0d7_KjU();
        } else {
            j20 = j8;
        }
        long j25 = j20;
        if ((i & 256) != 0) {
            j21 = colors.m106873getOnSecondary0d7_KjU();
        } else {
            j21 = j9;
        }
        long j26 = j21;
        if ((i & 512) != 0) {
            j22 = colors.m106870getOnBackground0d7_KjU();
        } else {
            j22 = j10;
        }
        long j27 = j22;
        if ((i & 1024) != 0) {
            j23 = colors.m106874getOnSurface0d7_KjU();
        } else {
            j23 = j11;
        }
        long j28 = j23;
        if ((i & 2048) != 0) {
            j24 = colors.m106871getOnError0d7_KjU();
        } else {
            j24 = j12;
        }
        if ((i & 4096) != 0) {
            z2 = colors.isLight();
        } else {
            z2 = z;
        }
        return colors.m106867copypvPzIIM(j13, j14, j15, j16, j17, j18, j19, j25, j26, j27, j28, j24, z2);
    }

    @NotNull
    /* renamed from: copy-pvPzIIM */
    public final Colors m106867copypvPzIIM(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, boolean z) {
        return new Colors(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, z, null);
    }

    /* renamed from: getBackground-0d7_KjU */
    public final long m106868getBackground0d7_KjU() {
        return ((Color) this.background$delegate.getValue()).m107537unboximpl();
    }

    /* renamed from: getError-0d7_KjU */
    public final long m106869getError0d7_KjU() {
        return ((Color) this.error$delegate.getValue()).m107537unboximpl();
    }

    /* renamed from: getOnBackground-0d7_KjU */
    public final long m106870getOnBackground0d7_KjU() {
        return ((Color) this.onBackground$delegate.getValue()).m107537unboximpl();
    }

    /* renamed from: getOnError-0d7_KjU */
    public final long m106871getOnError0d7_KjU() {
        return ((Color) this.onError$delegate.getValue()).m107537unboximpl();
    }

    /* renamed from: getOnPrimary-0d7_KjU */
    public final long m106872getOnPrimary0d7_KjU() {
        return ((Color) this.onPrimary$delegate.getValue()).m107537unboximpl();
    }

    /* renamed from: getOnSecondary-0d7_KjU */
    public final long m106873getOnSecondary0d7_KjU() {
        return ((Color) this.onSecondary$delegate.getValue()).m107537unboximpl();
    }

    /* renamed from: getOnSurface-0d7_KjU */
    public final long m106874getOnSurface0d7_KjU() {
        return ((Color) this.onSurface$delegate.getValue()).m107537unboximpl();
    }

    /* renamed from: getPrimary-0d7_KjU */
    public final long m106875getPrimary0d7_KjU() {
        return ((Color) this.primary$delegate.getValue()).m107537unboximpl();
    }

    /* renamed from: getPrimaryVariant-0d7_KjU */
    public final long m106876getPrimaryVariant0d7_KjU() {
        return ((Color) this.primaryVariant$delegate.getValue()).m107537unboximpl();
    }

    /* renamed from: getSecondary-0d7_KjU */
    public final long m106877getSecondary0d7_KjU() {
        return ((Color) this.secondary$delegate.getValue()).m107537unboximpl();
    }

    /* renamed from: getSecondaryVariant-0d7_KjU */
    public final long m106878getSecondaryVariant0d7_KjU() {
        return ((Color) this.secondaryVariant$delegate.getValue()).m107537unboximpl();
    }

    /* renamed from: getSurface-0d7_KjU */
    public final long m106879getSurface0d7_KjU() {
        return ((Color) this.surface$delegate.getValue()).m107537unboximpl();
    }

    public final boolean isLight() {
        return ((Boolean) this.isLight$delegate.getValue()).booleanValue();
    }

    /* renamed from: setBackground-8_81llA$material_release */
    public final void m106880setBackground8_81llA$material_release(long j) {
        this.background$delegate.setValue(Color.m107517boximpl(j));
    }

    /* renamed from: setError-8_81llA$material_release */
    public final void m106881setError8_81llA$material_release(long j) {
        this.error$delegate.setValue(Color.m107517boximpl(j));
    }

    public final void setLight$material_release(boolean z) {
        this.isLight$delegate.setValue(Boolean.valueOf(z));
    }

    /* renamed from: setOnBackground-8_81llA$material_release */
    public final void m106882setOnBackground8_81llA$material_release(long j) {
        this.onBackground$delegate.setValue(Color.m107517boximpl(j));
    }

    /* renamed from: setOnError-8_81llA$material_release */
    public final void m106883setOnError8_81llA$material_release(long j) {
        this.onError$delegate.setValue(Color.m107517boximpl(j));
    }

    /* renamed from: setOnPrimary-8_81llA$material_release */
    public final void m106884setOnPrimary8_81llA$material_release(long j) {
        this.onPrimary$delegate.setValue(Color.m107517boximpl(j));
    }

    /* renamed from: setOnSecondary-8_81llA$material_release */
    public final void m106885setOnSecondary8_81llA$material_release(long j) {
        this.onSecondary$delegate.setValue(Color.m107517boximpl(j));
    }

    /* renamed from: setOnSurface-8_81llA$material_release */
    public final void m106886setOnSurface8_81llA$material_release(long j) {
        this.onSurface$delegate.setValue(Color.m107517boximpl(j));
    }

    /* renamed from: setPrimary-8_81llA$material_release */
    public final void m106887setPrimary8_81llA$material_release(long j) {
        this.primary$delegate.setValue(Color.m107517boximpl(j));
    }

    /* renamed from: setPrimaryVariant-8_81llA$material_release */
    public final void m106888setPrimaryVariant8_81llA$material_release(long j) {
        this.primaryVariant$delegate.setValue(Color.m107517boximpl(j));
    }

    /* renamed from: setSecondary-8_81llA$material_release */
    public final void m106889setSecondary8_81llA$material_release(long j) {
        this.secondary$delegate.setValue(Color.m107517boximpl(j));
    }

    /* renamed from: setSecondaryVariant-8_81llA$material_release */
    public final void m106890setSecondaryVariant8_81llA$material_release(long j) {
        this.secondaryVariant$delegate.setValue(Color.m107517boximpl(j));
    }

    /* renamed from: setSurface-8_81llA$material_release */
    public final void m106891setSurface8_81llA$material_release(long j) {
        this.surface$delegate.setValue(Color.m107517boximpl(j));
    }

    @NotNull
    public String toString() {
        return "Colors(primary=" + ((Object) Color.m107535toStringimpl(m106875getPrimary0d7_KjU())) + ", primaryVariant=" + ((Object) Color.m107535toStringimpl(m106876getPrimaryVariant0d7_KjU())) + ", secondary=" + ((Object) Color.m107535toStringimpl(m106877getSecondary0d7_KjU())) + ", secondaryVariant=" + ((Object) Color.m107535toStringimpl(m106878getSecondaryVariant0d7_KjU())) + ", background=" + ((Object) Color.m107535toStringimpl(m106868getBackground0d7_KjU())) + ", surface=" + ((Object) Color.m107535toStringimpl(m106879getSurface0d7_KjU())) + ", error=" + ((Object) Color.m107535toStringimpl(m106869getError0d7_KjU())) + ", onPrimary=" + ((Object) Color.m107535toStringimpl(m106872getOnPrimary0d7_KjU())) + ", onSecondary=" + ((Object) Color.m107535toStringimpl(m106873getOnSecondary0d7_KjU())) + ", onBackground=" + ((Object) Color.m107535toStringimpl(m106870getOnBackground0d7_KjU())) + ", onSurface=" + ((Object) Color.m107535toStringimpl(m106874getOnSurface0d7_KjU())) + ", onError=" + ((Object) Color.m107535toStringimpl(m106871getOnError0d7_KjU())) + ", isLight=" + isLight() + ')';
    }

    private Colors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, boolean z) {
        this.primary$delegate = SnapshotStateKt.mutableStateOf(Color.m107517boximpl(j), SnapshotStateKt.structuralEqualityPolicy());
        this.primaryVariant$delegate = SnapshotStateKt.mutableStateOf(Color.m107517boximpl(j2), SnapshotStateKt.structuralEqualityPolicy());
        this.secondary$delegate = SnapshotStateKt.mutableStateOf(Color.m107517boximpl(j3), SnapshotStateKt.structuralEqualityPolicy());
        this.secondaryVariant$delegate = SnapshotStateKt.mutableStateOf(Color.m107517boximpl(j4), SnapshotStateKt.structuralEqualityPolicy());
        this.background$delegate = SnapshotStateKt.mutableStateOf(Color.m107517boximpl(j5), SnapshotStateKt.structuralEqualityPolicy());
        this.surface$delegate = SnapshotStateKt.mutableStateOf(Color.m107517boximpl(j6), SnapshotStateKt.structuralEqualityPolicy());
        this.error$delegate = SnapshotStateKt.mutableStateOf(Color.m107517boximpl(j7), SnapshotStateKt.structuralEqualityPolicy());
        this.onPrimary$delegate = SnapshotStateKt.mutableStateOf(Color.m107517boximpl(j8), SnapshotStateKt.structuralEqualityPolicy());
        this.onSecondary$delegate = SnapshotStateKt.mutableStateOf(Color.m107517boximpl(j9), SnapshotStateKt.structuralEqualityPolicy());
        this.onBackground$delegate = SnapshotStateKt.mutableStateOf(Color.m107517boximpl(j10), SnapshotStateKt.structuralEqualityPolicy());
        this.onSurface$delegate = SnapshotStateKt.mutableStateOf(Color.m107517boximpl(j11), SnapshotStateKt.structuralEqualityPolicy());
        this.onError$delegate = SnapshotStateKt.mutableStateOf(Color.m107517boximpl(j12), SnapshotStateKt.structuralEqualityPolicy());
        this.isLight$delegate = SnapshotStateKt.mutableStateOf(Boolean.valueOf(z), SnapshotStateKt.structuralEqualityPolicy());
    }
}
