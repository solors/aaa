package com.facebook.internal;

import java.util.Arrays;
import java.util.EnumSet;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: SmartLoginOption.kt */
@Metadata
/* loaded from: classes4.dex */
public enum SmartLoginOption {
    None(0),
    Enabled(1),
    RequireConfirm(2);
    
    @NotNull
    private static final EnumSet<SmartLoginOption> ALL;
    @NotNull
    public static final Companion Companion = new Companion(null);
    private final long value;

    /* compiled from: SmartLoginOption.kt */
    @Metadata
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final EnumSet<SmartLoginOption> parseOptions(long j) {
            EnumSet<SmartLoginOption> result = EnumSet.noneOf(SmartLoginOption.class);
            Iterator it = SmartLoginOption.ALL.iterator();
            while (it.hasNext()) {
                SmartLoginOption smartLoginOption = (SmartLoginOption) it.next();
                if ((smartLoginOption.getValue() & j) != 0) {
                    result.add(smartLoginOption);
                }
            }
            Intrinsics.checkNotNullExpressionValue(result, "result");
            return result;
        }
    }

    static {
        EnumSet<SmartLoginOption> allOf = EnumSet.allOf(SmartLoginOption.class);
        Intrinsics.checkNotNullExpressionValue(allOf, "allOf(SmartLoginOption::class.java)");
        ALL = allOf;
    }

    SmartLoginOption(long j) {
        this.value = j;
    }

    @NotNull
    public static final EnumSet<SmartLoginOption> parseOptions(long j) {
        return Companion.parseOptions(j);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static SmartLoginOption[] valuesCustom() {
        SmartLoginOption[] valuesCustom = values();
        return (SmartLoginOption[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }

    public final long getValue() {
        return this.value;
    }
}
