package com.mobilefuse.sdk.assetsmanager;

import android.content.SharedPreferences;
import com.mobilefuse.sdk.Debugging;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.ErrorResult;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.exception.SuccessResult;
import com.mobilefuse.sdk.exception.TryKt;
import com.mobilefuse.sdk.utils.SharedPreferenceFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p804nd.NoWhenBranchMatchedException;

/* compiled from: AssetSharedPrefsResolver.kt */
@Metadata
/* loaded from: classes7.dex */
public final class AssetSharedPrefsResolver {
    private final String PREF_NAME_ASSETS = "assets_json_preferences";
    private final Functions<SharedPreferences> sharedPrefs = SharedPreferenceFactory.createLazySharedPrefs("assets_json_preferences");

    public final boolean removeAssetPreference() {
        Either errorResult;
        Object value;
        boolean z;
        SharedPreferences.Editor edit;
        SharedPreferences.Editor clear;
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            SharedPreferences invoke = this.sharedPrefs.invoke();
            if (invoke != null && (edit = invoke.edit()) != null && (clear = edit.clear()) != null) {
                z = clear.commit();
            } else {
                z = false;
            }
            errorResult = new SuccessResult(Boolean.valueOf(z));
        } catch (Throwable th) {
            if (TryKt.WhenMappings.$EnumSwitchMapping$1[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            }
            errorResult = new ErrorResult(th);
        }
        if (errorResult instanceof ErrorResult) {
            Throwable th2 = (Throwable) ((ErrorResult) errorResult).getValue();
            value = Boolean.FALSE;
        } else if (errorResult instanceof SuccessResult) {
            value = ((SuccessResult) errorResult).getValue();
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return ((Boolean) value).booleanValue();
    }

    @NotNull
    public final String resolveAssetsPreferences(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            SharedPreferences invoke = this.sharedPrefs.invoke();
            if (invoke == null) {
                return "";
            }
            String string = invoke.getString(key, null);
            if (string == null) {
                return "";
            }
            return string;
        } catch (Throwable th) {
            if (TryKt.WhenMappings.$EnumSwitchMapping$1[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            }
            Throwable th2 = (Throwable) new ErrorResult(th).getValue();
            return "";
        }
    }

    @NotNull
    public final Object saveAssetsPreferences(@NotNull String key, @NotNull String value) {
        Either errorResult;
        SharedPreferences.Editor edit;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            SharedPreferences invoke = this.sharedPrefs.invoke();
            if (invoke != null && (edit = invoke.edit()) != null) {
                edit.putString(key, value);
                edit.commit();
            }
            Debugging.logDebug$default(this, "Success saving preferences: key: " + key + " value: " + value, null, 2, null);
            errorResult = new SuccessResult(Unit.f99208a);
        } catch (Throwable th) {
            if (TryKt.WhenMappings.$EnumSwitchMapping$1[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            }
            errorResult = new ErrorResult(th);
        }
        if (errorResult instanceof ErrorResult) {
            Throwable th2 = (Throwable) ((ErrorResult) errorResult).getValue();
            return Boolean.FALSE;
        } else if (errorResult instanceof SuccessResult) {
            return ((SuccessResult) errorResult).getValue();
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
