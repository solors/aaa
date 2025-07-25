package com.facebook.ads.internal.checkerframework.checker.nullness.qual;

import com.facebook.ads.internal.checkerframework.framework.qual.DefaultFor;
import com.facebook.ads.internal.checkerframework.framework.qual.DefaultInUncheckedCodeFor;
import com.facebook.ads.internal.checkerframework.framework.qual.DefaultQualifierInHierarchy;
import com.facebook.ads.internal.checkerframework.framework.qual.QualifierForLiterals;
import com.facebook.ads.internal.checkerframework.framework.qual.SubtypeOf;
import com.facebook.ads.internal.checkerframework.framework.qual.UpperBoundFor;
import com.facebook.ads.redexgen.p370X.EnumC113077M;
import com.facebook.ads.redexgen.p370X.EnumC113177a;
import com.facebook.ads.redexgen.p370X.EnumC113187b;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@SubtypeOf({MonotonicNonNull.class})
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@UpperBoundFor(typeKinds = {EnumC113177a.A0H, EnumC113177a.A0B, EnumC113177a.A03, EnumC113177a.A05, EnumC113177a.A07, EnumC113177a.A0A, EnumC113177a.A0D, EnumC113177a.A0I, EnumC113177a.A04})
@Retention(RetentionPolicy.RUNTIME)
@QualifierForLiterals({EnumC113077M.A0C})
@DefaultFor({EnumC113187b.A05})
@DefaultQualifierInHierarchy
@DefaultInUncheckedCodeFor({EnumC113187b.A0E, EnumC113187b.A0C})
@Documented
/* loaded from: assets/audience_network.dex */
public @interface NonNull {
}
