package com.mobilefuse.sdk.utils;

import android.content.SharedPreferences;
import com.mobilefuse.sdk.AppLifecycleHelper;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.ErrorResult;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.exception.SuccessResult;
import com.mobilefuse.sdk.exception.TryKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.C37609n0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import p804nd.NoWhenBranchMatchedException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SharedPreferenceFactory.kt */
@Metadata
/* loaded from: classes7.dex */
public final class SharedPreferenceFactoryKt$createLazySharedPrefs$1 extends Lambda implements Functions<SharedPreferences> {
    final /* synthetic */ C37609n0 $prefs;
    final /* synthetic */ String $prefsName;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedPreferenceFactoryKt$createLazySharedPrefs$1(C37609n0 c37609n0, String str) {
        super(0);
        this.$prefs = c37609n0;
        this.$prefsName = str;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Functions
    @Nullable
    public final SharedPreferences invoke() {
        T t;
        C37609n0 c37609n0 = this.$prefs;
        if (((Either) c37609n0.f99327b) == null) {
            ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
            try {
                t = new SuccessResult(AppLifecycleHelper.getGlobalContext().getSharedPreferences(this.$prefsName, 0));
            } catch (Throwable th) {
                if (TryKt.WhenMappings.$EnumSwitchMapping$1[exceptionHandlingStrategy.ordinal()] == 1) {
                    StabilityHelper.logException("[Automatically caught]", th);
                }
                t = new ErrorResult(th);
            }
            c37609n0.f99327b = t;
        }
        Either either = (Either) this.$prefs.f99327b;
        if (either == null || (either instanceof ErrorResult)) {
            return null;
        }
        if (either instanceof SuccessResult) {
            return (SharedPreferences) ((SuccessResult) either).getValue();
        }
        throw new NoWhenBranchMatchedException();
    }
}
